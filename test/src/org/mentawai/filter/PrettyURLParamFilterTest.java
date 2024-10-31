package org.mentawai.filter;

import junit.framework.TestCase;

import org.mentawai.action.SuccessAction;
import org.mentawai.core.InvocationChain;
import org.mentawai.util.MockAction;

/**
 * 
 * Test case for PrettyURLInjectionFilter.
 * 
 * @author Rubem Azenha (rubem.azenha@gmail.com)
 *
 * @see PrettyURLParamFilter
 */
public class PrettyURLParamFilterTest extends TestCase {

	public void testFilter() throws Exception {

		PrettyURLParamFilter filter = new PrettyURLParamFilter(
				new String[] { "name", "age" });

		MockAction mockAction = new MockAction();
		mockAction.getInput().setValue("0", "Rubem Azenha");
		mockAction.getInput().setValue("1", "19");

		InvocationChain chain = new InvocationChain("mockAction", mockAction);

		String chainResult = filter.filter(chain);
		assertEquals(SuccessAction.SUCCESS, chainResult);

		String name = mockAction.getInput().getStringValue("name");
		assertEquals("Rubem Azenha", name);

		String age = mockAction.getInput().getStringValue("age");
		assertEquals("19", age);

	}

	public void testFilterMoreParamsThanConfigurationOrder() throws Exception {

		PrettyURLParamFilter filter = new PrettyURLParamFilter(
				new String[] { "name", "age" });

		MockAction mockAction = new MockAction();
		mockAction.getInput().setValue("0", "Rubem Azenha");
		mockAction.getInput().setValue("1", "19");
		mockAction.getInput().setValue("2", "São Paulo");

		InvocationChain chain = new InvocationChain("mockAction", mockAction);

		String chainResult = filter.filter(chain);
		assertEquals(SuccessAction.SUCCESS, chainResult);

		String name = mockAction.getInput().getStringValue("name");
		assertEquals("Rubem Azenha", name);

		String age = mockAction.getInput().getStringValue("age");
		assertEquals("19", age);

		String city = mockAction.getInput().getStringValue("city");
		assertNull(city);

	}
}
