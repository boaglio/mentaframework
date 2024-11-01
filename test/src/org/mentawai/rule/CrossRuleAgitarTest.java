/**
 * Generated by Agitar build: JUnitFactory Version 2.1.0.000576 (Build date: Oct 19, 2007) [2.1.0.000576]
 * JDK Version: 1.5.0_11
 *
 * Generated on Nov 8, 2007 5:51:23 PM
 * Time to generate: 00:16.594 seconds
 *
 */

package org.mentawai.rule;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import java.util.Map;
import org.mentawai.core.Action;
import org.mentawai.core.PojoAction;
import org.mentawai.util.MockAction;

public class CrossRuleAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return CrossRule.class;
    }
    
    public void testCheck() throws Throwable {
        boolean result = new EqualRule("testCrossRuleField1", "testCrossRuleField2").check("testCrossRuleField", new MockAction());
        assertTrue("result", result);
    }
    
    public void testGetTokensWithAggressiveMocks() throws Throwable {
        CrossRule crossRule = (CrossRule) Mockingbird.getProxyObject(CrossRule.class, true);
        Mockingbird.enterTestMode(CrossRule.class);
        Map result = crossRule.getTokens();
        assertNull("result", result);
    }
    
    public void testCheckThrowsNullPointerException1() throws Throwable {
        try {
            EqualRule.getInstance("testCrossRuleField1", "testCrossRuleField2").check("testCrossRuleField", null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(CrossRule.class, ex);
        }
    }
}

