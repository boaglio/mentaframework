package examples.injection;

import java.util.*;

import org.mentawai.core.*;

public class HelloInjection extends BaseAction {
    
    private String username = null;
    private int age = -1;
    private String password = null;
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // no setter for password...
	
	public String execute() throws Exception {
		if (username == null || username.trim().equals("")) {
			return ERROR;
		}
        if (age <= 0) return ERROR;
        if (password == null) return ERROR;
        
		output.setValue("username", username.toUpperCase());
        output.setValue("age", String.valueOf(age + 1));
        output.setValue("password", password);
		return SUCCESS;
	}
	
}
	
		
		