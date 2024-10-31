import org.mentawai.core.*;
import examples.fileupload.*;
import org.mentawai.filter.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		ActionConfig ac = new ActionConfig("/HelloFileUpload", HelloFileUpload.class);
		ac.addConsequence(HelloFileUpload.SUCCESS, new Forward("/hello.jsp"));
		ac.addConsequence(HelloFileUpload.ERROR, new Forward("/username.jsp"));
		addActionConfig(ac);
        
        ac.addFilter(new FileUploadFilter());
	}
}

		