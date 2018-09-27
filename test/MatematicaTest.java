/*********************
* Rodrigo CavanhaMan *
*        IFTM        *
*********************/
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
		int resposta = matematica.fatorial(0);
		Assert.assertEquals(resposta, 1);
	}

	@Test
	public void testaFatorialUm() throws MatematicaException {
		int resposta = matematica.fatorial(-5);
		Assert.assertEquals(resposta, 1);
	}

	@Test
	public void testaFatorialCinco() throws MatematicaException {
		int resposta = matematica.fatorial(1);
		Assert.assertEquals(resposta, 2);
	}

	@Test
	public void testaFatorialtreze() throws MatematicaException {
		int resposta = matematica.fatorial(1);
		Assert.assertEquals(resposta, 62270208);
	}


}
