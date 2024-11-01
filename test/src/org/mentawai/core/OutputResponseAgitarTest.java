/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 7:30:22 PM
 * Time to generate: 00:44.620 seconds
 *
 */

package org.mentawai.core;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletResponse;
import org.agitar.mock.servlet.MockHttpServletResponse;
import org.agitar.mock.servlet.MockServletContext;

public class OutputResponseAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ResponseOutput.class;
    }
    
    public void testConstructor() throws Throwable {
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        ResponseOutput outputResponse = new ResponseOutput(res);
        assertEquals("(MockHttpServletResponse) res", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
        assertEquals("(MockHttpServletResponse) res", "UTF-8", ((MockHttpServletResponse) res).getCharacterEncoding());
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
        assertSame("outputResponse.getResponse()", res, outputResponse.getResponse());
    }
    
    public void testContainsKey() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"161_Hb/\t9lB\t", ""});
        boolean result = outputResponse.containsKey("161_Hb/\t9lB\t");
        assertTrue("result", result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testContainsKey1() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        boolean result = outputResponse.containsKey("   ");
        assertFalse("result", result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testContainsValue() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"testString", ""});
        boolean result = outputResponse.containsValue("");
        assertTrue("result", result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testContainsValue1() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        boolean result = outputResponse.containsValue(new Integer(0));
        assertFalse("result", result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testGet() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Boolean boolean2 = Boolean.FALSE;
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"testString", boolean2});
        Boolean result = (Boolean) outputResponse.get("testString");
        assertSame("result", boolean2, result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testGet1() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Integer value = new Integer(2);
        outputResponse.put("testString", value);
        Integer result = (Integer) outputResponse.get("testString");
        assertSame("result", value, result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testGet2() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Integer value = new Integer(0);
        outputResponse.put("testString", value);
        Integer result = (Integer) outputResponse.get("testString");
        assertSame("result", value, result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testGet3() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Object result = outputResponse.get(" = ");
        assertNull("result", result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testGet4() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        String value = (String) outputResponse.put("testString", "testString");
        String result = (String) outputResponse.get("testString");
        assertEquals("result", value, result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testGetResponse() throws Throwable {
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        HttpServletResponse result = new ResponseOutput(res).getResponse();
        assertSame("result", res, result);
    }
    
    public void testGetValue() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        outputResponse.put("testOutputResponseKey", "testString");
        Iterator keys = outputResponse.keys();
        ResponseOutput outputResponse2 = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse2, new Object[] {"testString", keys});
        Iterator result = (Iterator) outputResponse2.getValue("testString");
        assertSame("result", keys, result);
        assertEquals("outputResponse2.map.size()", 1, ((Map) getPrivateField(outputResponse2, "map")).size());
    }
    
    public void testGetValue1() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        String put = (String) callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"testString", ""});
        String result = (String) outputResponse.getValue("testString");
        assertEquals("result", put, result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testGetValue2() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Object result = outputResponse.getValue("testOutputResponseName");
        assertNull("result", result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testIsEmpty() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        boolean result = outputResponse.isEmpty();
        assertTrue("result", result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testIsEmpty1() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        String put = (String) callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"testString", "testString"});
        boolean result = outputResponse.isEmpty();
        assertFalse("result", result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testKeys() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"testString", "testString"});
        Iterator result = outputResponse.keys();
        assertTrue("result.hasNext()", result.hasNext());
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testKeys1() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Object value = Mockingbird.getProxyObject(Object.class);
        Mockingbird.enterRecordingMode();
        HashMap hashMap = (HashMap) Mockingbird.getProxyObject(HashMap.class);
        Mockingbird.setReturnValue(false, hashMap, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.enterTestMode(ResponseOutput.class);
        outputResponse.put("testOutputResponseKey", value);
        Mockingbird.enterRecordingMode();
        Set abstractSet = (Set) Mockingbird.getProxyObject(Set.class);
        Mockingbird.setReturnValue(false, hashMap, "keySet", "()java.util.Set", abstractSet, 1);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Mockingbird.setReturnValue(false, abstractSet, "iterator", "()java.util.Iterator", new Object[] {}, iterator, 1);
        Mockingbird.enterTestMode(ResponseOutput.class);
        Iterator result = outputResponse.keys();
        assertSame("result", iterator, result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testKeys2() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Iterator result = outputResponse.keys();
        assertFalse("result.hasNext()", result.hasNext());
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testPut() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Integer value = new Integer(2);
        Integer result = (Integer) outputResponse.put("testOutputResponseKey", value);
        assertSame("result", value, result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testPut1() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        String result = (String) outputResponse.put("testOutputResponseKey", "");
        assertEquals("result", "", result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testPut2() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Boolean value = Boolean.FALSE;
        Boolean result = (Boolean) outputResponse.put("testOutputResponseKey", value);
        assertSame("result", value, result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testPut3() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Object result = outputResponse.put("testOutputResponseKey", null);
        assertNull("result", result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testPut4() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Integer value = new Integer(0);
        Integer result = (Integer) outputResponse.put("testOutputResponseKey", value);
        assertSame("result", value, result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testPut5() throws Throwable {
        Map outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        ResponseOutput outputResponse2 = (ResponseOutput) Mockingbird.getProxyObject(ResponseOutput.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(HashMap.class), "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.enterTestMode(ResponseOutput.class);
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"t\"5CB\\", outputResponse2});
        Mockingbird.enterRecordingMode();
        Boolean value = Boolean.TRUE;
        outputResponse2.setValue("testString", value);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(ResponseOutput.class);
        Boolean result = (Boolean) outputResponse2.put("testString", value);
        assertSame("result", value, result);
        assertNull("outputResponse2.map", getPrivateField(outputResponse2, "map"));
    }
    
    public void testRemove() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Object result = outputResponse.remove("42");
        assertNull("result", result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testRemove1() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"", outputResponse});
        ResponseOutput result = (ResponseOutput) outputResponse.remove("");
        assertSame("result", outputResponse, result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testRemove2() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        Integer integer = new Integer(0);
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"testString", integer});
        Integer result = (Integer) outputResponse.remove("testString");
        assertSame("result", integer, result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testRemoveValue() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        outputResponse.removeValue("testOutputResponseName");
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testSetValue() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        outputResponse.setValue("testOutputResponseName", "");
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testSize() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        int result = outputResponse.size();
        assertEquals("result", 0, result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testSize1() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"", ""});
        int result = outputResponse.size();
        assertEquals("result", 1, result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testToString() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput((HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class));
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"\u0010Mo<7BP[d1`VK U\u0003i", ""});
        outputResponse.put("testOutputResponseKey", null);
        Mockingbird.enterTestMode(ResponseOutput.class);
        String result = outputResponse.toString();
        assertEquals("result", "testOutputResponseKey = null\n\u0010Mo<7BP[d1`VK U\u0003i = \n", result);
        assertEquals("outputResponse.map.size()", 2, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testToString1() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput((HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class));
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, outputResponse, new Object[] {"testString", "testString"});
        Mockingbird.enterTestMode(ResponseOutput.class);
        String result = outputResponse.toString();
        assertEquals("result", "testString = testString\n", result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testToString2() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput((HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class));
        outputResponse.put("testOutputResponseKey", null);
        Mockingbird.enterTestMode(ResponseOutput.class);
        String result = outputResponse.toString();
        assertEquals("result", "testOutputResponseKey = null\n", result);
        assertEquals("outputResponse.map.size()", 1, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testToString3() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        String result = outputResponse.toString();
        assertEquals("result", "", result);
        assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
    }
    
    public void testContainsKeyThrowsIllegalArgumentException() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        try {
            outputResponse.containsKey(new Integer(0));
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ResponseOutput.class, ex);
            assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
        }
    }
    
    public void testGetThrowsIllegalArgumentException() throws Throwable {
        ResponseOutput outputResponse = (ResponseOutput) Mockingbird.getProxyObject(ResponseOutput.class);
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, new ResponseOutput(new MockServletContext().createHttpServletResponse()), new Object[] {"7[6\"r@)>\n+sCVJ", outputResponse});
        Mockingbird.enterTestMode(ResponseOutput.class);
        try {
            outputResponse.get(Boolean.FALSE);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ResponseOutput.class, ex);
            assertNull("outputResponse.map", getPrivateField(outputResponse, "map"));
        }
    }
    
    public void testPutThrowsIllegalArgumentException() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        try {
            outputResponse.put((String) null, "testString");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ResponseOutput.class, ex);
            assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
        }
    }
    
    public void testPutThrowsNullPointerException() throws Throwable {
        ResponseOutput outputResponse = (ResponseOutput) Mockingbird.getProxyObject(ResponseOutput.class);
        callPrivateMethod("java.util.Map", "put", new Class[] {Object.class, Object.class}, new ResponseOutput(new MockServletContext().createHttpServletResponse()), new Object[] {"t\"5CB\\", outputResponse});
        Mockingbird.enterTestMode(ResponseOutput.class);
        try {
            outputResponse.put("testOutputResponseKey", Boolean.TRUE);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("outputResponse.map", getPrivateField(outputResponse, "map"));
        }
    }
    
    public void testRemoveThrowsIllegalArgumentException() throws Throwable {
        ResponseOutput outputResponse = new ResponseOutput(new MockServletContext().createHttpServletResponse());
        char[] key = new char[2];
        try {
            outputResponse.remove(key);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ResponseOutput.class, ex);
            assertEquals("outputResponse.map.size()", 0, ((Map) getPrivateField(outputResponse, "map")).size());
        }
    }
}

