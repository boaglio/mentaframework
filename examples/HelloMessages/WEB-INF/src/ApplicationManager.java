import java.util.*;

import org.mentawai.core.*;
import org.mentawai.i18n.*;
import examples.messages.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		ActionConfig ac = new ActionConfig("/HelloWorld", HelloMentawai.class);
		ac.addConsequence(HelloMentawai.SUCCESS, new Forward("/hello.jsp"));
		ac.addConsequence(HelloMentawai.ERROR, new Forward("/username.jsp"));
		addActionConfig(ac);
	}
	
	public void loadLocales() {
		LocaleManager.add(new Locale("pt", "BR"));
		LocaleManager.add(new Locale("en", "US"));
	}
}

		