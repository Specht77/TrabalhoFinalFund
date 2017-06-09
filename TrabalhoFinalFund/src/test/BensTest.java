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
	public void CoordenadasConstrutorTest() {
		assertEquals("breve", bem.getDescricaoBreve());
		assertEquals("completa", bem.getDescricaoCompleta());
		assertEquals("categ", bem.getCategoria());
	
	

}
