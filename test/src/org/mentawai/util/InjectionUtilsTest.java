package org.mentawai.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import junit.framework.TestCase;

public class InjectionUtilsTest extends TestCase {
	
	private User u = new User("Sergio", 31, true);
	
	
	public void testGetProperty() throws java.lang.Exception {
		
		String name = InjectionUtils.getProperty(u, "name");
		assertEquals("Sergio", name);
		
		int age = Integer.parseInt(InjectionUtils.getProperty(u, "age"));
		assertEquals(31, age);
		
		// now try private field
		String reg = InjectionUtils.getProperty(u, "reg");
		assertNotNull(reg);
      
      // now try private field
      String man = InjectionUtils.getProperty(u, "man");
      assertNotNull(reg);
      assertEquals(true, Boolean.valueOf(man).booleanValue());
      
	}
   
   public void testPrepareForInjection() {
      
      //public static void prepareForInjection(Class<? extends Object> klass,           Map<String, Object> setters, Map<String, Object> fields) {
      
      Map<String, Object> setters = new HashMap<String, Object>();
      Map<String, Object> fields  = new HashMap<String, Object>();
      
      InjectionUtils.prepareForInjection(User.class, setters, fields);
      
      assertEquals(1, setters.size());
      assertEquals(3, fields.size());
      
      Method m = (Method) setters.get("age");
      
      assertNotNull(m);
      
      assertEquals(m.getName(), "setAge");
      
      Field f = (Field) fields.get("name");
      
      assertNotNull(f);
      
      assertEquals(f.getName(), "name");
      
      f = (Field) fields.get("reg");
      
      assertNotNull(f);
      
      assertEquals(f.getName(), "reg");
   }
   
   public void testGetField() {
      
      Field f = InjectionUtils.getField(User.class, "reg");
      
      assertNotNull(f);
      
      assertEquals(f.getName(), "reg");
   }
   
   public void testFindMethodToGet() {
      
      Method m = InjectionUtils.findMethodToGet(User.class, "age");
      
      assertNotNull(m);
      assertEquals(m.getName(), "getAge");
      
      m = InjectionUtils.findMethodToGet(User.class, "man");
      assertNotNull(m);
      assertEquals(m.getName(), "isMan");
   }
   
   public void testFindMethodToInject() {
      
      Method m = InjectionUtils.findMethodToInject(User.class, "age", Integer.class);
      
      assertNotNull(m);
      
      assertEquals(m.getName(), "setAge");
      
      m = InjectionUtils.findMethodToInject(User.class, "age", int.class);
      
      assertNotNull(m);
      
      assertEquals(m.getName(), "setAge");
      
      m = InjectionUtils.findMethodToInject(User.class, "reg", Date.class);
      
      assertNull(m);
   }
   
   public void testInject() throws java.lang.Exception {
      
      User u = new User("Test", 11, false);
      
      Method m = InjectionUtils.findMethodToInject(User.class, "age", int.class);
      
      assertNotNull(m);
      
      InjectionUtils.inject(m, u, 22, null, false, false);
      
      assertEquals(u.getAge(), 22);
      
      // Float e Double values test..
      Product product = new Product();   
      Method priceM = InjectionUtils.findMethodToInject(Product.class, "price", double.class);
      Method interestM = InjectionUtils.findMethodToInject(Product.class, "interest", float.class);
      assertNotNull(priceM);
      assertNotNull(interestM);
      
      
      Locale en_US = new Locale("en", "US");
      Locale pt_BR = new Locale("pt","BR");
      
      
      // Mais informação em: http://developers.sun.com/dev/gadc/technicalpublications/articles/java1.4currency.html
      
      // Locale: en_US
      InjectionUtils.inject(priceM, product, "99.90", en_US, true, false);
      assertEquals( 99.90d, product.getPrice());
      
      InjectionUtils.inject(priceM, product, "1,999.90", en_US, true, false);
      assertEquals( 1999.90d, product.getPrice());
      
      InjectionUtils.inject(priceM, product, "1,999,999.90", en_US, true, false);
      assertEquals( 1999999.90d, product.getPrice());
      
      InjectionUtils.inject(interestM, product, "0.5", en_US, true, false);
      assertEquals( 0.5f, product.getInterest());
      
      // Locale: pt_BR
      
      InjectionUtils.inject(priceM, product, "99,90", pt_BR, true, false);
      assertEquals( 99.90d, product.getPrice());
 
      InjectionUtils.inject(priceM, product, "1.999,90", pt_BR, true, false);
      assertEquals(1999.90d, product.getPrice());
      
      InjectionUtils.inject(priceM, product, "1.999.999,90", pt_BR, true, false);
      assertEquals(1999999.90d, product.getPrice());
      
      InjectionUtils.inject(interestM, product, "0,5", pt_BR, true, false);
      assertEquals( 0.5f, product.getInterest());   
 
   }
   
   
   
  
	
   
   private static class Product {
		private double price;
		private float interest; // juros
		
		private Product() {
		}
		
		private Product(double price, float interest) {
			super();
			this.price = price;
			this.interest = interest;
		} 
		
		public void setPriceAndInterest(double price, float interest) {
			this.price = price;
			this.interest = interest;
		}
	
		public void setPriceAndInterestObjects(Double price, Float interest) {
			this.price = price;
			this.interest = interest;
		}
		
		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public float getInterest() {
			return interest;
		}

		public void setInterest(float interest) {
			this.interest = interest;
		}


   }
   
	private static class User {
		
		private int age;
		
		private String name;
		
		private Date reg = new Date();
      
      private boolean man;

		
		public User(String name, int age, boolean man) {
			this.name = name;
			this.age = age;
         this.man = man;
		}
		
		public int getAge() { return age; }
		
		public String getName() { return name; }
		
		// no public getter for reg!
      
      public void setAge(int age) { this.age = age; }
      
      public boolean isMan() { return man; }
      
		public String toString() {
			
			return name + " " + man + " " + age + " " + reg;
		}
	}
}
