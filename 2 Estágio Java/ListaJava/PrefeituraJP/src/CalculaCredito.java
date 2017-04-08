import java.util.Scanner;


public class CalculaCredito {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObterValores salario = new ObterValores();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("informe seu salario e logo em seguida o valor da parcela");
		float salario1 = leitor.nextFloat();
		float parcela = leitor.nextFloat();
		/**
		 * returnSalario armazena o retorno da função validaCredito
		 * se o retorno for positivo, neste caso 1 a operação será válida para realizar 
		 * o credito para o funcionario 
		 * caso contrario a operação foi reprovada
		 */
		
		float returnSalario = salario.validaCredito(salario1, parcela); 
		
		
		if(returnSalario == 1 ){
			System.out.println("Operação aprovada!");
			
		}
		
		else{
			System.out.println("Operação reprovada! ");
		}
	}

}
