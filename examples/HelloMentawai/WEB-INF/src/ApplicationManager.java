import org.mentawai.core.*;
import examples.helloworld.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		ActionConfig ac = new ActionConfig("/HelloWorld", HelloMentawai.class);
		ac.addConsequence(HelloMentawai.SUCCESS, new Forward("/hello.jsp"));
		ac.addConsequence(HelloMentawai.ERROR, new Forward("/username.jsp"));
		addActionConfig(ac);
	}
}

		