package seguradora;

/**
 * Classe que cadastra pessoa jurídica
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public class PessoaJuridica extends Pessoa {

	// Atributos
	
	private String cnpj;
	
	/**
	 *  Método sobrescrito do método abstrato da classe Pessoa
	 */
	
	@Override
	public void exibir() {
		System.out.println("CNPJ: " + this.getCnpj());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
	}
	
	// Métodos Acessores e Modificadores
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
