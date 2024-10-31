/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 5:48:48 PM
 * Time to generate: 00:24.535 seconds
 *
 */

package org.mentawai.transaction;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import org.hibernate.Session;

public class HibernateTransactionAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return HibernateTransaction.class;
    }
    
    public void testConstructor() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction();
        assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
        assertNull("hibernateTransaction.getSession()", hibernateTransaction.getSession());
        assertFalse("hibernateTransaction.wasRolledBack()", hibernateTransaction.wasRolledBack());
        assertFalse("hibernateTransaction.wasCommited()", hibernateTransaction.wasCommited());
        assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
    }
    
    public void testConstructor1() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction(null);
        assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
        assertNull("hibernateTransaction.getSession()", hibernateTransaction.getSession());
        assertFalse("hibernateTransaction.wasRolledBack()", hibernateTransaction.wasRolledBack());
        assertFalse("hibernateTransaction.wasCommited()", hibernateTransaction.wasCommited());
        assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
    }
    
    public void testBeginWithAggressiveMocks() throws Throwable {
        HibernateTransaction hibernateTransaction = (HibernateTransaction) Mockingbird.getProxyObject(HibernateTransaction.class, true);
        Session session = (Session) Mockingbird.getProxyObject(Session.class);
        setPrivateField(hibernateTransaction, "active", Boolean.FALSE);
        setPrivateField(hibernateTransaction, "commited", Boolean.FALSE);
        setPrivateField(hibernateTransaction, "rolledback", Boolean.FALSE);
        hibernateTransaction.setTransaction(null);
        hibernateTransaction.setSession(session);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(session.beginTransaction(), null);
        Mockingbird.enterTestMode(HibernateTransaction.class);
        hibernateTransaction.begin();
        assertTrue("hibernateTransaction.isActive()", hibernateTransaction.isActive());
        assertNotNull("hibernateTransaction.getSession()", hibernateTransaction.getSession());
        assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
    }
    
    public void testCommit() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction();
        hibernateTransaction.commit();
        assertTrue("hibernateTransaction.wasCommited()", hibernateTransaction.wasCommited());
        assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
        assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
    }
    
    public void testCommitWithAggressiveMocks() throws Throwable {
        HibernateTransaction hibernateTransaction = (HibernateTransaction) Mockingbird.getProxyObject(HibernateTransaction.class, true);
        setPrivateField(hibernateTransaction, "rolledback", Boolean.FALSE);
        setPrivateField(hibernateTransaction, "commited", Boolean.TRUE);
        Mockingbird.enterTestMode(HibernateTransaction.class);
        hibernateTransaction.commit();
        assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
        assertTrue("hibernateTransaction.wasCommited()", hibernateTransaction.wasCommited());
        assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
    }
    
    public void testIsActive() throws Throwable {
        boolean result = new HibernateTransaction().isActive();
        assertFalse("result", result);
    }
    
    public void testRollback() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction();
        hibernateTransaction.rollback();
        assertTrue("hibernateTransaction.wasRolledBack()", hibernateTransaction.wasRolledBack());
        assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
        assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
    }
    
    public void testRollbackWithAggressiveMocks() throws Throwable {
        HibernateTransaction hibernateTransaction = (HibernateTransaction) Mockingbird.getProxyObject(HibernateTransaction.class, true);
        setPrivateField(hibernateTransaction, "commited", Boolean.FALSE);
        setPrivateField(hibernateTransaction, "rolledback", Boolean.TRUE);
        Mockingbird.enterTestMode(HibernateTransaction.class);
        hibernateTransaction.rollback();
        assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
        assertTrue("hibernateTransaction.wasRolledBack()", hibernateTransaction.wasRolledBack());
        assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
    }
    
    public void testSetSession() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction(null);
        hibernateTransaction.setSession(null);
        assertNull("hibernateTransaction.getSession()", hibernateTransaction.getSession());
    }
    
    public void testWasCommited() throws Throwable {
        boolean result = new HibernateTransaction(null, null).wasCommited();
        assertFalse("result", result);
    }
    
    public void testWasRolledBack() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction(null);
        hibernateTransaction.rollback();
        boolean result = hibernateTransaction.wasRolledBack();
        assertTrue("result", result);
    }
    
    public void testWasRolledBack1() throws Throwable {
        boolean result = new HibernateTransaction(null, null).wasRolledBack();
        assertFalse("result", result);
    }
    
    public void testBeginThrowsIllegalStateException() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction();
        try {
            hibernateTransaction.begin();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "HibernateTransaction does not have a hibernate session!", ex.getMessage());
            assertThrownBy(HibernateTransaction.class, ex);
            assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
            assertNull("hibernateTransaction.getSession()", hibernateTransaction.getSession());
            assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
        }
    }
    
    public void testBeginThrowsIllegalStateException1() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction();
        hibernateTransaction.commit();
        try {
            hibernateTransaction.begin();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "Cannot begin transaction again!", ex.getMessage());
            assertThrownBy(HibernateTransaction.class, ex);
            assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
            assertNull("hibernateTransaction.getSession()", hibernateTransaction.getSession());
            assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
        }
    }
    
    public void testBeginThrowsIllegalStateExceptionWithAggressiveMocks() throws Throwable {
        HibernateTransaction hibernateTransaction = (HibernateTransaction) Mockingbird.getProxyObject(HibernateTransaction.class, true);
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(IllegalStateException.class, "<init>(java.lang.String)", Mockingbird.getProxyObject(IllegalStateException.class));
        setPrivateField(hibernateTransaction, "active", Boolean.FALSE);
        setPrivateField(hibernateTransaction, "commited", Boolean.FALSE);
        setPrivateField(hibernateTransaction, "rolledback", Boolean.TRUE);
        Mockingbird.enterTestMode(HibernateTransaction.class);
        try {
            hibernateTransaction.begin();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
            assertNull("hibernateTransaction.getSession()", hibernateTransaction.getSession());
            assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
        }
    }
    
    public void testCommitThrowsIllegalStateException() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction(null);
        hibernateTransaction.rollback();
        try {
            hibernateTransaction.commit();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "Tried to commit but transaction is already rolledback!", ex.getMessage());
            assertThrownBy(HibernateTransaction.class, ex);
            assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
            assertFalse("hibernateTransaction.wasCommited()", hibernateTransaction.wasCommited());
            assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
        }
    }
    
    public void testCommitThrowsNullPointerException() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction(null, null);
        try {
            hibernateTransaction.commit();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(HibernateTransaction.class, ex);
            assertTrue("hibernateTransaction.isActive()", hibernateTransaction.isActive());
            assertFalse("hibernateTransaction.wasCommited()", hibernateTransaction.wasCommited());
            assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
        }
    }
    
    public void testRollbackThrowsIllegalStateException() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction(null);
        hibernateTransaction.commit();
        try {
            hibernateTransaction.rollback();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "Tried to rollback but transaction is already commited!", ex.getMessage());
            assertThrownBy(HibernateTransaction.class, ex);
            assertFalse("hibernateTransaction.isActive()", hibernateTransaction.isActive());
            assertFalse("hibernateTransaction.wasRolledBack()", hibernateTransaction.wasRolledBack());
            assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
        }
    }
    
    public void testRollbackThrowsNullPointerException() throws Throwable {
        HibernateTransaction hibernateTransaction = new HibernateTransaction(null, null);
        try {
            hibernateTransaction.rollback();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(HibernateTransaction.class, ex);
            assertTrue("hibernateTransaction.isActive()", hibernateTransaction.isActive());
            assertFalse("hibernateTransaction.wasRolledBack()", hibernateTransaction.wasRolledBack());
            assertNull("hibernateTransaction.getTransaction()", hibernateTransaction.getTransaction());
        }
    }
}

