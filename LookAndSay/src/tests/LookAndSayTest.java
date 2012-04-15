package tests;

import main.FormatterInFull;
import main.LookAndSay;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LookAndSayTest {

	private LookAndSay lookAndSay;
	
	@Before
	public void before(){
		lookAndSay = new LookAndSay();
	}
	
	@Test
	public void testEntradaMaisSimples() {
		Assert.assertEquals("11", lookAndSay.evaluate("1"));
	}
	
	@Test
	public void testDoisDigitosIguais() {
		Assert.assertEquals("21", lookAndSay.evaluate("11"));
	}
	
	@Test
	public void testDoisDigitosDiferentes() {
		Assert.assertEquals("1112", lookAndSay.evaluate("12"));
	}
	
	@Test
	public void testTresDigitosRepetindo() {
		Assert.assertEquals("111211",  lookAndSay.evaluate("121"));
	}
	

	@Test
	public void testNumeroSimplesComSaidaPorExtenso() {
		lookAndSay = new LookAndSay(new FormatterInFull());
		Assert.assertEquals("um 1",  lookAndSay.evaluate("1"));
	}
	
	@Test
	public void testDoisDigitosComSaidaPorExtenso() {
		lookAndSay = new LookAndSay(new FormatterInFull());
		Assert.assertEquals("um 1 um 2",  lookAndSay.evaluate("12"));
	}
	
	@Test
	public void testTresDigitosRepetidosComSaidaPorExtenso() {
		lookAndSay = new LookAndSay(new FormatterInFull());
		Assert.assertEquals("três 1",  lookAndSay.evaluate("111"));
	}
	
	@Test
	public void testDoisDigitosRepetidosEUmNaoSaidaPorExtenso() {
		lookAndSay = new LookAndSay(new FormatterInFull());
		Assert.assertEquals("um 1 um 2 um 1",  lookAndSay.evaluate("121"));
	}
	
	@Test
	public void tetstNumeroComplexoSaidaPorExtenso() {
		lookAndSay = new LookAndSay(new FormatterInFull());
		Assert.assertEquals("dois 1 cinco 7 um 8 um 7",  lookAndSay.evaluate("117777787"));
	}
	
	@Test
	public void testSomatorioDigitosElemento() {
		Assert.assertEquals(new Long(2), lookAndSay.sum("11"));
	}
	
	@Test
	public void testSomatorioDigitosDaQuadragesimaSequencia() {
		Assert.assertEquals(new Long(139088), lookAndSay.sumFortySequence("1"));
	}
	
	@Test
	public void testSomatorioDigitosDaQuadragesimaSequenciaCom2() {
		Long resultOf2 = new Long(161739);
		Assert.assertEquals(resultOf2, lookAndSay.sumFortySequence("2"));
		Assert.assertEquals(new Long(resultOf2 + 1L), lookAndSay.sumFortySequence("3"));
		Assert.assertEquals(new Long(resultOf2 + 7L), lookAndSay.sumFortySequence("9"));
	}
}
