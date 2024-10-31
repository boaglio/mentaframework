package actions;

import org.mentawai.ajaxtag.BaseAjaxtagAction;
import org.mentawai.ajaxtag.responses.HTMLIncludeResponse;

public class HtmlIncludeContentAction extends BaseAjaxtagAction {

	public String execute() throws Exception {
		setResponse(new HTMLIncludeResponse("/calloutcontent.jsp"));
		return SUCCESS;
	}

}
