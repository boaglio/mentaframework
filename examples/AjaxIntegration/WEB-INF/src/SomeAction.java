import java.util.HashMap;
import java.util.Map;

import org.mentawai.core.*;
import org.mentawai.ajax.*;

public class SomeAction extends BaseAction {

	public String execute() throws Exception {
        Map map = new HashMap();
        map.put("1","Rubem Azenha");
        map.put("2","Sergio Oliveira");
        map.put("3","Fernando Boaglio");
        map.put("4","Davi Luan Carneiro");
        map.put("5","Alex Fortuna");
        output.setValue(AjaxConsequence.OBJECT, map);
        return SUCCESS;
        
	}

}
