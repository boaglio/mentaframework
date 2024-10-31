/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:37:33 PM
 * Time to generate: 00:17.732 seconds
 *
 */

package org.mentawai.bean.type;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AutoIncrementTypeAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return AutoIncrementType.class;
    }
    
    public void testConstructor() throws Throwable {
        AutoIncrementType autoIncrementType = new AutoIncrementType();
        assertEquals("autoIncrementType.getTypeClass()", Integer.class, autoIncrementType.getTypeClass());
    }
    
    public void testBindToStmt() throws Throwable {
        AutoIncrementType autoIncrementType = new AutoIncrementType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setInt(-100, 0);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(AutoIncrementType.class);
        autoIncrementType.bindToStmt(stmt, -100, new Integer(0));
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testBindToStmt1() throws Throwable {
        AutoIncrementType autoIncrementType = new AutoIncrementType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterRecordingMode();
        stmt.setNull(9, 4);
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(AutoIncrementType.class);
        autoIncrementType.bindToStmt(stmt, 9, null);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetFromResultSet() throws Throwable {
        AutoIncrementType autoIncrementType = new AutoIncrementType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt("testAutoIncrementTypeParam1"), 0);
        Integer integer = new Integer(0);
        Mockingbird.setReturnValue(true, Integer.class, "valueOf", "(int)java.lang.Integer", new Object[] {new Integer(0)}, integer, 1);
        Mockingbird.enterTestMode(AutoIncrementType.class);
        Integer result = (Integer) autoIncrementType.getFromResultSet(rset, "testAutoIncrementTypeField");
        assertSame("result", integer, result);
    }
    
    public void testGetFromResultSet1() throws Throwable {
        AutoIncrementType autoIncrementType = new AutoIncrementType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt("testString"), 1);
        Integer integer = new Integer(1);
        Mockingbird.setReturnValue(true, Integer.class, "valueOf", "(int)java.lang.Integer", new Object[] {new Integer(1)}, integer, 1);
        Mockingbird.enterTestMode(AutoIncrementType.class);
        Integer result = (Integer) autoIncrementType.getFromResultSet(rset, "testString");
        assertSame("result", integer, result);
    }
    
    public void testGetFromResultSet2() throws Throwable {
        AutoIncrementType autoIncrementType = new AutoIncrementType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt(-1), 24);
        Integer integer = new Integer(24);
        Mockingbird.setReturnValue(true, Integer.class, "valueOf", "(int)java.lang.Integer", new Object[] {new Integer(24)}, integer, 1);
        Mockingbird.enterTestMode(AutoIncrementType.class);
        Integer result = (Integer) autoIncrementType.getFromResultSet(rset, -1);
        assertSame("result", integer, result);
    }
    
    public void testGetFromResultSet3() throws Throwable {
        AutoIncrementType autoIncrementType = new AutoIncrementType();
        ResultSet rset = (ResultSet) Mockingbird.getProxyObject(ResultSet.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(rset.getInt(100), 0);
        Integer integer = new Integer(0);
        Mockingbird.setReturnValue(true, Integer.class, "valueOf", "(int)java.lang.Integer", new Object[] {new Integer(0)}, integer, 1);
        Mockingbird.enterTestMode(AutoIncrementType.class);
        Integer result = (Integer) autoIncrementType.getFromResultSet(rset, 100);
        assertSame("result", integer, result);
    }
    
    public void testGetTypeClass() throws Throwable {
        Class result = new AutoIncrementType().getTypeClass();
        assertEquals("result", Integer.class, result);
    }
    
    public void testToString() throws Throwable {
        String result = new AutoIncrementType().toString();
        assertEquals("result", "AutoIncrementType", result);
    }
    
    public void testBindToStmtThrowsIllegalArgumentException() throws Throwable {
        AutoIncrementType autoIncrementType = new AutoIncrementType();
        PreparedStatement stmt = (PreparedStatement) Mockingbird.getProxyObject(PreparedStatement.class);
        Mockingbird.enterTestMode(AutoIncrementType.class);
        try {
            autoIncrementType.bindToStmt(stmt, 100, "testString");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals("ex.getMessage()", "value is not an integer!", ex.getMessage());
            assertThrownBy(AutoIncrementType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException() throws Throwable {
        try {
            new AutoIncrementType().bindToStmt(null, 100, new Integer(0));
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AutoIncrementType.class, ex);
        }
    }
    
    public void testBindToStmtThrowsNullPointerException1() throws Throwable {
        try {
            new AutoIncrementType().bindToStmt(null, 100, null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AutoIncrementType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException() throws Throwable {
        try {
            new AutoIncrementType().getFromResultSet(null, "testAutoIncrementTypeField");
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AutoIncrementType.class, ex);
        }
    }
    
    public void testGetFromResultSetThrowsNullPointerException1() throws Throwable {
        try {
            new AutoIncrementType().getFromResultSet(null, 100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(AutoIncrementType.class, ex);
        }
    }
}

