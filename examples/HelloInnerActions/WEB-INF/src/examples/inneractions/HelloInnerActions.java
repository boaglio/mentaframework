package examples.inneractions;

import java.util.*;

import org.mentawai.core.*;

public class HelloInnerActions extends BaseAction {
	
	public String execute() throws Exception {
		output.setValue("speak", "Hello there!");
		return SUCCESS;
	}
	
	public String sayBye() throws Exception {
		output.setValue("speak", "Bye for now...");
		return SUCCESS;
	}
	
	public class SayBye2 extends BaseAction {
		
		public String execute() throws Exception {
			
			output.setValue("speak", "Bye for now from SayBye2 inner action class!");
			
			return SUCCESS;
			
		}
		
	}
	
	public static class SayBye3 extends BaseAction {
		
		public String execute() throws Exception {
			
			output.setValue("speak", "Bye for now from SayBye3 static inner action class!");
			
			return SUCCESS;
			
		}
	}
}
	
		
		