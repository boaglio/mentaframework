package actions;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.ajaxtags.demo.Car;
import org.ajaxtags.demo.CarService;
import org.mentawai.ajaxtag.BaseAjaxtagAction;
import org.mentawai.ajaxtag.responses.HTMLContentReplaceResponse;

public class HtmlContentAction extends BaseAjaxtagAction {

	public String execute() throws Exception {
		String make = input.getString("make");
	    CarService service = new CarService();
	    List list = service.getModelsByMake(make);

	    StringBuffer html = new StringBuffer();
	    html.append("<h2>").append(make.toUpperCase()).append("</h2><p>Models</p><ul>");
	    for (Iterator iter = list.iterator(); iter.hasNext();) {
	      Car car = (Car) iter.next();
	      html.append("<li>").append(car.getModel()).append("</li>");
	    }
	    html.append("</ul>");
	    html.append("<br>");
	    html.append("<code>Last Updated: ");
	    html.append(new Date());
	    html.append("</code>");
	    
	    setResponse(new HTMLContentReplaceResponse(html.toString()));
		return SUCCESS;
	}


}
