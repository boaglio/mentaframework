package examples.chain;

import java.util.*;

import org.mentawai.core.*;

public class Action1 extends BaseAction {
	
	public String execute() throws Exception {
		output.setValue("action1", "from action 1");
		return SUCCESS;
	}
	
}
	
		
		