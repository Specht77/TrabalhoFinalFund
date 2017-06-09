package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import business.Bens;

public class BensTest {

	private Bens bem;
	@Before
	public void setUp() throws Exception {
		bem = new Bens("breve", "completa", "categ");
	}
	@Test
	public void test() {
		fail("Not yet implemented");
		
	}
	@Test
	public void BensConstructorTest() {
		assertEquals("breve", bem.getDescricaoBreve());
		assertEquals("completa", bem.getDescricaoCompleta());
		assertEquals("categ", bem.getCategoria());
	
	}
	@Test
	public void setDescricaoBreveTest(){
		bem.setDescricaoBreve("test1");
		assertEquals("test1", bem.getDescricaoBreve());
		
		bem.setDescricaoBreve("test2");
		assertEquals("test2", bem.getDescricaoBreve());
		
		bem.setDescricaoBreve("test2");
		assertEquals("test2", bem.getDescricaoBreve());
	}
	@Test
	public void setDescricaoCompletaTest(){
		bem.setDescricaoCompleta("test1");
		assertEquals("test1", bem.getDescricaoCompleta());
		
		bem.setDescricaoCompleta("test2");
		assertEquals("test2", bem.getDescricaoCompleta());
		
		bem.setDescricaoCompleta("test2");
		assertEquals("test2", bem.getDescricaoCompleta());
	}

	
	
	
	
	
}
