/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:13:46 PM
 * Time to generate: 00:17.220 seconds
 *
 */

package org.mentawai.ioc;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.Locale;
import org.mentawai.core.Action;
import org.mentawai.util.MockAction;

public class ActionComponentAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ActionComponent.class;
    }
    
    public void testGetAction() throws Throwable {
        Mockingbird.enterRecordingMode();
        ThreadLocal threadLocal = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        Mockingbird.replaceObjectForRecording(ThreadLocal.class, "<init>()", threadLocal);
        Mockingbird.replaceObjectForRecording(ThreadLocal.class, "<init>()", Mockingbird.getProxyObject(ThreadLocal.class));
        Mockingbird.enterTestMode(ActionComponent.class);
        ActionComponent applicationComponent = new ApplicationComponent();
        Mockingbird.enterRecordingMode();
        MockAction mockAction = (MockAction) Mockingbird.getProxyObject(MockAction.class);
        Mockingbird.setReturnValue(false, threadLocal, "get", "()java.lang.Object", new Object[] {}, mockAction, 1);
        Mockingbird.enterTestMode(ActionComponent.class);
        MockAction result = (MockAction) applicationComponent.getAction();
        assertSame("result", mockAction, result);
    }
    
    public void testGetAction1() throws Throwable {
        ActionComponent applicationComponent = new ApplicationComponent();
        Action result = applicationComponent.getAction();
        assertNull("result", result);
    }
    
    public void testGetInstance() throws Throwable {
        Mockingbird.enterRecordingMode();
        ThreadLocal threadLocal = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        Mockingbird.replaceObjectForRecording(ThreadLocal.class, "<init>()", threadLocal);
        ThreadLocal threadLocal2 = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        Mockingbird.replaceObjectForRecording(ThreadLocal.class, "<init>()", threadLocal2);
        Mockingbird.enterTestMode(ActionComponent.class);
        ActionComponent localeComponent = new LocaleComponent();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, threadLocal2, "get", "()java.lang.Object", new Object[] {}, null, 1);
        MockAction mockAction = (MockAction) Mockingbird.getProxyObject(MockAction.class);
        Mockingbird.setReturnValue(false, threadLocal, "get", "()java.lang.Object", new Object[] {}, mockAction, 1);
        Locale locale = (Locale) Mockingbird.getProxyObject(Locale.class);
        Mockingbird.setReturnValue(localeComponent.getInstance("", mockAction), locale);
        Mockingbird.enterTestMode(ActionComponent.class);
        Locale result = (Locale) localeComponent.getInstance();
        assertSame("result", locale, result);
    }
    
    public void testGetInstance1() throws Throwable {
        Mockingbird.enterRecordingMode();
        ThreadLocal threadLocal = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        Mockingbird.replaceObjectForRecording(ThreadLocal.class, "<init>()", threadLocal);
        ThreadLocal threadLocal2 = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        Mockingbird.replaceObjectForRecording(ThreadLocal.class, "<init>()", threadLocal2);
        Mockingbird.enterTestMode(ActionComponent.class);
        ActionComponent applicationComponent = new ApplicationComponent();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, threadLocal2, "get", "()java.lang.Object", new Object[] {}, " W ", 1);
        MockAction mockAction = (MockAction) Mockingbird.getProxyObject(MockAction.class);
        Mockingbird.setReturnValue(false, threadLocal, "get", "()java.lang.Object", new Object[] {}, mockAction, 1);
        Mockingbird.setReturnValue(applicationComponent.getInstance(" W ", mockAction), null);
        Mockingbird.enterTestMode(ActionComponent.class);
        Object result = applicationComponent.getInstance();
        assertNull("result", result);
    }
    
    public void testGetKey() throws Throwable {
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(ThreadLocal.class, "<init>()", Mockingbird.getProxyObject(ThreadLocal.class));
        ThreadLocal threadLocal = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        Mockingbird.replaceObjectForRecording(ThreadLocal.class, "<init>()", threadLocal);
        Mockingbird.enterTestMode(ActionComponent.class);
        ActionComponent applicationComponent = new ApplicationComponent();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, threadLocal, "get", "()java.lang.Object", new Object[] {}, " W ", 1);
        Mockingbird.enterTestMode(ActionComponent.class);
        String result = applicationComponent.getKey();
        assertEquals("result", " W ", result);
    }
    
    public void testGetKey1() throws Throwable {
        ActionComponent applicationComponent = new ApplicationComponent();
        String result = applicationComponent.getKey();
        assertNull("result", result);
    }
    
    public void testSetAction() throws Throwable {
        new ApplicationComponent().setAction(new MockAction());
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testSetKey() throws Throwable {
        new ApplicationComponent().setKey("testActionComponentk");
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetInstanceThrowsNullPointerException() throws Throwable {
        try {
            new ApplicationComponent().getInstance();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ApplicationComponent.class, ex);
        }
    }
}
