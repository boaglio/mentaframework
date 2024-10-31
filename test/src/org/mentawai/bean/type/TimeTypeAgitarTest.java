/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:41:46 PM
 * Time to generate: 00:17.165 seconds
 *
 */

package org.mentawai.bean.type;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.Date;

public class TimeTypeAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return TimeType.class;
    }
    
    public void testConstructor() throws Throwable {
        TimeType timeType = new TimeType();
        assertEquals("timeType.getTypeClass()", Date.class, timeType.getTypeClass());
    }
    
    public void testBindToStmt() throws Throwable {
        TimeType timeType = new TimeType();
        Time value = new Time(100L);
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setTime(3, value);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(TimeType.class);
        timeType.bindToStmt(stmt, 3, value);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt1() throws Throwable {
        Date value = new Date(100L);
        TimeType timeType = new TimeType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        Time time = (Time) Mockingbird.getProxyObject(Time.class);
        Mockingbird.replaceObjectForRecording(Time.class, "<init>(long)", time);
        stmt.setTime(5, time);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(TimeType.class);
        timeType.bindToStmt(stmt, 5, value);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt2() throws Throwable {
        TimeType timeType = new TimeType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setTime(3, null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(TimeType.class);
        timeType.bindToStmt(stmt, 3, null);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetFromResultSet() throws Throwable {
        TimeType timeType = new TimeType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Time time = (Time) Mockingbird.getProxyObject(Time.class);
        Mockingbird.setReturnValue(rset.getTime("testString"), time);
        Mockingbird.enterTestMode(TimeType.class);
        Time result = (Time) timeType.getFromResultSet(rset, "testString");
        assertSame("result", time, result);
    }
    
    public void testGetFromResultSet1() throws Throwable {
        TimeType timeType = new TimeType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getTime("testTimeTypeParam1"), null);
        Mockingbird.enterTestMode(TimeType.class);
        Object result = timeType.getFromResultSet(rset, "testTimeTypeField");
        assertNull("result", result);
    }
    
    public void testGetFromResultSet2() throws Throwable {
        TimeType timeType = new TimeType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getTime(100), null);
        Mockingbird.enterTestMode(TimeType.class);
        Object result = timeType.getFromResultSet(rset, 100);
        assertNull("result", result);
    }
    
    public void testGetFromResultSet3() throws Throwable {
        TimeType timeType = new TimeType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Time time = (Time) Mockingbird.getProxyObject(Time.class);
        Mockingbird.setReturnValue(rset.getTime(0), time);
        Mockingbird.enterTestMode(TimeType.class);
        Time result = (Time) timeType.getFromResultSet(rset, 0);
        assertSame("result", time, result);
    }
    
    public void testGetTypeClass() throws Throwable {
        Class result = new TimeType().getTypeClass();
        assertEquals("result", Date.class, result);
    }
    
    public void testToString() throws Throwable {
        String result = new TimeType().toString();
        assertEquals("result", "TimeType", result);
    }
    
    public void testBindToStmtThrowsIllegalArgumentException() throws Throwable {
        TimeType timeType = new TimeType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterTestMode(TimeType.class);
        try {
            timeType.bindToStmt(stmt, 100, "");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "value is not a time!", ex.getMessage());
            assertThrownBy(TimeType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException() throws Throwable {
        Date value = new Date(100L);
        TimeType timeType = new TimeType();
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(Time.class, "<init>(long)", Mockingbird.getProxyObject(Time.class));
        Mockingbird.enterTestMode(TimeType.class);
        try {
            timeType.bindToStmt(null, 100, value);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(TimeType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException1() throws Throwable {
        try {
            new TimeType().bindToStmt(null, 100, new Time(100L));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(TimeType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException2() throws Throwable {
        try {
            new TimeType().bindToStmt(null, 100, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(TimeType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException() throws Throwable {
        try {
            new TimeType().getFromResultSet(null, "testTimeTypeField");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(TimeType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException1() throws Throwable {
        try {
            new TimeType().getFromResultSet(null, 100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(TimeType.class, ex);
        }
    }
}

