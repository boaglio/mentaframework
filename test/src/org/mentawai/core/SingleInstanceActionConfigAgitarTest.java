/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 7:29:10 PM
 * Time to generate: 00:19.788 seconds
 *
 */

package org.mentawai.core;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.Collection;
import java.util.Map;
import org.mentawai.action.LogoutAction;
import org.mentawai.action.SuccessAction;
import org.mentawai.util.MockAction;

public class SingleInstanceActionConfigAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return SingleInstanceActionConfig.class;
    }
    
    public void testConstructor() throws Throwable {
        Mockingbird.ignoreConstructorExceptions(ActionConfig.class);
        SingleInstanceActionConfig singleInstanceActionConfig = new SingleInstanceActionConfig(null);
        assertNull("singleInstanceActionConfig.dirName", getPrivateField(singleInstanceActionConfig, "dirName"));
        assertNull("singleInstanceActionConfig.getName()", singleInstanceActionConfig.getName());
        assertEquals("singleInstanceActionConfig.consequences.size()", 0, ((Map) getPrivateField(singleInstanceActionConfig, "consequences")).size());
        assertEquals("singleInstanceActionConfig.filters.size()", 0, ((Collection) getPrivateField(singleInstanceActionConfig, "filters")).size());
        int actual = ((Collection) getPrivateField(singleInstanceActionConfig, "firstFilters")).size();
        assertEquals("singleInstanceActionConfig.firstFilters.size()", 0, actual);
        assertNull("singleInstanceActionConfig.getAction()", singleInstanceActionConfig.getAction());
        assertEquals("singleInstanceActionConfig.innerConsequences.size()", 0, ((Map) getPrivateField(singleInstanceActionConfig, "innerConsequences")).size());
        assertNull("singleInstanceActionConfig.getInnerAction()", singleInstanceActionConfig.getInnerAction());
        assertNull("singleInstanceActionConfig.actionClass", singleInstanceActionConfig.actionClass);
    }
    
    public void testConstructor1() throws Throwable {
        Mockingbird.ignoreConstructorExceptions(ActionConfig.class);
        SingleInstanceActionConfig singleInstanceActionConfig = new SingleInstanceActionConfig("", null);
        assertNull("singleInstanceActionConfig.dirName", getPrivateField(singleInstanceActionConfig, "dirName"));
        assertEquals("singleInstanceActionConfig.getName()", "", singleInstanceActionConfig.getName());
        assertEquals("singleInstanceActionConfig.consequences.size()", 0, ((Map) getPrivateField(singleInstanceActionConfig, "consequences")).size());
        assertEquals("singleInstanceActionConfig.filters.size()", 0, ((Collection) getPrivateField(singleInstanceActionConfig, "filters")).size());
        int actual = ((Collection) getPrivateField(singleInstanceActionConfig, "firstFilters")).size();
        assertEquals("singleInstanceActionConfig.firstFilters.size()", 0, actual);
        assertNull("singleInstanceActionConfig.getAction()", singleInstanceActionConfig.getAction());
        assertEquals("singleInstanceActionConfig.innerConsequences.size()", 0, ((Map) getPrivateField(singleInstanceActionConfig, "innerConsequences")).size());
        assertNull("singleInstanceActionConfig.getInnerAction()", singleInstanceActionConfig.getInnerAction());
        assertNull("singleInstanceActionConfig.actionClass", singleInstanceActionConfig.actionClass);
    }
    
    public void testConstructor2() throws Throwable {
        Mockingbird.ignoreConstructorExceptions(ActionConfig.class);
        SingleInstanceActionConfig singleInstanceActionConfig = new SingleInstanceActionConfig("", null, "");
        assertNull("singleInstanceActionConfig.dirName", getPrivateField(singleInstanceActionConfig, "dirName"));
        assertEquals("singleInstanceActionConfig.getName()", "", singleInstanceActionConfig.getName());
        assertEquals("singleInstanceActionConfig.consequences.size()", 0, ((Map) getPrivateField(singleInstanceActionConfig, "consequences")).size());
        assertEquals("singleInstanceActionConfig.filters.size()", 0, ((Collection) getPrivateField(singleInstanceActionConfig, "filters")).size());
        int actual = ((Collection) getPrivateField(singleInstanceActionConfig, "firstFilters")).size();
        assertEquals("singleInstanceActionConfig.firstFilters.size()", 0, actual);
        assertNull("singleInstanceActionConfig.getAction()", singleInstanceActionConfig.getAction());
        assertEquals("singleInstanceActionConfig.innerConsequences.size()", 0, ((Map) getPrivateField(singleInstanceActionConfig, "innerConsequences")).size());
        assertEquals("singleInstanceActionConfig.getInnerAction()", "", singleInstanceActionConfig.getInnerAction());
        assertNull("singleInstanceActionConfig.actionClass", singleInstanceActionConfig.actionClass);
    }
    
    public void testGetActionWithAggressiveMocks() throws Throwable {
        SingleInstanceActionConfig singleInstanceActionConfig = (SingleInstanceActionConfig) Mockingbird.getProxyObject(SingleInstanceActionConfig.class, true);
        setPrivateField(singleInstanceActionConfig, "instance", null);
        Mockingbird.enterTestMode(SingleInstanceActionConfig.class);
        Action result = singleInstanceActionConfig.getAction();
        assertNull("result", result);
    }
    
    public void testConstructorThrowsNullPointerException() throws Throwable {
        try {
            new SingleInstanceActionConfig(new MockAction(new LogoutAction()));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ActionConfig.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException1() throws Throwable {
        try {
            new SingleInstanceActionConfig("/+", new MockAction());
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ActionConfig.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException2() throws Throwable {
        try {
            new SingleInstanceActionConfig("/", new PojoAction(""));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ActionConfig.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException3() throws Throwable {
        try {
            new SingleInstanceActionConfig("/", new SuccessAction(), "testSingleInstanceActionConfigInnerAction");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ActionConfig.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException4() throws Throwable {
        try {
            new SingleInstanceActionConfig("/\uA59A", new SuccessAction(), "testSingleInstanceActionConfigInnerAction");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ActionConfig.class, ex);
        }
    }
}

