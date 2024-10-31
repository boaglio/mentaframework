/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:25:20 PM
 * Time to generate: 00:17.717 seconds
 *
 */

package org.mentawai.filter;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import org.mentawai.action.LogoutAction;
import org.mentawai.core.Action;
import org.mentawai.core.ActionException;
import org.mentawai.core.Context;
import org.mentawai.core.InvocationChain;
import org.mentawai.core.Output;
import org.mentawai.util.MockAction;

public class RedirectAfterLoginFilterAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return RedirectAfterLoginFilter.class;
    }
    
    public void testConstructor() throws Throwable {
        new RedirectAfterLoginFilter();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testDestroy() throws Throwable {
        new RedirectAfterLoginFilter().destroy();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testFilter() throws Throwable {
        String result = new RedirectAfterLoginFilter().filter(new InvocationChain("testRedirectAfterLoginFilterActionName", new MockAction()));
        assertEquals("result", "success", result);
    }
    
    public void testFilter1() throws Throwable {
        RedirectAfterLoginFilter redirectAfterLoginFilter = new RedirectAfterLoginFilter();
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        Context context = (Context) Mockingbird.getProxyObject(Context.class);
        setPrivateField(invocationChain, "action", action);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getSession(), context);
        Mockingbird.setReturnValue(context.getAttribute("url"), "");
        Mockingbird.setReturnValue(invocationChain.invoke(), "error");
        Mockingbird.enterTestMode(RedirectAfterLoginFilter.class);
        String result = redirectAfterLoginFilter.filter(invocationChain);
        assertEquals("result", "error", result);
    }
    
    public void testFilter2() throws Throwable {
        RedirectAfterLoginFilter redirectAfterLoginFilter = new RedirectAfterLoginFilter();
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        Context context = (Context) Mockingbird.getProxyObject(Context.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        setPrivateField(invocationChain, "action", action);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getSession(), context);
        Mockingbird.setReturnValue(context.getAttribute("url"), "");
        Mockingbird.setReturnValue(invocationChain.invoke(), "");
        Mockingbird.setReturnValue(action.getOutput(), output);
        Mockingbird.setReturnValue(false, output, "setValue", "(java.lang.String,java.lang.Object)void", null, 1);
        Mockingbird.enterTestMode(RedirectAfterLoginFilter.class);
        String result = redirectAfterLoginFilter.filter(invocationChain);
        assertEquals("result", "redir", result);
    }
    
    public void testFilterThrowsActionException() throws Throwable {
        InvocationChain chain = new InvocationChain("testRedirectAfterLoginFilterActionName", new MockAction());
        chain.setInnerAction("testRedirectAfterLoginFilterInnerAction");
        try {
            new RedirectAfterLoginFilter().filter(chain);
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertEquals("ex.getMessage()", "The inner action does not exist: testRedirectAfterLoginFilterInnerAction", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
            assertNull("ex.getCause()", ex.getCause());
            assertEquals("chain.getActionName()", "testRedirectAfterLoginFilterActionName", chain.getActionName());
        }
    }
    
    public void testFilterThrowsNullPointerException() throws Throwable {
        InvocationChain chain = new InvocationChain("testRedirectAfterLoginFilterActionName", new LogoutAction());
        try {
            new RedirectAfterLoginFilter().filter(chain);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(RedirectAfterLoginFilter.class, ex);
            assertEquals("chain.getActionName()", "testRedirectAfterLoginFilterActionName", chain.getActionName());
        }
    }
    
    public void testFilterThrowsNullPointerException1() throws Throwable {
        InvocationChain chain = new InvocationChain("testRedirectAfterLoginFilterActionName", null);
        try {
            new RedirectAfterLoginFilter().filter(chain);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(RedirectAfterLoginFilter.class, ex);
            assertEquals("chain.getActionName()", "testRedirectAfterLoginFilterActionName", chain.getActionName());
        }
    }
    
    public void testFilterThrowsNullPointerException2() throws Throwable {
        try {
            new RedirectAfterLoginFilter().filter(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(RedirectAfterLoginFilter.class, ex);
        }
    }
}
