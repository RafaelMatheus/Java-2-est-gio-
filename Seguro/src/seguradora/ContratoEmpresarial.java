package seguradora;

/**
 * Classe que cadastra contrato empresarial
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public class ContratoEmpresarial extends Contrato {

	// Atributos
	
	private PessoaJuridica cltpj;
	private int nfunc;
	private int nvis;
	private int ramo; // [1] - Comércio / [2] - Indústria - [3] - Agropecuária 
	
	// Métodos Especiais
	
	/**
	 * Método que exibe contrato empresarial
	 */
	
	@Override
	public void exibirContrato() {
		
		System.out.println("*************************************");
		System.out.println("TIPO DE CONTRATO: Empresarial");
		System.out.println("*************************************");
		
		System.out.println("DADOS DO CLIENTE");
		System.out.println("-------------------------------------");
		System.out.println("CNPJ: " + this.cltpj.getCnpj());
		System.out.println("Nome: " + this.cltpj.getNome());
		System.out.println("Endereço: " + this.cltpj.getEndereco());
		System.out.println("-------------------------------------");
		
		System.out.println("DADOS DO CONTRATO");
		System.out.println("-------------------------------------");
		System.out.printf("Valor do Imóvel: R$ %.2f \n", this.getVlrimv());
		System.out.println("Número de Funcionários: " + this.getNfunc());
		System.out.println("Número de Visitas Diárias: " + this.getNvis());

		// Ramo
		
		if (this.getRamo() == 1) {
			System.out.println("Ramo: Comércio");
		} else if (this.getRamo() == 2) {
			System.out.println("Ramo: Indústria");
		} else if (this.getRamo() == 3) {
			System.out.println("Ramo: Agropecuária");
		}
		
		System.out.printf("Valor do Seguro: R$ %.2f \n", this.getVlrseguro());
		System.out.println("-------------------------------------");
	}
	
	/**
	 * Método que calcula o valor do seguro do contrato empresarial
	 */
	
	@Override
	public void calcularContrato() {
		
		double valorimovel = this.getVlrimv();
		
		/**
		 * 4% do valor do móvel 
		 */
		
		double valorpremio = (valorimovel * 4) / 100;
		
		double condicao = 0.0;
		double temp = 0.0;
		double valorcalculado = 0.0;
		
		/**
		 * 0,2% a cada 10 funcionários
		 */
		
		int nfunc = this.getNfunc();
		int contfunc = 0;
		
		double calculofunc = (valorpremio * 0.2) / 100;
		double calculofinalfunc = 0.0;
		
		for (contfunc = 1; contfunc <= nfunc; contfunc++) {
			if (contfunc % 10 == 0) {
				calculofinalfunc = calculofinalfunc + calculofunc;
			}
		}
		
		/**
		 * 0,3% a cada 200 visitas diárias
		 */
		
		int nvis = this.getNvis();
		int contvis = 0;
			
		double calculovis = (valorpremio * 0.3) / 100;
		double calculofinalvis = 0.0;
		
		for (contvis = 1; contvis <= nvis; contvis++) {
			if (contvis % 200 == 0) {
				calculofinalvis = calculofinalvis + calculovis;
			}
		}
		
		/**
		 * 0,5% se comércio
		 */
		
		if (this.getRamo() == 1) {
			temp = (valorpremio * 0.5) / 100;
			condicao = temp;
		}
		
		/**
		 * 1% se industria
		 */
		
		if (this.getRamo() == 2) { 
			temp = (valorpremio * 1) / 100;
			condicao = temp;
		}
		
		/**
		 *  Valor Calculado do Seguro
		 */
		
		valorcalculado = valorpremio + calculofinalfunc + calculofinalvis + condicao;
		this.setVlrseguro(valorcalculado);
	}

	// Métodos Acessores e Modificadores
	
	public PessoaJuridica getCltpj() {
		return cltpj;
	}
	public void setCltpj(PessoaJuridica cltpj) {
		this.cltpj = cltpj;
	}

	public int getNfunc() {
		return nfunc;
	}
	public void setNfunc(int nfunc) {
		this.nfunc = nfunc;
	}
	public int getNvis() {
		return nvis;
	}
	public void setNvis(int nvis) {
		this.nvis = nvis;
	}
	public int getRamo() {
		return ramo;
	}
	public void setRamo(int ramo) {
		this.ramo = ramo;
	}
}
