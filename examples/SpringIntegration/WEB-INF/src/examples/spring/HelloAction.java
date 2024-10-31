package examples.spring;

import org.mentawai.core.BaseAction;

/*
 * Use SpringActionConfig
 */
public class HelloAction extends BaseAction {
	
	private HelloBean helloBean;
	
	public void setHelloBean(HelloBean helloBean) {
		this.helloBean = helloBean;
	}
	
	public String execute() throws Exception {
		output.setValue("hello", helloBean.hello());
		return SUCCESS;
	}	
}
	
		
		