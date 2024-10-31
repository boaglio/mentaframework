package org.mentawai.util;

import org.mentawai.util.StringUtils;

import junit.framework.TestCase;

public class StringUtilsTest extends TestCase {

    public void testIsNotEmpty() {
    	
        boolean result = StringUtils.isNotEmpty("");
        assertEquals(false, result);
        
        result = StringUtils.isNotEmpty("casa");
        assertEquals(true, result);
    }

    public void testIsEmpty() {
    	
        boolean result = StringUtils.isEmpty("");
        assertEquals(true, result);
        
        result = StringUtils.isEmpty("casa");
        assertEquals(false, result);
    }

}
