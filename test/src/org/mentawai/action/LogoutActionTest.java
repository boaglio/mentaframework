package org.mentawai.action;

import junit.framework.TestCase;

import org.mentawai.core.Action;
import org.mentawai.util.MockAction;

public class LogoutActionTest extends TestCase {
	
	LogoutAction logoutAction = MockAction.getMockAction(LogoutAction.class);

	public void testLogout() {
		
		logoutAction.logout();
		
		assertTrue(true);
	}

	public void testExecute() throws Exception {
		
		String result = logoutAction.execute();
		
		assertEquals(result, Action.SUCCESS);
	}
}
