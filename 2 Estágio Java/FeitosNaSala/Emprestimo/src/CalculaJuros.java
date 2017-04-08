import java.util.Scanner;
public class CalculaJuros {

	
	public static void main(String[] args) {
		
		Emprestimo emprestimo = new Emprestimo();
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe seu nome");
		emprestimo.nomeUsuario = leitor.nextLine();
		System.out.println("informe sua idade");
		emprestimo.idade = leitor.nextInt();
		System.out.println("Informe o valor do emprestimo: ");
		float valor = leitor.nextFloat();
		
		System.out.println(emprestimo.calcularValorEmprestimo(valor));
		
		emprestimo.imprimir();
		

	}


}
