/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 7:27:48 PM
 * Time to generate: 00:27.392 seconds
 *
 */

package org.mentawai.core;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import groovy.lang.GroovyClassLoader;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.codehaus.groovy.control.CompilationFailedException;
import org.mentawai.ioc.Component;
import org.mentawai.ioc.DefaultComponent;
import org.mentawai.ioc.ScopeComponent;

public class GroovyApplicationManagerAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return GroovyApplicationManager.class;
    }
    
    public void testActionWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.action((Class) null, ""), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        ActionConfig result = groovyApplicationManager.action((Class) null, "");
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testActionWithAggressiveMocks1() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.action(null), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        ActionConfig result = groovyApplicationManager.action(null);
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testActionWithAggressiveMocks2() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.action("", null, ""), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        ActionConfig result = groovyApplicationManager.action("", null, "");
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testActionWithAggressiveMocks3() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.action("", (Class) null), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        ActionConfig result = groovyApplicationManager.action("", (Class) null);
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testAddActionConfigWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.addActionConfig(null), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        ActionConfig result = groovyApplicationManager.addActionConfig(null);
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testAddComponentWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.addComponent("", null), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        Component result = groovyApplicationManager.addComponent("", null);
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testAddGlobalConsequenceWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.addGlobalConsequence("", null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.addGlobalConsequence("", null);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testAddGlobalFilterWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.addGlobalFilter((Filter) null, false);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.addGlobalFilter((Filter) null, false);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testAddGlobalFilterWithAggressiveMocks1() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.addGlobalFilter((Filter) null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.addGlobalFilter((Filter) null);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testAddGlobalFilterWithAggressiveMocks2() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.addGlobalFilter((List) null, false);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.addGlobalFilter((List) null, false);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testAddGlobalFilterWithAggressiveMocks3() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.addGlobalFilter((List) null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.addGlobalFilter((List) null);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testAddWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.add(null), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        ActionConfig result = groovyApplicationManager.add(null);
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testAddWithAggressiveMocks1() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.add("", null), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        Component result = groovyApplicationManager.add("", null);
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testDestroyWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.destroy(null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.destroy(null);
        assertEquals("groovyApplicationManager.getScriptName()", "ApplicationManager.groovy", groovyApplicationManager.getScriptName());
    }
    
    public void testFilterLastWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.filterLast((Filter) null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.filterLast((Filter) null);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testFilterLastWithAggressiveMocks1() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.filterLast((List) null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.filterLast((List) null);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testFilterWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.filter((Filter) null, false);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.filter((Filter) null, false);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testFilterWithAggressiveMocks1() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.filter((Filter) null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.filter((Filter) null);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testFilterWithAggressiveMocks2() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.filter((List) null, false);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.filter((List) null, false);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testFilterWithAggressiveMocks3() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.filter((List) null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.filter((List) null);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testGetActionConfigWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.getActionConfig("", ""), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        ActionConfig result = groovyApplicationManager.getActionConfig("", "");
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testGetActionConfigWithAggressiveMocks1() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.getActionConfig(""), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        ActionConfig result = groovyApplicationManager.getActionConfig("");
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testGetComponentWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.getComponent(""), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        Component result = groovyApplicationManager.getComponent("");
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testGetGlobalConsequenceWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.getGlobalConsequence(""), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        Consequence result = groovyApplicationManager.getGlobalConsequence("");
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testGetGlobalFiltersWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.getGlobalFilters(), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        List result = groovyApplicationManager.getGlobalFilters();
        assertNull("result", result);
    }
    
    public void testGetGlobalFiltersWithAggressiveMocks1() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.getGlobalFilters(false), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        List result = groovyApplicationManager.getGlobalFilters(false);
        assertNull("result", result);
    }
    
    public void testGetScriptNameWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        String result = groovyApplicationManager.getScriptName();
        assertEquals("result", "ApplicationManager.groovy", result);
    }
    
    public void testInitWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.init(null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.init(null);
        assertEquals("groovyApplicationManager.getScriptName()", "ApplicationManager.groovy", groovyApplicationManager.getScriptName());
    }
    
    public void testIocWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.ioc("", null, 0), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        ScopeComponent result = groovyApplicationManager.ioc("", null, 0);
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testIocWithAggressiveMocks1() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.ioc("", (Class) null), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        DefaultComponent result = groovyApplicationManager.ioc("", (Class) null);
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testIocWithAggressiveMocks2() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.ioc("", (Component) null), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        Component result = groovyApplicationManager.ioc("", (Component) null);
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testLoadActionsWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.loadActions();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.loadActions();
        assertEquals("groovyApplicationManager.getScriptName()", "ApplicationManager.groovy", groovyApplicationManager.getScriptName());
    }
    
    public void testLoadBeansWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.loadBeans();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.loadBeans();
        assertEquals("groovyApplicationManager.getScriptName()", "ApplicationManager.groovy", groovyApplicationManager.getScriptName());
    }
    
    public void testLoadListsWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.loadLists();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.loadLists();
        assertEquals("groovyApplicationManager.getScriptName()", "ApplicationManager.groovy", groovyApplicationManager.getScriptName());
    }
    
    public void testLoadLocalesWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.loadLocales();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.loadLocales();
        assertEquals("groovyApplicationManager.getScriptName()", "ApplicationManager.groovy", groovyApplicationManager.getScriptName());
    }
    
    public void testOnWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.on("", (Consequence) null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.on("", (Consequence) null);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testSetDebugModeWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.setDebugMode(false, false);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.setDebugMode(false, false);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testSetDebugModeWithAggressiveMocks1() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.setDebugMode(false);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.setDebugMode(false);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testSetReloadModeWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        applicationManager.setReloadMode(false);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        groovyApplicationManager.setReloadMode(false);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testSpringWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        setPrivateField(groovyApplicationManager, "delegate", applicationManager);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(applicationManager.spring("", ""), null);
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        ActionConfig result = groovyApplicationManager.spring("", "");
        assertNull("result", result);
        assertNotNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
    }
    
    public void testConstructorThrowsNullPointerException() throws Throwable {
        try {
            new GroovyApplicationManager();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(StringBuffer.class, ex);
        }
    }
    
    public void testCreateAppManagerThrowsRuntimeExceptionWithAggressiveMocks() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        Mockingbird.enterRecordingMode();
        GroovyClassLoader groovyClassLoader = (GroovyClassLoader) Mockingbird.getProxyObject(GroovyClassLoader.class);
        Mockingbird.replaceObjectForRecording(GroovyClassLoader.class, "<init>()", groovyClassLoader);
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setException(groovyClassLoader.parseClass(file), (Throwable) Mockingbird.getProxyObject(CompilationFailedException.class));
        Mockingbird.replaceObjectForRecording(RuntimeException.class, "<init>(java.lang.Throwable)", Mockingbird.getProxyObject(RuntimeException.class));
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        try {
            callPrivateMethod("org.mentawai.core.GroovyApplicationManager", "createAppManager", new Class[] {String.class}, groovyApplicationManager, new Object[] {""});
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
        }
    }
    
    public void testCreateAppManagerThrowsRuntimeExceptionWithAggressiveMocks1() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        Mockingbird.enterRecordingMode();
        GroovyClassLoader groovyClassLoader = (GroovyClassLoader) Mockingbird.getProxyObject(GroovyClassLoader.class);
        Mockingbird.replaceObjectForRecording(GroovyClassLoader.class, "<init>()", groovyClassLoader);
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setException(groovyClassLoader.parseClass(file), (Throwable) Mockingbird.getProxyObject(IOException.class));
        Mockingbird.replaceObjectForRecording(RuntimeException.class, "<init>(java.lang.Throwable)", Mockingbird.getProxyObject(RuntimeException.class));
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        try {
            callPrivateMethod("org.mentawai.core.GroovyApplicationManager", "createAppManager", new Class[] {String.class}, groovyApplicationManager, new Object[] {""});
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
        }
    }
    
    public void testCreateAppManagerThrowsRuntimeExceptionWithAggressiveMocks2() throws Throwable {
        GroovyApplicationManager groovyApplicationManager = (GroovyApplicationManager) Mockingbird.getProxyObject(GroovyApplicationManager.class, true);
        Mockingbird.enterRecordingMode();
        GroovyClassLoader groovyClassLoader = (GroovyClassLoader) Mockingbird.getProxyObject(GroovyClassLoader.class);
        Mockingbird.replaceObjectForRecording(GroovyClassLoader.class, "<init>()", groovyClassLoader);
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setReturnValue(groovyClassLoader.parseClass(file), Mockingbird.getProxyObject(Class.class));
        Mockingbird.replaceObjectForRecording(RuntimeException.class, "<init>(java.lang.Throwable)", Mockingbird.getProxyObject(RuntimeException.class));
        Mockingbird.enterTestMode(GroovyApplicationManager.class);
        try {
            callPrivateMethod("org.mentawai.core.GroovyApplicationManager", "createAppManager", new Class[] {String.class}, groovyApplicationManager, new Object[] {""});
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertEquals("ex.getClass()", ClassCastException.class, ex.getClass());
            assertThrownBy(GroovyApplicationManager.class, ex);
            assertNull("groovyApplicationManager.delegate", getPrivateField(groovyApplicationManager, "delegate"));
        }
    }
}
