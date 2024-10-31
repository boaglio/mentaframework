/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 7:30:10 PM
 * Time to generate: 00:58.153 seconds
 *
 */

package org.mentawai.core;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.mentawai.action.LogoutAction;
import org.mentawai.action.SuccessAction;
import org.mentawai.converter.LocaleConverter;
import org.mentawai.filter.DateConverterFilter;
import org.mentawai.filter.MethodParamFilter;
import org.mentawai.filter.PushInjectionFilter;
import org.mentawai.filter.ValidatorFilter;
import org.mentawai.util.DebugServletFilter;
import org.mentawai.util.InjectionUtils;
import org.mentawai.util.MockAction;

public class InvocationChainAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return InvocationChain.class;
    }
    
    public void testConstructor() throws Throwable {
        Action action = new MockAction();
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", action);
        assertEquals("invocationChain.getActionName()", "testInvocationChainActionName", invocationChain.getActionName());
        assertSame("invocationChain.getAction()", action, invocationChain.getAction());
        assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
        assertNull("invocationChain.getInnerAction()", invocationChain.getInnerAction());
    }
    
    public void testAddFilter() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new SuccessAction());
        Filter filter = new PushInjectionFilter(true, false);
        invocationChain.addFilter(filter);
        assertEquals("invocationChain.getFilters().size()", 1, invocationChain.getFilters().size());
        assertSame("invocationChain.getFilters().get(0)", filter, invocationChain.getFilters().get(0));
    }
    
    public void testAddFilters() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new PojoAction("testString"));
        invocationChain.addFilters(new ArrayList(100));
        assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
    }
    
    public void testGetAction() throws Throwable {
        Action action = new MockAction();
        Action result = new InvocationChain("testInvocationChainActionName", action).getAction();
        assertSame("result", action, result);
    }
    
    public void testGetActionName() throws Throwable {
        String result = new InvocationChain("testInvocationChainActionName", new PojoAction("")).getActionName();
        assertEquals("result", "testInvocationChainActionName", result);
    }
    
    public void testGetConstructor() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new LogoutAction());
        Object result = callPrivateMethod("org.mentawai.core.InvocationChain", "getConstructor", new Class[] {Class.class}, invocationChain, new Object[] {Integer.class});
        assertNull("result", result);
    }
    
    public void testGetConstructor1() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new LogoutAction());
        Constructor result = (Constructor) callPrivateMethod("org.mentawai.core.InvocationChain", "getConstructor", new Class[] {Class.class}, invocationChain, new Object[] {LogoutAction.class});
        assertEquals("result.getDeclaringClass()", LogoutAction.class, result.getDeclaringClass());
    }
    
    public void testGetFilters() throws Throwable {
        LinkedList result = (LinkedList) new InvocationChain("testInvocationChainActionName", new PojoAction("")).getFilters();
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetInnerClass() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new SuccessAction());
        Object result = callPrivateMethod("org.mentawai.core.InvocationChain", "getInnerClass", new Class[] {String.class}, invocationChain, new Object[] {"testInvocationChainInnerAction"});
        assertNull("result", result);
    }
    
    public void testGetMethod() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new SuccessAction());
        Method result = (Method) callPrivateMethod("org.mentawai.core.InvocationChain", "getMethod", new Class[] {String.class}, invocationChain, new Object[] {"execute"});
        assertEquals("result.getDeclaringClass()", SuccessAction.class, result.getDeclaringClass());
    }
    
    public void testGetMethod1() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new MockAction());
        Object result = callPrivateMethod("org.mentawai.core.InvocationChain", "getMethod", new Class[] {String.class}, invocationChain, new Object[] {"testInvocationChainInnerAction"});
        assertNull("result", result);
    }
    
    public void testGetPojo() throws Throwable {
        Class[] pojo = new Class[0];
        Class[] result = (Class[]) new InvocationChain("testInvocationChainActionName", new PojoAction(pojo)).getPojo();
        assertSame("result", pojo, result);
    }
    
    public void testGetPojo1() throws Throwable {
        Object result = new InvocationChain("testInvocationChainActionName", new PojoAction(null)).getPojo();
        assertNull("result", result);
    }
    
    public void testGetPojo2() throws Throwable {
        Integer pojo = new Integer(-100);
        Integer result = (Integer) new InvocationChain("testInvocationChainActionName", new PojoAction(pojo)).getPojo();
        assertSame("result", pojo, result);
    }
    
    public void testGetPojo3() throws Throwable {
        Object result = new InvocationChain("testInvocationChainActionName", new SuccessAction()).getPojo();
        assertNull("result", result);
    }
    
    public void testGetPojo4() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new PojoAction("testString"));
        String result = (String) invocationChain.getPojo();
        assertEquals("result", "testString", result);
    }
    
    public void testInitInnerAction() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new PojoAction(""));
        Action mainAction = new PojoAction("testString");
        Action innerAction = new LogoutAction();
        invocationChain.initInnerAction(mainAction, innerAction);
        assertEquals("(PojoAction) mainAction.getPojo()", "testString", ((PojoAction) mainAction).getPojo());
    }
    
    public void testInvoke() throws Throwable {
        Action action = new MockAction();
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", action);
        String result = invocationChain.invoke();
        assertEquals("result", "success", result);
        assertSame("invocationChain.getAction()", action, invocationChain.getAction());
        assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
    }
    
    public void testInvoke1() throws Throwable {
        Action action = new MockAction();
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", action);
        Filter filter = new ValidatorFilter();
        invocationChain.addFilter(filter);
        String result = invocationChain.invoke();
        assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
        assertFalse("invocationChain.getFilters().contains(filter)", invocationChain.getFilters().contains(filter));
        assertEquals("result", "success", result);
        assertSame("invocationChain.getAction()", action, invocationChain.getAction());
    }
    
    public void testInvokeWithAggressiveMocks1() throws Throwable {
        storeStaticField(Controller.class, "debugMode");
        storeStaticField(MethodParamFilter.class, "PARAM_KEY");
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class, true);
        LinkedList linkedList = (LinkedList) Mockingbird.getProxyObject(LinkedList.class);
        PojoAction pojoAction = (PojoAction) Mockingbird.getProxyObject(PojoAction.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        StringBuffer stringBuffer = new StringBuffer();
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Iterator iterator2 = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        setPrivateField(invocationChain, "filters", linkedList);
        invocationChain.setInnerAction(null);
        setPrivateField(invocationChain, "action", pojoAction);
        Mockingbird.enterRecordingMode();
        DebugServletFilter.debugInputOutput(pojoAction);
        Mockingbird.setNormalReturnForVoid();
        Controller.debugMode = true;
        setPrivateField(pojoAction, "pojo", obj);
        MethodParamFilter.PARAM_KEY = "";
        Boolean boolean2 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, linkedList, "isEmpty", "()boolean", new Object[] {}, boolean2, 1);
        Mockingbird.setReturnValue(DebugServletFilter.getDebug(pojoAction), stringBuffer);
        Mockingbird.setReturnValue(true, DebugServletFilter.class, "debug", "(java.lang.StringBuffer,java.lang.String,boolean)void", null, 1);
        Mockingbird.setReturnValue(pojoAction.getInput(), input);
        HashSet hashSet = (HashSet) Mockingbird.getProxyObject(HashSet.class);
        Mockingbird.replaceObjectForRecording(HashSet.class, "<init>()", hashSet);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(input.keys(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Boolean boolean3 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, hashSet, "contains", "(java.lang.Object)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, hashSet, "add", "(java.lang.Object)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(input.keys(), iterator2);
        Mockingbird.setReturnValue(iterator2.hasNext(), true);
        Mockingbird.setReturnValue(iterator2.next(), "");
        Mockingbird.setReturnValue(false, hashSet, "contains", "(java.lang.Object)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(pojoAction.getLocale(), null);
        Mockingbird.setReturnValue(true, InjectionUtils.class, "tryToConvert", "(java.lang.Object,java.lang.Class,java.util.Locale,boolean)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator2.hasNext(), true);
        Mockingbird.setReturnValue(iterator2.next(), "");
        Mockingbird.setReturnValue(false, hashSet, "contains", "(java.lang.Object)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(pojoAction.getLocale(), null);
        Mockingbird.setReturnValue(true, InjectionUtils.class, "tryToConvert", "(java.lang.Object,java.lang.Class,java.util.Locale,boolean)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator2.hasNext(), true);
        Mockingbird.setReturnValue(iterator2.next(), "");
        Mockingbird.setReturnValue(false, hashSet, "contains", "(java.lang.Object)boolean", boolean2, 1);
        Mockingbird.setReturnValue(iterator2.hasNext(), true);
        Mockingbird.setReturnValue(iterator2.next(), "");
        Mockingbird.setReturnValue(false, hashSet, "contains", "(java.lang.Object)boolean", boolean2, 1);
        Mockingbird.setReturnValue(iterator2.hasNext(), true);
        Mockingbird.setReturnValue(iterator2.next(), "");
        Mockingbird.setReturnValue(false, hashSet, "contains", "(java.lang.Object)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, hashSet, "add", "(java.lang.Object)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(Object.class), "equals", "(java.lang.Object)boolean", boolean2, 1);
        Mockingbird.enterTestMode(InvocationChain.class);
        invocationChain.invoke();
        assertNull("invocationChain.getAction().getLocale()", invocationChain.getAction().getLocale());
        assertNotNull("invocationChain.getFilters()", invocationChain.getFilters());
        // dependencies on static and environment state led to removal of 1 assertion
    }
    
    public void testInvokeWithAggressiveMocks2() throws Throwable {
        storeStaticField(Controller.class, "debugMode");
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class, true);
        LinkedList linkedList = (LinkedList) Mockingbird.getProxyObject(LinkedList.class);
        Filter filter = (Filter) Mockingbird.getProxyObject(Filter.class);
        StringBuffer stringBuffer = new StringBuffer();
        setPrivateField(invocationChain, "filters", linkedList);
        setPrivateField(invocationChain, "action", null);
        Mockingbird.enterRecordingMode();
        DebugServletFilter.debugInputOutput(null);
        Mockingbird.setNormalReturnForVoid();
        Controller.debugMode = true;
        Mockingbird.setReturnValue(false, linkedList, "isEmpty", "()boolean", new Object[] {}, Boolean.FALSE, 1);
        Mockingbird.setReturnValue(false, linkedList, "removeFirst", "()java.lang.Object", new Object[] {}, filter, 1);
        Mockingbird.setReturnValue(DebugServletFilter.getDebug((Action) null), stringBuffer);
        DebugServletFilter.debug(stringBuffer, filter);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(filter.filter(invocationChain), "");
        Mockingbird.enterTestMode(InvocationChain.class);
        String result = invocationChain.invoke();
        assertEquals("result", "", result);
        assertNull("invocationChain.getAction()", invocationChain.getAction());
        assertNotNull("invocationChain.getFilters()", invocationChain.getFilters());
    }
    
    public void testSetInnerAction() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new PojoAction(""));
        invocationChain.setInnerAction("testInvocationChainInnerAction");
        assertEquals("invocationChain.getInnerAction()", "testInvocationChainInnerAction", invocationChain.getInnerAction());
    }
    
    public void testAddFiltersThrowsNullPointerException() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new PojoAction("testString"));
        try {
            invocationChain.addFilters(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LinkedList.class, ex);
            assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
        }
    }
    
    public void testGetConstructorThrowsNullPointerException() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new LogoutAction());
        try {
            callPrivateMethod("org.mentawai.core.InvocationChain", "getConstructor", new Class[] {Class.class}, invocationChain, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
        }
    }
    
    public void testGetConstructorThrowsNullPointerException1() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", null);
        try {
            callPrivateMethod("org.mentawai.core.InvocationChain", "getConstructor", new Class[] {Class.class}, invocationChain, new Object[] {Action.class});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
        }
    }
    
    public void testGetInnerClassThrowsNullPointerException() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", null);
        try {
            callPrivateMethod("org.mentawai.core.InvocationChain", "getInnerClass", new Class[] {String.class}, invocationChain, new Object[] {"testInvocationChainInnerAction"});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
        }
    }
    
    public void testInitInnerActionThrowsNullPointerException() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", new PojoAction(""));
        Action innerAction = new LogoutAction();
        try {
            invocationChain.initInnerAction(null, innerAction);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
        }
    }
    
    public void testInvokeThrowsActionException() throws Throwable {
        Action action = new PojoAction("");
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", action);
        invocationChain.setInnerAction("testInvocationChainInnerAction");
        try {
            invocationChain.invoke();
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertEquals("ex.getMessage()", "Cannot find method to execute: testInvocationChainInnerAction", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
            assertNull("ex.rootCause", ex.rootCause);
            assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
            assertSame("invocationChain.getAction()", action, invocationChain.getAction());
        }
    }
    
    public void testInvokeThrowsActionException1() throws Throwable {
        Action action = new PojoAction("");
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", action);
        try {
            invocationChain.invoke();
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertEquals("ex.getMessage()", "Cannot find method to execute: execute", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
            assertNull("ex.rootCause", ex.rootCause);
            assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
            assertSame("invocationChain.getAction()", action, invocationChain.getAction());
        }
    }
    
    public void testInvokeThrowsActionException2() throws Throwable {
        Action action = new LogoutAction();
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", action);
        invocationChain.setInnerAction("testInvocationChainInnerAction");
        try {
            invocationChain.invoke();
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertEquals("ex.getMessage()", "The inner action does not exist: testInvocationChainInnerAction", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
            assertNull("ex.rootCause", ex.rootCause);
            assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
            assertSame("invocationChain.getAction()", action, invocationChain.getAction());
        }
    }
    
    public void testInvokeThrowsActionExceptionWithAggressiveMocks() throws Throwable {
        storeStaticField(Controller.class, "debugMode");
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class, true);
        LinkedList linkedList = (LinkedList) Mockingbird.getProxyObject(LinkedList.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        StringBuffer stringBuffer = new StringBuffer();
        setPrivateField(invocationChain, "filters", linkedList);
        setPrivateField(invocationChain, "action", action);
        Mockingbird.enterRecordingMode();
        DebugServletFilter.debugInputOutput(action);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterNormalMode();
        invocationChain.setInnerAction("");
        Controller.debugMode = true;
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, linkedList, "isEmpty", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.setReturnValue(DebugServletFilter.getDebug(action), stringBuffer);
        Mockingbird.setReturnValue(true, DebugServletFilter.class, "debug", "(java.lang.StringBuffer,java.lang.String,boolean)void", null, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.replaceObjectForRecording(ActionException.class, "<init>(java.lang.String)", Mockingbird.getProxyObject(ActionException.class));
        Mockingbird.enterTestMode(InvocationChain.class);
        try {
            invocationChain.invoke();
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertNull("invocationChain.getActionName()", invocationChain.getActionName());
        }
    }
    
    public void testInvokeThrowsFilterException() throws Throwable {
        Action action = new MockAction();
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", action);
        Filter filter = new DateConverterFilter("testInvocationChainS1", "testInvocationChainS2");
        invocationChain.addFilter(filter);
        try {
            invocationChain.invoke();
            fail("Expected FilterException to be thrown");
        } catch (FilterException ex) {
            assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
            assertFalse("invocationChain.getFilters().contains(filter)", invocationChain.getFilters().contains(filter));
            assertEquals("ex.getMessage()", "Cannot convert null!", ex.getMessage());
            assertThrownBy(LocaleConverter.class, ex);
            assertEquals("ex.rootCause.getMessage()", "Cannot convert null!", ex.rootCause.getMessage());
            assertSame("invocationChain.getAction()", action, invocationChain.getAction());
        }
    }
    
    public void testInvokeThrowsNullPointerException() throws Throwable {
        Action action = new PojoAction(null);
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", action);
        invocationChain.setInnerAction("testInvocationChainInnerAction");
        try {
            invocationChain.invoke();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
            assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
            assertSame("invocationChain.getAction()", action, invocationChain.getAction());
        }
    }
    
    public void testInvokeThrowsNullPointerException1() throws Throwable {
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", null);
        invocationChain.setInnerAction("testInvocationChainInnerAction");
        try {
            invocationChain.invoke();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
            assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
            assertNull("invocationChain.getAction()", invocationChain.getAction());
        }
    }
    
    public void testInvokeThrowsNullPointerException3() throws Throwable {
        Action action = new PojoAction(null);
        InvocationChain invocationChain = new InvocationChain("testInvocationChainActionName", action);
        try {
            invocationChain.invoke();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
            assertEquals("invocationChain.getFilters().size()", 0, invocationChain.getFilters().size());
            assertSame("invocationChain.getAction()", action, invocationChain.getAction());
        }
    }
}
