/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:12:05 PM
 * Time to generate: 00:16.836 seconds
 *
 */

package org.mentawai.message;

import com.agitar.lib.junit.AgitarTestCase;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.mentawai.action.LogoutAction;
import org.mentawai.action.SuccessAction;
import org.mentawai.core.Action;
import org.mentawai.util.MockAction;

public class MessageManagerAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return MessageManager.class;
    }
    
    public void testConstructor() throws Throwable {
        new MessageManager();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetErrors() throws Throwable {
        LinkedList result = (LinkedList) MessageManager.getErrors(new MockAction(), true);
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetErrors1() throws Throwable {
        List result = MessageManager.getErrors(new MockAction(), false);
        assertNull("result", result);
    }
    
    public void testGetErrors2() throws Throwable {
        Action action = new MockAction();
        LinkedList errors = (LinkedList) MessageManager.getErrors(action, true);
        LinkedList result = (LinkedList) MessageManager.getErrors(action, true);
        assertSame("result", errors, result);
    }
    
    public void testGetErrors3() throws Throwable {
        List result = MessageManager.getErrors(null, true);
        assertNull("result", result);
    }
    
    public void testGetFieldErrors() throws Throwable {
        LinkedHashMap result = (LinkedHashMap) MessageManager.getFieldErrors(new MockAction(), true);
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetFieldErrors1() throws Throwable {
        Map result = MessageManager.getFieldErrors(new MockAction(), false);
        assertNull("result", result);
    }
    
    public void testGetFieldErrors2() throws Throwable {
        Map result = MessageManager.getFieldErrors(null, true);
        assertNull("result", result);
    }
    
    public void testGetFieldErrors3() throws Throwable {
        Action action = new MockAction();
        LinkedHashMap fieldErrors = (LinkedHashMap) MessageManager.getFieldErrors(action, true);
        LinkedHashMap result = (LinkedHashMap) MessageManager.getFieldErrors(action, true);
        assertSame("result", fieldErrors, result);
    }
    
    public void testGetMessages() throws Throwable {
        LinkedList result = (LinkedList) MessageManager.getMessages(new MockAction(), true);
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetMessages1() throws Throwable {
        List result = MessageManager.getMessages(new MockAction(), false);
        assertNull("result", result);
    }
    
    public void testGetMessages2() throws Throwable {
        Action action = new MockAction();
        LinkedList messages = (LinkedList) MessageManager.getMessages(action, true);
        LinkedList result = (LinkedList) MessageManager.getMessages(action, true);
        assertSame("result", messages, result);
    }
    
    public void testGetMessages3() throws Throwable {
        List result = MessageManager.getMessages(null, true);
        assertNull("result", result);
    }
    
    public void testGetErrorsThrowsNullPointerException() throws Throwable {
        Action action = new SuccessAction();
        try {
            MessageManager.getErrors(action, true);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MessageManager.class, ex);
        }
    }
    
    public void testGetFieldErrorsThrowsNullPointerException() throws Throwable {
        Action action = new SuccessAction();
        try {
            MessageManager.getFieldErrors(action, true);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MessageManager.class, ex);
        }
    }
    
    public void testGetMessagesThrowsNullPointerException() throws Throwable {
        Action action = new LogoutAction();
        try {
            MessageManager.getMessages(action, true);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MessageManager.class, ex);
        }
    }
}
