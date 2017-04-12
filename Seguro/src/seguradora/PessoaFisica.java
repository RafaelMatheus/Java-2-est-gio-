package seguradora;

/**
 * Classe que cadastra pessoa física
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public class PessoaFisica extends Pessoa {
	
	// Atributos
	
	private String cpf;
	
	/**
	 *  Método sobrescrito do método abstrato da classe Pessoa
	 */
	
	@Override
	public void exibir() {
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
	}
	
	// Métodos Acessores e Modificadores
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
