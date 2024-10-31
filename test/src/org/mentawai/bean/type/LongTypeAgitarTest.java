/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:41:32 PM
 * Time to generate: 00:16.543 seconds
 *
 */

package org.mentawai.bean.type;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LongTypeAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return LongType.class;
    }
    
    public void testConstructor() throws Throwable {
        LongType longType = new LongType();
        assertEquals("longType.getTypeClass()", Long.class, longType.getTypeClass());
    }
    
    public void testBindToStmt() throws Throwable {
        LongType longType = new LongType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setLong(2, 0L);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(LongType.class);
        longType.bindToStmt(stmt, 2, new Long(0L));
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt1() throws Throwable {
        LongType longType = new LongType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setNull(-4, -5);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(LongType.class);
        longType.bindToStmt(stmt, -4, null);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetFromResultSet() throws Throwable {
        LongType longType = new LongType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getLong(-1), 24L);
        Long long2 = new Long(24L);
        Mockingbird.setReturnValue(true, Long.class, "valueOf", "(long)java.lang.Long", new Object[] {new Long(24L)}, long2, 1);
        Mockingbird.enterTestMode(LongType.class);
        Long result = (Long) longType.getFromResultSet(rset, -1);
        assertSame("result", long2, result);
    }
    
    public void testGetFromResultSet1() throws Throwable {
        LongType longType = new LongType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getLong(100), 0L);
        Long long2 = new Long(0L);
        Mockingbird.setReturnValue(true, Long.class, "valueOf", "(long)java.lang.Long", new Object[] {new Long(0L)}, long2, 1);
        Mockingbird.enterTestMode(LongType.class);
        Long result = (Long) longType.getFromResultSet(rset, 100);
        assertSame("result", long2, result);
    }
    
    public void testGetFromResultSet2() throws Throwable {
        LongType longType = new LongType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getLong("testString"), 1L);
        Long long2 = new Long(1L);
        Mockingbird.setReturnValue(true, Long.class, "valueOf", "(long)java.lang.Long", new Object[] {new Long(1L)}, long2, 1);
        Mockingbird.enterTestMode(LongType.class);
        Long result = (Long) longType.getFromResultSet(rset, "testString");
        assertSame("result", long2, result);
    }
    
    public void testGetFromResultSet3() throws Throwable {
        LongType longType = new LongType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getLong("testLongTypeParam1"), 0L);
        Long long2 = new Long(0L);
        Mockingbird.setReturnValue(true, Long.class, "valueOf", "(long)java.lang.Long", new Object[] {new Long(0L)}, long2, 1);
        Mockingbird.enterTestMode(LongType.class);
        Long result = (Long) longType.getFromResultSet(rset, "testLongTypeField");
        assertSame("result", long2, result);
    }
    
    public void testGetTypeClass() throws Throwable {
        Class result = new LongType().getTypeClass();
        assertEquals("result", Long.class, result);
    }
    
    public void testToString() throws Throwable {
        String result = new LongType().toString();
        assertEquals("result", "LongType", result);
    }
    
    public void testBindToStmtThrowsIllegalArgumentException() throws Throwable {
        LongType longType = new LongType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterTestMode(LongType.class);
        try {
            longType.bindToStmt(stmt, 100, new Integer(0));
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "value is not a long!", ex.getMessage());
            assertThrownBy(LongType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException() throws Throwable {
        try {
            new LongType().bindToStmt(null, 100, new Long(-10L));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LongType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException1() throws Throwable {
        try {
            new LongType().bindToStmt(null, 100, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LongType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException() throws Throwable {
        try {
            new LongType().getFromResultSet(null, 100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LongType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException1() throws Throwable {
        try {
            new LongType().getFromResultSet(null, "testLongTypeField");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LongType.class, ex);
        }
    }
}

