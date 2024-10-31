package examples.fileupload;

import java.util.*;

import org.mentawai.core.*;

import org.apache.commons.fileupload.*;

public class HelloFileUpload extends BaseAction {
	
	public String execute() throws Exception {
		String username = input.getString("username");
		if (username == null || username.trim().equals("")) {
			return ERROR;
		}
		output.setValue("username", username.toUpperCase());
        
        FileItem item = (FileItem) input.getValue("theFile");
        output.setValue("fileSize", String.valueOf(item.getSize()));
        
        String [] options = input.getStrings("options");
        output.setValue("options", options);
        
		return SUCCESS;
	}
	
}
	
		
		