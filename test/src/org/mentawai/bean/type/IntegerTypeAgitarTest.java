/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:41:17 PM
 * Time to generate: 00:17.043 seconds
 *
 */

package org.mentawai.bean.type;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IntegerTypeAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return IntegerType.class;
    }
    
    public void testConstructor() throws Throwable {
        IntegerType integerType = new IntegerType();
        assertEquals("integerType.getTypeClass()", Integer.class, integerType.getTypeClass());
    }
    
    public void testBindToStmt() throws Throwable {
        IntegerType integerType = new IntegerType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setInt(-100, 0);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(IntegerType.class);
        integerType.bindToStmt(stmt, -100, new Integer(0));
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt1() throws Throwable {
        IntegerType integerType = new IntegerType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setNull(9, 4);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(IntegerType.class);
        integerType.bindToStmt(stmt, 9, null);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetFromResultSet() throws Throwable {
        IntegerType integerType = new IntegerType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt(-1), 24);
        Integer integer = new Integer(24);
        Mockingbird.setReturnValue(true, Integer.class, "valueOf", "(int)java.lang.Integer", new Object[] {new Integer(24)}, integer, 1);
        Mockingbird.enterTestMode(IntegerType.class);
        Integer result = (Integer) integerType.getFromResultSet(rset, -1);
        assertSame("result", integer, result);
    }
    
    public void testGetFromResultSet1() throws Throwable {
        IntegerType integerType = new IntegerType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt(100), 0);
        Integer integer = new Integer(0);
        Mockingbird.setReturnValue(true, Integer.class, "valueOf", "(int)java.lang.Integer", new Object[] {new Integer(0)}, integer, 1);
        Mockingbird.enterTestMode(IntegerType.class);
        Integer result = (Integer) integerType.getFromResultSet(rset, 100);
        assertSame("result", integer, result);
    }
    
    public void testGetFromResultSet2() throws Throwable {
        IntegerType integerType = new IntegerType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt("testString"), 1);
        Integer integer = new Integer(1);
        Mockingbird.setReturnValue(true, Integer.class, "valueOf", "(int)java.lang.Integer", new Object[] {new Integer(1)}, integer, 1);
        Mockingbird.enterTestMode(IntegerType.class);
        Integer result = (Integer) integerType.getFromResultSet(rset, "testString");
        assertSame("result", integer, result);
    }
    
    public void testGetFromResultSet3() throws Throwable {
        IntegerType integerType = new IntegerType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt("testIntegerTypeParam1"), 0);
        Integer integer = new Integer(0);
        Mockingbird.setReturnValue(true, Integer.class, "valueOf", "(int)java.lang.Integer", new Object[] {new Integer(0)}, integer, 1);
        Mockingbird.enterTestMode(IntegerType.class);
        Integer result = (Integer) integerType.getFromResultSet(rset, "testIntegerTypeField");
        assertSame("result", integer, result);
    }
    
    public void testGetTypeClass() throws Throwable {
        Class result = new IntegerType().getTypeClass();
        assertEquals("result", Integer.class, result);
    }
    
    public void testToString() throws Throwable {
        String result = new IntegerType().toString();
        assertEquals("result", "IntegerType", result);
    }
    
    public void testBindToStmtThrowsIllegalArgumentException() throws Throwable {
        IntegerType integerType = new IntegerType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterTestMode(IntegerType.class);
        try {
            integerType.bindToStmt(stmt, 100, "testString");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "value is not an integer!", ex.getMessage());
            assertThrownBy(IntegerType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException() throws Throwable {
        try {
            new IntegerType().bindToStmt(null, 100, new Integer(0));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(IntegerType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException1() throws Throwable {
        try {
            new IntegerType().bindToStmt(null, 100, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(IntegerType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException() throws Throwable {
        try {
            new IntegerType().getFromResultSet(null, 100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(IntegerType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException1() throws Throwable {
        try {
            new IntegerType().getFromResultSet(null, "testIntegerTypeField");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(IntegerType.class, ex);
        }
    }
}
