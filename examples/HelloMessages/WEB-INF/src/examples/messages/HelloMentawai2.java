package examples.messages;

import java.util.*;

import org.mentawai.core.*;
import org.mentawai.message.*;

public class HelloMentawai2 extends BaseAction {
	
	private static final MessageContext MSG_CONTEXT = new ClassMessageContext(HelloMentawai2.class);
	private static final int USERNAME_MISSING_ERROR = 1;
	private static final int CONGRATULATION_MSG = 2;
	
	public String execute() throws Exception {
		String username = input.getString("username");
		if (username == null || username.trim().equals("")) {
			addMessage(USERNAME_MISSING_ERROR, MSG_CONTEXT);
			return ERROR;
		}
		output.setValue("username", username.toUpperCase());
		addError(CONGRATULATION_MSG, MSG_CONTEXT);
		return SUCCESS;
	}
	
}
	
		
		