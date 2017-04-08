import java.util.Scanner;

/**
 * 
 * @author rafael
 * 
 */
public class CalcularAumento {
	public static void main(String[] args) {
		AumentoSalarial salario123 = new AumentoSalarial();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o seu salario atual: ");
		float salario1 = leitor.nextFloat();
		System.out.println("informe quantos porcento seu salario aumentou: ");
		float aumento1 = leitor.nextFloat();
		float total = salario123.calculaAumento(salario1, aumento1);
		System.out.println("O aumento do seu salario foi: " + total);

		
	}
}