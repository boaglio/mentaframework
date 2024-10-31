/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 7:29:14 PM
 * Time to generate: 00:38.850 seconds
 *
 */

package org.mentawai.core;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.agitar.mock.servlet.MockHttpServletRequest;
import org.agitar.mock.servlet.MockHttpServletResponse;
import org.agitar.mock.servlet.MockHttpSession;
import org.agitar.mock.servlet.MockServletContext;

public class SessionContextAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return SessionContext.class;
    }
    
    public void testConstructor() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        HttpServletResponse res = mockServletContext.createHttpServletResponse();
        SessionContext sessionContext = new SessionContext(req, res);
        Map privateField = (Map) getPrivateField(((MockHttpSession) getPrivateField(req, "session")).getServletContext(), "mimeMap");
        assertEquals("(MockHttpServletRequest) req.session.getServletContext().mimeMap.get(\"txt\")", "text/plain", privateField.get("txt"));
        assertEquals("(MockHttpServletResponse) res", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
        assertEquals("(MockHttpServletResponse) res", "UTF-8", ((MockHttpServletResponse) res).getCharacterEncoding());
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
        assertSame("sessionContext.getResponse()", res, sessionContext.getResponse());
        assertSame("sessionContext.getRequest()", req, sessionContext.getRequest());
    }
    
    public void testContainsKey() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        boolean result = sessionContext.containsKey("");
        assertFalse("result", result);
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testContainsKey1() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        Mockingbird.enterRecordingMode();
        HttpSession httpSession = (HttpSession) Mockingbird.getProxyObject(HttpSession.class);
        Mockingbird.setReturnValue(req.getSession(true), httpSession);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(httpSession.getAttribute("1"), "");
        Mockingbird.enterTestMode(SessionContext.class);
        boolean result = sessionContext.containsKey("1");
        assertTrue("result", result);
        assertSame("sessionContext.getSession()", httpSession, sessionContext.getSession());
    }
    
    public void testGet() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        Object result = sessionContext.get("testString");
        assertNull("result", result);
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testGet1() throws Throwable {
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        Mockingbird.enterRecordingMode();
        HttpSession httpSession = (HttpSession) Mockingbird.getProxyObject(HttpSession.class);
        Mockingbird.setReturnValue(req.getSession(true), httpSession);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(httpSession.getAttribute("abcdefghijklmnnopqrstuvwxyz"), "");
        Mockingbird.enterTestMode(SessionContext.class);
        String result = (String) sessionContext.get("abcdefghijklmnnopqrstuvwxyz");
        assertEquals("result", "", result);
        assertSame("sessionContext.getSession()", httpSession, sessionContext.getSession());
    }
    
    public void testGetAttribute() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Mockingbird.enterRecordingMode();
        HttpSession httpSession = (HttpSession) Mockingbird.getProxyObject(HttpSession.class);
        Mockingbird.setReturnValue(req.getSession(true), httpSession);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(httpSession.getAttribute("testString"), "");
        Mockingbird.enterTestMode(SessionContext.class);
        String result = (String) sessionContext.getAttribute("testString");
        assertEquals("result", "", result);
        assertSame("sessionContext.getSession()", httpSession, sessionContext.getSession());
    }
    
    public void testGetAttribute1() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        Object result = sessionContext.getAttribute("testSessionContextName");
        assertNull("result", result);
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testGetRequest() throws Throwable {
        HttpServletRequest req = new MockServletContext().createHttpServletRequest("testSessionContextParam1");
        HttpServletRequest result = new SessionContext(req, new MockServletContext().createHttpServletResponse()).getRequest();
        assertSame("result", req, result);
    }
    
    public void testGetResponse() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        HttpServletResponse res = mockServletContext.createHttpServletResponse();
        HttpServletResponse result = new SessionContext(req, res).getResponse();
        assertSame("result", res, result);
    }
    
    public void testGetSession() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        HttpSession result = new SessionContext(req, res).getSession();
        assertNull("result", result);
    }
    
    public void testGetSession1() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        MockHttpSession result = (MockHttpSession) new SessionContext(req, mockServletContext.createHttpServletResponse()).getSession();
        assertEquals("result.getId()", "0", result.getId());
    }
    
    public void testHasAttribute() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        boolean result = sessionContext.hasAttribute("testSessionContextName");
        assertFalse("result", result);
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testHasAttribute1() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        Mockingbird.enterRecordingMode();
        HttpSession httpSession = (HttpSession) Mockingbird.getProxyObject(HttpSession.class);
        Mockingbird.setReturnValue(req.getSession(true), httpSession);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(httpSession.getAttribute("testString"), "");
        Mockingbird.enterTestMode(SessionContext.class);
        boolean result = sessionContext.hasAttribute("testString");
        assertTrue("result", result);
        assertSame("sessionContext.getSession()", httpSession, sessionContext.getSession());
    }
    
    public void testKeys() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        Iterator result = sessionContext.keys();
        assertFalse("result.hasNext()", result.hasNext());
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testPut() throws Throwable {
        SessionContext sessionContext = new SessionContext(new MockServletContext().createHttpServletRequest("testSessionContextParam1"), (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class));
        Mockingbird.enterTestMode(SessionContext.class);
        String result = (String) sessionContext.put("testString", "testString");
        assertEquals("result", "testString", result);
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testPut1() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        Integer value = new Integer(19);
        Integer result = (Integer) sessionContext.put("testString", value);
        assertSame("result", value, result);
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testPut2() throws Throwable {
        SessionContext sessionContext = new SessionContext(new MockServletContext().createHttpServletRequest("testSessionContextParam1"), new MockServletContext().createHttpServletResponse());
        Integer value = new Integer(0);
        Integer result = (Integer) sessionContext.put("testString", value);
        assertSame("result", value, result);
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testPut3() throws Throwable {
        SessionContext sessionContext = new SessionContext(new MockServletContext().createHttpServletRequest("testSessionContextParam1"), (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class));
        Mockingbird.enterTestMode(SessionContext.class);
        Object result = sessionContext.put("testString", null);
        assertNull("result", result);
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testRemove() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Mockingbird.enterRecordingMode();
        HttpSession httpSession = (HttpSession) Mockingbird.getProxyObject(HttpSession.class);
        Mockingbird.setReturnValue(req.getSession(true), httpSession);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(httpSession.getAttribute("testString"), "");
        httpSession.removeAttribute("testString");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(SessionContext.class);
        String result = (String) sessionContext.remove("testString");
        assertEquals("result", "", result);
        assertSame("sessionContext.getSession()", httpSession, sessionContext.getSession());
    }
    
    public void testRemove1() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        Object result = sessionContext.remove(",\"o}B=)*\fHHsOL;6fDulTD7{;\nD#J");
        assertNull("result", result);
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testRemove2() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        Mockingbird.enterRecordingMode();
        HttpSession httpSession = (HttpSession) Mockingbird.getProxyObject(HttpSession.class);
        Mockingbird.setReturnValue(req.getSession(true), httpSession);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        Mockingbird.enterRecordingMode();
        Integer integer = new Integer(0);
        Mockingbird.setReturnValue(httpSession.getAttribute(""), integer);
        httpSession.removeAttribute("");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(SessionContext.class);
        Integer result = (Integer) sessionContext.remove("");
        assertSame("result", integer, result);
        assertSame("sessionContext.getSession()", httpSession, sessionContext.getSession());
    }
    
    public void testRemoveAttribute() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        sessionContext.removeAttribute("testSessionContextName");
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testReset() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        sessionContext.reset();
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
        assertSame("sessionContext.getRequest()", req, sessionContext.getRequest());
    }
    
    public void testSetAttribute() throws Throwable {
        SessionContext sessionContext = new SessionContext(new MockServletContext().createHttpServletRequest("testSessionContextParam1"), new MockServletContext().createHttpServletResponse());
        sessionContext.setAttribute("testSessionContextName", new Integer(1));
        assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
    }
    
    public void testContainsKeyThrowsIllegalArgumentException() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        try {
            sessionContext.containsKey(new Object());
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(SessionContext.class, ex);
            assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
        }
    }
    
    public void testContainsKeyThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        try {
            sessionContext.containsKey("$MQ1< 9+\fP)@<F");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("sessionContext.getSession()", sessionContext.getSession());
        }
    }
    
    public void testGetAttributeThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        try {
            sessionContext.getAttribute("testSessionContextName");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("sessionContext.getSession()", sessionContext.getSession());
        }
    }
    
    public void testGetThrowsIllegalArgumentException() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        try {
            sessionContext.get(new Object());
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(SessionContext.class, ex);
            assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
        }
    }
    
    public void testGetThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        try {
            sessionContext.get("testString");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("sessionContext.getSession()", sessionContext.getSession());
        }
    }
    
    public void testHasAttributeThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        try {
            sessionContext.hasAttribute("testSessionContextName");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("sessionContext.getSession()", sessionContext.getSession());
        }
    }
    
    public void testKeysThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        try {
            sessionContext.keys();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("sessionContext.getSession()", sessionContext.getSession());
        }
    }
    
    public void testPutThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        try {
            sessionContext.put("testString", "testString");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("sessionContext.getSession()", sessionContext.getSession());
        }
    }
    
    public void testRemoveAttributeThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        try {
            sessionContext.removeAttribute("testSessionContextName");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("sessionContext.getSession()", sessionContext.getSession());
        }
    }
    
    public void testRemoveThrowsIllegalArgumentException() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testSessionContextParam1");
        SessionContext sessionContext = new SessionContext(req, mockServletContext.createHttpServletResponse());
        try {
            sessionContext.remove(Boolean.FALSE);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(SessionContext.class, ex);
            assertEquals("sessionContext.getSession().getId()", "0", sessionContext.getSession().getId());
        }
    }
    
    public void testRemoveThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        try {
            sessionContext.remove("testString");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("sessionContext.getSession()", sessionContext.getSession());
        }
    }
    
    public void testResetThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        try {
            sessionContext.reset();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("sessionContext.getSession()", sessionContext.getSession());
            assertSame("sessionContext.getRequest()", req, sessionContext.getRequest());
        }
    }
    
    public void testSetAttributeThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse res = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getSession(true), null);
        Mockingbird.enterTestMode(SessionContext.class);
        SessionContext sessionContext = new SessionContext(req, res);
        try {
            sessionContext.setAttribute("testSessionContextName", "testString");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertNull("sessionContext.getSession()", sessionContext.getSession());
        }
    }
}
