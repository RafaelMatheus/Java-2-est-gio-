
public class Emprestimo {
	/**
	 * 
	 */

	String nomeUsuario;
	int idade;
	float valorEmprestimo;
	float percentualJurosMes;
	int mesesParaPagar;
	

	public void imprimir() {
		/**
		 * Esse metodo e responsavel por imprimir tudo
		 */
		System.out.println("A sua idade e: " + idade);
		System.out.println("O valor do emprestimo e : " + valorEmprestimo);
		System.out.println("O percentual de juros e " + percentualJurosMes);
		System.out.println("O mes para pagar e: " + mesesParaPagar);

	}

	float calcularValorEmprestimo(float valorEmprestimos) {
	/**
	 * Esse metodo e responsavel por realizar todo calculo
	 */
		if (this.idade > 18 && this.idade < 25) {
			this.valorEmprestimo=valorEmprestimos+=(valorEmprestimos/mesesParaPagar);
			return valorEmprestimo;
		} else if (this.idade > 23 && this.idade <= 33) {
			this.valorEmprestimo = (valorEmprestimos * 10) / 100;
			return this.valorEmprestimo;
		} 
		else{
			return this.valorEmprestimo;
		}
		
		
	}

}
