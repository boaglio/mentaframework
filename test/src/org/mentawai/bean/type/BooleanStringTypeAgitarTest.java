/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:38:54 PM
 * Time to generate: 00:20.601 seconds
 *
 */

package org.mentawai.bean.type;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BooleanStringTypeAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return BooleanStringType.class;
    }
    
    public void testConstructor() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType();
        assertEquals("booleanStringType.sTrue", "T", getPrivateField(booleanStringType, "sTrue"));
        assertEquals("booleanStringType.sFalse", "F", getPrivateField(booleanStringType, "sFalse"));
    }
    
    public void testConstructor1() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        assertEquals("booleanStringType.sTrue", "testBooleanStringTypeSTrue", getPrivateField(booleanStringType, "sTrue"));
        assertEquals("booleanStringType.sFalse", "testBooleanStringTypeSFalse", getPrivateField(booleanStringType, "sFalse"));
    }
    
    public void testBindToStmt() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testString");
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setString(0, "testString");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(BooleanStringType.class);
        booleanStringType.bindToStmt(stmt, 0, Boolean.FALSE);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt1() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("", "testBooleanStringTypeSFalse");
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setString(0, "");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(BooleanStringType.class);
        booleanStringType.bindToStmt(stmt, 0, Boolean.TRUE);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt2() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setString(0, "");
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(BooleanStringType.class);
        booleanStringType.bindToStmt(stmt, 0, null);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testEquals() throws Throwable {
        BooleanStringType obj = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        boolean result = obj.equals(obj);
        assertTrue("result", result);
    }
    
    public void testEquals1() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testString", "testBooleanStringTypeSFalse");
        boolean result = booleanStringType.equals(new BooleanStringType("testString", "testBooleanStringTypeSFalse1"));
        assertFalse("result", result);
    }
    
    public void testEquals2() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        boolean result = booleanStringType.equals("testString");
        assertFalse("result", result);
    }
    
    public void testEquals3() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        boolean result = booleanStringType.equals(new BooleanStringType());
        assertFalse("result", result);
    }
    
    public void testGetBoolValue() throws Throwable {
        Boolean result = (Boolean) callPrivateMethod("org.mentawai.bean.type.BooleanStringType", "getBoolValue", new Class[] {boolean.class}, null, new Object[] {Boolean.TRUE});
        assertTrue("result", result.booleanValue());
    }
    
    public void testGetBoolValue1() throws Throwable {
        Boolean result = (Boolean) callPrivateMethod("org.mentawai.bean.type.BooleanStringType", "getBoolValue", new Class[] {boolean.class}, null, new Object[] {Boolean.FALSE});
        assertFalse("result", result.booleanValue());
    }
    
    public void testGetBooleanValue() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType();
        boolean result = booleanStringType.getBooleanValue("0");
        assertFalse("result", result);
    }
    
    public void testGetBooleanValue1() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType();
        boolean result = booleanStringType.getBooleanValue("T");
        assertTrue("result", result);
    }
    
    public void testGetBooleanValue2() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType();
        boolean result = booleanStringType.getBooleanValue(null);
        assertFalse("result", result);
    }
    
    public void testGetBooleanValue3() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType();
        boolean result = booleanStringType.getBooleanValue("false");
        assertFalse("result", result);
    }
    
    public void testGetBooleanValue4() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        boolean result = booleanStringType.getBooleanValue("1");
        assertTrue("result", result);
    }
    
    public void testGetBooleanValue5() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType();
        boolean result = booleanStringType.getBooleanValue("true");
        assertTrue("result", result);
    }
    
    public void testGetBooleanValue6() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType();
        boolean result = booleanStringType.getBooleanValue("F");
        assertFalse("result", result);
    }
    
    public void testGetFromResultSet() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getString("testString"), "T");
        Mockingbird.enterTestMode(BooleanStringType.class);
        Boolean result = (Boolean) booleanStringType.getFromResultSet(rset, "testString");
        assertTrue("result", result.booleanValue());
    }
    
    public void testGetFromResultSet1() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getString("42"), "0");
        Mockingbird.enterTestMode(BooleanStringType.class);
        Boolean result = (Boolean) booleanStringType.getFromResultSet(rset, "42");
        assertFalse("result", result.booleanValue());
    }
    
    public void testGetFromResultSet2() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getString(-2), "0");
        Mockingbird.enterTestMode(BooleanStringType.class);
        Boolean result = (Boolean) booleanStringType.getFromResultSet(rset, -2);
        assertFalse("result", result.booleanValue());
    }
    
    public void testGetFromResultSet3() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getString(2), "T");
        Mockingbird.enterTestMode(BooleanStringType.class);
        Boolean result = (Boolean) booleanStringType.getFromResultSet(rset, 2);
        assertTrue("result", result.booleanValue());
    }
    
    public void testGetTypeClass() throws Throwable {
        Class result = new BooleanStringType().getTypeClass();
        assertEquals("result", Boolean.class, result);
    }
    
    public void testToString() throws Throwable {
        String result = new BooleanStringType().toString();
        assertEquals("result", "BooleanStringType", result);
    }
    
    public void testBindToStmtThrowsIllegalArgumentException() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterTestMode(BooleanStringType.class);
        try {
            booleanStringType.bindToStmt(stmt, 100, new Integer(0));
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "value is not a boolean!", ex.getMessage());
            assertThrownBy(BooleanStringType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        try {
            booleanStringType.bindToStmt(null, 100, Boolean.FALSE);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanStringType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException1() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        try {
            booleanStringType.bindToStmt(null, 100, Boolean.TRUE);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanStringType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException2() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        try {
            booleanStringType.bindToStmt(null, 100, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanStringType.class, ex);
        }
    }
    
    public void testEqualsThrowsNullPointerException() throws Throwable {
        try {
            new BooleanStringType("testString", "testBooleanStringTypeSFalse1").equals(new BooleanStringType(null, "testBooleanStringTypeSFalse"));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanStringType.class, ex);
        }
    }
    
    public void testEqualsThrowsNullPointerException1() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testString", "testBooleanStringTypeSFalse");
        try {
            booleanStringType.equals(new BooleanStringType("testString", null));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanStringType.class, ex);
        }
    }
    
    public void testGetBooleanValueThrowsSQLException() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType();
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(SQLException.class, "<init>(java.lang.String)", Mockingbird.getProxyObject(SQLException.class));
        Mockingbird.enterTestMode(BooleanStringType.class);
        try {
            booleanStringType.getBooleanValue("testBooleanStringTypes");
            fail("Expected SQLException to be thrown");
        } catch (SQLException ex) {
            assertEquals("booleanStringType.getTypeClass()", Boolean.class, booleanStringType.getTypeClass());
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        try {
            booleanStringType.getFromResultSet(null, "testBooleanStringTypeField");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanStringType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException1() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType("testBooleanStringTypeSTrue", "testBooleanStringTypeSFalse");
        try {
            booleanStringType.getFromResultSet(null, 100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(BooleanStringType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsSQLException() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getString("testBooleanStringTypeParam1"), "testString");
        Mockingbird.replaceObjectForRecording(SQLException.class, "<init>(java.lang.String)", Mockingbird.getProxyObject(SQLException.class));
        Mockingbird.enterTestMode(BooleanStringType.class);
        try {
            booleanStringType.getFromResultSet(rset, "testBooleanStringTypeField");
            fail("Expected SQLException to be thrown");
        } catch (SQLException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetFromResultSetThrowsSQLException1() throws Throwable {
        BooleanStringType booleanStringType = new BooleanStringType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getString(100), "testString");
        Mockingbird.replaceObjectForRecording(SQLException.class, "<init>(java.lang.String)", Mockingbird.getProxyObject(SQLException.class));
        Mockingbird.enterTestMode(BooleanStringType.class);
        try {
            booleanStringType.getFromResultSet(rset, 100);
            fail("Expected SQLException to be thrown");
        } catch (SQLException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
}

