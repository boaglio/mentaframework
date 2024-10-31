import java.util.*;

import org.mentawai.core.*;
import org.mentawai.i18n.*;
import examples.conversion.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		ActionConfig ac = new ActionConfig("/HelloConversion", HelloConversion.class);
		ac.addConsequence(HelloConversion.SUCCESS, new Forward("/hello.jsp"));
		ac.addConsequence(HelloConversion.ERROR, new Forward("/form.jsp"));
		addActionConfig(ac);
		ac.addFilter(new HelloConversionFilter());
	}
	
	public void loadLocales() {
		LocaleManager.add(new Locale("pt", "BR"));
		LocaleManager.add(new Locale("en", "US"));
	}

}

		