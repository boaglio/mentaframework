package actions;

import org.mentawai.ajaxtag.BaseAjaxtagAction;
import org.mentawai.ajaxtag.responses.CalloutResponse;

public class CalloutAction extends BaseAjaxtagAction {

	public String execute() throws Exception {
		String param = input.getString("q");

		String msg = "<p>This is a test of the 'callout.mtw'</p><p>You asked about:<br/><b>"
				+ param + "</b>.</p>";

		setResponse(new CalloutResponse(msg));

		return SUCCESS;
	}

	public String otherCallout() throws Exception {
		String param = input.getString("query");
		
		String msg = "<p>This is another test of the Callout: 'callout.otherCallout.mtw'</p><BR><p>In the innerAction you ask about:<br/><i>"
			+ param + "</i>.</p>";
		
		setResponse(new CalloutResponse(msg));
		
		return SUCCESS;
	}
}
