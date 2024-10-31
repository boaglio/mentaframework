/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 5:51:27 PM
 * Time to generate: 00:21.054 seconds
 *
 */

package org.mentawai.template;

import com.agitar.lib.junit.AgitarTestCase;
import java.util.HashMap;

public class PageAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return Page.class;
    }
    
    public void testConstructor() throws Throwable {
        Page page = new Page("testPagePath", "testPageView");
        assertEquals("page.getBlocks().size()", 0, page.getBlocks().size());
        assertEquals("page.getView()", "testPageView", page.getView());
        assertEquals("page.getPath()", "testPagePath", page.getPath());
    }
    
    public void testConstructor1() throws Throwable {
        Page page = new Page("testPagePath", new Page("testPageView", Integer.class), Integer.class);
        assertEquals("page.getBlocks().size()", 0, page.getBlocks().size());
        assertEquals("page.getView()", "testPageView", page.getView());
        assertEquals("page.getListener()", Integer.class, page.getListener());
        assertEquals("page.getPath()", "testPagePath", page.getPath());
    }
    
    public void testConstructor2() throws Throwable {
        Page page = new Page("testPageView");
        assertEquals("page.getView()", "testPageView", page.getView());
        assertEquals("page.getBlocks().size()", 0, page.getBlocks().size());
    }
    
    public void testConstructor3() throws Throwable {
        Page page = new Page("testPageView", String.class);
        assertEquals("page.getBlocks().size()", 0, page.getBlocks().size());
        assertEquals("page.getView()", "testPageView", page.getView());
        assertEquals("page.getListener()", String.class, page.getListener());
    }
    
    public void testConstructor4() throws Throwable {
        Page page = new Page(new Page("testPageView"), Integer.class);
        assertEquals("page.getView()", "testPageView", page.getView());
        assertEquals("page.getBlocks().size()", 0, page.getBlocks().size());
        assertEquals("page.getListener()", Integer.class, page.getListener());
    }
    
    public void testConstructor5() throws Throwable {
        Page page = new Page(new Page("testPageView", String.class));
        assertEquals("page.getBlocks().size()", 0, page.getBlocks().size());
        assertEquals("page.getView()", "testPageView", page.getView());
        assertEquals("page.getListener()", String.class, page.getListener());
    }
    
    public void testConstructor6() throws Throwable {
        Page page = new Page("testPagePath", new Page("testPageView", Integer.class));
        assertEquals("page.getView()", "testPageView", page.getView());
        assertEquals("page.getBlocks().size()", 0, page.getBlocks().size());
        assertEquals("page.getListener()", Integer.class, page.getListener());
        assertEquals("page.getPath()", "testPagePath", page.getPath());
    }
    
    public void testConstructor7() throws Throwable {
        Page page = new Page("testPagePath", "testPageView", Integer.class);
        assertEquals("page.getView()", "testPageView", page.getView());
        assertEquals("page.getBlocks().size()", 0, page.getBlocks().size());
        assertEquals("page.getListener()", Integer.class, page.getListener());
        assertEquals("page.getPath()", "testPagePath", page.getPath());
    }
    
    public void testGetBlock() throws Throwable {
        Page page = new Page("testPageView");
        Page page2 = new Page("testPagePath", "testPageView");
        page.setBlock("testString", page2);
        Page result = page.getBlock("testString");
        assertSame("result", page2, result);
        assertEquals("page.getBlocks().size()", 1, page.getBlocks().size());
    }
    
    public void testGetBlock1() throws Throwable {
        Page page = new Page("testPageView", Integer.class);
        Page result = page.getBlock("testPageId");
        assertNull("result", result);
        assertEquals("page.getBlocks().size()", 0, page.getBlocks().size());
    }
    
    public void testGetBlocks() throws Throwable {
        HashMap result = (HashMap) new Page("testPageView").getBlocks();
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetStringBlock() throws Throwable {
        Page page = new Page("testPageView");
        String result = page.getStringBlock("testPageId");
        assertEquals("result", "null", result);
        assertEquals("page.getBlocks().size()", 0, page.getBlocks().size());
    }
    
    public void testSetBlock() throws Throwable {
        Page page = new Page("testPageView", Integer.class);
        page.setBlock("testPageId", new Page("testPagePath", "testPageView"));
        assertEquals("page.getBlocks().size()", 1, page.getBlocks().size());
    }
    
    public void testSetListener() throws Throwable {
        Page page = new Page("testPagePath", "testPageView", Integer.class);
        page.setListener(Integer.class);
        assertEquals("page.getListener()", Integer.class, page.getListener());
    }
    
    public void testSetPath() throws Throwable {
        Page page = new Page("testPageView", byte.class);
        page.setPath("testPagePath");
        assertEquals("page.getPath()", "testPagePath", page.getPath());
    }
    
    public void testSetStringBlock() throws Throwable {
        Page page = new Page("testPageView", byte.class);
        page.setStringBlock("testPageId", "testPageStringBlock");
        assertEquals("page.getBlocks().size()", 1, page.getBlocks().size());
        assertEquals("page.getBlocks().get(\"testPageId\")", "testPageStringBlock", page.getBlocks().get("testPageId"));
    }
    
    public void testSetView() throws Throwable {
        Page page = new Page("testPageView");
        page.setView("testPageView");
        assertEquals("page.getView()", "testPageView", page.getView());
    }
    
    public void testConstructorThrowsNullPointerException() throws Throwable {
        try {
            new Page("testPagePath", (Page) null, short.class);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Page.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException1() throws Throwable {
        try {
            new Page((Page) null, Integer.class);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Page.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException2() throws Throwable {
        try {
            new Page((Page) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Page.class, ex);
        }
    }
    
    public void testConstructorThrowsNullPointerException3() throws Throwable {
        try {
            new Page("testPagePath", (Page) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(Page.class, ex);
        }
    }
    
    public void testGetBlockThrowsClassCastException() throws Throwable {
        Page page = new Page("testPagePath", "testPageView");
        page.setStringBlock("testString", "testPageStringBlock");
        try {
            page.getBlock("testString");
            fail("Expected ClassCastException to be thrown");
        } catch (ClassCastException ex) {
            assertEquals("ex.getClass()", ClassCastException.class, ex.getClass());
            assertThrownBy(Page.class, ex);
            assertEquals("page.getBlocks().size()", 1, page.getBlocks().size());
        }
    }
}

