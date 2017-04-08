import java.util.Scanner;

public class RealizaEmprestimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emprestimo emprestimo = new Emprestimo();
		Scanner leitor = new Scanner(System.in);

		System.out
				.println("informe na ordem seu nome, sua idade, valor do emprestimo, percentual de juros ao mes ,meses para pagar");
		String nomeUsuario = leitor.nextLine();
		int idade = leitor.nextInt();
		float valorEmprestimo = leitor.nextFloat();
		float percentualJurosMes = leitor.nextFloat();
		int mesesParaPagar = leitor.nextInt();
		emprestimo.setNomeUsuario(nomeUsuario);
		emprestimo.setIdade(idade);
		emprestimo.setValorEmprestimo(valorEmprestimo);
		emprestimo.setPercentualJurosMes(percentualJurosMes);
		emprestimo.setMesesParaPagar(mesesParaPagar);
		
		emprestimo.calculaValor(emprestimo.idade);
		
		emprestimo.imprimir();

	}

}
