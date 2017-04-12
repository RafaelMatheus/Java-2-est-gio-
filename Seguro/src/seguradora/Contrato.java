package seguradora;

/**
 * Classe abstrata Contrato
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public abstract class Contrato { 
	
	/**
	 *  Classe abstrata não pode instanciar objetos
	 */

	// Atributos
	
	protected double vlrimv;
	protected double vlrseguro;
	protected boolean sinistro = false;
	
	/**
	 *  Método Abstratos somente para fins de herança
	 */
	
	public abstract void exibirContrato();
	public abstract void calcularContrato();
	
	// Métodos Acessores e Modificadores
	
	public double getVlrimv() {
		return vlrimv;
	}
	public void setVlrimv(double vlrimv) {
		this.vlrimv = vlrimv;
	}
	public double getVlrseguro() {
		return vlrseguro;
	}
	public void setVlrseguro(double vlrseguro) {
		this.vlrseguro = vlrseguro;
	}
	
	public boolean getSinistro() {
		return sinistro;
	}
	public void setSinistro(boolean sinistro) {
		this.sinistro = sinistro;
	}
}
