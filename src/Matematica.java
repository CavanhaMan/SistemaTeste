import java.math.BigDecimal;

/*********************
* Rodrigo CavanhaMan *
*        IFTM        *
*********************/
public class Matematica {

	public BigDecimal fatorial(int n)  throws MatematicaException {
		if(n<0)
			throw new MatematicaException("Não aceita número menor do que 0 ",+n);
		if(n==0 || n==1)
			return BigDecimal.ONE;
		return BigDecimal.valueOf(n).multiply(fatorial(n-1));
	}
}


/*
public static void main(String[] args) {
		BigDecimal valor1 = new BigDecimal(222);
		BigDecimal valor2 = new BigDecimal(111);
		if (valor1.compareTo(valor2) == 1){
			System.out.println("valor1 é maior");
		} else if(valor2.compareTo(valor1) == 1){
			System.out.println("valor2 é maior");
		}
	}
 */