/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:25:30 PM
 * Time to generate: 00:15.529 seconds
 *
 */

package org.mentawai.converter;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.sql.Date;

public class SQLToUtilDataConverterAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return SQLToUtilDataConverter.class;
    }
    
    public void testConstructor() throws Throwable {
        new SQLToUtilDataConverter();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testConvert() throws Throwable {
        Date value = new Date(100L);
        SQLToUtilDataConverter sQLToUtilDataConverter = new SQLToUtilDataConverter();
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, value, "getTime", "()long", new Object[] {}, new Long(-100L), 1);
        Mockingbird.enterTestMode(SQLToUtilDataConverter.class);
        java.util.Date result = (java.util.Date) sQLToUtilDataConverter.convert(value);
        assertNotNull("result", result);
    }
    
    public void testConvertThrowsConversionException() throws Throwable {
        try {
            new SQLToUtilDataConverter().convert("");
            fail("Expected ConversionException to be thrown");
        } catch (ConversionException ex) {
            assertEquals("ex.getMessage()", "The given value is not a java.sql.Date object!", ex.getMessage());
            assertThrownBy(SQLToUtilDataConverter.class, ex);
        }
    }
}

