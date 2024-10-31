/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:18:53 PM
 * Time to generate: 00:23.045 seconds
 *
 */

package org.mentawai.filter;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.ArrayList;
import java.util.Iterator;
import org.mentawai.action.LogoutAction;
import org.mentawai.action.SuccessAction;
import org.mentawai.core.Action;
import org.mentawai.core.ActionException;
import org.mentawai.core.FilterException;
import org.mentawai.core.Input;
import org.mentawai.core.InvocationChain;
import org.mentawai.util.MockAction;

public class CollectionFilterAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return CollectionFilter.class;
    }
    
    public void testConstructor() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName", 100);
        assertEquals("collectionFilter.maxAllowed", 100, ((Number) getPrivateField(collectionFilter, "maxAllowed")).intValue());
        assertEquals("collectionFilter.attrName", "testCollectionFilterAttrName", getPrivateField(collectionFilter, "attrName"));
    }
    
    public void testConstructor1() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName");
        assertEquals("collectionFilter.maxAllowed", 128, ((Number) getPrivateField(collectionFilter, "maxAllowed")).intValue());
        assertEquals("collectionFilter.attrName", "testCollectionFilterAttrName", getPrivateField(collectionFilter, "attrName"));
    }
    
    public void testBuildCollection() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName", 100);
        Object[] list = new Object[1];
        ArrayList result = (ArrayList) collectionFilter.buildCollection(list, 0);
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testBuildCollection1() throws Throwable {
        Object[] list = new Object[3];
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName");
        ArrayList result = (ArrayList) collectionFilter.buildCollection(list, 1);
        assertEquals("result.size()", 1, result.size());
        assertTrue("(ArrayList) result.contains(null)", result.contains(null));
    }
    
    public void testDestroy() throws Throwable {
        new CollectionFilter("testCollectionFilterAttrName", 100).destroy();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testFilter() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName");
        Action action = new MockAction();
        String filter = collectionFilter.filter(new InvocationChain("testCollectionFilterActionName", action));
        String result = collectionFilter.filter(new InvocationChain("testCollectionFilterActionName1", action));
        assertEquals("result", filter, result);
    }
    
    public void testFilter1() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("", 100);
        InvocationChain chain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Mockingbird.enterRecordingMode();
        Action mockAction = (Action) Mockingbird.getProxyObject(Action.class);
        Mockingbird.setReturnValue(chain.getAction(), mockAction);
        Input inputMap = (Input) Mockingbird.getProxyObject(Input.class);
        Mockingbird.setReturnValue(mockAction.getInput(), inputMap);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Mockingbird.setReturnValue(inputMap.keys(), iterator);
        Mockingbird.setReturnValue(false, iterator, "hasNext", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.setReturnValue(false, iterator, "next", "()java.lang.Object", new Object[] {}, "testString", 1);
        Mockingbird.setException(true, Integer.class, "parseInt", "(java.lang.String)int", new Object[] {"testString"}, (Throwable) Mockingbird.getProxyObject(NumberFormatException.class), 1);
        Mockingbird.setReturnValue(false, iterator, "hasNext", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.setReturnValue(false, iterator, "next", "()java.lang.Object", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, iterator, "hasNext", "()boolean", new Object[] {}, Boolean.FALSE, 1);
        inputMap.setValue("testCollectionFilterParam1", null);
        Mockingbird.setNormalReturnForVoid(true);
        Mockingbird.setReturnValue(chain.invoke(), "success");
        Mockingbird.enterTestMode(CollectionFilter.class);
        String result = collectionFilter.filter(chain);
        assertEquals("result", "success", result);
    }
    
    public void testFilterWithAggressiveMocks() throws Throwable {
        CollectionFilter collectionFilter = (CollectionFilter) Mockingbird.getProxyObject(CollectionFilter.class, true);
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        NumberFormatException numberFormatException = (NumberFormatException) Mockingbird.getProxyObject(NumberFormatException.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        setPrivateField(collectionFilter, "maxAllowed", new Integer(3));
        setPrivateField(collectionFilter, "attrName", "");
        setPrivateField(invocationChain, "action", action);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getInput(), input);
        Mockingbird.setReturnValue(input.keys(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Boolean boolean3 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setException(true, Integer.class, "parseInt", "(java.lang.String)int", numberFormatException, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setException(true, Integer.class, "parseInt", "(java.lang.String)int", numberFormatException, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, Integer.class, "parseInt", "(java.lang.String)int", new Integer(1), 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, Integer.class, "parseInt", "(java.lang.String)int", new Integer(2), 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        ArrayList arrayList = (ArrayList) Mockingbird.getProxyObject(ArrayList.class);
        Mockingbird.replaceObjectForRecording(ArrayList.class, "<init>(int)", arrayList);
        Mockingbird.setReturnValue(false, arrayList, "add", "(java.lang.Object)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, arrayList, "add", "(java.lang.Object)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, input, "setValue", "(java.lang.String,java.lang.Object)void", null, 1);
        Mockingbird.setReturnValue(invocationChain.invoke(), "");
        Mockingbird.enterTestMode(CollectionFilter.class);
        String result = collectionFilter.filter(invocationChain);
        assertEquals("result", "", result);
    }
    
    public void testFilterWithAggressiveMocks1() throws Throwable {
        CollectionFilter collectionFilter = (CollectionFilter) Mockingbird.getProxyObject(CollectionFilter.class, true);
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        NumberFormatException numberFormatException = (NumberFormatException) Mockingbird.getProxyObject(NumberFormatException.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        setPrivateField(collectionFilter, "maxAllowed", new Integer(3));
        setPrivateField(collectionFilter, "attrName", "");
        setPrivateField(invocationChain, "action", action);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getInput(), input);
        Mockingbird.setReturnValue(input.keys(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Boolean boolean3 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setException(true, Integer.class, "parseInt", "(java.lang.String)int", numberFormatException, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setException(true, Integer.class, "parseInt", "(java.lang.String)int", numberFormatException, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, Integer.class, "parseInt", "(java.lang.String)int", new Integer(0), 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, Integer.class, "parseInt", "(java.lang.String)int", new Integer(2), 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), false);
        ArrayList arrayList = (ArrayList) Mockingbird.getProxyObject(ArrayList.class);
        Mockingbird.replaceObjectForRecording(ArrayList.class, "<init>(int)", arrayList);
        Mockingbird.setReturnValue(arrayList.add(obj), false);
        Mockingbird.setReturnValue(false, arrayList, "add", "(java.lang.Object)boolean", boolean2, 1);
        Mockingbird.setReturnValue(false, input, "setValue", "(java.lang.String,java.lang.Object)void", null, 1);
        Mockingbird.setReturnValue(invocationChain.invoke(), "");
        Mockingbird.enterTestMode(CollectionFilter.class);
        String result = collectionFilter.filter(invocationChain);
        assertEquals("result", "", result);
    }
    
    public void testParseNumberFromKey() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName");
        int result = collectionFilter.parseNumberFromKey("10Characte", ":[*8yQ&!3)1");
        assertEquals("result", 1, result);
    }
    
    public void testBuildCollectionThrowsArrayIndexOutOfBoundsException() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName");
        Object[] list = new Object[7];
        try {
            collectionFilter.buildCollection(list, 100);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "7", ex.getMessage());
            assertThrownBy(CollectionFilter.class, ex);
        }
    }
    
    public void testBuildCollectionThrowsIllegalArgumentException() throws Throwable {
        Object[] list = new Object[2];
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName");
        try {
            collectionFilter.buildCollection(list, -1);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "Illegal Capacity: -1", ex.getMessage());
            assertThrownBy(ArrayList.class, ex);
        }
    }
    
    public void testBuildCollectionThrowsNullPointerException() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName");
        try {
            collectionFilter.buildCollection((Object[]) null, 100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(CollectionFilter.class, ex);
        }
    }
    
    public void testFilterThrowsActionException() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testString", 100);
        InvocationChain chain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Mockingbird.enterRecordingMode();
        Action mockAction = (Action) Mockingbird.getProxyObject(Action.class);
        Mockingbird.setReturnValue(chain.getAction(), mockAction);
        Input inputMap = (Input) Mockingbird.getProxyObject(Input.class);
        Mockingbird.setReturnValue(mockAction.getInput(), inputMap);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Mockingbird.setReturnValue(inputMap.keys(), iterator);
        Mockingbird.setReturnValue(false, iterator, "hasNext", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.setReturnValue(false, iterator, "next", "()java.lang.Object", new Object[] {}, "4n2", 1);
        Mockingbird.setReturnValue(false, iterator, "hasNext", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.setReturnValue(false, iterator, "next", "()java.lang.Object", new Object[] {}, "testString", 1);
        Mockingbird.setReturnValue(false, iterator, "hasNext", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.setReturnValue(false, iterator, "next", "()java.lang.Object", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, iterator, "hasNext", "()boolean", new Object[] {}, Boolean.FALSE, 1);
        inputMap.setValue("testCollectionFilterParam1", null);
        Mockingbird.setNormalReturnForVoid(true);
        Mockingbird.setException(chain.invoke(), (Throwable) Mockingbird.getProxyObject(ActionException.class));
        Mockingbird.enterTestMode(CollectionFilter.class);
        try {
            collectionFilter.filter(chain);
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testFilterThrowsActionException1() throws Throwable {
        InvocationChain chain = new InvocationChain("testCollectionFilterActionName", new MockAction(new SuccessAction()));
        chain.setInnerAction("testCollectionFilterInnerAction");
        try {
            new CollectionFilter("testCollectionFilterAttrName", 100).filter(chain);
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertEquals("ex.getMessage()", "The inner action does not exist: testCollectionFilterInnerAction", ex.getMessage());
            assertThrownBy(InvocationChain.class, ex);
            assertNull("ex.getCause()", ex.getCause());
            assertEquals("chain.getActionName()", "testCollectionFilterActionName", chain.getActionName());
        }
    }
    
    public void testFilterThrowsActionException2() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName", 100);
        InvocationChain chain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Mockingbird.enterRecordingMode();
        Action mockAction = (Action) Mockingbird.getProxyObject(Action.class);
        Mockingbird.setReturnValue(chain.getAction(), mockAction);
        Input inputMap = (Input) Mockingbird.getProxyObject(Input.class);
        Mockingbird.setReturnValue(mockAction.getInput(), inputMap);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        Mockingbird.setReturnValue(inputMap.keys(), iterator);
        Mockingbird.setReturnValue(false, iterator, "hasNext", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.setReturnValue(false, iterator, "next", "()java.lang.Object", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, iterator, "hasNext", "()boolean", new Object[] {}, Boolean.FALSE, 1);
        inputMap.setValue("testCollectionFilterParam1", null);
        Mockingbird.setNormalReturnForVoid(true);
        Mockingbird.setException(chain.invoke(), (Throwable) Mockingbird.getProxyObject(ActionException.class));
        Mockingbird.enterTestMode(CollectionFilter.class);
        try {
            collectionFilter.filter(chain);
            fail("Expected ActionException to be thrown");
        } catch (ActionException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testFilterThrowsFilterExceptionWithAggressiveMocks() throws Throwable {
        CollectionFilter collectionFilter = (CollectionFilter) Mockingbird.getProxyObject(CollectionFilter.class, true);
        InvocationChain invocationChain = (InvocationChain) Mockingbird.getProxyObject(InvocationChain.class);
        Action action = (Action) Mockingbird.getProxyObject(Action.class);
        Input input = (Input) Mockingbird.getProxyObject(Input.class);
        Iterator iterator = (Iterator) Mockingbird.getProxyObject(Iterator.class);
        NumberFormatException numberFormatException = (NumberFormatException) Mockingbird.getProxyObject(NumberFormatException.class);
        Object obj = Mockingbird.getProxyObject(Object.class);
        Object obj2 = Mockingbird.getProxyObject(Object.class);
        setPrivateField(collectionFilter, "attrName", "");
        setPrivateField(collectionFilter, "maxAllowed", new Integer(3));
        setPrivateField(invocationChain, "action", action);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(action.getInput(), input);
        Mockingbird.setReturnValue(input.keys(), iterator);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean2, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Boolean boolean3 = Boolean.TRUE;
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setException(true, Integer.class, "parseInt", "(java.lang.String)int", numberFormatException, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setException(true, Integer.class, "parseInt", "(java.lang.String)int", numberFormatException, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, Integer.class, "parseInt", "(java.lang.String)int", new Integer(1), 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, Integer.class, "parseInt", "(java.lang.String)int", new Integer(2), 1);
        Mockingbird.setReturnValue(false, input, "getValue", "(java.lang.String)java.lang.Object", obj2, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(iterator.hasNext(), true);
        Mockingbird.setReturnValue(iterator.next(), "A");
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "startsWith", "(java.lang.String)boolean", boolean3, 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(String.class), "substring", "(int)java.lang.String", "", 1);
        Mockingbird.setReturnValue(true, Integer.class, "parseInt", "(java.lang.String)int", new Integer(3), 1);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(StringBuilder.class), "toString", "()java.lang.String", "", 1);
        Mockingbird.replaceObjectForRecording(FilterException.class, "<init>(java.lang.String)", Mockingbird.getProxyObject(FilterException.class));
        Mockingbird.enterTestMode(CollectionFilter.class);
        try {
            collectionFilter.filter(invocationChain);
            fail("Expected FilterException to be thrown");
        } catch (FilterException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testFilterThrowsNegativeArraySizeException() throws Throwable {
        InvocationChain chain = new InvocationChain("testCollectionFilterActionName", new MockAction());
        try {
            new CollectionFilter("testCollectionFilterAttrName", -1).filter(chain);
            fail("Expected NegativeArraySizeException to be thrown");
        } catch (NegativeArraySizeException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(CollectionFilter.class, ex);
            assertEquals("chain.getActionName()", "testCollectionFilterActionName", chain.getActionName());
        }
    }
    
    public void testFilterThrowsNullPointerException() throws Throwable {
        InvocationChain chain = new InvocationChain("testCollectionFilterActionName", null);
        try {
            new CollectionFilter("testCollectionFilterAttrName").filter(chain);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(CollectionFilter.class, ex);
            assertEquals("chain.getActionName()", "testCollectionFilterActionName", chain.getActionName());
        }
    }
    
    public void testFilterThrowsNullPointerException1() throws Throwable {
        try {
            new CollectionFilter("testCollectionFilterAttrName", 100).filter(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(CollectionFilter.class, ex);
        }
    }
    
    public void testFilterThrowsNullPointerException2() throws Throwable {
        InvocationChain chain = new InvocationChain("testCollectionFilterActionName", new LogoutAction());
        try {
            new CollectionFilter("testCollectionFilterAttrName").filter(chain);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(CollectionFilter.class, ex);
            assertEquals("chain.getActionName()", "testCollectionFilterActionName", chain.getActionName());
        }
    }
    
    public void testParseNumberFromKeyThrowsNullPointerException() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName");
        try {
            collectionFilter.parseNumberFromKey(null, "testCollectionFilterKey");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(CollectionFilter.class, ex);
        }
    }
    
    public void testParseNumberFromKeyThrowsNumberFormatException() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName");
        try {
            collectionFilter.parseNumberFromKey("", "testCollectionFilterKey");
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException ex) {
            assertEquals("ex.getMessage()", "For input string: \"testCollectionFilterKey\"", ex.getMessage());
            assertThrownBy(NumberFormatException.class, ex);
        }
    }
    
    public void testParseNumberFromKeyThrowsStringIndexOutOfBoundsException() throws Throwable {
        CollectionFilter collectionFilter = new CollectionFilter("testCollectionFilterAttrName");
        try {
            collectionFilter.parseNumberFromKey("testCollectionFilterAttrName", "testCollectionFilterKey");
            fail("Expected StringIndexOutOfBoundsException to be thrown");
        } catch (StringIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "String index out of range: -5", ex.getMessage());
            assertThrownBy(String.class, ex);
        }
    }
}

