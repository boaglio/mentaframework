/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:12:15 PM
 * Time to generate: 00:15.983 seconds
 *
 */

package org.mentawai.message;

import com.agitar.lib.junit.AgitarTestCase;
import java.util.HashMap;
import java.util.Map;

public class DefaultMessageAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return DefaultMessage.class;
    }
    
    public void testConstructor() throws Throwable {
        MessageContext context = new ClasspathMessageContext("testDefaultMessageResource");
        DefaultMessage defaultMessage = new DefaultMessage("testDefaultMessageId", context);
        assertNull("defaultMessage.params", defaultMessage.params);
        assertEquals("defaultMessage.tokenMarker", "%", defaultMessage.tokenMarker);
        assertNull("defaultMessage.tokens", defaultMessage.tokens);
        assertSame("defaultMessage.context", context, defaultMessage.context);
        assertEquals("defaultMessage.id", "testDefaultMessageId", defaultMessage.id);
    }
    
    public void testConstructor1() throws Throwable {
        Map tokens = new HashMap(100, 100.0F);
        String[] strings = new String[2];
        MessageContext context = new FileMessageContext("testDefaultMessageFile");
        DefaultMessage defaultMessage = new DefaultMessage(100, context, tokens, strings);
        assertSame("defaultMessage.params", strings, defaultMessage.params);
        assertEquals("defaultMessage.tokenMarker", "%", defaultMessage.tokenMarker);
        assertSame("defaultMessage.tokens", tokens, defaultMessage.tokens);
        assertSame("defaultMessage.context", context, defaultMessage.context);
        assertEquals("defaultMessage.id", "100", defaultMessage.id);
    }
    
    public void testConstructor2() throws Throwable {
        Map tokens = new HashMap(100, 100.0F);
        String[] strings = new String[1];
        MessageContext context = new ClasspathMessageContext("testDefaultMessageResource");
        DefaultMessage defaultMessage = new DefaultMessage("testDefaultMessageId", context, tokens, strings);
        assertSame("defaultMessage.params", strings, defaultMessage.params);
        assertEquals("defaultMessage.tokenMarker", "%", defaultMessage.tokenMarker);
        assertSame("defaultMessage.tokens", tokens, defaultMessage.tokens);
        assertSame("defaultMessage.context", context, defaultMessage.context);
        assertEquals("defaultMessage.id", "testDefaultMessageId", defaultMessage.id);
    }
    
    public void testConstructor3() throws Throwable {
        Map tokens = new HashMap(100, 100.0F);
        MessageContext context = new ClassMessageContext(Integer.class);
        DefaultMessage defaultMessage = new DefaultMessage("testDefaultMessageId", context, tokens);
        assertNull("defaultMessage.params", defaultMessage.params);
        assertEquals("defaultMessage.tokenMarker", "%", defaultMessage.tokenMarker);
        assertSame("defaultMessage.tokens", tokens, defaultMessage.tokens);
        assertSame("defaultMessage.context", context, defaultMessage.context);
        assertEquals("defaultMessage.id", "testDefaultMessageId", defaultMessage.id);
    }
    
    public void testConstructor4() throws Throwable {
        MessageContext context = new ClassMessageContext("");
        DefaultMessage defaultMessage = new DefaultMessage(100, context);
        assertNull("defaultMessage.params", defaultMessage.params);
        assertEquals("defaultMessage.tokenMarker", "%", defaultMessage.tokenMarker);
        assertNull("defaultMessage.tokens", defaultMessage.tokens);
        assertSame("defaultMessage.context", context, defaultMessage.context);
        assertEquals("defaultMessage.id", "100", defaultMessage.id);
    }
    
    public void testConstructor5() throws Throwable {
        Map tokens = new HashMap(100, 100.0F);
        MessageContext context = new FileMessageContext("testDefaultMessageFile");
        DefaultMessage defaultMessage = new DefaultMessage(100, context, tokens);
        assertNull("defaultMessage.params", defaultMessage.params);
        assertEquals("defaultMessage.tokenMarker", "%", defaultMessage.tokenMarker);
        assertSame("defaultMessage.tokens", tokens, defaultMessage.tokens);
        assertSame("defaultMessage.context", context, defaultMessage.context);
        assertEquals("defaultMessage.id", "100", defaultMessage.id);
    }
}
