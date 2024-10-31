package org.mentawai.tag.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

public class OrdenatorTest extends TestCase {

	public void testCompare() throws Exception {
	
		assertEquals("1234",  printList( ListSorter.sort( getList(), 	"id", false) )   );
		assertEquals("1342",  printList( ListSorter.sort( getList(), 	"nome", false) )   );
		assertEquals("1423",  printList( ListSorter.sort( getList(), 	"idadeString", false) )   );
		assertEquals("1432",  printList( ListSorter.sort( getList(), 	"idade", false) )   );
		assertEquals("1234",  printList( ListSorter.sort( getList(), 	"nascimento", false) )   );

	}

	private String printList(List<Object> list){
      
		String sequence = new String();
		
		for (Object people : list) {
         
         
         
			sequence = sequence.concat( people.toString() );
		}

		return sequence;
	}
	
	private List<Object> getList() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		
		List<Object> peopleList = new ArrayList<Object>();
		
		People p1 = new People();
		p1.setId(1);
		p1.setNome("AAA");
		p1.setIdadeString("1");
		p1.setIdade( new Integer(1) );
		p1.setNascimento( sdf.parse("01/12/1985") );
		
		People p2 = new People();
		p2.setId(2);
		p2.setNome("ZZZ");
		p2.setIdadeString("10");
		p2.setIdade( new Integer(88) );
		p2.setNascimento( sdf.parse("02/12/1985") );
		
		
		People p3 = new People();
		p3.setId(3);
		p3.setNome("BBB");
		p3.setIdadeString("11");
		p3.setIdade( new Integer(8) );
		p3.setNascimento( sdf.parse("03/12/1985") );
		
		
		People p4 = new People();
		p4.setId(4);
		p4.setNome("HHH");
		p4.setIdadeString("8");
		p4.setIdade( new Integer(6) );
		p4.setNascimento( sdf.parse("04/12/1985") );
		
		
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		peopleList.add(p4);

		return peopleList;
	}
	
	private class People {
		
		int id;
		String nome;
		Integer idade;
		Date nascimento;
		String idadeString;
		
		public People() {
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Integer getIdade() {
			return idade;
		}
		public void setIdade(Integer idade) {
			this.idade = idade;
		}
		public Date getNascimento() {
			return nascimento;
		}
		public void setNascimento(Date nascimento) {
			this.nascimento = nascimento;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getIdadeString() {
			return idadeString;
		}
		public void setIdadeString(String idadeString) {
			this.idadeString = idadeString;
		}
		
		@Override
		public String toString() {
			return String.valueOf( getId() );
		}
		
	}

}