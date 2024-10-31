package examples.hellofilters;

import java.util.*;

import org.mentawai.core.*;

public class HelloFilters extends BaseAction {
	
	public static final String LIST = "list";
	
	public static List getList(Output output) {
		List list = (List) output.getValue(LIST);
		if (list == null) {
			list = new LinkedList();
			output.setValue(LIST, list);
		}
		return list;
	}
	
	public String execute() throws Exception {
		Date now = new Date();
		List list = getList(output);
		list.add(now.toString());
		return SUCCESS;
	}
	
}
	
		
		