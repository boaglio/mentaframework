package examples.ioc;

import java.util.*;

import org.mentawai.core.*;

public class HelloIoC extends BaseAction {
    
    private Talker talker1 = null;
    private Talker talker2 = null;
    private Talker talker3 = null;
    
    public void setTalker1(Talker t) {
        this.talker1 = t;
    }
    
    public void setTalker2(Talker t) {
        this.talker2 = t;
    }
    
    // t3 will be injected straight into the private field... (no need for setter)
    
	public String execute() throws Exception {
        String s1 = null;
        String s2 = null;
        String s3 = null;
        
        if (talker1 != null) {
            s1 = talker1.saySomething();
            output.setValue("from_t1", s1);
        }
        if (talker2 != null) {
            s2 = talker2.saySomething();
            output.setValue("from_t2", s2);
        }
        if (talker3 != null) {
            s3 = talker3.saySomething();
            output.setValue("from_t3", s3);
        }
		return SUCCESS;
	}
	
}
	
		
		