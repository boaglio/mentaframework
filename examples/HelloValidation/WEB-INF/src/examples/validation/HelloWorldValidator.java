package examples.validation;

import java.util.*;

import org.mentawai.core.*;
import org.mentawai.message.*;
import org.mentawai.filter.*;
import org.mentawai.rule.*;
import org.mentawai.validation.*;

public class HelloWorldValidator extends ValidationFilter {
	
	private static final int FIELD_REQUIRED_ERROR = 1;
	private static final int INVALID_USERNAME_LENGTH = 2;
	private static final int INVALID_AGE = 3;
	private static final int INVALID_PASSWORD_LENGTH = 4;
	private static final int PASSWORD_DOES_NOT_MATCH = 5;
	
	public void prepareValidator(Validator val, Action action, String innerAction) {
		
		val.add("username", new RequiredRule(), FIELD_REQUIRED_ERROR);
		val.add("username", new StringRule(6, 30), INVALID_USERNAME_LENGTH);
		
		val.add("age", new RequiredRule(), FIELD_REQUIRED_ERROR);
		val.add("age", new IntegerRule(18, 50), INVALID_AGE);
		
		val.add("password", new RequiredRule(), FIELD_REQUIRED_ERROR);
		val.add("password", new StringRule(4, 20), INVALID_PASSWORD_LENGTH);
		
		val.add("passconf", new RequiredRule(), FIELD_REQUIRED_ERROR);
		val.add("password", new EqualRule("password", "passconf"), PASSWORD_DOES_NOT_MATCH);
	}
}

		
	
	
	