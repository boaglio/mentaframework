import java.util.*;

import org.mentawai.core.*;
import org.mentawai.ajax.*;

public class JSONMapAction extends BaseAction {

	public String execute() throws Exception {
		Map map = new HashMap();
		map.put("name", "daviluan");
		map.put("password", "secret");

		output.setValue(AjaxConsequence.OBJECT, map);
		return SUCCESS;
	}
}
