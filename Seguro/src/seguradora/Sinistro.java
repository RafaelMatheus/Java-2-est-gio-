package seguradora;

/**
 * Classe abstrata Sinistro
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public abstract class Sinistro {
	
	/**
	 *  Classe abstrata não pode instanciar objetos
	 */
	
	// Atributos
	
	protected String data;
	protected double porcentagem;
	protected String tipo;	
	
	/**
	 *  Método Abstratos somente para fins de herança
	 */

	public abstract void tipoSinistro();
	public abstract void exibirSinistro();
	
	// Métodos Acessores e Modificadores
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
