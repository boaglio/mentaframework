package examples.conversion;

import java.util.*;

import org.mentawai.core.*;

public class HelloConversion extends BaseAction {
	
	public String execute() throws Exception {
		Date date = (Date) input.getValue("date");
		if (date == null) {
			return ERROR;
		}
		Calendar cal = Calendar.getInstance(loc);
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, 1);
		output.setValue("tomorrow", cal.getTime());
		return SUCCESS;
	}
	
}
	
		
		