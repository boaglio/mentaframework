package org.mentawai.tag.html.dyntag.inputMoney;

import javax.servlet.jsp.JspException;

import com.agitar.lib.junit.AgitarTestCase;

public class inputMoneyTest extends AgitarTestCase {

	public void testCustomizeMask() throws JspException {
		
		InputMoney im = new InputMoney();

		   assertEquals("Testing formater with 0", "0,00" , im.customizeMask(2, ".", ",", "0"));
	       assertEquals("Testing formater with 0", "0.00" , im.customizeMask(2, ".", ".", "0"));      
	     
	       assertEquals("Testing formater with 0.0", "0,00" , im.customizeMask(2, ".", ",", " 0.0"));
	       assertEquals("Testing formater with 0.0", "0.00" , im.customizeMask(2, ".", ".", " 0.0"));
	     
	       assertEquals("Testing formater with 0.15", "0,15" , im.customizeMask(2, ".", ",", "0.15"));
	       assertEquals("Testing formater with 0.10", "0,10" , im.customizeMask(2, ".", ",", "0.10"));
	       assertEquals("Testing formater with 0.100", "0,10" , im.customizeMask(2, ".", ",", "0.100"));
	     
	       assertEquals("Testing formater with 0.01", "0,01" , im.customizeMask(2, ".", ",", " 0.01"));
	       assertEquals("Testing formater with 0,01", "0,01" , im.customizeMask(2, ".", ",", "0,01"));
	       assertEquals("Testing formater with 0.01", "0.01" , im.customizeMask(2, ",", ".", "0.01"));
	       assertEquals("Testing formater with 0,01", "0.01" , im.customizeMask(2, ",", ".", "0,01"));      
	     
	       assertEquals("Testing formater with 0.00", "0,00" , im.customizeMask(2, ".", ",", " 0.00"));
	       assertEquals("Testing formater with 1", "1,00" , im.customizeMask(2, ".", ",", "1"));
	       assertEquals("Testing formater with 1,00", "1,00" , im.customizeMask(2, ".", ",", "1,00"));
	     
	       assertEquals("Testing formater with new Float(0)", "0,00" , im.customizeMask(2, ".", ",", new Float(0)));
	       assertEquals("Testing formater with new Float(1)", "1,00" , im.customizeMask(2, ".", ",", new Float(1)));
	       assertEquals("Testing formater with new Float(0.01)", "0,01" , im.customizeMask(2, ".", ",", new Float(0.01)));
	       assertEquals("Testing formater with new Float(0.10)", "0,10" , im.customizeMask(2, ".", ",", new Float(0.10)));
	       assertEquals("Testing formater with new Float(1.0)", "1,00" , im.customizeMask(2, ".", ",", new Float(1.0)));
	       assertEquals("Testing formater with new Float(100.00)", "100,00" , im.customizeMask(2, ".", ",", new Float(100.0)));
	       assertEquals("Testing formater with 1,000, 000.00", "1,000,000.00" , im.customizeMask(2, ",", ".", "1000000"));
	       assertEquals("Testing formater with 1.000.000,000", "1.000.000,000" , im.customizeMask(3, ".", ",", "1000000"));
	   
	       assertEquals("Testing formater with 1.000 ", "1.000" , im.customizeMask(3, ",", ".", "1"));
	       assertEquals("Testing formater with 1,000", "1,000" , im.customizeMask(3, ".", ",", "1"));
	}
	
}
