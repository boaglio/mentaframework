/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 4:48:36 PM
 * Time to generate: 00:19.496 seconds
 *
 */

package org.mentawai.util;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;

public class ExceptionAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return Exception.class;
    }
    
    public void testConstructor() throws Throwable {
        Throwable t = new ClassFormatError(" ");
        Exception exception = new Exception(t);
        assertSame("exception.getCause()", t, exception.getCause());
        assertSame("exception.rootCause", t, exception.rootCause);
        assertEquals("exception.getMessage()", " ", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor1() throws Throwable {
        Throwable t = new ClassFormatError("");
        Exception exception = new Exception(t);
        assertSame("exception.getCause()", t, exception.getCause());
        assertSame("exception.rootCause", t, exception.rootCause);
        assertEquals("exception.getMessage()", "java.lang.ClassFormatError", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor2() throws Throwable {
        Throwable t = new NumberFormatException();
        Exception exception = new Exception("testExceptionMsg", new Exception("testExceptionMsg", t, true), false);
        assertSame("exception.getCause()", t, exception.getCause());
        assertSame("exception.rootCause", t, exception.rootCause);
        assertEquals("exception.getMessage()", "testExceptionMsg", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor3() throws Throwable {
        Throwable classCircularityError = new ClassCircularityError();
        Exception exception = new Exception("testExceptionMsg", new Throwable(classCircularityError), true);
        assertSame("exception.getCause()", classCircularityError, exception.getCause());
        assertSame("exception.rootCause", classCircularityError, exception.rootCause);
        assertEquals("exception.getMessage()", "testExceptionMsg (ClassCircularityError)", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor4() throws Throwable {
        Throwable t = new ClassCircularityError("testExceptionParam1");
        Exception exception = new Exception("testExceptionMsg", t, true);
        assertSame("exception.getCause()", t, exception.getCause());
        assertSame("exception.rootCause", t, exception.rootCause);
        assertEquals("exception.getMessage()", "testExceptionMsg (ClassCircularityError: testExceptionParam1)", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor5() throws Throwable {
        Exception exception = new Exception("testExceptionMsg");
        assertNull("exception.rootCause", exception.rootCause);
        assertEquals("exception.getMessage()", "testExceptionMsg", exception.getMessage());
    }
    
    public void testConstructor6() throws Throwable {
        Exception exception = new Exception();
        assertNull("exception.rootCause", exception.rootCause);
    }
    
    public void testConstructor7() throws Throwable {
        Throwable t = new NumberFormatException();
        Exception exception = new Exception(new Exception(t));
        assertSame("exception.getCause()", t, exception.getCause());
        assertSame("exception.rootCause", t, exception.rootCause);
        assertEquals("exception.getMessage()", "java.lang.NumberFormatException", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor8() throws Throwable {
        Throwable t = new CloneNotSupportedException("testExceptionParam1");
        Exception exception = new Exception(new Exception(t));
        assertSame("exception.getCause()", t, exception.getCause());
        assertSame("exception.rootCause", t, exception.rootCause);
        assertEquals("exception.getMessage()", "testExceptionParam1", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor9() throws Throwable {
        Throwable t = new NullPointerException();
        Throwable unknownError = new UnknownError();
        t.initCause(unknownError);
        Exception exception = new Exception(t);
        assertSame("exception.getCause()", unknownError, exception.getCause());
        assertSame("exception.rootCause", unknownError, exception.rootCause);
        assertEquals("exception.getMessage()", "java.lang.UnknownError", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor10() throws Throwable {
        Throwable t = new Exception();
        Exception exception = new Exception(t);
        assertSame("exception.getCause()", t, exception.getCause());
        assertSame("exception.rootCause", t, exception.rootCause);
        assertEquals("exception.getMessage()", "org.mentawai.util.Exception", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor11() throws Throwable {
        Throwable classCircularityError = new ClassCircularityError();
        Exception exception = new Exception("testExceptionMsg", new Throwable(classCircularityError));
        assertSame("exception.getCause()", classCircularityError, exception.getCause());
        assertSame("exception.rootCause", classCircularityError, exception.rootCause);
        assertEquals("exception.getMessage()", "testExceptionMsg", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor12() throws Throwable {
        Throwable t = new ArrayStoreException();
        Exception exception = new Exception("testExceptionMsg", t);
        assertSame("exception.getCause()", t, exception.getCause());
        assertSame("exception.rootCause", t, exception.rootCause);
        assertEquals("exception.getMessage()", "testExceptionMsg", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testConstructor13() throws Throwable {
        Throwable t = new ClassFormatError();
        Exception exception = new Exception("testExceptionMsg", t, true);
        assertSame("exception.getCause()", t, exception.getCause());
        assertSame("exception.rootCause", t, exception.rootCause);
        assertEquals("exception.getMessage()", "testExceptionMsg (ClassFormatError)", exception.getMessage());
    }
    
    public void testConstructor14() throws Throwable {
        Throwable t = new ArrayStoreException("testExceptionParam1");
        Exception exception = new Exception("testExceptionMsg", t, false);
        assertSame("exception.getCause()", t, exception.getCause());
        assertSame("exception.rootCause", t, exception.rootCause);
        assertEquals("exception.getMessage()", "testExceptionMsg", exception.getMessage());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testGetCause() throws Throwable {
        Throwable result = new Exception("testExceptionMsg").getCause();
        assertNull("result", result);
    }
    
    public void testGetCause1() throws Throwable {
        Throwable t = new UnknownError();
        Throwable result = new Exception("testExceptionMsg", t, true).getCause();
        assertSame("result", t, result);
    }
    
    public void testGetMsg() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new Throwable(" ", new IncompatibleClassChangeError())});
        assertEquals("result", " ", result);
    }
    
    public void testGetMsg1() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new Throwable("", new IncompatibleClassChangeError())});
        assertEquals("result", "java.lang.IncompatibleClassChangeError", result);
    }
    
    public void testGetMsg2() throws Throwable {
        Object result = callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {null, new ClassCastException(), Boolean.FALSE});
        assertNull("result", result);
    }
    
    public void testGetMsg3() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testExceptionMsg", new ArrayStoreException(""), Boolean.TRUE});
        assertEquals("result", "testExceptionMsg (ArrayStoreException)", result);
    }
    
    public void testGetMsg4() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new NoSuchFieldError("")});
        assertEquals("result", "java.lang.NoSuchFieldError", result);
    }
    
    public void testGetMsg5() throws Throwable {
        Throwable nullPointerException = new NullPointerException();
        nullPointerException.initCause(new NumberFormatException());
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {Throwable.class}, null, new Object[] {nullPointerException});
        assertEquals("result", "java.lang.NumberFormatException", result);
    }
    
    public void testGetMsg6() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new ClassFormatError()});
        assertEquals("result", "java.lang.ClassFormatError", result);
    }
    
    public void testGetMsg7() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {Throwable.class}, null, new Object[] {new NoSuchFieldError("testExceptionParam1")});
        assertEquals("result", "testExceptionParam1", result);
    }
    
    public void testGetMsg8() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testExceptionMsg", new ClassCastException(), Boolean.TRUE});
        assertEquals("result", "testExceptionMsg (ClassCastException)", result);
    }
    
    public void testGetMsg9() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testExceptionMsg", new Throwable(new ClassCircularityError()), Boolean.TRUE});
        assertEquals("result", "testExceptionMsg (ClassCircularityError)", result);
    }
    
    public void testGetMsg10() throws Throwable {
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testExceptionMsg", new Exception(" "), Boolean.TRUE});
        assertEquals("result", "testExceptionMsg (Exception:  )", result);
    }
    
    public void testGetMsg11() throws Throwable {
        Throwable exception = new Exception("testExceptionMsg", new ArrayStoreException("testExceptionParam1"), true);
        String result = (String) callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testExceptionMsg", exception, Boolean.TRUE});
        assertEquals("result", "testExceptionMsg (ArrayStoreException: testExceptionParam1)", result);
    }
    
    public void testGetRootCause() throws Throwable {
        Exception exception = (Exception) Mockingbird.getProxyObject(Exception.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(exception.getCause(), null);
        Mockingbird.enterTestMode(Exception.class);
        Exception result = (Exception) callPrivateMethod("org.mentawai.util.Exception", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {exception});
        assertSame("result", exception, result);
    }
    
    public void testGetRootCause1() throws Throwable {
        Throwable t = new ClassFormatError("testExceptionParam1");
        Throwable result = (Throwable) callPrivateMethod("org.mentawai.util.Exception", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {new Exception(t)});
        assertSame("result", t, result);
    }
    
    public void testConstructorThrowsNullPointerException() throws Throwable {
        try {
            new Exception("testExceptionMsg", null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Exception.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException1() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object rootCause = callPrivateMethod("org.mentawai.util.Exception", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
        Mockingbird.setException(rootCause, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(Exception.class);
        try {
            new Exception("testExceptionMsg", null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testConstructorThrowsNullPointerException2() throws Throwable {
        try {
            new Exception("testExceptionMsg", null, false);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Exception.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException3() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object rootCause = callPrivateMethod("org.mentawai.util.Exception", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
        Mockingbird.setException(rootCause, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(Exception.class);
        try {
            new Exception("testExceptionMsg", null, false);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetMsgThrowsNullPointerException() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object rootCause = callPrivateMethod("org.mentawai.util.Exception", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
        Mockingbird.setException(rootCause, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(Exception.class);
        try {
            callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {Throwable.class}, null, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetMsgThrowsNullPointerException1() throws Throwable {
        try {
            callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {Throwable.class}, null, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Exception.class, ex);
        }
    }
    
    public void testGetMsgThrowsNullPointerException2() throws Throwable {
        try {
            callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testExceptionMsg", null, Boolean.TRUE});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Exception.class, ex);
        }
    }
    
    public void testGetMsgThrowsNullPointerException3() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object rootCause = callPrivateMethod("org.mentawai.util.Exception", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
        Mockingbird.setException(rootCause, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(Exception.class);
        try {
            callPrivateMethod("org.mentawai.util.Exception", "getMsg", new Class[] {String.class, Throwable.class, boolean.class}, null, new Object[] {"testExceptionMsg", null, Boolean.TRUE});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetRootCauseThrowsNullPointerException() throws Throwable {
        try {
            callPrivateMethod("org.mentawai.util.Exception", "getRootCause", new Class[] {Throwable.class}, null, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Exception.class, ex);
        }
    }
}
