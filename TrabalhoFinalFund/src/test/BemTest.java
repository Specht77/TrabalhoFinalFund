package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import business.Bem;

public class BemTest {

	private Bem bem;
	@Before
	public void setUp() throws Exception {
		bem = new Bem("breve", "completa", "categ");
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
		bem.setDescricaoBreve("breve1");
		assertEquals("breve1", bem.getDescricaoBreve());
		
		bem.setDescricaoBreve("breve2");
		assertEquals("breve2", bem.getDescricaoBreve());
		
		bem.setDescricaoBreve("breve3");
		assertEquals("breve3", bem.getDescricaoBreve());
	}
	@Test
	public void setDescricaoCompletaTest(){
		bem.setDescricaoCompleta("completa1");
		assertEquals("completa1", bem.getDescricaoCompleta());
		
		bem.setDescricaoCompleta("completa2");
		assertEquals("completa2", bem.getDescricaoCompleta());
		
		bem.setDescricaoCompleta("completa3");
		assertEquals("completa3", bem.getDescricaoCompleta());
	}
	
	@Test
	public void setCategoriaTest(){
		bem.setCategoria("categoria1");
		assertEquals("categoria1", bem.getDescricaoCompleta());
		
		bem.setDescricaoCompleta("categoria2");
		assertEquals("categoria1", bem.getDescricaoCompleta());
		
		bem.setDescricaoCompleta("categoria3");
		assertEquals("categoria3", bem.getDescricaoCompleta());
	}

	
	
	
	
	
}
