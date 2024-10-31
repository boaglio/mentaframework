package examples.conversion;

import java.util.*;

import org.mentawai.core.*;
import org.mentawai.filter.*;
import org.mentawai.converter.*;

public class HelloConversionFilter extends ConversionFilter {
	
	public void prepareConverters(Map<String, Converter> converters, Action action, String innerAction) {
		
		converters.put("date", new DateConverter());
	}
}

		
	
	
	