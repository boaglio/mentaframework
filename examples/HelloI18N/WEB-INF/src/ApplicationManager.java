import java.util.*;

import org.mentawai.core.*;
import org.mentawai.i18n.*;
import org.mentawai.action.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
    
    public void loadActions() {
    
        action(SuccessAction.class)
            .on(SUCCESS, fwd("/hello.jsp"));
        
    }
	
	public void loadLocales() {
		LocaleManager.add(new Locale("pt", "BR"));
		LocaleManager.add(new Locale("en", "US"));
	}
}

		