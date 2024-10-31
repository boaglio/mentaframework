package examples.vofilter;

import java.util.*;

import org.mentawai.core.*;

public class HelloVOFilter extends BaseAction {
	
	public String execute() throws Exception {
		User user = (User) input.getValue("examples.vofilter.User");
		if (user == null) return ERROR;
		if (user.getUsername() == null) return ERROR;
		if (user.getPassword() == null) return ERROR;
		user.setUsername(user.getUsername().toUpperCase());
		user.setPassword(user.getPassword().toUpperCase());
        user.setAge(user.getAge() + 1);
		output.setValue("user", user);
		return SUCCESS;
	}
	
}
	
		
		