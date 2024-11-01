/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:21:28 PM
 * Time to generate: 00:20.600 seconds
 *
 */

package org.mentawai.filter;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.agitar.mock.servlet.MockHttpServletRequest;
import org.agitar.mock.servlet.MockServletContext;
import org.mentawai.action.BaseLoginAction;
import org.mentawai.action.LogoutAction;
import org.mentawai.ajaxtag.BaseAjaxtagAction;
import org.mentawai.core.Action;
import org.mentawai.core.Context;
import org.mentawai.core.InvocationChain;
import org.mentawai.core.PojoAction;
import org.mentawai.util.MockAction;

public class AuthenticationFilterAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return AuthenticationFilter.class;
    }
    
    public void testConstructor() throws Throwable {
        new AuthenticationFilter();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testDestroy() throws Throwable {
        new AuthenticationFilter().destroy();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testFilter() throws Throwable {
        String result = new AuthenticationFilter().filter(new InvocationChain("testAuthenticationFilterActionName", new MockAction()));
        assertEquals("result", "login", result);
    }
    
    public void testFilter1() throws Throwable {
        AuthenticationFilter authenticationFilter = new AuthenticationFilter();
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        BaseAjaxtagAction baseAjaxtagAction = (BaseAjaxtagAction) Mockingbird.getProxyObject(BaseAjaxtagAction.class);
        setPrivateField(invocationChain, "action", baseAjaxtagAction);
        invocationChain.setInnerAction("");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(baseAjaxtagAction.getSession(), null);
        Mockingbird.setReturnValue(BaseLoginAction.isLogged((Context) null), false);
        Mockingbird.enterTestMode(AuthenticationFilter.class);
        String result = authenticationFilter.filter(invocationChain);
        assertEquals("result", "ajax_denied", result);
    }
    
    public void testFilter2() throws Throwable {
        AuthenticationFilter authenticationFilter = new AuthenticationFilter();
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        setPrivateField(invocationChain, "action", action);
        invocationChain.setInnerAction("");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getSession(), null);
        Mockingbird.setReturnValue(BaseLoginAction.isLogged((Context) null), true);
        Mockingbird.setReturnValue(invocationChain.invoke(), "");
        Mockingbird.enterTestMode(AuthenticationFilter.class);
        String result = authenticationFilter.filter(invocationChain);
        assertEquals("result", "", result);
    }
    
    public void testSetCallbackUrl() throws Throwable {
        HttpSession session = (HttpSession) Mockingbird.getProxyObject(HttpSession.class);
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getRequestURL(), Mockingbird.getProxyObject(StringBuffer.class));
        Mockingbird.setReturnValue(req.getQueryString(), "testString");
        session.setAttribute("url", "?testString");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(AuthenticationFilter.class);
        AuthenticationFilter.setCallbackUrl(session, req);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testSetCallbackUrl1() throws Throwable {
        HttpServletRequest req = new MockServletContext().createHttpServletRequest("https://crvxmbl.com:097/Servlet");
        HttpSession session = (HttpSession) Mockingbird.getProxyObject(HttpSession.class);
        Mockingbird.enterRecordingMode();
        session.setAttribute("url", "https://crvxmbl.com:97/Servlet");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(AuthenticationFilter.class);
        AuthenticationFilter.setCallbackUrl(session, req);
        assertEquals("(MockHttpServletRequest) req.getServerName()", "crvxmbl.com", ((MockHttpServletRequest) req).getServerName());
    }
    
    public void testFilterThrowsNullPointerException() throws Throwable {
        InvocationChain chain = new InvocationChain("testAuthenticationFilterActionName", new PojoAction(""));
        try {
            new AuthenticationFilter().filter(chain);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BaseLoginAction.class, ex);
            assertEquals("chain.getActionName()", "testAuthenticationFilterActionName", chain.getActionName());
        }
    }
    
    public void testFilterThrowsNullPointerException2() throws Throwable {
        try {
            new AuthenticationFilter().filter(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AuthenticationFilter.class, ex);
        }
    }
    
    public void testFilterThrowsNullPointerException3() throws Throwable {
        InvocationChain chain = new InvocationChain("testAuthenticationFilterActionName", null);
        try {
            new AuthenticationFilter().filter(chain);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AuthenticationFilter.class, ex);
            assertEquals("chain.getActionName()", "testAuthenticationFilterActionName", chain.getActionName());
        }
    }
    
    public void testSetCallbackUrlThrowsNullPointerException() throws Throwable {
        HttpServletRequest req = new MockServletContext().createHttpServletRequest("testAuthenticationFilterParam1");
        try {
            AuthenticationFilter.setCallbackUrl(null, req);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AuthenticationFilter.class, ex);
            assertEquals("(MockHttpServletRequest) req.getServerName()", "localhost", ((MockHttpServletRequest) req).getServerName());
        }
    }
    
    public void testSetCallbackUrlThrowsNullPointerException1() throws Throwable {
        HttpSession session = (HttpSession) Mockingbird.getProxyObject(HttpSession.class);
        HttpServletRequest req = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(req.getRequestURL(), null);
        Mockingbird.setReturnValue(req.getQueryString(), "testString");
        Mockingbird.enterTestMode(AuthenticationFilter.class);
        try {
            AuthenticationFilter.setCallbackUrl(session, req);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AuthenticationFilter.class, ex);
        }
    }
}

