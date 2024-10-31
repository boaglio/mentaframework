/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:21:22 PM
 * Time to generate: 00:15.280 seconds
 *
 */

package org.mentawai.filter;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.mentawai.core.Action;
import org.mentawai.core.FilterException;
import org.mentawai.core.InvocationChain;
import org.mentawai.core.Output;
import org.mentawai.formatter.Formatter;
import org.mentawai.formatter.FormatterManager;

public class FormatFilterAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return FormatFilter.class;
    }
    
    public void testAddWithAggressiveMocks() throws Throwable {
        FormatFilter formatFilter = (FormatFilter) Mockingbird.getProxyObject(FormatFilter.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        setPrivateField(formatFilter, "formatters", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.put("", null), null);
        Mockingbird.enterTestMode(FormatFilter.class);
        FormatFilter result = formatFilter.add("", (Formatter) null);
        assertNotNull("result", result);
    }
    
    public void testAddWithAggressiveMocks1() throws Throwable {
        FormatFilter formatFilter = (FormatFilter) Mockingbird.getProxyObject(FormatFilter.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        setPrivateField(formatFilter, "formatters", map);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(map.put("", ""), null);
        Mockingbird.enterTestMode(FormatFilter.class);
        FormatFilter result = formatFilter.add("", "");
        assertNotNull("result", result);
    }
    
    public void testDestroyWithAggressiveMocks() throws Throwable {
        FormatFilter formatFilter = (FormatFilter) Mockingbird.getProxyObject(FormatFilter.class, true);
        Mockingbird.enterTestMode(FormatFilter.class);
        formatFilter.destroy();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testFilterWithAggressiveMocks() throws Throwable {
        FormatFilter formatFilter = (FormatFilter) Mockingbird.getProxyObject(FormatFilter.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        Set set = (Set) Mockingbird.getProxyObject(Set.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Formatter formatter = (Formatter) Mockingbird.getProxyObject(Formatter.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        Formatter formatter2 = (Formatter) Mockingbird.getProxyObject(Formatter.class);
        setPrivateField(formatFilter, "isLoaded", Boolean.TRUE);
        setPrivateField(formatFilter, "formatters", map);
        setPrivateField(invocationChain, "action", action);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(invocationChain.invoke(), "");
        Mockingbird.setReturnValue(action.getLocale(), null);
        Mockingbird.setReturnValue(action.getOutput(), output);
        Mockingbird.setReturnValue(map.keySet(), set);
        Mockingbird.setReturnValue(set.iterator(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", formatter, 1);
        Mockingbird.setReturnValue(formatter.format(obj, null), "");
        Mockingbird.setReturnValue(false, output, "setValue", "(java.lang.String,java.lang.Object)void", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", formatter2, 1);
        Mockingbird.setReturnValue(formatter2.format(obj2, null), "");
        Mockingbird.setReturnValue(false, output, "setValue", "(java.lang.String,java.lang.Object)void", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        Mockingbird.enterTestMode(FormatFilter.class);
        String result = formatFilter.filter(invocationChain);
        assertEquals("result", "", result);
    }
    
    public void testFilterWithAggressiveMocks1() throws Throwable {
        FormatFilter formatFilter = (FormatFilter) Mockingbird.getProxyObject(FormatFilter.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        Set set = (Set) Mockingbird.getProxyObject(Set.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Formatter formatter = (Formatter) Mockingbird.getProxyObject(Formatter.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        Formatter formatter2 = (Formatter) Mockingbird.getProxyObject(Formatter.class);
        setPrivateField(formatFilter, "isLoaded", Boolean.FALSE);
        setPrivateField(formatFilter, "formatters", map);
        setPrivateField(invocationChain, "action", action);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(invocationChain.invoke(), "");
        Mockingbird.setReturnValue(action.getLocale(), null);
        Mockingbird.setReturnValue(action.getOutput(), output);
        formatFilter.initFormatters();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(false, map, "keySet", "()java.util.Set", set, 1);
        Mockingbird.setReturnValue(set.iterator(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", "", 1);
        Mockingbird.setReturnValue(true, FormatterManager.class, "getFormatter", "(java.lang.String)org.mentawai.formatter.Formatter", formatter, 1);
        Mockingbird.setReturnValue(formatter.format(obj, null), "");
        Mockingbird.setReturnValue(false, output, "setValue", "(java.lang.String,java.lang.Object)void", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", formatter2, 1);
        Mockingbird.setReturnValue(formatter2.format(obj2, null), "");
        Mockingbird.setReturnValue(false, output, "setValue", "(java.lang.String,java.lang.Object)void", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        Mockingbird.enterTestMode(FormatFilter.class);
        String result = formatFilter.filter(invocationChain);
        assertEquals("result", "", result);
    }
    
    public void testFilterThrowsFilterExceptionWithAggressiveMocks() throws Throwable {
        FormatFilter formatFilter = (FormatFilter) Mockingbird.getProxyObject(FormatFilter.class, true);
        Map map = (Map) Mockingbird.getProxyObject(Map.class);
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        Output output = (Output) Mockingbird.getProxyObject(Output.class);
        Set set = (Set) Mockingbird.getProxyObject(Set.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Formatter formatter = (Formatter) Mockingbird.getProxyObject(Formatter.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        Formatter formatter2 = (Formatter) Mockingbird.getProxyObject(Formatter.class);
        Object obj3 = Mockingbird.getProxyObject(Object.class);
        setPrivateField(formatFilter, "isLoaded", Boolean.FALSE);
        setPrivateField(formatFilter, "formatters", map);
        setPrivateField(invocationChain, "action", action);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(invocationChain.invoke(), "");
        Mockingbird.setReturnValue(action.getLocale(), null);
        Mockingbird.setReturnValue(action.getOutput(), output);
        formatFilter.initFormatters();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.setReturnValue(false, map, "keySet", "()java.util.Set", set, 1);
        Mockingbird.setReturnValue(set.iterator(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", formatter, 1);
        Mockingbird.setReturnValue(formatter.format(obj, null), "");
        Mockingbird.setReturnValue(false, output, "setValue", "(java.lang.String,java.lang.Object)void", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", formatter2, 1);
        Mockingbird.setReturnValue(formatter2.format(obj2, null), "");
        Mockingbird.setReturnValue(false, output, "setValue", "(java.lang.String,java.lang.Object)void", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", null, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, output, "getValue", "(java.lang.String)java.lang.Object", obj3, 1);
        Mockingbird.setReturnValue(false, map, "get", "(java.lang.Object)java.lang.Object", "", 1);
        Mockingbird.setReturnValue(true, FormatterManager.class, "getFormatter", "(java.lang.String)org.mentawai.formatter.Formatter", null, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.replaceObjectForRecording(FilterException.class, "<init>(java.lang.String)", Mockingbird.getProxyObject(FilterException.class));
        Mockingbird.enterTestMode(FormatFilter.class);
        try {
            formatFilter.filter(invocationChain);
            fail("Expected FilterException to be thrown");
        } catch (FilterException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
}

