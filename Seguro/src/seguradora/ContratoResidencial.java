package seguradora;

/**
 * Classe que cadastra contrato residencial
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public class ContratoResidencial extends Contrato {

	// Atributos
	
	private PessoaFisica cltpf;
	private String endereco;
	private int zona; // [1] - Urbana / [2] - Suburbana / [3] - Rural
	private int tipo; // [1] - Apartamento / [2] - Casa

	// Métodos Especiais
	
	/**
	 * Método que exibe contrato residencial
	 */
	
	@Override
	public void exibirContrato() {
		
		System.out.println("*************************************");
		System.out.println("TIPO DE CONTRATO: Residencial");
		System.out.println("*************************************");
		
		System.out.println("DADOS DO CLIENTE");
		System.out.println("-------------------------------------");
		System.out.println("CPF: " + this.cltpf.getCpf());
		System.out.println("Nome: " + this.cltpf.getNome());
		System.out.println("Endereço: " + this.cltpf.getEndereco());
		System.out.println("-------------------------------------");
		
		System.out.println("DADOS DO CONTRATO");
		System.out.println("-------------------------------------");
		System.out.println("Endereço: " + this.getEndereco());
		System.out.printf("Valor do Imóvel: R$ %.2f \n", this.getVlrimv());
		
		// Zona
		
		if (this.getZona() == 1) {
			System.out.println("Zona: Urbana");
		} else if (this.getZona() == 2) {
			System.out.println("Zona: Suburbana");
		} else if (this.getZona() == 3) {
			System.out.println("Zona: Rural");
		}
		
		// Tipo de Residência
		
		if (this.getTipo() == 1) {
			System.out.println("Tipo de Residêcia: Apartamento");
		} else if (this.getTipo() == 2) {
			System.out.println("Tipo de Residência: Casa");
		}
		
		System.out.printf("Valor do Seguro: R$ %.2f \n", this.getVlrseguro());
		System.out.println("-------------------------------------");
	}
	
	/**
	 * Método que calcula o valor do seguro do contrato residencial
	 */
	
	@Override
	public void calcularContrato() {
		
		double valorimovel = this.getVlrimv();
		
		/**
		 * 2% do valor do móvel
		 */
		
		double valorpremio = (valorimovel * 2) / 100;
		
		double condicao = 0.0;
		double temp = 0.0;
		double temp2 = 0.0;
		
		double valorcalculado = 0.0;
		
		/**
		 * 1% se zona urbana
		 */
		
		if (this.getZona() == 1) {
			temp = (valorpremio * 1) / 100;
			condicao = temp;
		}
		
		/**
		 * 0,5% se zona suburbana
		 */
		
		if (this.getZona() == 2) {
			temp = (valorpremio * 0.5) / 100;
			condicao = temp;
		}
		
		/**
		 * 0,5% se casa
		 */
		
		if (this.getTipo() == 2) {
			temp2 = (valorpremio * 0.5) / 100;
			condicao = condicao + temp2;
		}
		
		/**
		 *  Valor Calculado do Seguro
		 */
		valorcalculado = valorpremio + condicao;
		this.setVlrseguro(valorcalculado);
	}
	
	// Métodos Acessores e Modificadores
	
	public PessoaFisica getCltpf() {
		return cltpf;
	}
	public void setCltpf(PessoaFisica cltpf) {
		this.cltpf = cltpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
