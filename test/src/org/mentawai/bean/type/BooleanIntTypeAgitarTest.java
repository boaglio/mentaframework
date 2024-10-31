/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:38:19 PM
 * Time to generate: 00:18.886 seconds
 *
 */

package org.mentawai.bean.type;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BooleanIntTypeAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return BooleanIntType.class;
    }
    
    public void testConstructor() throws Throwable {
        BooleanIntType booleanIntType = new BooleanIntType();
        assertEquals("booleanIntType.getTypeClass()", Boolean.class, booleanIntType.getTypeClass());
    }
    
    public void testBindToStmt() throws Throwable {
        BooleanIntType booleanIntType = new BooleanIntType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setInt(1, 1);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(BooleanIntType.class);
        booleanIntType.bindToStmt(stmt, 1, Boolean.TRUE);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt1() throws Throwable {
        BooleanIntType booleanIntType = new BooleanIntType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setInt(1, 0);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(BooleanIntType.class);
        booleanIntType.bindToStmt(stmt, 1, Boolean.FALSE);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt2() throws Throwable {
        BooleanIntType booleanIntType = new BooleanIntType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setInt(-2, 0);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(BooleanIntType.class);
        booleanIntType.bindToStmt(stmt, -2, null);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetBoolValue() throws Throwable {
        Boolean result = (Boolean) callPrivateMethod("org.mentawai.bean.type.BooleanIntType", "getBoolValue", new Class[] {int.class}, null, new Object[] {new Integer(0)});
        assertFalse("result", result.booleanValue());
    }
    
    public void testGetBoolValue1() throws Throwable {
        Boolean result = (Boolean) callPrivateMethod("org.mentawai.bean.type.BooleanIntType", "getBoolValue", new Class[] {int.class}, null, new Object[] {new Integer(1)});
        assertTrue("result", result.booleanValue());
    }
    
    public void testGetFromResultSet() throws Throwable {
        BooleanIntType booleanIntType = new BooleanIntType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt(100), 0);
        Object boolValue = callPrivateMethod("org.mentawai.bean.type.BooleanIntType", "getBoolValue", new Class[] {int.class}, null, new Object[] {new Integer(0)});
        Boolean boolean2 = Boolean.FALSE;
        Mockingbird.setReturnValue(boolValue, boolean2);
        Mockingbird.enterTestMode(BooleanIntType.class);
        Boolean result = (Boolean) booleanIntType.getFromResultSet(rset, 100);
        assertSame("result", boolean2, result);
    }
    
    public void testGetTypeClass() throws Throwable {
        Class result = new BooleanIntType().getTypeClass();
        assertEquals("result", Boolean.class, result);
    }
    
    public void testToString() throws Throwable {
        String result = new BooleanIntType().toString();
        assertEquals("result", "BooleanIntType", result);
    }
    
    public void testBindToStmtThrowsIllegalArgumentException() throws Throwable {
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        BooleanIntType booleanIntType = new BooleanIntType();
        Mockingbird.enterTestMode(BooleanIntType.class);
        try {
            booleanIntType.bindToStmt(stmt, 100, new Integer(1));
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "value is not a boolean!", ex.getMessage());
            assertThrownBy(BooleanIntType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException() throws Throwable {
        try {
            new BooleanIntType().bindToStmt(null, 100, Boolean.FALSE);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanIntType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException1() throws Throwable {
        try {
            new BooleanIntType().bindToStmt(null, 100, Boolean.TRUE);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanIntType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException2() throws Throwable {
        try {
            new BooleanIntType().bindToStmt(null, 100, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanIntType.class, ex);
        }
    }
    
    public void testGetBoolValueThrowsSQLException() throws Throwable {
        try {
            callPrivateMethod("org.mentawai.bean.type.BooleanIntType", "getBoolValue", new Class[] {int.class}, null, new Object[] {new Integer(-1)});
            fail("Expected SQLException to be thrown");
        } catch (SQLException ex) {
            assertEquals("ex.getMessage()", "integer is not 0 or 1: -1", ex.getMessage());
            assertThrownBy(BooleanIntType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException() throws Throwable {
        try {
            new BooleanIntType().getFromResultSet(null, "testBooleanIntTypeField");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanIntType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException1() throws Throwable {
        try {
            new BooleanIntType().getFromResultSet(null, 100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanIntType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsSQLException() throws Throwable {
        BooleanIntType booleanIntType = new BooleanIntType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt("testString"), -12);
        Object boolValue = callPrivateMethod("org.mentawai.bean.type.BooleanIntType", "getBoolValue", new Class[] {int.class}, null, new Object[] {new Integer(-12)});
        Mockingbird.setException(boolValue, (Throwable) Mockingbird.getProxyObject(SQLException.class));
        Mockingbird.enterTestMode(BooleanIntType.class);
        try {
            booleanIntType.getFromResultSet(rset, "testString");
            fail("Expected SQLException to be thrown");
        } catch (SQLException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetFromResultSetThrowsSQLException1() throws Throwable {
        BooleanIntType booleanIntType = new BooleanIntType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt("testString"), -12);
        Object boolValue = callPrivateMethod("org.mentawai.bean.type.BooleanIntType", "getBoolValue", new Class[] {int.class}, null, new Object[] {new Integer(-12)});
        Mockingbird.setException(boolValue, (Throwable) Mockingbird.getProxyObject(SQLException.class));
        Mockingbird.enterTestMode(BooleanIntType.class);
        try {
            booleanIntType.getFromResultSet(rset, "testString");
            fail("Expected SQLException to be thrown");
        } catch (SQLException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetFromResultSetThrowsSQLException2() throws Throwable {
        BooleanIntType booleanIntType = new BooleanIntType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt(1), 21);
        Object boolValue = callPrivateMethod("org.mentawai.bean.type.BooleanIntType", "getBoolValue", new Class[] {int.class}, null, new Object[] {new Integer(21)});
        Mockingbird.setException(boolValue, (Throwable) Mockingbird.getProxyObject(SQLException.class));
        Mockingbird.enterTestMode(BooleanIntType.class);
        try {
            booleanIntType.getFromResultSet(rset, 1);
            fail("Expected SQLException to be thrown");
        } catch (SQLException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
}
