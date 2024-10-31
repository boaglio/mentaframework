import java.util.Locale;

import org.mentawai.ajaxtag.AjaxtagConsequence;
import org.mentawai.core.ActionConfig;
import org.mentawai.i18n.LocaleManager;

import actions.AutocompleteAction;
import actions.CalloutAction;
import actions.DropdownAction;
import actions.FormUpdateAction;
import actions.HtmlContentAction;
import actions.HtmlIncludeContentAction;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	public void loadActions() {
		
		ActionConfig autocompleteConfig = new ActionConfig("/autocomplete",
				AutocompleteAction.class);
		autocompleteConfig.addConsequence(SUCCESS, new AjaxtagConsequence());
		addActionConfig(autocompleteConfig );
		
		
		ActionConfig dropdownConfig = new ActionConfig("/dropdown",
				DropdownAction.class);
		dropdownConfig.addConsequence(SUCCESS, new AjaxtagConsequence());
		addActionConfig(dropdownConfig);

		ActionConfig calloutConfig = new ActionConfig("/callout",
				CalloutAction.class);
		calloutConfig .addConsequence(SUCCESS, new AjaxtagConsequence());
		calloutConfig.addConsequence(SUCCESS, "otherCallout", new AjaxtagConsequence());
		addActionConfig(calloutConfig );

		ActionConfig formupdateConfig = new ActionConfig("/formupdate",
				FormUpdateAction.class);
		formupdateConfig.addConsequence(SUCCESS, new AjaxtagConsequence());
		addActionConfig(formupdateConfig);
	
		ActionConfig htmlContentConfig = new ActionConfig("/htmlcontent",
				HtmlContentAction.class);
		htmlContentConfig.addConsequence(SUCCESS, new AjaxtagConsequence());
		addActionConfig(htmlContentConfig);
		
		ActionConfig htmlIncludeContentConfig = new ActionConfig("/htmlincludecontent",
				HtmlIncludeContentAction.class);
		htmlIncludeContentConfig.addConsequence(SUCCESS, new AjaxtagConsequence());
		addActionConfig(htmlIncludeContentConfig);

	}
}
