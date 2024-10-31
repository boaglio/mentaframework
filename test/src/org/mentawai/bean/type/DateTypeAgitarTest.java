/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:40:21 PM
 * Time to generate: 00:16.946 seconds
 *
 */

package org.mentawai.bean.type;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class DateTypeAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return DateType.class;
    }
    
    public void testConstructor() throws Throwable {
        DateType dateType = new DateType();
        assertEquals("dateType.getTypeClass()", Date.class, dateType.getTypeClass());
    }
    
    public void testBindToStmt() throws Throwable {
        DateType dateType = new DateType();
        java.sql.Date value = new java.sql.Date(100L);
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setDate(-1, value);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(DateType.class);
        dateType.bindToStmt(stmt, -1, value);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt1() throws Throwable {
        DateType dateType = new DateType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Date value = new Date();
        Mockingbird.enterRecordingMode();
        java.sql.Date date = (java.sql.Date) Mockingbird.getProxyObject(java.sql.Date.class);
        Mockingbird.replaceObjectForRecording(java.sql.Date.class, "<init>(long)", date);
        stmt.setDate(-2, date);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(DateType.class);
        dateType.bindToStmt(stmt, -2, value);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt2() throws Throwable {
        DateType dateType = new DateType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setDate(-2, null);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(DateType.class);
        dateType.bindToStmt(stmt, -2, null);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetFromResultSet() throws Throwable {
        DateType dateType = new DateType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        java.sql.Date date = (java.sql.Date) Mockingbird.getProxyObject(java.sql.Date.class);
        Mockingbird.setReturnValue(rset.getDate("testString"), date);
        Mockingbird.enterTestMode(DateType.class);
        java.sql.Date result = (java.sql.Date) dateType.getFromResultSet(rset, "testString");
        assertSame("result", date, result);
    }
    
    public void testGetFromResultSet1() throws Throwable {
        DateType dateType = new DateType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getDate("testDateTypeParam1"), null);
        Mockingbird.enterTestMode(DateType.class);
        Object result = dateType.getFromResultSet(rset, "testDateTypeField");
        assertNull("result", result);
    }
    
    public void testGetFromResultSet2() throws Throwable {
        DateType dateType = new DateType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getDate(100), null);
        Mockingbird.enterTestMode(DateType.class);
        Object result = dateType.getFromResultSet(rset, 100);
        assertNull("result", result);
    }
    
    public void testGetFromResultSet3() throws Throwable {
        DateType dateType = new DateType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        java.sql.Date date = (java.sql.Date) Mockingbird.getProxyObject(java.sql.Date.class);
        Mockingbird.setReturnValue(rset.getDate(0), date);
        Mockingbird.enterTestMode(DateType.class);
        java.sql.Date result = (java.sql.Date) dateType.getFromResultSet(rset, 0);
        assertSame("result", date, result);
    }
    
    public void testGetTypeClass() throws Throwable {
        Class result = new DateType().getTypeClass();
        assertEquals("result", Date.class, result);
    }
    
    public void testToString() throws Throwable {
        String result = new DateType().toString();
        assertEquals("result", "DateType", result);
    }
    
    public void testBindToStmtThrowsIllegalArgumentException() throws Throwable {
        DateType dateType = new DateType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterTestMode(DateType.class);
        try {
            dateType.bindToStmt(stmt, 100, "testString");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "value is not a date!", ex.getMessage());
            assertThrownBy(DateType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException() throws Throwable {
        DateType dateType = new DateType();
        Date value = new Date();
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(java.sql.Date.class, "<init>(long)", Mockingbird.getProxyObject(java.sql.Date.class));
        Mockingbird.enterTestMode(DateType.class);
        try {
            dateType.bindToStmt(null, 100, value);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(DateType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException1() throws Throwable {
        try {
            new DateType().bindToStmt(null, 100, new java.sql.Date(100L));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(DateType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException2() throws Throwable {
        try {
            new DateType().bindToStmt(null, 100, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(DateType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException() throws Throwable {
        try {
            new DateType().getFromResultSet(null, "testDateTypeField");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(DateType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException1() throws Throwable {
        try {
            new DateType().getFromResultSet(null, 100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(DateType.class, ex);
        }
    }
}

