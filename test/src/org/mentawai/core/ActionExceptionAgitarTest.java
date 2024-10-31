/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 7:23:31 PM
 * Time to generate: 00:17.331 seconds
 *
 */

package org.mentawai.core;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;

public class ActionExceptionAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ActionException.class;
    }
    
    public void testConstructor() throws Throwable {
        Throwable e = new ClassCircularityError("");
        ActionException actionException = new ActionException(new ActionException(e));
        assertSame("actionException.rootCause", e, actionException.rootCause);
        assertSame("actionException.getCause()", e, actionException.getCause());
        assertEquals("actionException.getMessage()", "java.lang.ClassCircularityError", actionException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor1() throws Throwable {
        Throwable e = new ClassCircularityError("");
        ActionException actionException = new ActionException(e);
        assertSame("actionException.rootCause", e, actionException.rootCause);
        assertSame("actionException.getCause()", e, actionException.getCause());
        assertEquals("actionException.getMessage()", "java.lang.ClassCircularityError", actionException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor2() throws Throwable {
        Throwable e = new ActionException();
        ActionException actionException = new ActionException("testActionExceptionMsg", e);
        assertSame("actionException.rootCause", e, actionException.rootCause);
        assertSame("actionException.getCause()", e, actionException.getCause());
        assertEquals("actionException.getMessage()", "testActionExceptionMsg", actionException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor3() throws Throwable {
        Throwable e = new NullPointerException(" ");
        ActionException actionException = new ActionException(e);
        assertSame("actionException.rootCause", e, actionException.rootCause);
        assertSame("actionException.getCause()", e, actionException.getCause());
        assertEquals("actionException.getMessage()", " ", actionException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor4() throws Throwable {
        Throwable e = new ActionException();
        ActionException actionException = new ActionException(e);
        assertSame("actionException.rootCause", e, actionException.rootCause);
        assertSame("actionException.getCause()", e, actionException.getCause());
        assertEquals("actionException.getMessage()", "org.mentawai.core.ActionException", actionException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor5() throws Throwable {
        Throwable e = new ArrayStoreException();
        Throwable thr = new Throwable();
        e.initCause(thr);
        ActionException actionException = new ActionException(e);
        assertSame("actionException.rootCause", thr, actionException.rootCause);
        assertSame("actionException.getCause()", thr, actionException.getCause());
        assertEquals("actionException.getMessage()", "java.lang.Throwable", actionException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor6() throws Throwable {
        Throwable e = new NoClassDefFoundError("testActionExceptionParam1");
        ActionException actionException = new ActionException(new ActionException("testActionExceptionMsg", e));
        assertSame("actionException.rootCause", e, actionException.rootCause);
        assertSame("actionException.getCause()", e, actionException.getCause());
        assertEquals("actionException.getMessage()", "testActionExceptionParam1", actionException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor7() throws Throwable {
        Throwable e = new ClassFormatError();
        ActionException actionException = new ActionException(new ActionException("testActionExceptionMsg", e));
        assertSame("actionException.rootCause", e, actionException.rootCause);
        assertSame("actionException.getCause()", e, actionException.getCause());
        assertEquals("actionException.getMessage()", "testActionExceptionMsg", actionException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor8() throws Throwable {
        ActionException actionException = new ActionException("testActionExceptionMsg");
        assertNull("actionException.rootCause", actionException.rootCause);
        assertEquals("actionException.getMessage()", "testActionExceptionMsg", actionException.getMessage());
    }
    
    public void testConstructor9() throws Throwable {
        ActionException actionException = new ActionException();
        assertNull("actionException.rootCause", actionException.rootCause);
    }
    
    public void testConstructor10() throws Throwable {
        Throwable e = new ClassFormatError();
        ActionException actionException = new ActionException("testActionExceptionMsg", new ActionException("testActionExceptionMsg", e));
        assertSame("actionException.rootCause", e, actionException.rootCause);
        assertSame("actionException.getCause()", e, actionException.getCause());
        assertEquals("actionException.getMessage()", "testActionExceptionMsg", actionException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testGetCause() throws Throwable {
        Throwable e = new ClassCircularityError("testActionExceptionParam1");
        Throwable result = new ActionException(e).getCause();
        assertSame("result", e, result);
    }
    
    public void testGetCause1() throws Throwable {
        Throwable result = new ActionException().getCause();
        assertNull("result", result);
    }
    
    public void testGetMsg() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.core.ActionException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new IncompatibleClassChangeError("")});
        assertEquals("result", "java.lang.IncompatibleClassChangeError", result);
    }
    
    public void testGetMsg1() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.core.ActionException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new Throwable(new NoSuchFieldError(""))});
        assertEquals("result", "java.lang.NoSuchFieldError: ", result);
    }
    
    public void testGetMsg2() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.core.ActionException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new IncompatibleClassChangeError(" ")});
        assertEquals("result", " ", result);
    }
    
    public void testGetMsg3() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.core.ActionException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new ActionException(new NoClassDefFoundError())});
        assertEquals("result", "java.lang.NoClassDefFoundError", result);
    }
    
    public void testGetMsg4() throws Throwable {
        Throwable unknownError = new UnknownError();
        unknownError.initCause(new NullPointerException());
        String result = (String) callPrivateMethod("org.mentawai.core.ActionException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {unknownError});
        assertEquals("result", "java.lang.NullPointerException", result);
    }
    
    public void testGetMsg5() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.core.ActionException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new ActionException()});
        assertEquals("result", "org.mentawai.core.ActionException", result);
    }
    
    public void testGetMsg6() throws Throwable {
        Throwable thr = new Throwable("testActionExceptionParam1", new ActionException("testActionExceptionMsg"));
        String result = (String) callPrivateMethod("org.mentawai.core.ActionException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {thr});
        assertEquals("result", "testActionExceptionMsg", result);
    }
    
    public void testGetRootCause() throws Throwable {
        Throwable e = new IncompatibleClassChangeError();
        Throwable result = (Throwable) callPrivateMethod("org.mentawai.core.ActionException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {new ActionException("testActionExceptionMsg", e)});
        assertSame("result", e, result);
    }
    
    public void testGetRootCause1() throws Throwable {
        ActionException actionException = (ActionException) Mockingbird.getProxyObject(ActionException.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(actionException.getCause(), null);
        Mockingbird.enterTestMode(ActionException.class);
        ActionException result = (ActionException) callPrivateMethod("org.mentawai.core.ActionException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {actionException});
        assertSame("result", actionException, result);
    }
    
    public void testGetMsgThrowsNullPointerException() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object rootCause = callPrivateMethod("org.mentawai.core.ActionException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
        Mockingbird.setException(rootCause, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(ActionException.class);
        try {
            callPrivateMethod("org.mentawai.core.ActionException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetMsgThrowsNullPointerException1() throws Throwable {
        try {
            callPrivateMethod("org.mentawai.core.ActionException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ActionException.class, ex);
        }
    }
    
    public void testGetRootCauseThrowsNullPointerException() throws Throwable {
        try {
            callPrivateMethod("org.mentawai.core.ActionException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ActionException.class, ex);
        }
    }
}

