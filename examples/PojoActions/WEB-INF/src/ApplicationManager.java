import hello.HelloPojo;
import hello.Numbers;

import org.mentawai.filter.OutjectionFilter;
import org.mentawai.filter.VOFilter;
import org.mentawai.filter.MethodParamFilter;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	@Override
	public void loadActions() {
		
		action(HelloPojo.class) // HelloPojo.mtw
			.on(SUCCESS, fwd("/showValue.jsp"))
			.on(ERROR, redir("/error.jsp"))
			.filter(new OutjectionFilter())
			.filter(new VOFilter("numbers", Numbers.class));
		
		action("/HelloPojoParams", HelloPojo.class) // To test MethodParamFilter...
			.on(SUCCESS, fwd("/showValue.jsp"))
			.on(ERROR, redir("/error.jsp"))
			.filter(new OutjectionFilter())
			.filter(new MethodParamFilter("x", "y"));
		
		
	}
}