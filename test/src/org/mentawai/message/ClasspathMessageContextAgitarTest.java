/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:10:37 PM
 * Time to generate: 00:20.543 seconds
 *
 */

package org.mentawai.message;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.Locale;
import org.mentawai.i18n.I18N;
import org.mentawai.i18n.I18NMap;

public class ClasspathMessageContextAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ClasspathMessageContext.class;
    }
    
    public void testConstructor() throws Throwable {
        ClasspathMessageContext classpathMessageContext = new ClasspathMessageContext("testClasspathMessageContextResource");
        assertEquals("classpathMessageContext.toString()", "testClasspathMessageContextResource", classpathMessageContext.toString());
    }
    
    public void testGetMessageWithAggressiveMocks() throws Throwable {
        ClasspathMessageContext classpathMessageContext = (ClasspathMessageContext) Mockingbird.getProxyObject(ClasspathMessageContext.class, true);
        Locale locale = (Locale) Mockingbird.getProxyObject(Locale.class);
        setPrivateField(classpathMessageContext, "resource", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, locale, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, I18NMap.class, "getI18NFromClasspath", "(java.lang.String)org.mentawai.i18n.I18N", null, 1);
        Mockingbird.setReturnValue(false, locale, "getLanguage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, I18NMap.class, "getI18NFromClasspath", "(java.lang.String)org.mentawai.i18n.I18N", null, 1);
        Mockingbird.enterTestMode(ClasspathMessageContext.class);
        String result = classpathMessageContext.getMessage("", locale);
        assertEquals("result", "", result);
    }
    
    public void testGetMessageWithAggressiveMocks1() throws Throwable {
        ClasspathMessageContext classpathMessageContext = (ClasspathMessageContext) Mockingbird.getProxyObject(ClasspathMessageContext.class, true);
        Locale locale = (Locale) Mockingbird.getProxyObject(Locale.class);
        I18N i18N = (I18N) Mockingbird.getProxyObject(I18N.class);
        setPrivateField(classpathMessageContext, "resource", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, locale, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, I18NMap.class, "getI18NFromClasspath", "(java.lang.String)org.mentawai.i18n.I18N", i18N, 1);
        Mockingbird.setReturnValue(false, locale, "getLanguage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, I18NMap.class, "getI18NFromClasspath", "(java.lang.String)org.mentawai.i18n.I18N", null, 1);
        Mockingbird.setReturnValue(i18N.hasKey(""), false);
        Mockingbird.enterTestMode(ClasspathMessageContext.class);
        String result = classpathMessageContext.getMessage("", locale);
        assertEquals("result", "", result);
    }
    
    public void testGetMessageWithAggressiveMocks2() throws Throwable {
        ClasspathMessageContext classpathMessageContext = (ClasspathMessageContext) Mockingbird.getProxyObject(ClasspathMessageContext.class, true);
        Locale locale = (Locale) Mockingbird.getProxyObject(Locale.class);
        I18N i18N = (I18N) Mockingbird.getProxyObject(I18N.class);
        setPrivateField(classpathMessageContext, "resource", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, locale, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, I18NMap.class, "getI18NFromClasspath", "(java.lang.String)org.mentawai.i18n.I18N", null, 1);
        Mockingbird.setReturnValue(false, locale, "getLanguage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, I18NMap.class, "getI18NFromClasspath", "(java.lang.String)org.mentawai.i18n.I18N", i18N, 1);
        Mockingbird.setReturnValue(i18N.hasKey(""), false);
        Mockingbird.enterTestMode(ClasspathMessageContext.class);
        String result = classpathMessageContext.getMessage("", locale);
        assertEquals("result", "", result);
    }
    
    public void testGetMessageWithAggressiveMocks3() throws Throwable {
        ClasspathMessageContext classpathMessageContext = (ClasspathMessageContext) Mockingbird.getProxyObject(ClasspathMessageContext.class, true);
        Locale locale = (Locale) Mockingbird.getProxyObject(Locale.class);
        I18N i18N = (I18N) Mockingbird.getProxyObject(I18N.class);
        setPrivateField(classpathMessageContext, "resource", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, locale, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, I18NMap.class, "getI18NFromClasspath", "(java.lang.String)org.mentawai.i18n.I18N", i18N, 1);
        Mockingbird.setReturnValue(false, locale, "getLanguage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, I18NMap.class, "getI18NFromClasspath", "(java.lang.String)org.mentawai.i18n.I18N", null, 1);
        Mockingbird.setReturnValue(i18N.hasKey(""), true);
        Mockingbird.setReturnValue(false, i18N, "get", "(java.lang.String)java.lang.String", "", 1);
        Mockingbird.enterTestMode(ClasspathMessageContext.class);
        String result = classpathMessageContext.getMessage("", locale);
        assertEquals("result", "", result);
    }
    
    public void testGetMessageWithAggressiveMocks4() throws Throwable {
        ClasspathMessageContext classpathMessageContext = (ClasspathMessageContext) Mockingbird.getProxyObject(ClasspathMessageContext.class, true);
        Locale locale = (Locale) Mockingbird.getProxyObject(Locale.class);
        I18N i18N = (I18N) Mockingbird.getProxyObject(I18N.class);
        setPrivateField(classpathMessageContext, "resource", "");
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, locale, "toString", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, I18NMap.class, "getI18NFromClasspath", "(java.lang.String)org.mentawai.i18n.I18N", null, 1);
        Mockingbird.setReturnValue(false, locale, "getLanguage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, I18NMap.class, "getI18NFromClasspath", "(java.lang.String)org.mentawai.i18n.I18N", i18N, 1);
        Mockingbird.setReturnValue(i18N.hasKey(""), true);
        Mockingbird.setReturnValue(false, i18N, "get", "(java.lang.String)java.lang.String", "", 1);
        Mockingbird.enterTestMode(ClasspathMessageContext.class);
        String result = classpathMessageContext.getMessage("", locale);
        assertEquals("result", "", result);
    }
    
    public void testToString() throws Throwable {
        String result = new ClasspathMessageContext("testClasspathMessageContextResource").toString();
        assertEquals("result", "testClasspathMessageContextResource", result);
    }
    
    public void testGetMessageThrowsNullPointerException() throws Throwable {
        Locale loc = new Locale("testClasspathMessageContextParam1");
        try {
            new ClasspathMessageContext("testClasspathMessageContextResource").getMessage("testClasspathMessageContextId", loc);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("loc.getDisplayName()", "testclasspathmessagecontextparam1", loc.getDisplayName());
        }
    }
}
