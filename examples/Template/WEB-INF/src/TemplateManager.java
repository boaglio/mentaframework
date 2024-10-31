import org.mentawai.template.ConventionController;
import org.mentawai.template.Page;

public class TemplateManager extends org.mentawai.template.TemplateManager {

	public void configurePages() {
		Page base = new Page(".*", "template.jsp", ConventionController.class);
        base.setBlock("head", new Page("head.jsp"));
        base.setBlock("menu", new Page("menu.jsp"));
        add(base);
       
        Page page = new Page("/listNews", base); //Extends!
        page.setBlock("body", new Page("listNews.jsp"));
        page.setBlock("menu", new Page("menu2.jsp"));
        add(page);
	}
}
