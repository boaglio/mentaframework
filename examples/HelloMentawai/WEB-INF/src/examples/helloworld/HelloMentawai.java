package examples.helloworld;

import java.util.*;

import org.mentawai.core.*;

public class HelloMentawai extends BaseAction {
	
	public String execute() throws Exception {
		String username = input.getString("username");
		if (username == null || username.trim().equals("")) {
			return ERROR;
		}
		output.setValue("username", username.toUpperCase());
		return SUCCESS;
	}
	
}
	
		
		