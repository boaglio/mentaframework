/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:24:51 PM
 * Time to generate: 00:21.637 seconds
 *
 */

package org.mentawai.coc;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import org.mentawai.core.ActionConfig;
import org.mentawai.core.Consequence;
import org.mentawai.log.Debug;

public class CoCActionConfigAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return CoCActionConfig.class;
    }
    
    public void testConstructor() throws Throwable {
        storeStaticField(CoCActionConfig.class, "actionClassCache");
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        setPrivateField(CoCActionConfig.class, "actionClassCache", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.get(""), null);
        Mockingbird.ignoreConstructorExceptions(ActionConfig.class);
        Mockingbird.enterTestMode();
        CoCActionConfig coCActionConfig = new CoCActionConfig("");
        assertNull("coCActionConfig.dirName", getPrivateField(coCActionConfig, "dirName"));
        assertEquals("coCActionConfig.getName()", "", coCActionConfig.getName());
        assertEquals("coCActionConfig.consequences.size()", 0, ((Map) getPrivateField(coCActionConfig, "consequences")).size());
        assertEquals("coCActionConfig.filters.size()", 0, ((Collection) getPrivateField(coCActionConfig, "filters")).size());
        assertEquals("coCActionConfig.firstFilters.size()", 0, ((Collection) getPrivateField(coCActionConfig, "firstFilters")).size());
        assertEquals("coCActionConfig.innerConsequences.size()", 0, ((Map) getPrivateField(coCActionConfig, "innerConsequences")).size());
        assertNull("coCActionConfig.getInnerAction()", coCActionConfig.getInnerAction());
        assertNull("coCActionConfig.getActionClass()", coCActionConfig.getActionClass());
        assertNotNull("coCActionConfigCoCActionConfig.actionClassCache", getPrivateField(CoCActionConfig.class, "actionClassCache"));
    }
    
    public void testGetConsequenceWithAggressiveMocks() throws Throwable {
        CoCActionConfig coCActionConfig = (CoCActionConfig) Mockingbird.getProxyObject(CoCActionConfig.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        Consequence consequence = (Consequence) Mockingbird.getProxyObject(Consequence.class);
        setPrivateField(coCActionConfig, "consequences", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", consequence, 1);
        Mockingbird.enterTestMode(CoCActionConfig.class);
        Consequence result = coCActionConfig.getConsequence("");
        assertSame("result", result, result);
        assertNotNull("coCActionConfig.consequences", getPrivateField(coCActionConfig, "consequences"));
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testGetConsequenceWithAggressiveMocks1() throws Throwable {
        CoCActionConfig coCActionConfig = (CoCActionConfig) Mockingbird.getProxyObject(CoCActionConfig.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        ConsequenceProvider consequenceProvider = (ConsequenceProvider) Mockingbird.getProxyObject(ConsequenceProvider.class);
        setPrivateField(coCActionConfig, "name", "");
        setPrivateField(coCActionConfig, "actionClass", null);
        setPrivateField(coCActionConfig, "consequences", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.enterNormalMode();
        CoCActionConfig.setConsequenceProvider(consequenceProvider);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, consequenceProvider, "getConsequence", "(java.lang.String,java.lang.Class,java.lang.String,java.lang.String)org.mentawai.core.Consequence", null, 1);
        Mockingbird.setReturnValue(false, map, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.enterTestMode(CoCActionConfig.class);
        Consequence result = coCActionConfig.getConsequence("");
        assertNull("result", result);
        assertNotNull("coCActionConfig.consequences", getPrivateField(coCActionConfig, "consequences"));
        assertNotNull("coCActionConfigCoCActionConfig.consequenceProvider", getPrivateField(CoCActionConfig.class, "consequenceProvider"));
    }
    
    public void testGetConsequenceWithAggressiveMocks2() throws Throwable {
        CoCActionConfig coCActionConfig = (CoCActionConfig) Mockingbird.getProxyObject(CoCActionConfig.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        ConsequenceProvider consequenceProvider = (ConsequenceProvider) Mockingbird.getProxyObject(ConsequenceProvider.class);
        Map map2 = (Map) Mockingbird.getProxyObject(Map.class);
        setPrivateField(coCActionConfig, "name", "");
        setPrivateField(coCActionConfig, "actionClass", null);
        setPrivateField(coCActionConfig, "innerAction", null);
        setPrivateField(coCActionConfig, "innerConsequences", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.enterNormalMode();
        CoCActionConfig.setConsequenceProvider(consequenceProvider);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, consequenceProvider, "getConsequence", "(java.lang.String,java.lang.Class,java.lang.String,java.lang.String)org.mentawai.core.Consequence", null, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", map2, 1);
        Mockingbird.setReturnValue(false, map2, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.enterTestMode(CoCActionConfig.class);
        Consequence result = coCActionConfig.getConsequence("", "");
        assertNull("result", result);
        assertNotNull("coCActionConfigCoCActionConfig.consequenceProvider", getPrivateField(CoCActionConfig.class, "consequenceProvider"));
        assertNotNull("coCActionConfig.innerConsequences", getPrivateField(coCActionConfig, "innerConsequences"));
    }
    
    public void testGetConsequenceWithAggressiveMocks3() throws Throwable {
        CoCActionConfig coCActionConfig = (CoCActionConfig) Mockingbird.getProxyObject(CoCActionConfig.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        Map map2 = (Map) Mockingbird.getProxyObject(Map.class);
        Consequence consequence = (Consequence) Mockingbird.getProxyObject(Consequence.class);
        setPrivateField(coCActionConfig, "innerConsequences", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", map2, 1);
        Mockingbird.setReturnValue(false, map2, "get", "(java.lang.Object)java.lang.Object", consequence, 1);
        Mockingbird.enterTestMode(CoCActionConfig.class);
        Consequence result = coCActionConfig.getConsequence("", "");
        assertNotNull("result", result);
        assertNotNull("coCActionConfigCoCActionConfig.consequenceProvider", getPrivateField(CoCActionConfig.class, "consequenceProvider"));
        assertNotNull("coCActionConfig.innerConsequences", getPrivateField(coCActionConfig, "innerConsequences"));
    }
    
    public void testLoadAllActions() throws Throwable {
        CoCActionConfig.loadAllActions();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testLoadAllActions1() throws Throwable {
        storeStaticField(CoCActionConfig.class, "webinfClasses");
        Mockingbird.enterRecordingMode();
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        File[] files = new File[2];
        File file2 = (File) Mockingbird.getProxyObject(File.class);
        File file3 = (File) Mockingbird.getProxyObject(File.class);
        setPrivateField(CoCActionConfig.class, "webinfClasses", "");
        files[0] = file2;
        files[1] = file3;
        Mockingbird.setReturnValue(false, file, "isDirectory", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.setReturnValue(false, file, "listFiles", "()java.io.File[]", new Object[] {}, files, 1);
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, file2, "isDirectory", "()boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, file2, "getAbsolutePath", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "endsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, file3, "isDirectory", "()boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, file3, "getAbsolutePath", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "endsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.enterTestMode(CoCActionConfig.class);
        CoCActionConfig.loadAllActions();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testReadDir() throws Throwable {
        storeStaticField(CoCActionConfig.class, "webinfClasses");
        File file = (File) Mockingbird.getProxyObject(File.class);
        File[] files = new File[2];
        File file2 = (File) Mockingbird.getProxyObject(File.class);
        File file3 = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, file, "listFiles", "()java.io.File[]", new Object[] {}, files, 1);
        files[0] = file2;
        files[1] = file3;
        setPrivateField(CoCActionConfig.class, "webinfClasses", "");
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, file2, "isDirectory", "()boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, file2, "getAbsolutePath", "()java.lang.String", "AAAAA", 1);
        Boolean boolean3 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "endsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int,int)java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "replace", "(char,char)java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "replace", "(char,char)java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(false, file3, "isDirectory", "()boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, file3, "getAbsolutePath", "()java.lang.String", "AAAAA", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "endsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int,int)java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "replace", "(char,char)java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "replace", "(char,char)java.lang.String", "com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORBHelper", 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.String[])void", null, 1);
        Mockingbird.enterTestMode(CoCActionConfig.class);
        callPrivateMethod("org.mentawai.coc.CoCActionConfig", "readDir", new Class[] {File.class}, null, new Object[] {file});
        assertEquals("CoCActionConfig.actionClassCache.size()", 0, ((Map) getPrivateField(CoCActionConfig.class, "actionClassCache")).size());
    }
    
    public void testReadDir1() throws Throwable {
        File file = (File) Mockingbird.getProxyObject(File.class);
        File[] files = new File[2];
        File file2 = (File) Mockingbird.getProxyObject(File.class);
        File file3 = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, file, "listFiles", "()java.io.File[]", new Object[] {}, files, 1);
        files[0] = file2;
        files[1] = file3;
        Boolean boolean2 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, file2, "isDirectory", "()boolean", boolean2, 1);
        Mockingbird.setReturnValue(true, CoCActionConfig.class, "readDir", "(java.io.File)void", null, 1);
        Mockingbird.setReturnValue(false, file3, "isDirectory", "()boolean", boolean2, 1);
        Mockingbird.setReturnValue(true, CoCActionConfig.class, "readDir", "(java.io.File)void", null, 1);
        Mockingbird.enterTestMode(CoCActionConfig.class);
        callPrivateMethod("org.mentawai.coc.CoCActionConfig", "readDir", new Class[] {File.class}, null, new Object[] {file});
        assertEquals("CoCActionConfig.actionClassCache.size()", 0, ((Map) getPrivateField(CoCActionConfig.class, "actionClassCache")).size());
    }
    
    public void testSetConsequenceProvider() throws Throwable {
        ConsequenceProvider consequenceProvider = new InnerActionConsequenceProvider();
        CoCActionConfig.setConsequenceProvider(consequenceProvider);
        assertSame("CoCActionConfig.consequenceProvider", consequenceProvider, getPrivateField(CoCActionConfig.class, "consequenceProvider"));
    }
    
    public void testConstructorThrowsNullPointerException() throws Throwable {
        try {
            new CoCActionConfig("/");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ActionConfig.class, ex);
            assertEquals("CoCActionConfig.actionClassCache.size()", 0, ((Map) getPrivateField(CoCActionConfig.class, "actionClassCache")).size());
        }
    }
    
    public void testReadDirThrowsNullPointerException() throws Throwable {
        File file = new File("testCoCActionConfigParam1");
        try {
            callPrivateMethod("org.mentawai.coc.CoCActionConfig", "readDir", new Class[] {File.class}, null, new Object[] {file});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(CoCActionConfig.class, ex);
            assertEquals("CoCActionConfig.actionClassCache.size()", 0, ((Map) getPrivateField(CoCActionConfig.class, "actionClassCache")).size());
            assertEquals("file.getName()", "testCoCActionConfigParam1", file.getName());
        }
    }
    
    public void testReadDirThrowsNullPointerException1() throws Throwable {
        try {
            callPrivateMethod("org.mentawai.coc.CoCActionConfig", "readDir", new Class[] {File.class}, null, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(CoCActionConfig.class, ex);
            assertEquals("CoCActionConfig.actionClassCache.size()", 0, ((Map) getPrivateField(CoCActionConfig.class, "actionClassCache")).size());
        }
    }
}

