package examples.paginator;

import java.util.*;

import org.mentawai.core.*;

public class HelloPaginator extends BaseAction {
    
    private static final List<String> LIST = new ArrayList<String>();
    
    static {
        
        for(int i=0;i<100;i++) LIST.add("Mentawai" + String.valueOf(i + 1));
        
    }

    public String execute() throws Exception {
        
        int x = input.getInt("size", -1);
        
        if (x > 0) {
            
            LIST.clear();
            
            for(int i=0;i<x;i++) LIST.add("Mentawai" + String.valueOf(i + 1));
            
        }

        output.setValue("myList", LIST);
        
        return SUCCESS;
        
    }
}

