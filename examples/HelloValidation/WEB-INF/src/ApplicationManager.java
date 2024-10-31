import java.util.*;

import org.mentawai.core.*;
import org.mentawai.i18n.*;
import examples.validation.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		ActionConfig ac = new ActionConfig("/HelloWorld", HelloWorld.class);
		ac.addConsequence(HelloWorld.SUCCESS, new Forward("/hello.jsp"));
		ac.addConsequence(HelloWorld.ERROR, new Forward("/form.jsp"));
		addActionConfig(ac);
		ac.addFilter(new HelloWorldValidator());
	}
	
	public void loadLocales() {
		LocaleManager.add(new Locale("pt", "BR"));
		LocaleManager.add(new Locale("en", "US"));
	}
}

		