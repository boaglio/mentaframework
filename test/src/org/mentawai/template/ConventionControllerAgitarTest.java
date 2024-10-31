/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 5:50:04 PM
 * Time to generate: 00:23.236 seconds
 *
 */

package org.mentawai.template;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.io.File;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.agitar.mock.servlet.MockHttpServletRequest;
import org.agitar.mock.servlet.MockHttpServletResponse;
import org.agitar.mock.servlet.MockServletContext;
import org.mentawai.core.ApplicationManager;

public class ConventionControllerAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ConventionController.class;
    }
    
    public void testConstructor() throws Throwable {
        ConventionController conventionController = new ConventionController();
        assertEquals("conventionController.getExtension()", ".jsp", conventionController.getExtension());
    }
    
    public void testGetExtension() throws Throwable {
        String result = new ConventionController().getExtension();
        assertEquals("result", ".jsp", result);
    }
    
    public void testGetPrincipalBlock() throws Throwable {
        String result = new ConventionController().getPrincipalBlock();
        assertEquals("result", "body", result);
    }
    
    public void testGetRoot() throws Throwable {
        String result = new ConventionController().getRoot();
        assertEquals("result", "", result);
    }
    
    public void testProcessPage() throws Throwable {
        ConventionController conventionController = new ConventionController();
        Page page = (Page) Mockingbird.getProxyObject(Page.class);
        HttpServletRequest request = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse response = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        ServletContext application = (ServletContext) Mockingbird.getProxyObject(ServletContext.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(page.getPath(), "");
        Mockingbird.setReturnValue(ApplicationManager.getViewDir(), "");
        Mockingbird.setReturnValue(application.getRealPath("testConventionControllerParam1"), "testString");
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setReturnValue(false, file, "exists", "()boolean", new Object[] {}, Boolean.FALSE, 1);
        RequestDispatcher mockRequestDispatcher = (RequestDispatcher) Mockingbird.getProxyObject(RequestDispatcher.class);
        Mockingbird.setReturnValue(request.getRequestDispatcher(".jsp"), mockRequestDispatcher);
        mockRequestDispatcher.forward(request, response);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(ConventionController.class);
        conventionController.processPage(page, request, response, application);
        assertNull("page.getPath()", page.getPath());
    }
    
    public void testProcessPage1() throws Throwable {
        ConventionController conventionController = new ConventionController();
        Page page = (Page) Mockingbird.getProxyObject(Page.class);
        HttpServletRequest request = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse response = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        ServletContext application = (ServletContext) Mockingbird.getProxyObject(ServletContext.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(page.getPath(), "testString");
        Mockingbird.setReturnValue(ApplicationManager.getViewDir(), "\u2D4E");
        Mockingbird.setReturnValue(application.getRealPath("testConventionControllerParam1"), "testString");
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setReturnValue(false, file, "exists", "()boolean", new Object[] {}, Boolean.FALSE, 1);
        RequestDispatcher mockRequestDispatcher = (RequestDispatcher) Mockingbird.getProxyObject(RequestDispatcher.class);
        Mockingbird.setReturnValue(request.getRequestDispatcher("\u2D4E/testString.jsp"), mockRequestDispatcher);
        mockRequestDispatcher.forward(request, response);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(ConventionController.class);
        conventionController.processPage(page, request, response, application);
        assertNull("page.getPath()", page.getPath());
    }
    
    public void testProcessPage2() throws Throwable {
        ConventionController conventionController = new ConventionController();
        Page page = (Page) Mockingbird.getProxyObject(Page.class);
        HttpServletRequest request = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse response = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        ServletContext application = (ServletContext) Mockingbird.getProxyObject(ServletContext.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(page.getPath(), "testString");
        Mockingbird.setReturnValue(ApplicationManager.getViewDir(), "testString");
        Mockingbird.setReturnValue(application.getRealPath("testConventionControllerParam1"), "testString");
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setReturnValue(false, file, "exists", "()boolean", new Object[] {}, Boolean.FALSE, 1);
        RequestDispatcher mockRequestDispatcher = (RequestDispatcher) Mockingbird.getProxyObject(RequestDispatcher.class);
        Mockingbird.setReturnValue(request.getRequestDispatcher("testString.jsp"), mockRequestDispatcher);
        mockRequestDispatcher.forward(request, response);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(ConventionController.class);
        conventionController.processPage(page, request, response, application);
        assertNull("page.getPath()", page.getPath());
    }
    
    public void testProcessPage3() throws Throwable {
        ConventionController conventionController = new ConventionController();
        Page page = (Page) Mockingbird.getProxyObject(Page.class);
        HttpServletRequest request = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse response = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        ServletContext application = (ServletContext) Mockingbird.getProxyObject(ServletContext.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(page.getPath(), "testString");
        Mockingbird.setReturnValue(ApplicationManager.getViewDir(), null);
        Mockingbird.setReturnValue(application.getRealPath("testConventionControllerParam1"), "testString");
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setReturnValue(false, file, "exists", "()boolean", new Object[] {}, Boolean.FALSE, 1);
        RequestDispatcher mockRequestDispatcher = (RequestDispatcher) Mockingbird.getProxyObject(RequestDispatcher.class);
        Mockingbird.setReturnValue(request.getRequestDispatcher("testString.jsp"), mockRequestDispatcher);
        mockRequestDispatcher.forward(request, response);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(ConventionController.class);
        conventionController.processPage(page, request, response, application);
        assertNull("page.getPath()", page.getPath());
    }
    
    public void testProcessPage4() throws Throwable {
        ConventionController conventionController = new ConventionController();
        Page page = (Page) Mockingbird.getProxyObject(Page.class);
        HttpServletRequest httpServletRequest = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        ServletContext servletContext = (ServletContext) Mockingbird.getProxyObject(ServletContext.class);
        RequestDispatcher requestDispatcher = (RequestDispatcher) Mockingbird.getProxyObject(RequestDispatcher.class);
        page.setPath("");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.enterNormalMode();
        ApplicationManager.setViewDir("A");
        Mockingbird.enterRecordingMode();
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Boolean boolean3 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "endsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, "", "startsWith", "(java.lang.String)boolean", new Object[] {"/"}, boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int,int)java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(servletContext.getRealPath("/"), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setReturnValue(false, file, "exists", "()boolean", new Object[] {}, boolean2, 1);
        Mockingbird.setReturnValue(false, httpServletRequest, "getRequestDispatcher", "(java.lang.String)javax.servlet.RequestDispatcher", requestDispatcher, 1);
        requestDispatcher.forward(httpServletRequest, null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(ConventionController.class);
        conventionController.processPage(page, httpServletRequest, null, servletContext);
        assertEquals("conventionController.getExtension()", ".jsp", conventionController.getExtension());
    }
    
    public void testProcessPage5() throws Throwable {
        ConventionController conventionController = new ConventionController();
        Page page = (Page) Mockingbird.getProxyObject(Page.class);
        HttpServletRequest httpServletRequest = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        ServletContext servletContext = (ServletContext) Mockingbird.getProxyObject(ServletContext.class);
        RequestDispatcher requestDispatcher = (RequestDispatcher) Mockingbird.getProxyObject(RequestDispatcher.class);
        page.setPath("");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.enterNormalMode();
        ApplicationManager.setViewDir("A");
        Mockingbird.enterRecordingMode();
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "endsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "endsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", Boolean.TRUE, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(servletContext.getRealPath("/"), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setReturnValue(false, file, "exists", "()boolean", new Object[] {}, boolean2, 1);
        Mockingbird.setReturnValue(false, httpServletRequest, "getRequestDispatcher", "(java.lang.String)javax.servlet.RequestDispatcher", requestDispatcher, 1);
        requestDispatcher.forward(httpServletRequest, null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(ConventionController.class);
        conventionController.processPage(page, httpServletRequest, null, servletContext);
        assertEquals("conventionController.getExtension()", ".jsp", conventionController.getExtension());
    }
    
    public void testProcessPage6() throws Throwable {
        ConventionController conventionController = new ConventionController();
        Page page = (Page) Mockingbird.getProxyObject(Page.class);
        ServletContext servletContext = (ServletContext) Mockingbird.getProxyObject(ServletContext.class);
        page.setPath("");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.enterNormalMode();
        ApplicationManager.setViewDir("A");
        Mockingbird.enterRecordingMode();
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "endsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "endsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(servletContext.getRealPath("/"), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setReturnValue(false, file, "exists", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.replaceObjectForRecording(Page.class, "<init>(java.lang.String)", Mockingbird.getProxyObject(Page.class));
        Mockingbird.setReturnValue(false, page, "setBlock", "(java.lang.String,org.mentawai.template.Page)void", null, 1);
        Mockingbird.enterTestMode(ConventionController.class);
        conventionController.processPage(page, null, null, servletContext);
        assertEquals("conventionController.getExtension()", ".jsp", conventionController.getExtension());
    }
    
    public void testProcessPageThrowsNullPointerException() throws Throwable {
        ConventionController conventionController = new ConventionController();
        Page page = (Page) Mockingbird.getProxyObject(Page.class);
        HttpServletRequest request = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse response = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(page.getPath(), "");
        Mockingbird.setReturnValue(ApplicationManager.getViewDir(), "");
        Mockingbird.enterTestMode(ConventionController.class);
        try {
            conventionController.processPage(page, request, response, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ConventionController.class, ex);
            assertNull("page.getPath()", page.getPath());
        }
    }
    
    public void testProcessPageThrowsNullPointerException1() throws Throwable {
        Page page = new Page("testConventionControllerPath", "testConventionControllerView");
        MockServletContext mockServletContext = new MockServletContext();
        HttpServletResponse response = mockServletContext.createHttpServletResponse();
        HttpServletRequest request = mockServletContext.createHttpServletRequest("testConventionControllerParam1");
        try {
            new ConventionController().processPage(page, request, response, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("(MockHttpServletResponse) response", "text/html; charset=UTF-8", ((MockHttpServletResponse) response).getContentType());
            assertEquals("(MockHttpServletResponse) response", "UTF-8", ((MockHttpServletResponse) response).getCharacterEncoding());
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ConventionController.class, ex);
            assertEquals("page.getPath()", "testConventionControllerPath", page.getPath());
            assertEquals("(MockHttpServletRequest) request.getServerName()", "localhost", ((MockHttpServletRequest) request).getServerName());
        }
    }
    
    public void testProcessPageThrowsNullPointerException2() throws Throwable {
        ConventionController conventionController = new ConventionController();
        HttpServletRequest request = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse response = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        ServletContext application = (ServletContext) Mockingbird.getProxyObject(ServletContext.class);
        Mockingbird.enterTestMode(ConventionController.class);
        try {
            conventionController.processPage(null, request, response, application);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ConventionController.class, ex);
        }
    }
    
    public void testProcessPageThrowsTemplateException() throws Throwable {
        ConventionController conventionController = new ConventionController();
        Page page = (Page) Mockingbird.getProxyObject(Page.class);
        HttpServletRequest request = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse response = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        ServletContext application = (ServletContext) Mockingbird.getProxyObject(ServletContext.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(page.getPath(), null);
        Mockingbird.setReturnValue(ApplicationManager.getViewDir(), "");
        Mockingbird.setReturnValue(application.getRealPath("/"), "");
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setReturnValue(false, file, "exists", "()boolean", new Object[] {}, Boolean.FALSE, 1);
        Mockingbird.setReturnValue(request.getRequestDispatcher("null.jsp"), null);
        Mockingbird.enterTestMode(ConventionController.class);
        try {
            conventionController.processPage(page, request, response, application);
            fail("Expected TemplateException to be thrown");
        } catch (TemplateException ex) {
            assertEquals("ex.getMessage()", "java.lang.NullPointerException", ex.getMessage());
            assertThrownBy(ConventionController.class, ex);
            assertNull("ex.getCause().getMessage()", ex.getCause().getMessage());
            assertNull("page.getPath()", page.getPath());
        }
    }
    
    public void testProcessPageThrowsTemplateException1() throws Throwable {
        ConventionController conventionController = new ConventionController();
        Page page = (Page) Mockingbird.getProxyObject(Page.class);
        HttpServletRequest request = (HttpServletRequest) Mockingbird.getProxyObject(HttpServletRequest.class);
        HttpServletResponse response = (HttpServletResponse) Mockingbird.getProxyObject(HttpServletResponse.class);
        ServletContext application = (ServletContext) Mockingbird.getProxyObject(ServletContext.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(page.getPath(), "");
        Mockingbird.setReturnValue(ApplicationManager.getViewDir(), ";5vi[8:!L./[]'.U}Vk&7ldpMq~dUOeqT\rGc+`(h");
        Mockingbird.setReturnValue(application.getRealPath("/"), "");
        File file = (File) Mockingbird.getProxyObject(File.class);
        Mockingbird.replaceObjectForRecording(File.class, "<init>(java.lang.String)", file);
        Mockingbird.setReturnValue(false, file, "exists", "()boolean", new Object[] {}, Boolean.FALSE, 1);
        Mockingbird.setReturnValue(request.getRequestDispatcher(";5vi[8:!L./[]'.U}Vk&7ldpMq~dUOeqT\rGc+`(h/.jsp"), null);
        Mockingbird.enterTestMode(ConventionController.class);
        try {
            conventionController.processPage(page, request, response, application);
            fail("Expected TemplateException to be thrown");
        } catch (TemplateException ex) {
            assertEquals("ex.getMessage()", "java.lang.NullPointerException", ex.getMessage());
            assertThrownBy(ConventionController.class, ex);
            assertNull("ex.getCause().getMessage()", ex.getCause().getMessage());
            assertNull("page.getPath()", page.getPath());
        }
    }
}

