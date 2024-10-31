/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 4:47:43 PM
 * Time to generate: 00:19.894 seconds
 *
 */

package org.mentawai.util;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import org.mentawai.template.TemplateException;

public class RuntimeExceptionAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return RuntimeException.class;
    }
    
    public void testConstructor() throws Throwable {
        RuntimeException runtimeException = new RuntimeException("testRuntimeExceptionMsg");
        assertNull("runtimeException.rootCause", runtimeException.rootCause);
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionMsg", runtimeException.getMessage());
    }
    
    public void testConstructor1() throws Throwable {
        Throwable t = new ArrayStoreException("");
        RuntimeException runtimeException = new RuntimeException(t);
        assertSame("runtimeException.rootCause", t, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", t, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "java.lang.ArrayStoreException", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor2() throws Throwable {
        Throwable t = new CloneNotSupportedException();
        RuntimeException runtimeException = new RuntimeException("testRuntimeExceptionMsg", t, false);
        assertSame("runtimeException.rootCause", t, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", t, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionMsg", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor3() throws Throwable {
        Throwable numberFormatException = new NumberFormatException();
        RuntimeException runtimeException = new RuntimeException("testRuntimeExceptionMsg", new Throwable(numberFormatException), false);
        assertSame("runtimeException.rootCause", numberFormatException, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", numberFormatException, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionMsg", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor4() throws Throwable {
        Throwable t = new ArrayStoreException("testRuntimeExceptionParam1");
        RuntimeException runtimeException = new RuntimeException("testRuntimeExceptionMsg", new RuntimeException(t), true);
        assertSame("runtimeException.rootCause", t, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", t, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionMsg (ArrayStoreException: testRuntimeExceptionParam1)", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor5() throws Throwable {
        Throwable t = new Throwable("testRuntimeExceptionParam1");
        RuntimeException runtimeException = new RuntimeException("testRuntimeExceptionMsg", t);
        assertSame("runtimeException.rootCause", t, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", t, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionMsg", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor6() throws Throwable {
        Throwable cloneNotSupportedException = new CloneNotSupportedException();
        RuntimeException runtimeException = new RuntimeException("testRuntimeExceptionMsg", new Throwable(cloneNotSupportedException));
        assertSame("runtimeException.rootCause", cloneNotSupportedException, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", cloneNotSupportedException, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionMsg", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor7() throws Throwable {
        RuntimeException runtimeException = new RuntimeException();
        assertNull("runtimeException.rootCause", runtimeException.rootCause);
    }
    
    public void testConstructor8() throws Throwable {
        Throwable t = new NoSuchFieldError();
        RuntimeException runtimeException = new RuntimeException(t);
        assertSame("runtimeException.rootCause", t, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", t, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "java.lang.NoSuchFieldError", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor9() throws Throwable {
        Throwable noClassDefFoundError = new NoClassDefFoundError("testRuntimeExceptionParam1");
        RuntimeException runtimeException = new RuntimeException(new Throwable(noClassDefFoundError));
        assertSame("runtimeException.rootCause", noClassDefFoundError, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", noClassDefFoundError, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionParam1", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor10() throws Throwable {
        Throwable t = new NumberFormatException();
        Throwable thr = new Throwable();
        t.initCause(thr);
        RuntimeException runtimeException = new RuntimeException(t);
        assertSame("runtimeException.rootCause", thr, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", thr, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "java.lang.Throwable", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor11() throws Throwable {
        Throwable t = new NoSuchFieldError();
        RuntimeException runtimeException = new RuntimeException(new RuntimeException(t));
        assertSame("runtimeException.rootCause", t, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", t, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "java.lang.NoSuchFieldError", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor12() throws Throwable {
        Throwable t = new TemplateException("testRuntimeExceptionMessage");
        RuntimeException runtimeException = new RuntimeException(t);
        assertSame("runtimeException.rootCause", t, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", t, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionMessage", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor13() throws Throwable {
        Throwable t = new UnknownError();
        RuntimeException runtimeException = new RuntimeException("testRuntimeExceptionMsg", new RuntimeException(t), true);
        assertSame("runtimeException.rootCause", t, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", t, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionMsg (UnknownError)", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor14() throws Throwable {
        Throwable t = new CloneNotSupportedException();
        RuntimeException runtimeException = new RuntimeException("testRuntimeExceptionMsg", t, true);
        assertSame("runtimeException.rootCause", t, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", t, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionMsg (CloneNotSupportedException)", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor15() throws Throwable {
        Throwable t = new Throwable("testRuntimeExceptionParam1");
        RuntimeException runtimeException = new RuntimeException("testRuntimeExceptionMsg", t, true);
        assertSame("runtimeException.rootCause", t, runtimeException.rootCause);
        assertSame("runtimeException.getCause()", t, runtimeException.getCause());
        assertEquals("runtimeException.getMessage()", "testRuntimeExceptionMsg (Throwable: testRuntimeExceptionParam1)", runtimeException.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testGetCause() throws Throwable {
        Throwable t = new NoSuchFieldError();
        Throwable result = new RuntimeException(t).getCause();
        assertSame("result", t, result);
    }
    
    public void testGetCause1() throws Throwable {
        Throwable result = new TemplateException("testRuntimeExceptionMessage").getCause();
        assertNull("result", result);
    }
    
    public void testGetMsg() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new Throwable("")});
        assertEquals("result", "java.lang.Throwable", result);
    }
    
    public void testGetMsg1() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new Throwable(new IncompatibleClassChangeError())});
        assertEquals("result", "java.lang.IncompatibleClassChangeError", result);
    }
    
    public void testGetMsg2() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testRuntimeExceptionMsg", new IncompatibleClassChangeError("testRuntimeExceptionParam1"), Boolean.TRUE});
        assertEquals("result", "testRuntimeExceptionMsg (IncompatibleClassChangeError: testRuntimeExceptionParam1)", result);
    }
    
    public void testGetMsg3() throws Throwable {
        Throwable thr = new Throwable();
        thr.initCause(new Throwable(new CloneNotSupportedException()));
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testRuntimeExceptionMsg", thr, Boolean.TRUE});
        assertEquals("result", "testRuntimeExceptionMsg (CloneNotSupportedException)", result);
    }
    
    public void testGetMsg4() throws Throwable {
        Throwable numberFormatException = new NumberFormatException();
        numberFormatException.initCause(new Throwable());
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {numberFormatException});
        assertEquals("result", "java.lang.Throwable", result);
    }
    
    public void testGetMsg5() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new RuntimeException()});
        assertEquals("result", "org.mentawai.util.RuntimeException", result);
    }
    
    public void testGetMsg6() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new RuntimeException("testRuntimeExceptionMsg")});
        assertEquals("result", "testRuntimeExceptionMsg", result);
    }
    
    public void testGetMsg7() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new Throwable(new CloneNotSupportedException("testRuntimeExceptionParam1"))});
        assertEquals("result", "testRuntimeExceptionParam1", result);
    }
    
    public void testGetMsg8() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testRuntimeExceptionMsg", new NoClassDefFoundError(), Boolean.TRUE});
        assertEquals("result", "testRuntimeExceptionMsg (NoClassDefFoundError)", result);
    }
    
    public void testGetMsg9() throws Throwable {
        Object result = callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {null, new IncompatibleClassChangeError("testRuntimeExceptionParam1"), Boolean.FALSE});
        assertNull("result", result);
    }
    
    public void testGetMsg10() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testRuntimeExceptionMsg", new Throwable(new NoClassDefFoundError("testRuntimeExceptionParam1")), Boolean.TRUE});
        assertEquals("result", "testRuntimeExceptionMsg (NoClassDefFoundError: testRuntimeExceptionParam1)", result);
    }
    
    public void testGetMsg11() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testRuntimeExceptionMsg", new RuntimeException(new UnknownError()), Boolean.TRUE});
        assertEquals("result", "testRuntimeExceptionMsg (UnknownError)", result);
    }
    
    public void testGetRootCause() throws Throwable {
        Throwable runtimeException = new RuntimeException("testRuntimeExceptionMsg");
        Throwable result = (Throwable) callPrivateMethod("org.mentawai.util.RuntimeException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {new Throwable(runtimeException)});
        assertSame("result", runtimeException, result);
    }
    
    public void testGetRootCause1() throws Throwable {
        RuntimeException runtimeException = (RuntimeException) Mockingbird.getProxyObject(RuntimeException.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(runtimeException.getCause(), null);
        Mockingbird.enterTestMode(RuntimeException.class);
        RuntimeException result = (RuntimeException) callPrivateMethod("org.mentawai.util.RuntimeException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {runtimeException});
        assertSame("result", runtimeException, result);
    }
    
    public void testConstructorThrowsNullPointerException() throws Throwable {
        try {
            new RuntimeException("testRuntimeExceptionMsg", null, false);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(RuntimeException.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException1() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object rootCause = callPrivateMethod("org.mentawai.util.RuntimeException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
        Mockingbird.setException(rootCause, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(RuntimeException.class);
        try {
            new RuntimeException("testRuntimeExceptionMsg", null, false);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testConstructorThrowsNullPointerException2() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object rootCause = callPrivateMethod("org.mentawai.util.RuntimeException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
        Mockingbird.setException(rootCause, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(RuntimeException.class);
        try {
            new RuntimeException("testRuntimeExceptionMsg", null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testConstructorThrowsNullPointerException3() throws Throwable {
        try {
            new RuntimeException("testRuntimeExceptionMsg", null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(RuntimeException.class, ex);
        }
    }
    
    public void testGetMsgThrowsNullPointerException() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object rootCause = callPrivateMethod("org.mentawai.util.RuntimeException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
        Mockingbird.setException(rootCause, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(RuntimeException.class);
        try {
            callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetMsgThrowsNullPointerException1() throws Throwable {
        try {
            callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {Throwable.class}, null, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(RuntimeException.class, ex);
        }
    }
    
    public void testGetMsgThrowsNullPointerException2() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object rootCause = callPrivateMethod("org.mentawai.util.RuntimeException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
        Mockingbird.setException(rootCause, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(RuntimeException.class);
        try {
            callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testRuntimeExceptionMsg", null, Boolean.TRUE});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetMsgThrowsNullPointerException3() throws Throwable {
        try {
            callPrivateMethod("org.mentawai.util.RuntimeException", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testRuntimeExceptionMsg", null, Boolean.TRUE});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(RuntimeException.class, ex);
        }
    }
    
    public void testGetRootCauseThrowsNullPointerException() throws Throwable {
        try {
            callPrivateMethod("org.mentawai.util.RuntimeException", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(RuntimeException.class, ex);
        }
    }
}

