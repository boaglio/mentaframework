/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 5:49:27 PM
 * Time to generate: 00:17.020 seconds
 *
 */

package org.mentawai.transaction;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.agitar.mock.persistence.MockEntityManager;
import org.agitar.mock.persistence.MockEntityTransaction;

public class JpaTransactionAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return JpaTransaction.class;
    }
    
    public void testConstructor() throws Throwable {
        EntityManager session = new MockEntityManager();
        JpaTransaction jpaTransaction = new JpaTransaction(session);
        assertFalse("jpaTransaction.wasRolledBack()", jpaTransaction.wasRolledBack());
        assertFalse("jpaTransaction.wasCommited()", jpaTransaction.wasCommited());
        assertNull("jpaTransaction.getTransaction()", jpaTransaction.getTransaction());
        assertSame("jpaTransaction.getSession()", session, jpaTransaction.getSession());
        assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
    }
    
    public void testConstructor1() throws Throwable {
        EntityTransaction transaction = (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class);
        EntityManager session = new MockEntityManager();
        Mockingbird.enterTestMode(JpaTransaction.class);
        JpaTransaction jpaTransaction = new JpaTransaction(session, transaction);
        assertFalse("jpaTransaction.wasRolledBack()", jpaTransaction.wasRolledBack());
        assertFalse("jpaTransaction.wasCommited()", jpaTransaction.wasCommited());
        assertSame("jpaTransaction.getSession()", session, jpaTransaction.getSession());
        assertSame("jpaTransaction.getTransaction()", transaction, jpaTransaction.getTransaction());
        assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
    }
    
    public void testConstructor2() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction();
        assertFalse("jpaTransaction.wasRolledBack()", jpaTransaction.wasRolledBack());
        assertFalse("jpaTransaction.wasCommited()", jpaTransaction.wasCommited());
        assertNull("jpaTransaction.getTransaction()", jpaTransaction.getTransaction());
        assertNull("jpaTransaction.getSession()", jpaTransaction.getSession());
        assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
    }
    
    public void testBegin() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction((EntityManager) Mockingbird.getProxyObject(EntityManager.class), (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class));
        Mockingbird.enterTestMode(JpaTransaction.class);
        jpaTransaction.begin();
        assertTrue("jpaTransaction.isActive()", jpaTransaction.isActive());
    }
    
    public void testBegin1() throws Throwable {
        EntityManager session = (EntityManager) Mockingbird.getProxyObject(EntityManager.class);
        JpaTransaction jpaTransaction = new JpaTransaction(session, null);
        Mockingbird.enterRecordingMode();
        EntityTransaction entityTransaction = (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class);
        Object transaction = callPrivateMethod("javax.persistence.EntityManager", "getTransaction", new Class[] {}, session, new Object[] {});
        Mockingbird.setReturnValue(transaction, entityTransaction);
        Mockingbird.enterTestMode(JpaTransaction.class);
        jpaTransaction.begin();
        assertTrue("jpaTransaction.isActive()", jpaTransaction.isActive());
        assertSame("jpaTransaction.getSession()", session, jpaTransaction.getSession());
        assertSame("jpaTransaction.getTransaction()", entityTransaction, jpaTransaction.getTransaction());
    }
    
    public void testCommit() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction(new MockEntityManager(), (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class));
        jpaTransaction.commit();
        Mockingbird.enterTestMode(JpaTransaction.class);
        jpaTransaction.commit();
        assertTrue("jpaTransaction.wasCommited()", jpaTransaction.wasCommited());
        assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
    }
    
    public void testCommit1() throws Throwable {
        EntityTransaction transaction = (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class);
        JpaTransaction jpaTransaction = new JpaTransaction((EntityManager) Mockingbird.getProxyObject(EntityManager.class), transaction);
        jpaTransaction.begin();
        Mockingbird.enterRecordingMode();
        callPrivateMethod("javax.persistence.EntityTransaction", "commit", new Class[] {}, transaction, new Object[] {});
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(JpaTransaction.class);
        jpaTransaction.commit();
        assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
        assertTrue("jpaTransaction.wasCommited()", jpaTransaction.wasCommited());
        assertSame("jpaTransaction.getTransaction()", transaction, jpaTransaction.getTransaction());
    }
    
    public void testCommit2() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction(new MockEntityManager(), (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class));
        Mockingbird.enterTestMode(JpaTransaction.class);
        jpaTransaction.commit();
        assertTrue("jpaTransaction.wasCommited()", jpaTransaction.wasCommited());
        assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
    }
    
    public void testIsActive() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction(new MockEntityManager(), new MockEntityTransaction());
        jpaTransaction.begin();
        boolean result = jpaTransaction.isActive();
        assertTrue("result", result);
    }
    
    public void testIsActive1() throws Throwable {
        boolean result = new JpaTransaction(new MockEntityManager(), new MockEntityTransaction()).isActive();
        assertFalse("result", result);
    }
    
    public void testRollback() throws Throwable {
        EntityTransaction transaction = (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class);
        JpaTransaction jpaTransaction = new JpaTransaction((EntityManager) Mockingbird.getProxyObject(EntityManager.class), transaction);
        jpaTransaction.begin();
        Mockingbird.enterRecordingMode();
        callPrivateMethod("javax.persistence.EntityTransaction", "rollback", new Class[] {}, transaction, new Object[] {});
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(JpaTransaction.class);
        jpaTransaction.rollback();
        assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
        assertTrue("jpaTransaction.wasRolledBack()", jpaTransaction.wasRolledBack());
        assertSame("jpaTransaction.getTransaction()", transaction, jpaTransaction.getTransaction());
    }
    
    public void testRollback1() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction(new MockEntityManager(), (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class));
        Mockingbird.enterTestMode(JpaTransaction.class);
        jpaTransaction.rollback();
        assertTrue("jpaTransaction.wasRolledBack()", jpaTransaction.wasRolledBack());
        assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
    }
    
    public void testRollback2() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction(new MockEntityManager(), new MockEntityTransaction());
        jpaTransaction.rollback();
        jpaTransaction.rollback();
        assertTrue("jpaTransaction.wasRolledBack()", jpaTransaction.wasRolledBack());
        assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
    }
    
    public void testSetSession() throws Throwable {
        EntityManager session = new MockEntityManager();
        JpaTransaction jpaTransaction = new JpaTransaction();
        jpaTransaction.setSession(session);
        assertSame("jpaTransaction.getSession()", session, jpaTransaction.getSession());
    }
    
    public void testSetTransaction() throws Throwable {
        EntityTransaction transaction = new MockEntityTransaction();
        JpaTransaction jpaTransaction = new JpaTransaction(new MockEntityManager(), (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class));
        Mockingbird.enterTestMode(JpaTransaction.class);
        jpaTransaction.setTransaction(transaction);
        assertSame("jpaTransaction.getTransaction()", transaction, jpaTransaction.getTransaction());
    }
    
    public void testWasCommited() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction((EntityManager) Mockingbird.getProxyObject(EntityManager.class), null);
        jpaTransaction.commit();
        Mockingbird.enterTestMode(JpaTransaction.class);
        boolean result = jpaTransaction.wasCommited();
        assertTrue("result", result);
    }
    
    public void testWasCommited1() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction((EntityManager) Mockingbird.getProxyObject(EntityManager.class), (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class));
        Mockingbird.enterTestMode(JpaTransaction.class);
        boolean result = jpaTransaction.wasCommited();
        assertFalse("result", result);
    }
    
    public void testWasRolledBack() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction((EntityManager) Mockingbird.getProxyObject(EntityManager.class), (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class));
        Mockingbird.enterTestMode(JpaTransaction.class);
        boolean result = jpaTransaction.wasRolledBack();
        assertFalse("result", result);
    }
    
    public void testWasRolledBack1() throws Throwable {
        JpaTransaction jpaTransaction = new JpaTransaction();
        jpaTransaction.rollback();
        boolean result = jpaTransaction.wasRolledBack();
        assertTrue("result", result);
    }
    
    public void testBeginThrowsIllegalStateException() throws Throwable {
        EntityTransaction transaction = new MockEntityTransaction();
        JpaTransaction jpaTransaction = new JpaTransaction(null, transaction);
        try {
            jpaTransaction.begin();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "HibernateTransaction does not have a hibernate session!", ex.getMessage());
            assertThrownBy(JpaTransaction.class, ex);
            assertNull("jpaTransaction.getSession()", jpaTransaction.getSession());
            assertSame("jpaTransaction.getTransaction()", transaction, jpaTransaction.getTransaction());
            assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
        }
    }
    
    public void testBeginThrowsIllegalStateException1() throws Throwable {
        EntityTransaction transaction = (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class);
        EntityManager session = new MockEntityManager();
        JpaTransaction jpaTransaction = new JpaTransaction(session, transaction);
        jpaTransaction.rollback();
        Mockingbird.enterTestMode(JpaTransaction.class);
        try {
            jpaTransaction.begin();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "Cannot begin transaction again!", ex.getMessage());
            assertThrownBy(JpaTransaction.class, ex);
            assertSame("jpaTransaction.getSession()", session, jpaTransaction.getSession());
            assertSame("jpaTransaction.getTransaction()", transaction, jpaTransaction.getTransaction());
            assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
        }
    }
    
    public void testBeginThrowsIllegalStateException2() throws Throwable {
        EntityTransaction transaction = (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class);
        EntityManager session = (EntityManager) Mockingbird.getProxyObject(EntityManager.class);
        JpaTransaction jpaTransaction = new JpaTransaction(session, transaction);
        jpaTransaction.commit();
        Mockingbird.enterTestMode(JpaTransaction.class);
        try {
            jpaTransaction.begin();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "Cannot begin transaction again!", ex.getMessage());
            assertThrownBy(JpaTransaction.class, ex);
            assertSame("jpaTransaction.getSession()", session, jpaTransaction.getSession());
            assertSame("jpaTransaction.getTransaction()", transaction, jpaTransaction.getTransaction());
            assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
        }
    }
    
    public void testBeginThrowsIllegalStateException3() throws Throwable {
        EntityTransaction transaction = (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class);
        EntityManager session = (EntityManager) Mockingbird.getProxyObject(EntityManager.class);
        JpaTransaction jpaTransaction = new JpaTransaction(session, transaction);
        jpaTransaction.begin();
        Mockingbird.enterTestMode(JpaTransaction.class);
        try {
            jpaTransaction.begin();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "Cannot begin transaction again!", ex.getMessage());
            assertThrownBy(JpaTransaction.class, ex);
            assertSame("jpaTransaction.getSession()", session, jpaTransaction.getSession());
            assertSame("jpaTransaction.getTransaction()", transaction, jpaTransaction.getTransaction());
            assertTrue("jpaTransaction.isActive()", jpaTransaction.isActive());
        }
    }
    
    public void testCommitThrowsIllegalStateException() throws Throwable {
        EntityTransaction transaction = new MockEntityTransaction();
        JpaTransaction jpaTransaction = new JpaTransaction(new MockEntityManager(), transaction);
        jpaTransaction.rollback();
        try {
            jpaTransaction.commit();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "Tried to commit but transaction is already rolledback!", ex.getMessage());
            assertThrownBy(JpaTransaction.class, ex);
            assertFalse("jpaTransaction.wasCommited()", jpaTransaction.wasCommited());
            assertSame("jpaTransaction.getTransaction()", transaction, jpaTransaction.getTransaction());
            assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
        }
    }
    
    public void testRollbackThrowsIllegalStateException() throws Throwable {
        EntityTransaction transaction = (EntityTransaction) Mockingbird.getProxyObject(EntityTransaction.class);
        JpaTransaction jpaTransaction = new JpaTransaction((EntityManager) Mockingbird.getProxyObject(EntityManager.class), transaction);
        jpaTransaction.begin();
        Mockingbird.enterRecordingMode();
        callPrivateMethod("javax.persistence.EntityTransaction", "commit", new Class[] {}, transaction, new Object[] {});
        Mockingbird.setNormalReturnForVoid();
        Mockingbird.enterTestMode(JpaTransaction.class);
        jpaTransaction.commit();
        try {
            jpaTransaction.rollback();
            fail("Expected IllegalStateException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals("ex.getMessage()", "Tried to rollback but transaction is already commited!", ex.getMessage());
            assertThrownBy(JpaTransaction.class, ex);
            assertFalse("jpaTransaction.wasRolledBack()", jpaTransaction.wasRolledBack());
            assertSame("jpaTransaction.getTransaction()", transaction, jpaTransaction.getTransaction());
            assertFalse("jpaTransaction.isActive()", jpaTransaction.isActive());
        }
    }
}

