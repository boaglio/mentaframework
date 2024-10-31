import org.mentawai.core.*;
import org.mentawai.filter.*;
import org.mentawai.ioc.*;
import examples.ioc.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
    
    public void init(Context application) {
    	
        // IoC Components...
    	ioc("talker1", PortugueseTalker.class);
    	
    	ioc("talker2", PoliteTalker.class)
    		.addProperty("name", "Polite Guy");
    	
    	ioc("talker3", UnpoliteTalker.class, SESSION)
    		.addInitValue("Unpolite Guy");
    }
	
	public void loadActions() {
		
		filter(new IoCFilter());
		
		filter(new InjectionFilter());
		
		action("/HelloIoC", HelloIoC.class)
			.on(SUCCESS, fwd("/show.jsp"));
	}
}

		