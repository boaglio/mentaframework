/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:13:45 PM
 * Time to generate: 00:15.215 seconds
 *
 */

package org.mentawai.message;

import com.agitar.lib.junit.AgitarTestCase;

public class ClassMessageContextAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ClassMessageContext.class;
    }
    
    public void testConstructor() throws Throwable {
        ClassMessageContext classMessageContext = new ClassMessageContext(double.class, null);
        assertEquals("classMessageContext.dir", "/messages", classMessageContext.dir);
        assertEquals("classMessageContext.path", "/messages/double", getPrivateField(classMessageContext, "path"));
    }
    
    public void testConstructor1() throws Throwable {
        ClassMessageContext classMessageContext = new ClassMessageContext(float.class, "testClassMessageContextDir");
        assertEquals("classMessageContext.dir", "testClassMessageContextDir", classMessageContext.dir);
        assertEquals("classMessageContext.path", "testClassMessageContextDir/float", getPrivateField(classMessageContext, "path"));
    }
    
    public void testConstructor2() throws Throwable {
        ClassMessageContext classMessageContext = new ClassMessageContext(Object.class, "testClassMessageContextDir");
        assertEquals("classMessageContext.dir", "testClassMessageContextDir", classMessageContext.dir);
        assertEquals("classMessageContext.path", "testClassMessageContextDir/Object", getPrivateField(classMessageContext, "path"));
    }
    
    public void testConstructor3() throws Throwable {
        ClassMessageContext classMessageContext = new ClassMessageContext(Integer.class, null);
        assertEquals("classMessageContext.dir", "/messages", classMessageContext.dir);
        assertEquals("classMessageContext.path", "/messages/Integer", getPrivateField(classMessageContext, "path"));
    }
    
    public void testConstructor4() throws Throwable {
        ClassMessageContext classMessageContext = new ClassMessageContext(Integer.class);
        assertEquals("classMessageContext.dir", "/messages", classMessageContext.dir);
        assertEquals("classMessageContext.path", "/messages/Integer", getPrivateField(classMessageContext, "path"));
    }
    
    public void testConstructor5() throws Throwable {
        char[] obj = new char[3];
        ClassMessageContext classMessageContext = new ClassMessageContext(obj);
        assertEquals("classMessageContext.dir", "/messages", classMessageContext.dir);
        assertEquals("classMessageContext.path", "/messages/[C", getPrivateField(classMessageContext, "path"));
    }
    
    public void testGetPath() throws Throwable {
        ClassMessageContext classMessageContext = new ClassMessageContext("");
        String result = classMessageContext.getPath();
        assertEquals("result", "/messages/String", result);
    }
    
    public void testConstructorThrowsNullPointerException() throws Throwable {
        try {
            new ClassMessageContext(null, "testClassMessageContextDir");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ClassMessageContext.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException1() throws Throwable {
        try {
            new ClassMessageContext(null, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ClassMessageContext.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException2() throws Throwable {
        try {
            new ClassMessageContext((Class) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ClassMessageContext.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException3() throws Throwable {
        try {
            new ClassMessageContext((Object) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ClassMessageContext.class, ex);
        }
    }
}

