import org.mentawai.ajax.*;
import org.mentawai.ajax.renderer.*;
import org.mentawai.core.ActionConfig;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
    public void loadActions() {
        ActionConfig actionConfig = new ActionConfig("/getNames",SomeAction.class);
        actionConfig.addConsequence(SomeAction.SUCCESS, new AjaxConsequence(new MapAjaxRenderer()));
        addActionConfig(actionConfig);

        actionConfig = new ActionConfig("/getNamesJSON",JSONListAction.class);
        actionConfig.addConsequence(SomeAction.SUCCESS, new AjaxConsequence(new JSONArrayAjaxRenderer()));
        addActionConfig(actionConfig);

        actionConfig = new ActionConfig("/getUserJSON",JSONMapAction.class);
		actionConfig.addConsequence(SomeAction.SUCCESS, new AjaxConsequence(new JSONMapAjaxRenderer()));
        addActionConfig(actionConfig);
    }
}
