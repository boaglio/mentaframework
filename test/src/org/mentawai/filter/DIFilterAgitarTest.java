/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:23:50 PM
 * Time to generate: 05:02.072 seconds
 *
 */

package org.mentawai.filter;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import org.mentawai.action.LogoutAction;
import org.mentawai.action.SuccessAction;
import org.mentawai.core.Action;
import org.mentawai.core.ActionException;
import org.mentawai.core.ApplicationManager;
import org.mentawai.core.Input;
import org.mentawai.core.MapInput;
import org.mentawai.core.InputWrapper;
import org.mentawai.core.InvocationChain;
import org.mentawai.core.PojoAction;
import org.mentawai.ioc.Dependency;
import org.mentawai.log.Debug;
import org.mentawai.util.InjectionUtils;
import org.mentawai.util.MockAction;

public class DIFilterAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return DIFilter.class;
    }
    
    public void testConstructor() throws Throwable {
        DIFilter dIFilter = new DIFilter(true);
        assertNull("dIFilter.input.get()", ((ThreadLocal) getPrivateField(dIFilter, "input")).get());
        assertTrue("dIFilter.tryField", ((Boolean) getPrivateField(dIFilter, "tryField")).booleanValue());
        assertEquals("dIFilter.received.size()", 0, ((Map) getPrivateField(dIFilter, "received")).size());
        assertNull("dIFilter.attrName", getPrivateField(dIFilter, "attrName"));
        assertNull("dIFilter.sourceKey", getPrivateField(dIFilter, "sourceKey"));
        assertNull("dIFilter.sourceClass", getPrivateField(dIFilter, "sourceClass"));
        assertTrue("dIFilter.newVersion", ((Boolean) getPrivateField(dIFilter, "newVersion")).booleanValue());
        assertEquals("dIFilter.cache.size()", 0, ((Map) getPrivateField(dIFilter, "cache")).size());
    }
    
    public void testConstructor2() throws Throwable {
        DIFilter dIFilter = new DIFilter();
        assertNull("dIFilter.input.get()", ((ThreadLocal) getPrivateField(dIFilter, "input")).get());
        assertTrue("dIFilter.tryField", ((Boolean) getPrivateField(dIFilter, "tryField")).booleanValue());
        assertEquals("dIFilter.received.size()", 0, ((Map) getPrivateField(dIFilter, "received")).size());
        assertNull("dIFilter.attrName", getPrivateField(dIFilter, "attrName"));
        assertNull("dIFilter.sourceKey", getPrivateField(dIFilter, "sourceKey"));
        assertNull("dIFilter.sourceClass", getPrivateField(dIFilter, "sourceClass"));
        assertTrue("dIFilter.newVersion", ((Boolean) getPrivateField(dIFilter, "newVersion")).booleanValue());
        assertEquals("dIFilter.cache.size()", 0, ((Map) getPrivateField(dIFilter, "cache")).size());
    }
    
    public void testDestroy() throws Throwable {
        new DIFilter(true).destroy();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetValue() throws Throwable {
        DIFilter dIFilter = new DIFilter(true);
        dIFilter.filter(new InvocationChain("testDIFilterActionName", new MockAction()));
        Object result = dIFilter.getValue("testDIFilterKey");
        assertNull("result", result);
    }
    
    public void testGetValueOldWithAggressiveMocks1() throws Throwable {
        storeStaticField(Debug.class, "ENABLED");
        DIFilter dIFilter = (DIFilter) Mockingbird.getProxyObject(DIFilter.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        Map map2 = (Map) Mockingbird.getProxyObject(Map.class);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Method method = (Method) Mockingbird.getProxyObject(Method.class);
        Input input2 = (Input) Mockingbird.getProxyObject(Input.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        setPrivateField(dIFilter, "attrName", "");
        setPrivateField(dIFilter, "cache", map);
        setPrivateField(dIFilter, "sourceClass", Class.forName("com.sun.corba.se.spi.activation.NoSuchEndPoint"));
        setPrivateField(dIFilter, "sourceKey", "");
        setPrivateField(dIFilter, "received", map2);
        Debug.isEnabled() = true;
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, InjectionUtils.class, "findMethodToInject", "(java.lang.Class,java.lang.String,java.lang.Class)java.lang.reflect.Method", method, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.String[])void", null, 1);
        Mockingbird.setReturnValue(false, map, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(map2.containsKey(obj), false);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input2, 1);
        Mockingbird.setReturnValue(false, input2, "getValue", "(java.lang.String)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(false, map2, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.String[])void", null, 1);
        Mockingbird.enterTestMode(DIFilter.class);
        Object result = dIFilter.getValueOld("");
        assertNotNull("result", result);
    }
    
    public void testGetValueOldWithAggressiveMocks2() throws Throwable {
        storeStaticField(Debug.class, "ENABLED");
        DIFilter dIFilter = (DIFilter) Mockingbird.getProxyObject(DIFilter.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        Map map2 = (Map) Mockingbird.getProxyObject(Map.class);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        Input input2 = (Input) Mockingbird.getProxyObject(Input.class);
        setPrivateField(dIFilter, "cache", map);
        setPrivateField(dIFilter, "received", map2);
        setPrivateField(dIFilter, "sourceKey", "");
        Debug.isEnabled() = true;
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(map2.containsKey(obj), false);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input2, 1);
        Mockingbird.setReturnValue(false, input2, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(DIFilter.class);
        Object result = dIFilter.getValueOld("");
        assertNotNull("result", result);
    }
    
    public void testGetValueOldWithAggressiveMocks3() throws Throwable {
        storeStaticField(Debug.class, "ENABLED");
        DIFilter dIFilter = (DIFilter) Mockingbird.getProxyObject(DIFilter.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        Map map2 = (Map) Mockingbird.getProxyObject(Map.class);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Field field = (Field) Mockingbird.getProxyObject(Field.class);
        Input input2 = (Input) Mockingbird.getProxyObject(Input.class);
        dIFilter.setTryField(true);
        setPrivateField(dIFilter, "attrName", "");
        setPrivateField(dIFilter, "sourceClass", null);
        setPrivateField(dIFilter, "cache", map);
        setPrivateField(dIFilter, "received", map2);
        setPrivateField(dIFilter, "sourceKey", "");
        Debug.isEnabled() = false;
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, InjectionUtils.class, "findMethodToInject", "(java.lang.Class,java.lang.String,java.lang.Class)java.lang.reflect.Method", null, 1);
        Mockingbird.setReturnValue(true, InjectionUtils.class, "findFieldToInject", "(java.lang.Class,java.lang.String,java.lang.Class)java.lang.reflect.Field", field, 1);
        Mockingbird.setReturnValue(false, map, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(map2.containsKey(obj), false);
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input2, 1);
        Mockingbird.setReturnValue(false, input2, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.enterTestMode(DIFilter.class);
        Object result = dIFilter.getValueOld("");
        assertNotNull("result", result);
    }
    
    public void testGetValueOldWithAggressiveMocks4() throws Throwable {
        storeStaticField(Debug.class, "ENABLED");
        DIFilter dIFilter = (DIFilter) Mockingbird.getProxyObject(DIFilter.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        dIFilter.setTryField(true);
        setPrivateField(dIFilter, "attrName", "");
        setPrivateField(dIFilter, "sourceClass", Class.forName("com.sun.corba.se.spi.activation.NoSuchEndPoint"));
        setPrivateField(dIFilter, "cache", map);
        Debug.isEnabled() = true;
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, InjectionUtils.class, "findMethodToInject", "(java.lang.Class,java.lang.String,java.lang.Class)java.lang.reflect.Method", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.String[])void", null, 1);
        Mockingbird.setReturnValue(true, InjectionUtils.class, "findFieldToInject", "(java.lang.Class,java.lang.String,java.lang.Class)java.lang.reflect.Field", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.String[])void", null, 1);
        Mockingbird.setReturnValue(false, map, "put", "(java.lang.Object,java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(DIFilter.class);
        Object result = dIFilter.getValueOld("");
        assertNotNull("result", result);
    }
    
    public void testGetValueOldWithAggressiveMocks5() throws Throwable {
        storeStaticField(Debug.class, "ENABLED");
        DIFilter dIFilter = (DIFilter) Mockingbird.getProxyObject(DIFilter.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        Map map2 = (Map) Mockingbird.getProxyObject(Map.class);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        setPrivateField(dIFilter, "cache", map);
        setPrivateField(dIFilter, "received", map2);
        Debug.isEnabled() = true;
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(map2.containsKey(obj), true);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(DIFilter.class);
        Object result = dIFilter.getValueOld("");
        assertNotNull("result", result);
    }
    
    public void testGetValueWithAggressiveMocks() throws Throwable {
        storeStaticField(Debug.class, "ENABLED");
        storeStaticField(ApplicationManager.class, "instance");
        DIFilter dIFilter = (DIFilter) Mockingbird.getProxyObject(DIFilter.class, true);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Dependency dependency = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Dependency dependency2 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Dependency dependency3 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        Dependency dependency4 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Object obj3 = Mockingbird.getProxyObject(Object.class);
        setPrivateField(dIFilter, "newVersion", Boolean.TRUE);
        dIFilter.setTryField(false);
        setPrivateField(ApplicationManager.class, "instance", applicationManager);
        Debug.isEnabled() = false;
        setPrivateField(dependency3, "source", "");
        setPrivateField(dependency4, "source", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(applicationManager.getDependencies(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency);
        Mockingbird.setReturnValue(false, dependency, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency2);
        Mockingbird.setReturnValue(false, dependency2, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency3);
        Mockingbird.setReturnValue(false, dependency3, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(dependency3.hasAlreadyReceived(obj), false);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency4);
        Mockingbird.setReturnValue(false, dependency4, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", obj3, 1);
        Mockingbird.setReturnValue(dependency4.hasAlreadyReceived(obj), false);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        Mockingbird.enterTestMode(DIFilter.class);
        Object result = dIFilter.getValue("");
        assertNotNull("result", result);
    }
    
    public void testGetValueWithAggressiveMocks1() throws Throwable {
        storeStaticField(Debug.class, "ENABLED");
        storeStaticField(ApplicationManager.class, "instance");
        DIFilter dIFilter = (DIFilter) Mockingbird.getProxyObject(DIFilter.class, true);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Dependency dependency = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        Dependency dependency2 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Dependency dependency3 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Object obj3 = Mockingbird.getProxyObject(Object.class);
        Dependency dependency4 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Object obj4 = Mockingbird.getProxyObject(Object.class);
        setPrivateField(dIFilter, "newVersion", Boolean.TRUE);
        dIFilter.setTryField(false);
        setPrivateField(ApplicationManager.class, "instance", applicationManager);
        Debug.isEnabled() = false;
        setPrivateField(dependency3, "source", "");
        setPrivateField(dependency4, "source", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(applicationManager.getDependencies(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency);
        Mockingbird.setReturnValue(false, dependency, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(dependency.hasAlreadyReceived(obj), true);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency2);
        Mockingbird.setReturnValue(false, dependency2, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency3);
        Mockingbird.setReturnValue(false, dependency3, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", obj3, 1);
        Mockingbird.setReturnValue(dependency3.hasAlreadyReceived(obj), false);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency4);
        Mockingbird.setReturnValue(false, dependency4, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", obj4, 1);
        Mockingbird.setReturnValue(dependency4.hasAlreadyReceived(obj), false);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        Mockingbird.enterTestMode(DIFilter.class);
        Object result = dIFilter.getValue("");
        assertNotNull("result", result);
    }
    
    public void testGetValueWithAggressiveMocks2() throws Throwable {
        storeStaticField(Debug.class, "ENABLED");
        storeStaticField(ApplicationManager.class, "instance");
        DIFilter dIFilter = (DIFilter) Mockingbird.getProxyObject(DIFilter.class, true);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Dependency dependency = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        Dependency dependency2 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Dependency dependency3 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Dependency dependency4 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Object obj3 = Mockingbird.getProxyObject(Object.class);
        setPrivateField(dIFilter, "newVersion", Boolean.TRUE);
        dIFilter.setTryField(false);
        setPrivateField(ApplicationManager.class, "instance", applicationManager);
        setPrivateField(dependency, "source", "");
        Debug.isEnabled() = true;
        setPrivateField(dependency4, "source", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(applicationManager.getDependencies(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency);
        Mockingbird.setReturnValue(false, dependency, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(dependency.hasAlreadyReceived(obj), false);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency2);
        Mockingbird.setReturnValue(false, dependency2, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.String[])void", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency3);
        Mockingbird.setReturnValue(false, dependency3, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.String[])void", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency4);
        Mockingbird.setReturnValue(false, dependency4, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", obj3, 1);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(dependency4.hasAlreadyReceived(obj), false);
        Mockingbird.setReturnValue(true, Debug.class, "log", "(java.lang.Object[])void", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        Mockingbird.enterTestMode(DIFilter.class);
        Object result = dIFilter.getValue("");
        assertNotNull("result", result);
    }
    
    public void testHasAlreadyReceived1() throws Throwable {
        DIFilter dIFilter = new DIFilter();
        callPrivateMethod("org.mentawai.filter.DIFilter", "setAlreadyReceived", new Class[] {Object.class}, dIFilter, new Object[] {"testString"});
        boolean result = ((Boolean) callPrivateMethod("org.mentawai.filter.DIFilter", "hasAlreadyReceived", new Class[] {Object.class}, dIFilter, new Object[] {"testString"})).booleanValue();
        assertTrue("result", result);
        assertEquals("dIFilter.received.size()", 1, ((Map) getPrivateField(dIFilter, "received")).size());
    }
    
    public void testSetTryField() throws Throwable {
        DIFilter dIFilter = new DIFilter();
        dIFilter.setTryField(true);
        assertTrue("dIFilter.tryField", ((Boolean) getPrivateField(dIFilter, "tryField")).booleanValue());
    }
    
    public void testSetValueWithAggressiveMocks() throws Throwable {
        storeStaticField(Debug.class, "ENABLED");
        storeStaticField(ApplicationManager.class, "instance");
        DIFilter dIFilter = (DIFilter) Mockingbird.getProxyObject(DIFilter.class, true);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        ApplicationManager applicationManager = (ApplicationManager) Mockingbird.getProxyObject(ApplicationManager.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Dependency dependency = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Dependency dependency2 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Dependency dependency3 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        Dependency dependency4 = (Dependency) Mockingbird.getProxyObject(Dependency.class);
        Object obj3 = Mockingbird.getProxyObject(Object.class);
        setPrivateField(dIFilter, "newVersion", Boolean.TRUE);
        dIFilter.setTryField(false);
        setPrivateField(ApplicationManager.class, "instance", applicationManager);
        Debug.isEnabled() = false;
        setPrivateField(dependency3, "source", "");
        setPrivateField(dependency4, "source", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, dIFilter, "getInput", "()org.mentawai.core.Input", new Object[] {}, input, 1);
        Mockingbird.setReturnValue(false, input, "setValue", "(java.lang.String,java.lang.Object)void", null, 1);
        Mockingbird.setReturnValue(InputWrapper.class, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(applicationManager.getDependencies(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency);
        Mockingbird.setReturnValue(false, dependency, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency2);
        Mockingbird.setReturnValue(false, dependency2, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency3);
        Mockingbird.setReturnValue(false, dependency3, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(dependency3.hasAlreadyReceived(obj), false);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), dependency4);
        Mockingbird.setReturnValue(false, dependency4, "getMethodOrField", "(java.lang.Class,boolean)java.lang.Object", obj3, 1);
        Mockingbird.setReturnValue(dependency4.hasAlreadyReceived(obj), false);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        Mockingbird.enterTestMode(DIFilter.class);
        dIFilter.setValue("", null);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testToString() throws Throwable {
        String result = new DIFilter().toString();
        assertEquals("result", "DIFilter: tryField=true", result);
    }
    
    public void testFilterThrowsActionException() throws Throwable {
        InvocationChain chain = new InvocationChain("testDIFilterActionName", new PojoAction(new Integer(0)));
        try {
            new DIFilter().filter(chain);
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertEquals("ex.getMessage()", "Cannot find method to execute: execute", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
            assertNull("ex.getCause()", ex.getCause());
            assertEquals("chain.getActionName()", "testDIFilterActionName", chain.getActionName());
        }
    }
    
    public void testFilterThrowsNullPointerException1() throws Throwable {
        InvocationChain chain = new InvocationChain("testDIFilterActionName", null);
        try {
            new DIFilter(true).filter(chain);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("chain.getActionName()", "testDIFilterActionName", chain.getActionName());
        }
    }
    
    public void testGetMethodOrFieldThrowsNullPointerException1() throws Throwable {
        DIFilter dIFilter = new DIFilter();
        try {
            callPrivateMethod("org.mentawai.filter.DIFilter", "getMethodOrField", new Class[] {Class.class}, dIFilter, new Object[] {Integer.class});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InjectionUtils.class, ex);
            assertEquals("dIFilter.cache.size()", 0, ((Map) getPrivateField(dIFilter, "cache")).size());
            assertNull("dIFilter.sourceClass", getPrivateField(dIFilter, "sourceClass"));
        }
    }
    
    public void testGetValueOldThrowsNullPointerException() throws Throwable {
        Mockingbird.enterRecordingMode();
        ThreadLocal threadLocal = (ThreadLocal) Mockingbird.getProxyObject(ThreadLocal.class);
        Mockingbird.replaceObjectForRecording(ThreadLocal.class, "<init>()", threadLocal);
        Mockingbird.enterTestMode(DIFilter.class);
        DIFilter dIFilter = new DIFilter(true);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, threadLocal, "get", "()java.lang.Object", new Object[] {}, Mockingbird.getProxyObject(DIFilter.class), 1);
        Mockingbird.enterTestMode(DIFilter.class);
        try {
            dIFilter.getValueOld("testDIFilterKey");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("dIFilter.received.size()", 0, ((Map) getPrivateField(dIFilter, "received")).size());
            assertNull("dIFilter.sourceClass", getPrivateField(dIFilter, "sourceClass"));
            assertEquals("dIFilter.cache.size()", 0, ((Map) getPrivateField(dIFilter, "cache")).size());
        }
    }
    
    public void testGetValueThrowsIllegalStateException() throws Throwable {
        DIFilter dIFilter = new DIFilter();
        try {
            dIFilter.getValue("testDIFilterKey");
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "InputWrapper does not have an input!", ex.getMessage());
            assertThrownBy(InputWrapper.class, ex);
            assertEquals("dIFilter.received.size()", 0, ((Map) getPrivateField(dIFilter, "received")).size());
            assertNull("dIFilter.sourceClass", getPrivateField(dIFilter, "sourceClass"));
            assertEquals("dIFilter.cache.size()", 0, ((Map) getPrivateField(dIFilter, "cache")).size());
        }
    }
    
    public void testSetValueThrowsNullPointerException() throws Throwable {
        DIFilter dIFilter = new DIFilter();
        dIFilter.filter(new InvocationChain("testDIFilterActionName", new MockAction()));
        try {
            dIFilter.setValue("testDIFilterKey", "");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("dIFilter.received.size()", 0, ((Map) getPrivateField(dIFilter, "received")).size());
            assertNull("dIFilter.sourceClass", getPrivateField(dIFilter, "sourceClass"));
            assertEquals("dIFilter.cache.size()", 0, ((Map) getPrivateField(dIFilter, "cache")).size());
        }
    }
}

