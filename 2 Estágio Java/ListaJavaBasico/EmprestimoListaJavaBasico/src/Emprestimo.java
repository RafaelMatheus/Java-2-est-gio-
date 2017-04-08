
public class Emprestimo {
	String nomeUsuario; 
	int idade; 
	float valorEmprestimo; 
	float percentualJurosMes; 
	int mesesParaPagar;

	
	
	public float calculaValor(int idade){
		
		if (idade >= 18 && idade<23){
			valorEmprestimo += (valorEmprestimo / mesesParaPagar) / percentualJurosMes;
			return valorEmprestimo;
		}
		
		else if(idade >=23 && idade<=33){
			valorEmprestimo = (valorEmprestimo * 10)/100;
			return valorEmprestimo;
		}
			System.out.println("informe uma idade entre 18 e 33 ");
			return idade;
		
		
		
	}

	public void imprimir (){
		/**
		 * Imprime todos os atributos
		 */
		System.out.println("Nome: " + this.nomeUsuario);
		System.out.println("Idade: "+ this.idade);
		System.out.println("Valor a pagar " + this.valorEmprestimo);
		System.out.println("Percentual de juros: " + this.percentualJurosMes);
		System.out.println("Meses para pagar: " + this.mesesParaPagar);
		
		
	}
	
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}


	public int getIdade() {
		return idade;
	}


	public float getValorEmprestimo() {
		return valorEmprestimo;
	}


	public float getPercentualJurosMes() {
		return percentualJurosMes;
	}


	public int getMesesParaPagar() {
		return mesesParaPagar;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public void setValorEmprestimo(float valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}


	public void setPercentualJurosMes(float percentualJurosMes) {
		this.percentualJurosMes = percentualJurosMes;
	}


	public void setMesesParaPagar(int mesesParaPagar) {
		this.mesesParaPagar = mesesParaPagar;
	}


	
	
}
