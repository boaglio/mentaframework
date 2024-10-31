/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 6:22:13 PM
 * Time to generate: 00:14.819 seconds
 *
 */

package org.mentawai.db;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

public class DataSourceConnectionHandlerAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return DataSourceConnectionHandler.class;
    }
    
    public void testConstructor() throws Throwable {
        DataSourceConnectionHandler dataSourceConnectionHandler = new DataSourceConnectionHandler(null);
        assertNull("dataSourceConnectionHandler.ds", getPrivateField(dataSourceConnectionHandler, "ds"));
    }
    
    public void testDestroy() throws Throwable {
        new DataSourceConnectionHandler(null).destroy();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetConnection() throws Throwable {
        DataSource ds = (DataSource) Mockingbird.getProxyObject(DataSource.class);
        DataSourceConnectionHandler dataSourceConnectionHandler = new DataSourceConnectionHandler(ds);
        Mockingbird.enterRecordingMode();
        Connection connection = (Connection) Mockingbird.getProxyObject(Connection.class);
        Mockingbird.setReturnValue(ds.getConnection(), connection);
        Mockingbird.enterTestMode(DataSourceConnectionHandler.class);
        Connection result = dataSourceConnectionHandler.getConnection();
        assertSame("result", connection, result);
        assertSame("dataSourceConnectionHandler.ds", ds, getPrivateField(dataSourceConnectionHandler, "ds"));
    }
    
    public void testRelease() throws Throwable {
        DataSourceConnectionHandler dataSourceConnectionHandler = new DataSourceConnectionHandler((DataSource) Mockingbird.getProxyObject(DataSource.class));
        Mockingbird.enterTestMode(DataSourceConnectionHandler.class);
        dataSourceConnectionHandler.release(null);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testRelease1() throws Throwable {
        DataSourceConnectionHandler dataSourceConnectionHandler = new DataSourceConnectionHandler((DataSource) Mockingbird.getProxyObject(DataSource.class));
        Connection conn = (Connection) Mockingbird.getProxyObject(Connection.class);
        Mockingbird.enterRecordingMode();
        conn.close();
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(DataSourceConnectionHandler.class);
        dataSourceConnectionHandler.release(conn);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testReleaseWithAggressiveMocks() throws Throwable {
        DataSourceConnectionHandler dataSourceConnectionHandler = (DataSourceConnectionHandler) Mockingbird.getProxyObject(DataSourceConnectionHandler.class, true);
        Connection connection = (Connection) Mockingbird.getProxyObject(Connection.class);
        SQLException sQLException = (SQLException) Mockingbird.getProxyObject(SQLException.class);
        Mockingbird.enterRecordingMode();
        connection.close();
        Mockingbird.setExceptionForVoid(sQLException);
        Mockingbird.setReturnValue(false, sQLException, "printStackTrace", "()void", new Object[] {}, null, 1);
        Mockingbird.enterTestMode(DataSourceConnectionHandler.class);
        dataSourceConnectionHandler.release(connection);
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetConnectionThrowsNullPointerException() throws Throwable {
        DataSourceConnectionHandler dataSourceConnectionHandler = new DataSourceConnectionHandler(null);
        try {
            dataSourceConnectionHandler.getConnection();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(DataSourceConnectionHandler.class, ex);
            assertNull("dataSourceConnectionHandler.ds", getPrivateField(dataSourceConnectionHandler, "ds"));
        }
    }
    
    public void testGetConnectionThrowsSQLException() throws Throwable {
        DataSource ds = (DataSource) Mockingbird.getProxyObject(DataSource.class);
        DataSourceConnectionHandler dataSourceConnectionHandler = new DataSourceConnectionHandler(ds);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(ds.getConnection(), null);
        Mockingbird.replaceObjectForRecording(SQLException.class, "<init>(java.lang.String)", Mockingbird.getProxyObject(SQLException.class));
        Mockingbird.enterTestMode(DataSourceConnectionHandler.class);
        try {
            dataSourceConnectionHandler.getConnection();
            fail("Expected SQLException to be thrown");
        } catch (SQLException ex) {
            assertSame("dataSourceConnectionHandler.ds", ds, getPrivateField(dataSourceConnectionHandler, "ds"));
        }
    }
}

