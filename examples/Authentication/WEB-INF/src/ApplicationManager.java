import org.mentawai.core.*;
import org.mentawai.filter.*;
import org.mentawai.action.*;
import examples.authentication.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		
		addGlobalFilter(new AuthenticationFilter());
		addGlobalConsequence(AuthenticationFilter.LOGIN, new Redirect("/login.jsp"));
		
		ActionConfig ac = new ActionConfig("/Login", LoginAction.class);
		ac.addConsequence(LoginAction.SUCCESS, new Redirect("/welcome.jsp"));
		ac.addConsequence(LoginAction.ERROR,  new Forward("/login.jsp"));
		addActionConfig(ac);
		
		ac.addFilter(new RedirectAfterLoginFilter());
		ac.addConsequence(RedirectAfterLoginFilter.REDIR, new Redirect()); // dynamic redirect
        
        ac = new ActionConfig("/Logout", LogoutAction.class);
        ac.addConsequence(LogoutAction.SUCCESS, new Redirect("/index.jsp"));
        addActionConfig(ac);
	}
}

		