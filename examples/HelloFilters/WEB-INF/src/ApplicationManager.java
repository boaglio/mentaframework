import org.mentawai.core.*;
import examples.hellofilters.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		
		addGlobalFilter(new InOutFilter("Filter 1"));
		addGlobalFilter(new InOutFilter("Filter 2"));
		
		ActionConfig ac = new ActionConfig("/HelloFilters", HelloFilters.class);
		ac.addConsequence(HelloFilters.SUCCESS, new Forward("/hello.jsp"));
		addActionConfig(ac);
		
		ac.addFilter(new InOutFilter("Filter 3"));
		ac.addFilter(new InOutFilter("Filter 4"));
	}
}

		