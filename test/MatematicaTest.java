public class MatematicaTest {

	public static void main (String args[]) {
		MatematicaTest t = new MatematicaTest();
		t.testaFatorialZero();
	}
	public void testaFatorialZero() {
		Matematica matematica = new Matematica();
		int resposta = matematica.fatorial(0);
		if (resposta==1)
			System.out.println("Batuta!");
		else
			System.out.println("Faiô!");
	}
}
