import org.mentawai.core.Forward;
import org.mentawai.filter.SpringFilter;
import org.mentawai.spring.SpringActionConfig;

import examples.spring.SpringFilterAction;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
		//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		//SpringActionConfig.setBeanFactory(beanFactory);
		
		action("/springFilterAction", SpringFilterAction.class)
		.addFilter(new SpringFilter())
		.on(SUCCESS, fwd("index.jsp"));
		
		SpringActionConfig ac = new SpringActionConfig("/hello", "helloAction");
		ac.addConsequence(SUCCESS, new Forward("index.jsp"));
		addActionConfig(ac);
	}
}