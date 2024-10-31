package org.mentawai.action;

import org.mentawai.core.Action;

import junit.framework.TestCase;

/*
 * A very useful test case that will test whether the SuccessAction
 * returns SUCCESS or NOT.
 * 
 * @author Sergio Oliveira Jr.
 */
public class SuccessActionTest extends TestCase {
	
	public void testExecute() throws Exception {
		
		SuccessAction successAction = new SuccessAction();
		
		String s = successAction.execute();
		
		assertEquals(Action.SUCCESS, s);
	}
}
