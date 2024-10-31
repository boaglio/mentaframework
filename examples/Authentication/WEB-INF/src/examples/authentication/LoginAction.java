package examples.authentication;

import java.util.*;

import org.mentawai.core.*;
import org.mentawai.action.*;

public class LoginAction extends BaseLoginAction {
	
	public String execute() throws Exception {
		String user = input.getString("username");
		String pass = input.getString("password");
		
		if (user == null || user.trim().equals("")) {
			return ERROR;
		}
		
		if (pass == null || pass.trim().equals("")) {
			return ERROR;
		}
		
		if (!user.equals("saoj") || !pass.equals("abc123")) {
			return ERROR;
		}
		
		setUserSession(user);
		
		return SUCCESS;
	}
	
}
	
		
		