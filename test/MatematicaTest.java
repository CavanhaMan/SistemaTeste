/*********************
* Rodrigo CavanhaMan *
*        IFTM        *
*********************/
import org.junit.Assert;
import org.junit.Test;

public class MatematicaTest {

/*	public static void main (String args[]) {
		MatematicaTest t = new MatematicaTest();
		t.testaFatorialZero();
	}*/
	@Test
	public void testaFatorialZero() {
		Matematica matematica = new Matematica();
		int resposta = matematica.fatorial(0);
		Assert.assertEquals(resposta, 1);
	}

	@Test
	public void testaFatorialUm() {
		Matematica matematica = new Matematica();
		int resposta = matematica.fatorial(-5);
		Assert.assertEquals(resposta, 1);
	}

	@Test
	public void testaFatorialCinco() {
		Matematica matematica = new Matematica();
		int resposta = matematica.fatorial(1);
		Assert.assertEquals(resposta, 2);
	}


}
