import java.util.*;

import org.mentawai.core.*;
import org.mentawai.i18n.*;
import examples.paginator.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
        
        action(HelloPaginator.class)
            .on(SUCCESS, fwd("list.jsp"));
        
	}
	
}

		