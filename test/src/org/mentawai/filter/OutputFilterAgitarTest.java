/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:22:51 PM
 * Time to generate: 00:25.374 seconds
 *
 */

package org.mentawai.filter;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.agitar.lib.mockingbird.MockingbirdSystem;
import java.io.PrintStream;
import org.mentawai.action.LogoutAction;
import org.mentawai.action.SuccessAction;
import org.mentawai.core.ActionException;
import org.mentawai.core.InvocationChain;
import org.mentawai.core.PojoAction;
import org.mentawai.util.MockAction;

public class OutputFilterAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return OutputFilter.class;
    }
    
    public void testConstructor() throws Throwable {
        new OutputFilter();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testAdjustName() throws Throwable {
        OutputFilter outputFilter = new OutputFilter();
        String result = (String) callPrivateMethod("org.mentawai.filter.OutputFilter", "adjustName", new Class[] {String.class}, outputFilter, new Object[] {"testOutputFilterName"});
        assertEquals("result", "tOutputFilterName", result);
    }
    
    public void testDestroy() throws Throwable {
        new OutputFilter().destroy();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testFilter() throws Throwable {
        String result = new OutputFilter().filter(new InvocationChain("testOutputFilterActionName", new MockAction()));
        assertEquals("result", "success", result);
    }
    
    public void testFilter1() throws Throwable {
        String result = new OutputFilter().filter(new InvocationChain("testOutputFilterActionName", new SuccessAction()));
        assertEquals("result", "success", result);
    }
    
    public void testFilter2() throws Throwable {
        OutputFilter outputFilter = new OutputFilter();
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        PojoAction pojoAction = (PojoAction) Mockingbird.getProxyObject(PojoAction.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(invocationChain, "action", pojoAction);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(invocationChain.invoke(), "");
        setPrivateField(pojoAction, "pojo", obj);
        PrintStream printStream = (PrintStream) Mockingbird.getProxyObject(PrintStream.class);
        MockingbirdSystem.err = printStream;
        Mockingbird.setReturnValue(pojoAction.getOutput(), null);
        Boolean boolean2 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, printStream, "println", "(java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(Throwable.class), "printStackTrace", "()void", null, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.enterTestMode(OutputFilter.class);
        String result = outputFilter.filter(invocationChain);
        assertEquals("result", "", result);
    }
    
    public void testAdjustNameThrowsNegativeArraySizeException() throws Throwable {
        OutputFilter outputFilter = new OutputFilter();
        try {
            callPrivateMethod("org.mentawai.filter.OutputFilter", "adjustName", new Class[] {String.class}, outputFilter, new Object[] {""});
            fail("Expected NegativeArraySizeException to be thrown");
        } catch (NegativeArraySizeException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
        }
    }
    
    public void testAdjustNameThrowsNullPointerException() throws Throwable {
        OutputFilter outputFilter = new OutputFilter();
        try {
            callPrivateMethod("org.mentawai.filter.OutputFilter", "adjustName", new Class[] {String.class}, outputFilter, new Object[] {null});
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(OutputFilter.class, ex);
        }
    }
    
    public void testFilterThrowsActionException() throws Throwable {
        InvocationChain chain = new InvocationChain("testOutputFilterActionName", new PojoAction(""));
        try {
            new OutputFilter().filter(chain);
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertEquals("ex.getMessage()", "Cannot find method to execute: execute", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
            assertNull("ex.getCause()", ex.getCause());
            assertEquals("chain.getActionName()", "testOutputFilterActionName", chain.getActionName());
        }
    }
}

