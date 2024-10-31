package examples.messages;

import java.util.*;

import org.mentawai.core.*;
import org.mentawai.message.*;

public class HelloMentawai extends BaseAction {
	
	private static final int USERNAME_MISSING_ERROR = 1;
	private static final int CONGRATULATION_MSG = 2;
	
	public String execute() throws Exception {
		String username = input.getString("username");
		if (username == null || username.trim().equals("")) {
			addError(USERNAME_MISSING_ERROR);
			return ERROR;
		}
		output.setValue("username", username.toUpperCase());
		addMessage(CONGRATULATION_MSG);
		return SUCCESS;
	}
	
}
	
		
		