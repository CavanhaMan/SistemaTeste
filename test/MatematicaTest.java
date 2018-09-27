/*********************
* Rodrigo CavanhaMan *
*        IFTM        *
*********************/
import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatematicaTest {

	private Matematica matematica;
	
	@Before
	public void init() {
		matematica = new Matematica();
	}
/*	public static void main (String args[]) {
		MatematicaTest t = new MatematicaTest();
		t.testaFatorialZero();
	}*/
	@Test
	public void testaFatorialZero() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(0);
		Assert.assertEquals(resposta, 1);
	}

	@Test
	public void testaFatorialUm() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(-5);
		Assert.assertEquals(resposta, new BigDecimal(1));
	}

	@Test
	public void testaFatorialCinco() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(1);
		Assert.assertEquals(resposta, new BigDecimal(2));
	}

	@Test
	public void testaFatorialdoze() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(12);
		Assert.assertEquals(resposta, new BigDecimal(479001600));
	}

	@Test
	public void testaFatorialtreze() throws MatematicaException {
		BigDecimal resposta = matematica.fatorial(13);
		Assert.assertEquals(resposta, new BigDecimal(6227020800l));
	}


}
