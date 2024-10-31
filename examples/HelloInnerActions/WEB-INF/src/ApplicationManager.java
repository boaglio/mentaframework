import org.mentawai.core.*;
import org.mentawai.filter.*;
import examples.inneractions.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		ActionConfig ac = new ActionConfig("/HelloInnerActions", HelloInnerActions.class);
		ac.addConsequence(HelloInnerActions.SUCCESS, new Forward("/hello.jsp"));
		addActionConfig(ac);
        
		ac = new ActionConfig("/HelloInnerActions2", HelloInnerActions.class);
		ac.addConsequence(HelloInnerActions.SUCCESS, new Forward("/hello.jsp"));
        ac.addConsequence(HelloInnerActions.SUCCESS, "sayBye", new Forward("/hello2.jsp"));
		addActionConfig(ac);	
        
		ac = new ActionConfig("/HelloInnerActions3", HelloInnerActions.class);
		ac.addConsequence(HelloInnerActions.SUCCESS, new Forward("/hello3.jsp"));
        ac.addConsequence(HelloInnerActions.SUCCESS, "sayBye", new Forward("/hello.jsp"));
		addActionConfig(ac);	                
        
        // inner action config doing an override
		ac = new ActionConfig("/HelloInnerActions3", HelloInnerActions.class, "sayBye");
		ac.addConsequence(HelloInnerActions.SUCCESS, new Forward("/hello3.jsp"));
		addActionConfig(ac);	        
        
    }
}

		