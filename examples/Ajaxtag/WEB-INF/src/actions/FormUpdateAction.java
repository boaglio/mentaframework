package actions;

import org.mentawai.ajaxtag.BaseAjaxtagAction;
import org.mentawai.ajaxtag.responses.UpdateFieldResponse;

public class FormUpdateAction extends BaseAjaxtagAction {
	public static final double MPH_TO_KPH = 1.609344;

	public static final double MPH_TO_MPS = 0.44704;

	public String execute() throws Exception {
		Double mph = 0.0, kph = 0.0, mps = 0.0;
		mph = Double.parseDouble(input.getString("mph"));

		kph = mph * MPH_TO_KPH;
		mps = mph * MPH_TO_MPS;
		
		UpdateFieldResponse response = new UpdateFieldResponse();

		response.addValue("kph", kph);
		response.addValue("mps", mps);
		
		setResponse(response);

		return SUCCESS;
	}

}
