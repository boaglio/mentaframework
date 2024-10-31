import java.util.ArrayList;
import java.util.List;

import org.mentawai.core.*;
import org.mentawai.ajax.*;

public class JSONListAction extends BaseAction {

	public String execute() throws Exception {
		List list = new ArrayList(); 
		list.add("Davi Luan Carneiro");
		list.add("Rubem Azenha");
		list.add("Sergio Oliveira");
		list.add("Fernando Boaglio");
		list.add("Alex Oliveira");
		output.setValue(AjaxConsequence.OBJECT, list);
		return SUCCESS;
	}

}
