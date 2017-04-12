package seguradora;

/**
 * Classe abstrata Pessoa
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public abstract class Pessoa { 
	
	/**
	 *  Classe abstrata não pode instanciar objetos
	 */
	
	// Atributos
	
	protected String nome;
	protected String endereco;
	
	/**
	 *  Método Abstrato somente para fins de herança
	 */
	
	public abstract void exibir();
	
	// Métodos Acessores e Modificadores
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
