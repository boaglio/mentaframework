/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 4:49:25 PM
 * Time to generate: 00:30.082 seconds
 *
 */

package org.mentawai.util;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.lang.reflect.Method;
import java.util.LinkedList;

public class FindMethodAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return FindMethod.class;
    }
    
    public void testConstructor() throws Throwable {
        new FindMethod();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetDeclaredMethod() throws Throwable {
        Class class2 = (Class) Mockingbird.getProxyObject(Class.class);
        Class[] classs = new Class[1];
        Mockingbird.enterRecordingMode();
        LinkedList linkedList = (LinkedList) Mockingbird.getProxyObject(LinkedList.class);
        Mockingbird.replaceObjectForRecording(LinkedList.class, "<init>()", linkedList);
        Mockingbird.setReturnValue(linkedList.size(), 1);
        Mockingbird.setReturnValue(linkedList.get(0), null);
        Mockingbird.enterTestMode(FindMethod.class);
        Method result = FindMethod.getDeclaredMethod(class2, "", classs);
        assertNull("result", result);
    }
    
    public void testGetDeclaredMethodThrowsNullPointerException() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object find = callPrivateMethod("org.mentawai.util.FindMethod", "internalFind", new Class[] {Method[].class, String.class, Class[].class}, null, new Object[] {null, "testFindMethodParam2", null});
        Mockingbird.setException(true, find, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FindMethod.class);
        try {
            FindMethod.getDeclaredMethod(boolean.class, "testFindMethodName", (Class[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetDeclaredMethodThrowsNullPointerException1() throws Throwable {
        try {
            FindMethod.getDeclaredMethod(boolean.class, "testFindMethodName", (Class[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(FindMethod.class, ex);
        }
    }
    
    public void testGetDeclaredMethodThrowsNullPointerException2() throws Throwable {
        Class[] classs = new Class[2];
        try {
            FindMethod.getDeclaredMethod(null, "testFindMethodName", classs);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(FindMethod.class, ex);
        }
    }
    
    public void testGetMethodThrowsNullPointerException() throws Throwable {
        Class[] classs = new Class[3];
        try {
            FindMethod.getMethod(null, "testFindMethodName", classs);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(FindMethod.class, ex);
        }
    }
    
    public void testGetMethodThrowsNullPointerException1() throws Throwable {
        Mockingbird.enterRecordingMode();
        Object find = callPrivateMethod("org.mentawai.util.FindMethod", "internalFind", new Class[] {Method[].class, String.class, Class[].class}, null, new Object[] {null, "testFindMethodParam2", null});
        Mockingbird.setException(true, find, (Throwable) Mockingbird.getProxyObject(NullPointerException.class));
        Mockingbird.enterTestMode(FindMethod.class);
        try {
            FindMethod.getMethod(String.class, "testFindMethodName", (Class[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetMethodThrowsNullPointerException2() throws Throwable {
        try {
            FindMethod.getMethod(String.class, "testFindMethodName", (Class[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(FindMethod.class, ex);
        }
    }
    
    public void testInternalFindThrowsNoSuchMethodException() throws Throwable {
        Method[] methods = new Method[0];
        Class[] classs = new Class[2];
        try {
            callPrivateMethod("org.mentawai.util.FindMethod", "internalFind", new Class[] {Method[].class, String.class, Class[].class}, null, new Object[] {methods, "testFindMethodName", classs});
            fail("Expected NoSuchMethodException to be thrown");
        } catch (NoSuchMethodException ex) {
            assertEquals("ex.getMessage()", "No such method: testFindMethodName", ex.getMessage());
            assertThrownBy(FindMethod.class, ex);
        }
    }
    
    public void testInternalFindThrowsNullPointerException() throws Throwable {
        Method[] methods = new Method[2];
        try {
            callPrivateMethod("org.mentawai.util.FindMethod", "internalFind", new Class[] {Method[].class, String.class, Class[].class}, null, new Object[] {methods, "testFindMethodName", null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(FindMethod.class, ex);
        }
    }
    
    public void testInternalFindThrowsNullPointerException1() throws Throwable {
        Class[] classs = new Class[1];
        try {
            callPrivateMethod("org.mentawai.util.FindMethod", "internalFind", new Class[] {Method[].class, String.class, Class[].class}, null, new Object[] {null, "testFindMethodName", classs});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(FindMethod.class, ex);
        }
    }
    
    public void testInternalFindThrowsNullPointerException2() throws Throwable {
        Method[] methods = new Method[2];
        Class[] classs = new Class[0];
        try {
            callPrivateMethod("org.mentawai.util.FindMethod", "internalFind", new Class[] {Method[].class, String.class, Class[].class}, null, new Object[] {methods, "testFindMethodName", classs});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(FindMethod.class, ex);
        }
    }
}

