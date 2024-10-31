/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 7:30:40 PM
 * Time to generate: 00:24.932 seconds
 *
 */

package org.mentawai.core;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.agitar.mock.servlet.MockHttpServletResponse;
import org.agitar.mock.servlet.MockServletContext;
import org.mentawai.util.MockAction;

public class StreamConsequenceAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return StreamConsequence.class;
    }
    
    public void testConstructor() throws Throwable {
        StreamConsequence streamConsequence = new StreamConsequence("testStreamConsequenceContentType");
        assertEquals("streamConsequence.content_length_key", "contentLength", getPrivateField(streamConsequence, "content_length_key"));
        assertEquals("streamConsequence.stream_key", "stream", getPrivateField(streamConsequence, "stream_key"));
        assertEquals("streamConsequence.contentType", "testStreamConsequenceContentType", getPrivateField(streamConsequence, "contentType"));
        assertEquals("streamConsequence.filename_key", "filename", getPrivateField(streamConsequence, "filename_key"));
        assertEquals("streamConsequence.content_disposition_key", "contentDisposition", getPrivateField(streamConsequence, "content_disposition_key"));
    }
    
    public void testConstructor1() throws Throwable {
        StreamConsequence streamConsequence = new StreamConsequence("testStreamConsequenceContentType", "testStreamConsequenceStream_key");
        assertEquals("streamConsequence.content_length_key", "contentLength", getPrivateField(streamConsequence, "content_length_key"));
        assertEquals("streamConsequence.stream_key", "testStreamConsequenceStream_key", getPrivateField(streamConsequence, "stream_key"));
        assertEquals("streamConsequence.contentType", "testStreamConsequenceContentType", getPrivateField(streamConsequence, "contentType"));
        assertEquals("streamConsequence.content_disposition_key", "contentDisposition", getPrivateField(streamConsequence, "content_disposition_key"));
        assertEquals("streamConsequence.filename_key", "filename", getPrivateField(streamConsequence, "filename_key"));
    }
    
    public void testConstructor2() throws Throwable {
        StreamConsequence streamConsequence = new StreamConsequence("testStreamConsequenceContentType", "testStreamConsequenceStream_key", "testStreamConsequenceContent_disposition_key");
        assertEquals("streamConsequence.content_length_key", "contentLength", getPrivateField(streamConsequence, "content_length_key"));
        assertEquals("streamConsequence.stream_key", "testStreamConsequenceStream_key", getPrivateField(streamConsequence, "stream_key"));
        assertEquals("streamConsequence.contentType", "testStreamConsequenceContentType", getPrivateField(streamConsequence, "contentType"));
        assertEquals("streamConsequence.filename_key", "filename", getPrivateField(streamConsequence, "filename_key"));
        assertEquals("streamConsequence.content_disposition_key", "testStreamConsequenceContent_disposition_key", getPrivateField(streamConsequence, "content_disposition_key"));
    }
    
    public void testConstructor3() throws Throwable {
        StreamConsequence streamConsequence = new StreamConsequence("testStreamConsequenceContentType", "testStreamConsequenceStream_key", "testStreamConsequenceContent_disposition_key", "testStreamConsequenceContent_length_key");
        assertEquals("streamConsequence.content_length_key", "testStreamConsequenceContent_length_key", getPrivateField(streamConsequence, "content_length_key"));
        assertEquals("streamConsequence.stream_key", "testStreamConsequenceStream_key", getPrivateField(streamConsequence, "stream_key"));
        assertEquals("streamConsequence.contentType", "testStreamConsequenceContentType", getPrivateField(streamConsequence, "contentType"));
        assertEquals("streamConsequence.content_disposition_key", "testStreamConsequenceContent_disposition_key", getPrivateField(streamConsequence, "content_disposition_key"));
        assertEquals("streamConsequence.filename_key", "filename", getPrivateField(streamConsequence, "filename_key"));
    }
    
    public void testDefineHeader() throws Throwable {
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        StreamConsequence streamConsequence = new StreamConsequence("testStreamConsequenceContentType");
        streamConsequence.defineHeader(res, new MapOutput());
        assertEquals("(MockHttpServletResponse) res", "testStreamConsequenceContentType", ((MockHttpServletResponse) res).getContentType());
        assertNull("(MockHttpServletResponse) res", ((MockHttpServletResponse) res).getCharacterEncoding());
    }
    
    public void testExecuteWithAggressiveMocks() throws Throwable {
        StreamConsequence streamConsequence = (StreamConsequence) Mockingbird.getProxyObject(StreamConsequence.class, true);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        HttpServletResponse httpServletResponse = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        ServletOutputStream servletOutputStream = (ServletOutputStream) Mockingbird.getProxyObject(ServletOutputStream.class);
        InputStream inputStream = (InputStream) Mockingbird.getProxyObject(InputStream.class);
        setPrivateField(streamConsequence, "contentType", "");
        setPrivateField(streamConsequence, "content_length_key", "");
        setPrivateField(streamConsequence, "content_disposition_key", "");
        streamConsequence.setFileNameKey("");
        setPrivateField(streamConsequence, "stream_key", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getOutput(), output);
        Mockingbird.setReturnValue(false, httpServletResponse, "setContentType", "(java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", new Integer(0), 1);
        httpServletResponse.setContentLength(0);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, httpServletResponse, "setHeader", "(java.lang.String,java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(httpServletResponse.getOutputStream(), servletOutputStream);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", inputStream, 1);
        Mockingbird.setReturnValue(false, inputStream, "read", "(byte[],int,int)int", new Integer(0), 1);
        Mockingbird.setReturnValue(false, servletOutputStream, "write", "(byte[],int,int)void", null, 1);
        Mockingbird.setReturnValue(false, inputStream, "read", "(byte[],int,int)int", new Integer(0), 1);
        Mockingbird.setReturnValue(false, servletOutputStream, "write", "(byte[],int,int)void", null, 1);
        Mockingbird.setReturnValue(false, inputStream, "read", "(byte[],int,int)int", new Integer(-1), 1);
        servletOutputStream.flush();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(StreamConsequence.class);
        streamConsequence.execute(action, null, httpServletResponse);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testExecuteWithAggressiveMocks1() throws Throwable {
        StreamConsequence streamConsequence = (StreamConsequence) Mockingbird.getProxyObject(StreamConsequence.class, true);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        HttpServletResponse httpServletResponse = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        ServletOutputStream servletOutputStream = (ServletOutputStream) Mockingbird.getProxyObject(ServletOutputStream.class);
        byte[] bytes = new byte[0];
        setPrivateField(streamConsequence, "contentType", "");
        setPrivateField(streamConsequence, "content_length_key", "");
        setPrivateField(streamConsequence, "content_disposition_key", "");
        streamConsequence.setFileNameKey("");
        setPrivateField(streamConsequence, "stream_key", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getOutput(), output);
        Mockingbird.setReturnValue(false, httpServletResponse, "setContentType", "(java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, obj2, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, httpServletResponse, "setHeader", "(java.lang.String,java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(httpServletResponse.getOutputStream(), servletOutputStream);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", bytes, 1);
        servletOutputStream.write(bytes);
        Mockingbird.setNormalReturnForVoid();
        servletOutputStream.flush();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(StreamConsequence.class);
        streamConsequence.execute(action, null, httpServletResponse);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testSetFileNameKey() throws Throwable {
        StreamConsequence streamConsequence = new StreamConsequence("testStreamConsequenceContentType");
        streamConsequence.setFileNameKey("testStreamConsequenceFilename_key");
        assertEquals("streamConsequence.filename_key", "testStreamConsequenceFilename_key", getPrivateField(streamConsequence, "filename_key"));
    }
    
    public void testDefineHeaderThrowsIllegalArgumentException() throws Throwable {
        Output output = new MapOutput();
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        StreamConsequence streamConsequence = new StreamConsequence("");
        try {
            streamConsequence.defineHeader(res, output);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("(MockHttpServletResponse) res", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
            assertEquals("(MockHttpServletResponse) res", "UTF-8", ((MockHttpServletResponse) res).getCharacterEncoding());
            assertEquals("ex.getMessage()", "null or empty mimetype string: ", ex.getMessage());
            assertTrue("(OutputMap) output.isEmpty()", ((MapOutput) output).isEmpty());
            assertEquals("(MockHttpServletResponse) res.getContentType()", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
        }
    }
    
    public void testDefineHeaderThrowsNullPointerException() throws Throwable {
        StreamConsequence streamConsequence = new StreamConsequence("testStreamConsequenceContentType");
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        try {
            streamConsequence.defineHeader(res, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("(MockHttpServletResponse) res", "testStreamConsequenceContentType", ((MockHttpServletResponse) res).getContentType());
            assertNull("(MockHttpServletResponse) res", ((MockHttpServletResponse) res).getCharacterEncoding());
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(StreamConsequence.class, ex);
            assertEquals("(MockHttpServletResponse) res.getContentType()", "testStreamConsequenceContentType", ((MockHttpServletResponse) res).getContentType());
        }
    }
    
    public void testExecuteThrowsConsequenceException() throws Throwable {
        HttpServletRequest req = new MockServletContext().createHttpServletRequest("testStreamConsequenceParam1");
        StreamConsequence streamConsequence = new StreamConsequence("testStreamConsequenceContentType", "testStreamConsequenceStream_key", "testStreamConsequenceContent_disposition_key");
        Action a = new MockAction();
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        try {
            streamConsequence.execute(a, req, res);
            fail("Expected ConsequenceException to be thrown");
        } catch (ConsequenceException ex) {
            assertEquals("(MockHttpServletResponse) res", "testStreamConsequenceContentType", ((MockHttpServletResponse) res).getContentType());
            assertNull("(MockHttpServletResponse) res", ((MockHttpServletResponse) res).getCharacterEncoding());
            assertEquals("ex.getMessage()", "org.mentawai.core.ConsequenceException: Cannot find stream: testStreamConsequenceStream_key", ex.getMessage());
            assertThrownBy(StreamConsequence.class, ex);
            assertEquals("(MockHttpServletResponse) res.getContentType()", "testStreamConsequenceContentType", ((MockHttpServletResponse) res).getContentType());
        }
    }
    
    public void testExecuteThrowsConsequenceExceptionWithAggressiveMocks() throws Throwable {
        StreamConsequence streamConsequence = (StreamConsequence) Mockingbird.getProxyObject(StreamConsequence.class, true);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        HttpServletResponse httpServletResponse = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        IOException iOException = (IOException) Mockingbird.getProxyObject(IOException.class);
        setPrivateField(streamConsequence, "contentType", "");
        setPrivateField(streamConsequence, "content_length_key", "");
        setPrivateField(streamConsequence, "content_disposition_key", "");
        streamConsequence.setFileNameKey("");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getOutput(), output);
        Mockingbird.setReturnValue(false, httpServletResponse, "setContentType", "(java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", new Integer(0), 1);
        httpServletResponse.setContentLength(0);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, obj, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, httpServletResponse, "setHeader", "(java.lang.String,java.lang.String)void", null, 1);
        Mockingbird.setException(httpServletResponse.getOutputStream(), iOException);
        Mockingbird.replaceObjectForRecording(ConsequenceException.class, "<init>(java.lang.Exception)", Mockingbird.getProxyObject(ConsequenceException.class));
        Mockingbird.enterTestMode(StreamConsequence.class);
        try {
            streamConsequence.execute(action, null, httpServletResponse);
            fail("Expected ConsequenceException to be thrown");
        } catch (ConsequenceException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testExecuteThrowsConsequenceExceptionWithAggressiveMocks1() throws Throwable {
        StreamConsequence streamConsequence = (StreamConsequence) Mockingbird.getProxyObject(StreamConsequence.class, true);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        HttpServletResponse httpServletResponse = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(streamConsequence, "contentType", "");
        setPrivateField(streamConsequence, "content_length_key", "");
        setPrivateField(streamConsequence, "content_disposition_key", "");
        streamConsequence.setFileNameKey("");
        setPrivateField(streamConsequence, "stream_key", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getOutput(), output);
        Mockingbird.setReturnValue(false, httpServletResponse, "setContentType", "(java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", new Integer(0), 1);
        httpServletResponse.setContentLength(0);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, obj, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, httpServletResponse, "setHeader", "(java.lang.String,java.lang.String)void", null, 1);
        Mockingbird.setReturnValue(httpServletResponse.getOutputStream(), null);
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.replaceObjectForRecording(ConsequenceException.class, "<init>(java.lang.String)", Mockingbird.getProxyObject(ConsequenceException.class));
        Mockingbird.replaceObjectForRecording(ConsequenceException.class, "<init>(java.lang.Exception)", Mockingbird.getProxyObject(ConsequenceException.class));
        Mockingbird.enterTestMode(StreamConsequence.class);
        try {
            streamConsequence.execute(action, null, httpServletResponse);
            fail("Expected ConsequenceException to be thrown");
        } catch (ConsequenceException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testExecuteThrowsIllegalArgumentException() throws Throwable {
        HttpServletRequest req = new MockServletContext().createHttpServletRequest("testStreamConsequenceParam1");
        StreamConsequence streamConsequence = new StreamConsequence("", "testStreamConsequenceStream_key", "testStreamConsequenceContent_disposition_key");
        Action a = new MockAction();
        HttpServletResponse res = new MockServletContext().createHttpServletResponse();
        try {
            streamConsequence.execute(a, req, res);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("(MockHttpServletResponse) res", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
            assertEquals("(MockHttpServletResponse) res", "UTF-8", ((MockHttpServletResponse) res).getCharacterEncoding());
            assertEquals("ex.getMessage()", "null or empty mimetype string: ", ex.getMessage());
            assertEquals("(MockHttpServletResponse) res.getContentType()", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
        }
    }
    
    public void testExecuteThrowsNullPointerException() throws Throwable {
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletResponse res = mockServletContext.createHttpServletResponse();
        try {
            new StreamConsequence("testStreamConsequenceContentType").execute(null, mockServletContext.createHttpServletRequest("testStreamConsequenceParam1"), res);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("(MockHttpServletResponse) res", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
            assertEquals("(MockHttpServletResponse) res", "UTF-8", ((MockHttpServletResponse) res).getCharacterEncoding());
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(StreamConsequence.class, ex);
            assertEquals("(MockHttpServletResponse) res.getContentType()", "text/html; charset=UTF-8", ((MockHttpServletResponse) res).getContentType());
        }
    }
}
