package examples.spring;

import org.mentawai.core.BaseAction;

/*
 * Use SpringAutowiringFilter
 */
public class SpringFilterAction extends BaseAction {
	
	public String execute() throws Exception {
		HelloBean bean = (HelloBean)input.getValue("helloBean");
		output.setValue("hello", bean.hello());
		return SUCCESS;
	}
}
	
		
		