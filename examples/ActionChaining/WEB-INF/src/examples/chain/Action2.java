package examples.chain;

import java.util.*;

import org.mentawai.core.*;

public class Action2 extends BaseAction {
	
	public String execute() throws Exception {
		output.setValue("action2", "from action 2");
		return SUCCESS;
	}
	
}
	
		
		