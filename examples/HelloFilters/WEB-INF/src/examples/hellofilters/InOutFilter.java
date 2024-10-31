package examples.hellofilters;

import java.util.*;

import org.mentawai.core.*;

public class InOutFilter implements Filter {
	
	private String name;
	
	public InOutFilter(String name) {
		this.name = name;
	}
	
	public String filter(InvocationChain chain) throws Exception {
		Action action = chain.getAction();
		Output output = action.getOutput();
		List list = HelloFilters.getList(output);
		list.add(name + " in!");
		String result = chain.invoke();
		list.add(name + " out!");
		return result;
	}
    
    public void destroy() { }
}
		