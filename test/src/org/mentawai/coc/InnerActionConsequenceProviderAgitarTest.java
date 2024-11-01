/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:25:51 PM
 * Time to generate: 00:18.210 seconds
 *
 */

package org.mentawai.coc;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.Map;
import org.mentawai.core.Consequence;
import org.mentawai.core.Forward;

public class InnerActionConsequenceProviderAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return InnerActionConsequenceProvider.class;
    }
    
    public void testConstructor() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = new InnerActionConsequenceProvider();
        assertEquals("innerActionConsequenceProvider.dirCache.size()", 0, ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).size());
    }
    
    public void testGetConsequence() throws Throwable {
        Consequence result = new InnerActionConsequenceProvider().getConsequence("testInnerActionConsequenceProviderAction", Integer.class, "testInnerActionConsequenceProviderResult", null);
        assertNull("result", result);
    }
    
    public void testGetConsequence1() throws Throwable {
        Consequence result = new InnerActionConsequenceProvider().getConsequence("testInnerActionConsequenceProviderAction", Object.class, null, "testInnerActionConsequenceProviderInnerAction");
        assertNull("result", result);
    }
    
    public void testGetConsequence2() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = new InnerActionConsequenceProvider();
        Forward result = (Forward) innerActionConsequenceProvider.getConsequence("testInnerActionConsequenceProviderAction", Object.class, "error", "testInnerActionConsequenceProviderInnerAction");
        assertEquals("innerActionConsequenceProvider.dirCache.size()", 1, ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).size());
        Object actual = ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).get("testInnerActionConsequenceProviderAction");
        assertEquals("innerActionConsequenceProvider.dirCache.get(\"testInnerActionConsequenceProviderAction\")", "testinneractionconsequenceprovider", actual);
        assertEquals("result.getUrl()", "/testinneractionconsequenceprovider/testInnerActionConsequenceProviderInnerAction.jsp", result.getUrl());
    }
    
    public void testGetConsequence3() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = new InnerActionConsequenceProvider();
        Forward result = (Forward) innerActionConsequenceProvider.getConsequence("testInnerActionConsequenceProviderAction", Object.class, "success", "testInnerActionConsequenceProviderInnerAction");
        assertEquals("innerActionConsequenceProvider.dirCache.size()", 1, ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).size());
        Object actual = ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).get("testInnerActionConsequenceProviderAction");
        assertEquals("innerActionConsequenceProvider.dirCache.get(\"testInnerActionConsequenceProviderAction\")", "testinneractionconsequenceprovider", actual);
        assertEquals("result.getUrl()", "/testinneractionconsequenceprovider/testInnerActionConsequenceProviderInnerAction.jsp", result.getUrl());
    }
    
    public void testGetConsequence4() throws Throwable {
        Consequence result = new InnerActionConsequenceProvider().getConsequence("testInnerActionConsequenceProviderAction", Integer.class, "testInnerActionConsequenceProviderResult", "testInnerActionConsequenceProviderInnerAction");
        assertNull("result", result);
    }
    
    public void testGetDir() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = new InnerActionConsequenceProvider();
        String result = innerActionConsequenceProvider.getDir("action");
        assertEquals("innerActionConsequenceProvider.dirCache.size()", 1, ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).size());
        Object actual = ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).get("action");
        assertSame("innerActionConsequenceProvider.dirCache.get(\"action\")", "action", actual);
        assertEquals("result", "action", result);
    }
    
    public void testGetDir1() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = new InnerActionConsequenceProvider();
        String result = innerActionConsequenceProvider.getDir("testInnerActionConsequenceProviderActionName");
        assertEquals("innerActionConsequenceProvider.dirCache.size()", 1, ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).size());
        assertEquals("result", "testinneractionconsequenceprovideractionname", result);
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testGetDir2() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = new InnerActionConsequenceProvider();
        String result = innerActionConsequenceProvider.getDir("action\uA79B\uE57A\uFFA3\u9E85\u5F79\uD281\u865F\uB94F\u6D26\u05E8\u4F11\u5409\uA899\uEF89\u723E\uC7E7\uAAA9\u90AF\u9655\uDCD8\u9EAB\uAC11\uFAF7\u7C03\uBF09\u3938\uE77C\uAB14\u864D\uB8DD\uE98Caction");
        assertEquals("innerActionConsequenceProvider.dirCache.size()", 1, ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).size());
        assertEquals("result", "action\uA79B\uE57A\uFFA3\u9E85\u5F79\uD281\u865F\uB94F\u6D26\u05E8\u4F11\u5409\uA899\uEF89\u723E\uC7E7\uAAA9\u90AF\u9655\uDCD8\u9EAB\uAC11\uFAF7\u7C03\uBF09\u3938\uE77C\uAB14\u864D\uB8DD\uE98C", result);
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testGetDir3() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = new InnerActionConsequenceProvider();
        String dir = innerActionConsequenceProvider.getDir("testString");
        String result = innerActionConsequenceProvider.getDir("testString");
        assertEquals("result", dir, result);
        assertEquals("innerActionConsequenceProvider.dirCache.size()", 1, ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).size());
    }
    
    public void testGetDirWithAggressiveMocks() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = (InnerActionConsequenceProvider) Mockingbird.getProxyObject(InnerActionConsequenceProvider.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        setPrivateField(innerActionConsequenceProvider, "dirCache", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.get(""), "");
        Mockingbird.enterTestMode(InnerActionConsequenceProvider.class);
        String result = innerActionConsequenceProvider.getDir("");
        assertEquals("result", "", result);
        assertNotNull("innerActionConsequenceProvider.dirCache", getPrivateField(innerActionConsequenceProvider, "dirCache"));
    }
    
    public void testGetDirWithAggressiveMocks1() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = (InnerActionConsequenceProvider) Mockingbird.getProxyObject(InnerActionConsequenceProvider.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        setPrivateField(innerActionConsequenceProvider, "dirCache", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.get(""), null);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "toLowerCase", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "endsWith", "(java.lang.String)boolean", Boolean.FALSE, 1);
        Mockingbird.setReturnValue(false, map, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.enterTestMode(InnerActionConsequenceProvider.class);
        String result = innerActionConsequenceProvider.getDir("");
        assertEquals("result", "", result);
        assertNotNull("innerActionConsequenceProvider.dirCache", getPrivateField(innerActionConsequenceProvider, "dirCache"));
    }
    
    public void testGetConsequenceThrowsNullPointerException() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = new InnerActionConsequenceProvider();
        try {
            innerActionConsequenceProvider.getConsequence(null, Integer.class, "success", "testInnerActionConsequenceProviderInnerAction");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InnerActionConsequenceProvider.class, ex);
            assertEquals("innerActionConsequenceProvider.dirCache.size()", 0, ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).size());
        }
    }
    
    public void testGetConsequenceThrowsNullPointerException1() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = new InnerActionConsequenceProvider();
        try {
            innerActionConsequenceProvider.getConsequence(null, Integer.class, "error", "testInnerActionConsequenceProviderInnerAction");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InnerActionConsequenceProvider.class, ex);
            assertEquals("innerActionConsequenceProvider.dirCache.size()", 0, ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).size());
        }
    }
    
    public void testGetDirThrowsNullPointerException() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = new InnerActionConsequenceProvider();
        try {
            innerActionConsequenceProvider.getDir(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InnerActionConsequenceProvider.class, ex);
            assertEquals("innerActionConsequenceProvider.dirCache.size()", 0, ((Map) getPrivateField(innerActionConsequenceProvider, "dirCache")).size());
        }
    }
    
    public void testGetDirThrowsThrowableWithAggressiveMocks() throws Throwable {
        InnerActionConsequenceProvider innerActionConsequenceProvider = (InnerActionConsequenceProvider) Mockingbird.getProxyObject(InnerActionConsequenceProvider.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(innerActionConsequenceProvider, "dirCache", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.get(""), obj);
        Mockingbird.enterTestMode(InnerActionConsequenceProvider.class);
        try {
            innerActionConsequenceProvider.getDir("");
            fail("Expected Throwable to be thrown");
        } catch (Throwable ex) {
            assertEquals("ex.getClass()", ClassCastException.class, ex.getClass());
            assertThrownBy(InnerActionConsequenceProvider.class, ex);
            assertNotNull("innerActionConsequenceProvider.dirCache", getPrivateField(innerActionConsequenceProvider, "dirCache"));
        }
    }
}

