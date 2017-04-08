import java.util.Scanner;

/**
 * 
 * @author rafael
 *
 */
public class CalculaSalario {

	public static void main(String[] args) {
		ObterSalario salario = new ObterSalario();
		Scanner leitor = new Scanner(System.in);
		String opc = null;
		int cont = 0;
		do{
			cont ++;
			
			
			
			float sala = leitor.nextFloat();
			System.out.println("seu salario aumentou : "+salario.calcularSalario(sala));
			
			System.out.println("Digite fim para sair ou qualquer outra coisa para continuar:  ");
			opc = leitor.nextLine();
			
			if(opc != "fim"){
				System.out.println("informe seu " + cont + "salario");
				
				continue;
			}
			
			
		}while(opc != "fim");
			
			

	

		
	}

}
