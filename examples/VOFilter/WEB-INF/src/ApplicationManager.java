import org.mentawai.core.*;
import org.mentawai.filter.*;
import examples.vofilter.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		
		ActionConfig ac = new ActionConfig("/Hello", HelloVOFilter.class);
		ac.addConsequence(HelloVOFilter.SUCCESS, new Forward("/show.jsp"));
		ac.addConsequence(HelloVOFilter.ERROR, new Forward("/user.jsp"));
		addActionConfig(ac);
		
		ac.addFilter(new VOFilter(User.class));
	}
}

		