package actions;

import java.util.List;

import org.ajaxtags.demo.CarService;
import org.mentawai.ajaxtag.BaseAjaxtagAction;
import org.mentawai.ajaxtag.responses.AutocompleteResponse;
import org.mentawai.list.ListData;
import org.mentawai.list.ListManager;

public class AutocompleteAction extends BaseAjaxtagAction {

	public String execute() throws Exception {
		AutocompleteResponse r = new AutocompleteResponse();
		String model = input.getString("model");
		CarService service = new CarService();
		List list = service.getModelsByName(model);
		String name = "model";
		String value = "make";
		ListData listData = ListManager.convert(list, name, value);
		r.setData(listData);
		setResponse(r);

		return SUCCESS;
	}

}
