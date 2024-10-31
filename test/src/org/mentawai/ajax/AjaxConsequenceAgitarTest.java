/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:30:04 PM
 * Time to generate: 00:23.782 seconds
 *
 */

package org.mentawai.ajax;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.agitar.mock.servlet.MockHttpServletResponse;
import org.agitar.mock.servlet.MockServletContext;
import org.mentawai.action.SuccessAction;
import org.mentawai.ajax.renderer.BeanCollectionAjaxRenderer;
import org.mentawai.ajax.renderer.JSONArrayAjaxRenderer;
import org.mentawai.ajax.renderer.JSONGenericRenderer;
import org.mentawai.ajax.renderer.JSONMapAjaxRenderer;
import org.mentawai.ajax.renderer.StringAjaxRenderer;
import org.mentawai.core.Action;
import org.mentawai.core.ConsequenceException;
import org.mentawai.core.Output;
import org.mentawai.util.HttpUtils;
import org.mentawai.util.MockAction;

public class AjaxConsequenceAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return AjaxConsequence.class;
    }
    
    public void testConstructor() throws Throwable {
        AjaxRenderer renderer = new StringAjaxRenderer();
        AjaxConsequence ajaxConsequence = new AjaxConsequence(renderer, true);
        assertSame("ajaxConsequence.ajaxRenderer", renderer, getPrivateField(ajaxConsequence, "ajaxRenderer"));
        assertEquals("ajaxConsequence.key", "ajax_object", getPrivateField(ajaxConsequence, "key"));
        assertTrue("ajaxConsequence.pretty", ((Boolean) getPrivateField(ajaxConsequence, "pretty")).booleanValue());
    }
    
    public void testConstructor1() throws Throwable {
        AjaxRenderer renderer = new JSONGenericRenderer(100);
        AjaxConsequence ajaxConsequence = new AjaxConsequence("testAjaxConsequenceKey", renderer, true);
        assertSame("ajaxConsequence.ajaxRenderer", renderer, getPrivateField(ajaxConsequence, "ajaxRenderer"));
        assertEquals("ajaxConsequence.key", "testAjaxConsequenceKey", getPrivateField(ajaxConsequence, "key"));
        assertTrue("ajaxConsequence.pretty", ((Boolean) getPrivateField(ajaxConsequence, "pretty")).booleanValue());
    }
    
    public void testConstructor2() throws Throwable {
        AjaxRenderer renderer = new JSONArrayAjaxRenderer();
        AjaxConsequence ajaxConsequence = new AjaxConsequence(renderer);
        assertSame("ajaxConsequence.ajaxRenderer", renderer, getPrivateField(ajaxConsequence, "ajaxRenderer"));
        assertEquals("ajaxConsequence.key", "ajax_object", getPrivateField(ajaxConsequence, "key"));
        assertFalse("ajaxConsequence.pretty", ((Boolean) getPrivateField(ajaxConsequence, "pretty")).booleanValue());
    }
    
    public void testConstructor3() throws Throwable {
        String[] attrsAttrs = new String[2];
        AjaxRenderer renderer = new BeanCollectionAjaxRenderer(null, attrsAttrs);
        AjaxConsequence ajaxConsequence = new AjaxConsequence("testAjaxConsequenceKey", renderer);
        assertSame("ajaxConsequence.ajaxRenderer", renderer, getPrivateField(ajaxConsequence, "ajaxRenderer"));
        assertEquals("ajaxConsequence.key", "testAjaxConsequenceKey", getPrivateField(ajaxConsequence, "key"));
        assertFalse("ajaxConsequence.pretty", ((Boolean) getPrivateField(ajaxConsequence, "pretty")).booleanValue());
    }
    
    public void testExecuteWithAggressiveMocks() throws Throwable {
        AjaxConsequence ajaxConsequence = (AjaxConsequence) Mockingbird.getProxyObject(AjaxConsequence.class, true);
        AjaxRenderer ajaxRenderer = (AjaxRenderer) Mockingbird.getProxyObject(AjaxRenderer.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        HttpServletResponse httpServletResponse = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        PrintWriter printWriter = (PrintWriter) Mockingbird.getProxyObject(PrintWriter.class);
        setPrivateField(ajaxConsequence, "key", "");
        setPrivateField(ajaxConsequence, "ajaxRenderer", ajaxRenderer);
        setPrivateField(ajaxConsequence, "pretty", Boolean.FALSE);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getOutput(), output);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(ajaxRenderer.getContentType(), "");
        Mockingbird.setReturnValue(false, httpServletResponse, "setContentType", "(java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(action.getLocale(), null);
        Mockingbird.setReturnValue(ajaxRenderer.encode(obj, null, false), "");
        HttpUtils.disableCache(httpServletResponse);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(httpServletResponse.getWriter(), printWriter);
        Mockingbird.setReturnValue(false, printWriter, "print", "(java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(false, printWriter, "flush", "()void", new Object[] {}, null, 1);
        Mockingbird.enterTestMode(AjaxConsequence.class);
        ajaxConsequence.execute(action, null, httpServletResponse);
        assertNotNull("ajaxConsequence.ajaxRenderer", getPrivateField(ajaxConsequence, "ajaxRenderer"));
    }
    
    public void testExecuteThrowsConsequenceException() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletResponse res = mockServletContext.createHttpServletResponse();
        AjaxRenderer renderer = new StringAjaxRenderer();
        AjaxConsequence ajaxConsequence = new AjaxConsequence("testAjaxConsequenceKey", renderer, true);
        Action a = new MockAction();
        try {
            ajaxConsequence.execute(a, mockServletContext.createHttpServletRequest("testAjaxConsequenceParam1"), res);
            fail("Expected ConsequenceException to be thrown");
        } catch (ConsequenceException ex) {
            assertEquals("(MockHttpServletResponse) res", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
            assertEquals("(MockHttpServletResponse) res", "UTF-8", ((MockHttpServletResponse) res).getCharacterEncoding());
            assertEquals("ex.getMessage()", "Cannot find value for key: testAjaxConsequenceKey", ex.getMessage());
            assertThrownBy(AjaxConsequence.class, ex);
            assertSame("ajaxConsequence.ajaxRenderer", renderer, getPrivateField(ajaxConsequence, "ajaxRenderer"));
            assertEquals("(MockHttpServletResponse) res.getContentType()", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
        }
    }
    
    public void testExecuteThrowsConsequenceExceptionWithAggressiveMocks() throws Throwable {
        AjaxConsequence ajaxConsequence = (AjaxConsequence) Mockingbird.getProxyObject(AjaxConsequence.class, true);
        AjaxRenderer ajaxRenderer = (AjaxRenderer) Mockingbird.getProxyObject(AjaxRenderer.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        HttpServletResponse httpServletResponse = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        IOException iOException = (IOException) Mockingbird.getProxyObject(IOException.class);
        setPrivateField(ajaxConsequence, "key", "");
        setPrivateField(ajaxConsequence, "ajaxRenderer", ajaxRenderer);
        setPrivateField(ajaxConsequence, "pretty", Boolean.FALSE);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getOutput(), output);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(ajaxRenderer.getContentType(), "");
        Mockingbird.setReturnValue(false, httpServletResponse, "setContentType", "(java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(action.getLocale(), null);
        Mockingbird.setReturnValue(ajaxRenderer.encode(obj, null, false), "");
        HttpUtils.disableCache(httpServletResponse);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setException(httpServletResponse.getWriter(), iOException);
        Mockingbird.setReturnValue(false, iOException, "getMessage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.replaceObjectForRecording(ConsequenceException.class, "<init>(java.lang.String,java.lang.Exception)", Mockingbird.getProxyObject(ConsequenceException.class));
        Mockingbird.enterTestMode(AjaxConsequence.class);
        try {
            ajaxConsequence.execute(action, null, httpServletResponse);
            fail("Expected ConsequenceException to be thrown");
        } catch (ConsequenceException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testExecuteThrowsConsequenceExceptionWithAggressiveMocks1() throws Throwable {
        AjaxConsequence ajaxConsequence = (AjaxConsequence) Mockingbird.getProxyObject(AjaxConsequence.class, true);
        AjaxRenderer ajaxRenderer = (AjaxRenderer) Mockingbird.getProxyObject(AjaxRenderer.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        HttpServletResponse httpServletResponse = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Exception ex2 = (Exception) Mockingbird.getProxyObject(Exception.class);
        setPrivateField(ajaxConsequence, "key", "");
        setPrivateField(ajaxConsequence, "pretty", Boolean.FALSE);
        setPrivateField(ajaxConsequence, "ajaxRenderer", ajaxRenderer);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getOutput(), output);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(ajaxRenderer.getContentType(), "");
        Mockingbird.setReturnValue(false, httpServletResponse, "setContentType", "(java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(action.getLocale(), null);
        Mockingbird.setException(ajaxRenderer.encode(obj, null, false), ex2);
        Mockingbird.setReturnValue(false, ex2, "getMessage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.replaceObjectForRecording(ConsequenceException.class, "<init>(java.lang.String,java.lang.Exception)", Mockingbird.getProxyObject(ConsequenceException.class));
        Mockingbird.enterTestMode(AjaxConsequence.class);
        try {
            ajaxConsequence.execute(action, null, httpServletResponse);
            fail("Expected ConsequenceException to be thrown");
        } catch (ConsequenceException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testExecuteThrowsNullPointerException() throws Throwable {
        AjaxRenderer renderer = new JSONMapAjaxRenderer();
        AjaxConsequence ajaxConsequence = new AjaxConsequence("testAjaxConsequenceKey", renderer, true);
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletResponse res = mockServletContext.createHttpServletResponse();
        Action a = new SuccessAction();
        try {
            ajaxConsequence.execute(a, mockServletContext.createHttpServletRequest("testAjaxConsequenceParam1"), res);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("(MockHttpServletResponse) res", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
            assertEquals("(MockHttpServletResponse) res", "UTF-8", ((MockHttpServletResponse) res).getCharacterEncoding());
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AjaxConsequence.class, ex);
            assertSame("ajaxConsequence.ajaxRenderer", renderer, getPrivateField(ajaxConsequence, "ajaxRenderer"));
            assertEquals("(MockHttpServletResponse) res.getContentType()", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
        }
    }
}

