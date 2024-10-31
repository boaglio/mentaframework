
package hello;

import org.mentawai.core.Action;
import org.mentawai.core.Input;
import org.mentawai.core.PojoAction;

public class HelloPojo {
	
	private String value;
	
	public void execute() {
		
		value = "hello from execute!";
		
	}
	
	public String sayHi() {
		
		value = "saying hi!";
		
		return "success";
	}
	
	public String forceError() {
		
		return "error";
	}
	
	// This will be accessed by OutputFilter and placed in the action output...
	public String getValueToShow() {
		
		return value;
	}

	public void addTwoNumbers(int number1, int number2) {
		
		value = "Result1: " + String.valueOf(number1 + number2) + " / number1=" + number1 + " / number2=" + number2;
		
	}

	public void addTwoNumbers(Numbers numbers) {
		
		value = "Result2: " + String.valueOf(numbers.x + numbers.y);
		
	}
	
	public void addTwoNumbers2(int x, String y) {
		
		value = "Result3: x=" + String.valueOf(x) + " / y=" + y;
	}
	
	public void addTwoNumbers3(String y, int x) {
		
		value = "Result4: x=" + String.valueOf(x) + " / y=" + y;
		
	}
	
	public void addTwoNumbers4(Numbers numbers) {
		
		addTwoNumbers(numbers);
	}
	
	public String testAction() {
		
		Action a = PojoAction.getAction();
		
		Input input = a.getInput();
		
		int x = input.getInt("x");
		
		int y = input.getInt("y");
		
		
		value = "Result3: " + String.valueOf(x + y);
		
		return Action.SUCCESS;
		
		
	}
	
}