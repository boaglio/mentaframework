/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 4:49:18 PM
 * Time to generate: 00:36.175 seconds
 *
 */

package org.mentawai.util;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.HashMap;
import java.util.Locale;
import javax.servlet.ServletContext;
import org.mentawai.action.LogoutAction;
import org.mentawai.action.SuccessAction;
import org.mentawai.core.Action;
import org.mentawai.core.ActionException;
import org.mentawai.core.ApplicationContext;
import org.mentawai.core.Context;
import org.mentawai.core.MapContext;
import org.mentawai.core.MapInput;
import org.mentawai.core.MapOutput;
import org.mentawai.core.PojoAction;

public class MockActionAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return MockAction.class;
    }
    
    public void testConstructor() throws Throwable {
        MockAction mockAction = new MockAction();
    }
    
    public void testConstructor1() throws Throwable {
        Action action = new MockAction();
        MockAction mockAction = new MockAction(action);
        assertSame("mockAction.getAction()", action, mockAction.getAction());
    }
    
    public void testGetAction() throws Throwable {
        Action action = new LogoutAction();
        Action result = new MockAction(action).getAction();
        assertSame("result", action, result);
    }
    
    public void testGetApplication() throws Throwable {
        MockAction mockAction = new MockAction();
        MapContext result = (MapContext) mockAction.getApplication();
        assertNotNull("result", result);
    }
    
    public void testGetCookies() throws Throwable {
        MockAction mockAction = new MockAction();
        MapContext result = (MapContext) mockAction.getCookies();
        assertNotNull("result", result);
    }
    
     
    public void testGetLocale1() throws Throwable {
        MockAction action = new MockAction();
        MockAction mockAction = new MockAction(action);
        action.setLocale(null);
        Locale result = mockAction.getLocale();
        assertNull("result", result);
        assertSame("mockAction.getAction()", action, mockAction.getAction());
    }
    
    public void testGetMethod() throws Throwable {
        MockAction mockAction = new MockAction(new LogoutAction());
        Object result = callPrivateMethod("org.mentawai.util.MockAction", "getMethod", new Class[] {String.class}, mockAction, new Object[] {"testMockActionInnerAction"});
        assertNull("result", result);
    }
    
    public void testGetOutput() throws Throwable {
        MockAction mockAction = new MockAction();
        MapOutput result = (MapOutput) mockAction.getOutput();
        assertTrue("result.isEmpty()", result.isEmpty());
    }
    
    public void testGetSession() throws Throwable {
        MockAction mockAction = new MockAction();
        MapContext result = (MapContext) mockAction.getSession();
        assertNotNull("result", result);
    }
    
    public void testInit() throws Throwable {
        Action action = new MockAction();
        MockAction.init(action);
    }
    
    public void testSetApplication() throws Throwable {
        Action action = new LogoutAction();
        MockAction mockAction = new MockAction(action);
        mockAction.setApplication(new MapContext());
        assertSame("mockAction.getAction()", action, mockAction.getAction());
    }
    
    public void testSetCookies() throws Throwable {
        MockAction mockAction = new MockAction();
        Context context = new ApplicationContext((ServletContext) Mockingbird.getProxyObject(ServletContext.class));
        Mockingbird.enterTestMode(MockAction.class);
        mockAction.setCookies(context);
    }
    
    public void testSetInput() throws Throwable {
        MockAction mockAction = new MockAction();
        mockAction.setInput(new MapInput(new HashMap(100, 100.0F)));
    }
    
    public void testSetLocale() throws Throwable {
        Action action = new SuccessAction();
        MockAction mockAction = new MockAction(action);
        mockAction.setLocale(Locale.ENGLISH);
        assertSame("mockAction.getAction()", action, mockAction.getAction());
    }
    
    public void testSetOutput() throws Throwable {
        MockAction mockAction = new MockAction();
        mockAction.setOutput(new MapOutput());
    }
    
    public void testSetSession() throws Throwable {
        Action action = new PojoAction(new Object());
        MockAction mockAction = new MockAction(action);
        mockAction.setSession(new MapContext());
        assertSame("mockAction.getAction()", action, mockAction.getAction());
    }
    
    public void testConstructorThrowsRuntimeException1() throws Throwable {
        Class class2 = (Class) Mockingbird.getProxyObject(Class.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(RuntimeException.class, "<init>(java.lang.Throwable)", Mockingbird.getProxyObject(RuntimeException.class));
        Mockingbird.enterTestMode();
        try {
            new MockAction(class2);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testCallInnerActionThrowsActionException() throws Throwable {
        try {
            new MockAction(new PojoAction("testString")).callInnerAction("testMockActionInnerAction");
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertEquals("ex.getMessage()", "The inner action does not exist: testMockActionInnerAction", ex.getMessage());
            assertThrownBy(MockAction.class, ex);
            assertNull("ex.getCause()", ex.getCause());
        }
    }
    
    public void testGetMockActionThrowsRuntimeException() throws Throwable {
        try {
            MockAction.getMockAction(String.class);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertEquals("ex.getMessage()", "Class is not an Action: class java.lang.String", ex.getMessage());
            assertThrownBy(MockAction.class, ex);
            assertEquals("ex.rootCause.getMessage()", "Class is not an Action: class java.lang.String", ex.rootCause.getMessage());
        }
    }
    
    public void testGetMockActionThrowsRuntimeException1() throws Throwable {
        try {
            MockAction.getMockAction(Integer.class);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertEquals("ex.getMessage()", "java.lang.Integer", ex.getMessage());
            assertThrownBy(Class.class, ex);
            assertEquals("ex.rootCause.getMessage()", "java.lang.Integer", ex.rootCause.getMessage());
        }
    }
    
    public void testInitThrowsNullPointerException() throws Throwable {
        try {
            MockAction.init(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MockAction.class, ex);
        }
    }
}

