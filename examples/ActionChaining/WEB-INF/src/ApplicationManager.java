import org.mentawai.core.*;

import org.mentawai.filter.*;

import examples.chain.*;



public class ApplicationManager extends org.mentawai.core.ApplicationManager {

	

	public void loadActions() {

		

		ActionConfig ac2 = new ActionConfig("/Action2", Action2.class);

		ac2.addConsequence(Action2.SUCCESS, new Forward("/show.jsp"));

		addActionConfig(ac2);

		

		ActionConfig ac1 = new ActionConfig("/Action1", Action1.class);

		ac1.addConsequence(Action1.SUCCESS, new Chain(ac2));

		addActionConfig(ac1);

	}

}



		