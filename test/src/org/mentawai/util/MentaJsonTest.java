package org.mentawai.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import junit.framework.TestCase;

public class MentaJsonTest extends TestCase {

public void testToString() {
		
		
		JSONObject object = MentaJson.getJSONObject();
		object.put("um", "um");
		object.put("dois", "dois");
		object.put("tres", "tres");

		assertEquals("{\"um\":\"um\",\"dois\":\"dois\",\"tres\":\"tres\"}",   object.toString());
		
		JSONArray array1 = MentaJson.getJSONArray();
		array1.put("11");
		array1.put("12");
		array1.put("13");
		array1.put("14");
		
		JSONArray array2 = MentaJson.getJSONArray();
		array2.put("21");
		array2.put("22");
		array2.put("23");
		array2.put("24");
		
		JSONArray array3 = MentaJson.getJSONArray();
		array3.put("31");
		array3.put("32");
		array3.put("33");
		array3.put("34");
		
		assertEquals("[\"31\",\"32\",\"33\",\"34\"]", array3.toString());
		
		JSONObject obj = MentaJson.getJSONObject();
		obj.put("um", array1);
		obj.put("dois", array2);
		obj.put("tres", array3);
		
		assertEquals("{\"um\":[\"11\",\"12\",\"13\",\"14\"],\"dois\":[\"21\",\"22\",\"23\",\"24\"],\"tres\":[\"31\",\"32\",\"33\",\"34\"]}",  obj.toString() );
		
	}

}
