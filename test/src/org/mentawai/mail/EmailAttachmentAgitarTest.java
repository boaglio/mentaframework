/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:10:55 PM
 * Time to generate: 00:15.042 seconds
 *
 */

package org.mentawai.mail;

import com.agitar.lib.junit.AgitarTestCase;
import java.net.URL;

public class EmailAttachmentAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return EmailAttachment.class;
    }
    
    public void testConstructor() throws Throwable {
        EmailAttachment emailAttachment = new EmailAttachment();
        assertEquals("emailAttachment.getDescription()", "", emailAttachment.getDescription());
        assertEquals("emailAttachment.getPath()", "", emailAttachment.getPath());
        assertEquals("emailAttachment.getName()", "", emailAttachment.getName());
        assertEquals("emailAttachment.getDisposition()", "attachment", emailAttachment.getDisposition());
    }
    
    public void testSetDescription() throws Throwable {
        EmailAttachment emailAttachment = new EmailAttachment();
        emailAttachment.setDescription("testEmailAttachmentDesc");
        assertEquals("emailAttachment.getDescription()", "testEmailAttachmentDesc", emailAttachment.getDescription());
    }
    
    public void testSetDisposition() throws Throwable {
        EmailAttachment emailAttachment = new EmailAttachment();
        emailAttachment.setDisposition("testEmailAttachmentADisposition");
        assertEquals("emailAttachment.getDisposition()", "testEmailAttachmentADisposition", emailAttachment.getDisposition());
    }
    
    public void testSetName() throws Throwable {
        EmailAttachment emailAttachment = new EmailAttachment();
        emailAttachment.setName("testEmailAttachmentAName");
        assertEquals("emailAttachment.getName()", "testEmailAttachmentAName", emailAttachment.getName());
    }
    
    public void testSetPath() throws Throwable {
        EmailAttachment emailAttachment = new EmailAttachment();
        emailAttachment.setPath("testEmailAttachmentAPath");
        assertEquals("emailAttachment.getPath()", "testEmailAttachmentAPath", emailAttachment.getPath());
    }
    
    public void testSetURL() throws Throwable {
        URL aUrl = new URL("file:///_3__67_/U_pO_U_.yxd");
        EmailAttachment emailAttachment = new EmailAttachment();
        emailAttachment.setURL(aUrl);
        assertSame("emailAttachment.getURL()", aUrl, emailAttachment.getURL());
    }
}

