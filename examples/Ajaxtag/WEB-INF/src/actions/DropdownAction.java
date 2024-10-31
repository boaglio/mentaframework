package actions;

import java.util.List;

import org.ajaxtags.demo.CarService;
import org.mentawai.ajaxtag.BaseAjaxtagAction;
import org.mentawai.ajaxtag.responses.SelectDropdownResponse;
import org.mentawai.list.ListData;
import org.mentawai.list.ListManager;

public class DropdownAction extends BaseAjaxtagAction {

	public String execute() throws Exception {
		String make = input.getString("make");

	    // Get maker from your service bean
	    CarService service = new CarService();
	    List list = service.getModelsByMake(make);
	    String name = "model";
	    String value = "model";
		ListData listData = ListManager.convert(list, name, value);
		
		setResponse(new SelectDropdownResponse(listData));
		return SUCCESS;
	}

}
