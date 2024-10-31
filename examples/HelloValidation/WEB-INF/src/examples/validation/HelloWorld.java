package examples.validation;

import java.util.*;

import org.mentawai.core.*;
import org.mentawai.message.*;

public class HelloWorld extends BaseAction {
	
	public String execute() throws Exception {
		String username = input.getString("username");
		output.setValue("username", username.toUpperCase());
		return SUCCESS;
	}
	
}
	
		
		