/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 5:52:48 PM
 * Time to generate: 00:16.968 seconds
 *
 */

package org.mentawai.rule;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.Map;
import org.mentawai.core.Action;
import org.mentawai.util.MockAction;

public class LocaleRuleAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return LocaleRule.class;
    }
    
    public void testCheck1() throws Throwable {
        boolean result = DateRule.getInstance().check("testLocaleRuleField", new MockAction());
        assertTrue("result", result);
    }
    
    public void testGetTokensWithAggressiveMocks() throws Throwable {
        LocaleRule localeRule = (LocaleRule) Mockingbird.getProxyObject(LocaleRule.class, true);
        Mockingbird.enterTestMode(LocaleRule.class);
        Map result = localeRule.getTokens();
        assertNull("result", result);
    }
    
    public void testCheckThrowsNullPointerException() throws Throwable {
        try {
            new TimeRule(100).check("testLocaleRuleField", (Action) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(LocaleRule.class, ex);
        }
    }
}

