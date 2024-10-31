package org.mentawai.ajax.renderer;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.mentawai.list.SimpleListData;

import com.agitar.lib.junit.AgitarTestCase;

/**
 * 
 * @author Robert Willian Gil
 * 
 * Test JSONGenericRenderer Class
 *
 */
public class JSONGenericRendererTest extends AgitarTestCase {

    private final JSONGenericRenderer jgr = new JSONGenericRenderer();
    private final JSONGenericRenderer jgrLevel1 = new JSONGenericRenderer(1);
	private static Calendar calendar = Calendar.getInstance();
    
    static {
		calendar.set(1985, 11, 15);            // 15/12/1985
    }
    
    public void testEncode() throws Exception {
		
    	JSONObject json = null;
    	JSONObject obj = null;

        Map<Object, Object> map = new LinkedHashMap<Object, Object>();
        
        json = JSONObject.fromString( jgr.encode(map, null, false) );
		assertEquals("Test with empty Map", 0, json.getJSONArray("obj").length() );
		
        map.put(1, "One");
        map.put("Dois", "Two");
        map.put(3, 3);
        json = JSONObject.fromString( jgr.encode(map, new Locale("pt", "BR"), false) );
        obj = json.getJSONArray("obj").getJSONObject(0);
        assertEquals("1", obj.getString("key"));
        assertEquals("One", obj.getString("value"));
        
        json = JSONObject.fromString( jgr.encode(map, null, false) );
        obj = json.getJSONArray("obj").getJSONObject(0);
        assertEquals("1", obj.getString("key"));
        assertEquals("One", obj.getString("value"));
        
        assertEquals("Test encode with String/HTML", "JUnit Test <br>", jgr.encode("JUnit Test <br>", null, false));
        
        Country c = new Country(1, "Brasil", calendar.getTime(), calendar);
        json = JSONObject.fromString( jgr.encode(c, new Locale("pt", "BR"), false) );
        obj = json.getJSONArray("obj").getJSONObject(0);
		assertEquals("Test encode with Bean", 1, obj.getInt("idCountry"));
		assertEquals("Test encode with Bean", "Brasil", obj.getString("nameCountry"));
		assertEquals("Test encode with Bean", "15/12/1985", obj.getString("date"));
		assertEquals("Test encode with Bean", "15/12/1985", obj.getString("cal"));
		
		State state = new State(new Long(2), "Mato Grosso");
		state.setCountry(c);
		json = JSONObject.fromString( jgrLevel1.encode(state, new Locale("pt", "BR"), false) );
		obj = json.getJSONArray("obj").getJSONObject(0);
		assertEquals("Test encode with Bean descend levels", 2, obj.getInt("idState") );
		assertEquals("Test encode with Bean descend levels", "Mato Grosso", obj.getString("nameState") );
		obj = obj.getJSONObject("country");
		assertEquals("Test encode with Bean", "Brasil", obj.getString("nameCountry"));
		assertEquals("Test encode with Bean", "15/12/1985", obj.getString("date"));
		assertEquals("Test encode with Bean", "15/12/1985", obj.getString("cal"));
		
		List<State> list = new LinkedList<State>();
		json = JSONObject.fromString( jgr.encode(list, null, false) );
		assertEquals("Test with empty List", 0, json.getJSONArray("obj").length() );
		
		list.add(new State(new Long(1), "Mato Grosso", new Country(1, "Brazil")) );
		list.add(new State(new Long(2), "São Paulo", new Country(1, "Brazil")));
		list.add(new State(new Long(3), "Acre", new Country(1, "Brazil")));
		
		json = JSONObject.fromString( jgr.encode(list, null, false) );
		assertEquals("Test with empty List", 3, json.getJSONArray("obj").length() );
		
		
		// SimpleListData use HashMap, so it cannot be tested
		SimpleListData sld = new SimpleListData();
		json = JSONObject.fromString( jgr.encode(sld, null, false) );
		assertEquals("Test with empty List", 0, json.getJSONArray("obj").length() );
		
		Map<String, String> innerMap = new LinkedHashMap<String, String>();
		innerMap.put("I1", "INNER1");
		innerMap.put("I2", "INNER2");
		innerMap.put("I2", "INNER2");
		json = JSONObject.fromString( jgr.encode(innerMap, null, false) );
		obj = json.getJSONArray("obj").getJSONObject(0);
		assertEquals("Test with Map without Locale", "I1", obj.getString("key"));
		assertEquals("Test with Map without Locale", "INNER1", obj.getString("value"));
		obj = json.getJSONArray("obj").getJSONObject(1);
		assertEquals("Test with Map without Locale", "I2", obj.getString("key"));
		assertEquals("Test with Map without Locale", "INNER2", obj.getString("value"));
		
		map.put("4", innerMap);
		map.put("COLLECTION", map.keySet());
		json = JSONObject.fromString( jgr.encode(map, new Locale("pt", "BR"), false) );
		obj = json.getJSONArray("obj").getJSONObject(0);
		assertEquals("Test with Map without Locale", "1", obj.getString("key"));
		assertEquals("Test with Map without Locale", "One", obj.getString("value"));
		obj = json.getJSONArray("obj").getJSONObject(3);
		assertEquals("Test with Map without Locale", "4", obj.getString("key"));
		obj = obj.getJSONArray("value").getJSONObject(0);
		assertEquals("Test with Map without Locale", "I1", obj.getString("key"));
		assertEquals("Test with Map without Locale", "INNER1", obj.getString("value"));
		
		obj = json.getJSONArray("obj").getJSONObject(4);
		assertEquals("Test with Map without Locale", "COLLECTION", obj.getString("key"));
		JSONArray array = obj.getJSONArray("value");
		assertEquals(5, array.length());
		
		json = JSONObject.fromString( jgr.encode(map.keySet(), new Locale("pt", "BR"), false) );
		array = json.getJSONArray("obj");
		assertEquals(5, array.length());
				
    }
	

    @SuppressWarnings("serial")
	private static class Country implements Serializable {
    	private int idCountry;
    	private String nameCountry;
    	private Date date;
    	private Calendar cal;
    	
    	public Calendar getCal() {
			return cal;
		}

		public void setCal(Calendar cal) {
			this.cal = cal;
		}

		public Country() {
		}
    	
    	public Country(int id, String name) {
    		this.idCountry = id;
    		this.nameCountry = name;
    	}
    	
    	public Country(int id, String name, Date date, Calendar cal){
    		this(id, name);
    		this.date = date;
    		this.cal = cal;
    	}

		public int getIdCountry() {
			return idCountry;
		}

		public void setIdCountry(int id) {
			this.idCountry = id;
		}

		public String getNameCountry() {
			return nameCountry;
		}

		public void setNameCountry(String name) {
			this.nameCountry = name;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
    	
    	
    }
    
    @SuppressWarnings("serial")
	private static class State  implements Serializable {
    	private Long idState;
    	private String nameState;
    	private Country country;
    	
    	public State() {
		}
    	
    	public State(Long id, String name){
    		this.idState = id;
    		this.nameState = name;
    	}

    	public State(Long id, String name, Country country) {
    		this(id, name);
    		this.country = country;
    	}
    	
		public Long getIdState() {
			return idState;
		}

		public void setIdState(Long idState) {
			this.idState = idState;
		}

		public String getNameState() {
			return nameState;
		}

		public void setNameState(String nameState) {
			this.nameState = nameState;
		}

		public Country getCountry() {
			return country;
		}

		public void setCountry(Country idCountry) {
			this.country = idCountry;
		}
    	
    	
    }

}
