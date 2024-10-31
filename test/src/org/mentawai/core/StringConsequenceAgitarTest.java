/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 7:29:54 PM
 * Time to generate: 00:24.549 seconds
 *
 */

package org.mentawai.core;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.agitar.mock.servlet.MockHttpServletResponse;
import org.agitar.mock.servlet.MockServletContext;
import org.mentawai.util.MockAction;

public class StringConsequenceAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return StringConsequence.class;
    }
    
    public void testConstructor() throws Throwable {
        StringConsequence stringConsequence = new StringConsequence();
        assertEquals("stringConsequence.key", "string", getPrivateField(stringConsequence, "key"));
    }
    
    public void testConstructor1() throws Throwable {
        StringConsequence stringConsequence = new StringConsequence("testStringConsequenceKey");
        assertEquals("stringConsequence.key", "testStringConsequenceKey", getPrivateField(stringConsequence, "key"));
    }
    
    public void testExecuteWithAggressiveMocks() throws Throwable {
        StringConsequence stringConsequence = (StringConsequence) Mockingbird.getProxyObject(StringConsequence.class, true);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        HttpServletResponse httpServletResponse = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        PrintWriter printWriter = (PrintWriter) Mockingbird.getProxyObject(PrintWriter.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(stringConsequence, "key", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getOutput(), output);
        httpServletResponse.setContentType("text/plain");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(httpServletResponse.getWriter(), printWriter);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, obj, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, printWriter, "print", "(java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(false, printWriter, "close", "()void", new Object[] {}, null, 1);
        Mockingbird.enterTestMode(StringConsequence.class);
        stringConsequence.execute(action, null, httpServletResponse);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testExecuteThrowsConsequenceException() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testStringConsequenceParam1");
        HttpServletResponse res = mockServletContext.createHttpServletResponse();
        Action a = new MockAction();
        try {
            new StringConsequence("testStringConsequenceKey").execute(a, req, res);
            fail("Expected ConsequenceException to be thrown");
        } catch (ConsequenceException ex) {
            assertEquals("(MockHttpServletResponse) res", "text/plain", ((MockHttpServletResponse) res).getContentType());
            assertNull("(MockHttpServletResponse) res", ((MockHttpServletResponse) res).getCharacterEncoding());
            assertEquals("ex.getMessage()", "Cannot find string: testStringConsequenceKey", ex.getMessage());
            assertThrownBy(StringConsequence.class, ex);
            assertEquals("(MockHttpServletResponse) res.getContentType()", "text/plain", ((MockHttpServletResponse) res).getContentType());
        }
    }
    
    public void testExecuteThrowsConsequenceExceptionWithAggressiveMocks() throws Throwable {
        StringConsequence stringConsequence = (StringConsequence) Mockingbird.getProxyObject(StringConsequence.class, true);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        HttpServletResponse httpServletResponse = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        IOException iOException = (IOException) Mockingbird.getProxyObject(IOException.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getOutput(), null);
        httpServletResponse.setContentType("text/plain");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setException(httpServletResponse.getWriter(), iOException);
        Mockingbird.replaceObjectForRecording(ConsequenceException.class, "<init>(java.lang.Exception)", Mockingbird.getProxyObject(ConsequenceException.class));
        Mockingbird.enterTestMode(StringConsequence.class);
        try {
            stringConsequence.execute(action, null, httpServletResponse);
            fail("Expected ConsequenceException to be thrown");
        } catch (ConsequenceException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testExecuteThrowsNullPointerException() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testStringConsequenceParam1");
        HttpServletResponse res = mockServletContext.createHttpServletResponse();
        try {
            new StringConsequence("testStringConsequenceKey").execute(null, req, res);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("(MockHttpServletResponse) res", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
            assertEquals("(MockHttpServletResponse) res", "UTF-8", ((MockHttpServletResponse) res).getCharacterEncoding());
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(StringConsequence.class, ex);
            assertEquals("(MockHttpServletResponse) res.getContentType()", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
        }
    }
    
    public void testExecuteThrowsNullPointerException1() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletRequest req = mockServletContext.createHttpServletRequest("testStringConsequenceParam1");
        HttpServletResponse res = mockServletContext.createHttpServletResponse();
        Action a = new PojoAction("");
        try {
            new StringConsequence("testStringConsequenceKey").execute(a, req, res);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("(MockHttpServletResponse) res", "text/plain", ((MockHttpServletResponse) res).getContentType());
            assertNull("(MockHttpServletResponse) res", ((MockHttpServletResponse) res).getCharacterEncoding());
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(StringConsequence.class, ex);
            assertEquals("(PojoAction) a.getPojo()", "", ((PojoAction) a).getPojo());
            assertEquals("(MockHttpServletResponse) res.getContentType()", "text/plain", ((MockHttpServletResponse) res).getContentType());
        }
    }
}

