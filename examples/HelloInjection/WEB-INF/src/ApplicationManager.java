import org.mentawai.core.*;
import examples.injection.*;
import org.mentawai.filter.InjectionFilter;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		ActionConfig ac = new ActionConfig("/HelloInjection", HelloInjection.class);
		ac.addConsequence(HelloInjection.SUCCESS, new Forward("/hello.jsp"));
		ac.addConsequence(HelloInjection.ERROR, new Forward("/username.jsp"));
		addActionConfig(ac);
        
        ac.addFilter(new InjectionFilter());
	}
}

		