/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:33:22 PM
 * Time to generate: 00:18.716 seconds
 *
 */

package org.mentawai.ajax;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import org.apache.velocity.anakia.AnakiaElement;
import org.jdom.DocType;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

public class DOMUtilsAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return DOMUtils.class;
    }
    
    public void testConstructor() throws Throwable {
        new DOMUtils();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetDocumentAsString() throws Throwable {
        storeStaticField(DOMUtils.class, "outputter");
        Mockingbird.enterRecordingMode();
        StringWriter stringWriter = (StringWriter) Mockingbird.getProxyObject(StringWriter.class);
        Mockingbird.replaceObjectForRecording(StringWriter.class, "<init>()", stringWriter);
        XMLOutputter xMLOutputter = (XMLOutputter) Mockingbird.getProxyObject(XMLOutputter.class);
        setPrivateField(DOMUtils.class, "outputter", xMLOutputter);
        xMLOutputter.output((Document) null, stringWriter);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(false, stringWriter, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.enterTestMode(DOMUtils.class);
        String result = DOMUtils.getDocumentAsString(null, false);
        assertEquals("result", "", result);
    }
    
    public void testWriteDocument() throws Throwable {
        DOMUtils.writeDocument(new Document(new Element("testString", "testString")), new StringWriter(), false);
        assertNotNull("DOMUtils.outputter", getPrivateField(DOMUtils.class, "outputter"));
    }
    
    public void testWriteDocument1() throws Throwable {
        DOMUtils.writeDocument(new Document(new AnakiaElement("testString")), new StringWriter(), true);
        assertNotNull("DOMUtils.outputterPretty", getPrivateField(DOMUtils.class, "outputterPretty"));
    }
    
    public void testWriteDocument2() throws Throwable {
        DOMUtils.writeDocument(new Document(new AnakiaElement("testString", "testString", "testString"), null), new ByteArrayOutputStream(), false);
        assertNotNull("DOMUtils.outputter", getPrivateField(DOMUtils.class, "outputter"));
    }
    
    public void testWriteDocument3() throws Throwable {
        DOMUtils.writeDocument(new Document(new AnakiaElement("testString", "@")), new ByteArrayOutputStream(), true);
        assertNotNull("DOMUtils.outputterPretty", getPrivateField(DOMUtils.class, "outputterPretty"));
    }
    
    public void testGetDocumentAsStringThrowsRuntimeException() throws Throwable {
        storeStaticField(DOMUtils.class, "outputterPretty");
        Mockingbird.enterRecordingMode();
        StringWriter stringWriter = (StringWriter) Mockingbird.getProxyObject(StringWriter.class);
        Mockingbird.replaceObjectForRecording(StringWriter.class, "<init>()", stringWriter);
        XMLOutputter xMLOutputter = (XMLOutputter) Mockingbird.getProxyObject(XMLOutputter.class);
        setPrivateField(DOMUtils.class, "outputterPretty", xMLOutputter);
        xMLOutputter.output((Document) null, stringWriter);
        Mockingbird.setExceptionForVoid((Throwable) Mockingbird.getProxyObject(IOException.class));
        Mockingbird.replaceObjectForRecording(RuntimeException.class, "<init>(java.lang.Throwable)", Mockingbird.getProxyObject(RuntimeException.class));
        Mockingbird.enterTestMode(DOMUtils.class);
        try {
            DOMUtils.getDocumentAsString(null, true);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testWriteDocumentThrowsIllegalStateException() throws Throwable {
        try {
            DOMUtils.writeDocument(new Document(), new StringWriter(), true);
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "Root element not set", ex.getMessage());
            assertThrownBy(Document.class, ex);
            assertNotNull("DOMUtils.outputterPretty", getPrivateField(DOMUtils.class, "outputterPretty"));
            assertNotNull("DOMUtils.outputter", getPrivateField(DOMUtils.class, "outputter"));
        }
    }
    
    public void testWriteDocumentThrowsIllegalStateException1() throws Throwable {
        try {
            DOMUtils.writeDocument(new Document(), new ByteArrayOutputStream(), false);
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "Root element not set", ex.getMessage());
            assertThrownBy(Document.class, ex);
            assertNotNull("DOMUtils.outputter", getPrivateField(DOMUtils.class, "outputter"));
            assertNotNull("DOMUtils.outputterPretty", getPrivateField(DOMUtils.class, "outputterPretty"));
        }
    }
    
    public void testWriteDocumentThrowsNullPointerException() throws Throwable {
        try {
            DOMUtils.writeDocument(null, new StringWriter(), false);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(XMLOutputter.class, ex);
            assertNotNull("DOMUtils.outputter", getPrivateField(DOMUtils.class, "outputter"));
            assertNotNull("DOMUtils.outputterPretty", getPrivateField(DOMUtils.class, "outputterPretty"));
        }
    }
    
    public void testWriteDocumentThrowsNullPointerException1() throws Throwable {
        DocType docType = (DocType) callPrivateMethod("org.jdom.DocType", "<init>", new Class[] {}, null, new Object[] {});
        try {
            DOMUtils.writeDocument(new Document(new AnakiaElement("testString", "testString"), docType), new ByteArrayOutputStream(), false);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNotNull("DOMUtils.outputter", getPrivateField(DOMUtils.class, "outputter"));
            assertNotNull("DOMUtils.outputterPretty", getPrivateField(DOMUtils.class, "outputterPretty"));
        }
    }
    
    public void testWriteDocumentThrowsNullPointerException2() throws Throwable {
        DocType docType = (DocType) callPrivateMethod("org.jdom.DocType", "<init>", new Class[] {}, null, new Object[] {});
        Document document = new Document(new Element("testString", "testString", "testString"), docType, "testString");
        try {
            DOMUtils.writeDocument(document, new ByteArrayOutputStream(), true);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNotNull("DOMUtils.outputterPretty", getPrivateField(DOMUtils.class, "outputterPretty"));
            assertNotNull("DOMUtils.outputter", getPrivateField(DOMUtils.class, "outputter"));
        }
    }
}

