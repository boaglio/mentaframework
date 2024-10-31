import org.mentawai.core.*;
import org.mentawai.filter.*;
import org.mentawai.action.*;
import org.mentawai.authorization.*;
import examples.authorization.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
    
    public void init(Context application) {
        
        Group admins = new Group("admins");
        admins.addPermission("read").addPermission("write").addPermission("delete");
        AuthorizationManager.addGroup(admins);
        
        Group users = new Group("users");
        users.addPermission("read");
        AuthorizationManager.addGroup(users);
        
    }
	
	public void loadActions() {
		
		addGlobalFilter(new AuthenticationFilter());
		addGlobalConsequence(AuthenticationFilter.LOGIN, new Redirect("/login.jsp"));
                addGlobalConsequence(AuthorizationFilter.ACCESSDENIED, new Redirect("/denied.jsp"));
		
		ActionConfig ac = new ActionConfig("/Login", LoginAction.class);
		ac.addConsequence(LoginAction.SUCCESS, new Redirect("/welcome.jsp"));
		ac.addConsequence(LoginAction.ERROR,  new Forward("/login.jsp"));
		ac.addFilter(new RedirectAfterLoginFilter());
		ac.addConsequence(RedirectAfterLoginFilter.REDIR, new Redirect()); // dynamic redirect
		addActionConfig(ac);
		
        
                ac = new ActionConfig("/Logout", LogoutAction.class);
                ac.addConsequence(LogoutAction.SUCCESS, new Redirect("/index.jsp"));
                addActionConfig(ac);
                
                ac = new ActionConfig("/DeleteRecord", DeleteRecordAction.class);
                ac.addConsequence(DeleteRecordAction.SUCCESS, new Redirect("/deleted.jsp"));
                ac.addFilter(new AuthorizationFilter(new Permission("delete")));
                addActionConfig(ac);
        
	}
}

		