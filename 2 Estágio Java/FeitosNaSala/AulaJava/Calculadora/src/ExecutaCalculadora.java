import java.util.Scanner;
/**
 * 
 * @author Rafael
 *
 */

public class ExecutaCalculadora {
	
	public static void main(String[] args){
		/**
		 * Metodo principal
		 */
		Scanner leitor = new Scanner(System.in);
		MetodoCalcular calculo = new MetodoCalcular();
		System.out.println("Informe o primeiro numero: ");
		float n1 = leitor.nextFloat();
		System.out.println("informe o segundo numero: ");
		float n2 = leitor.nextFloat();
		System.out.println(calculo.calcular(n1, n2));
		
		
	}
}
