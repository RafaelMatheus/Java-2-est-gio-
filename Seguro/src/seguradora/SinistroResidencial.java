package seguradora;

/**
 * Classe que cadastra sinistro residencial
 * @author: alvaro.santos
 * @date: 11 de abr de 2017
 */

public class SinistroResidencial extends Sinistro {

	// Atributos
	
	private PessoaFisica pf;
	private ContratoResidencial contrato;
	
	// Métodos Especiais
	
	@Override
	public void tipoSinistro() {
		double porcentagem = this.getPorcentagem();
		if (porcentagem > 75.0) {
			this.setTipo("TOTAL");
		} else if (porcentagem < 75.0) {
			this.setTipo("PARCIAL");
		}
	}
	
	@Override
	public void exibirSinistro() {
		
		System.out.println("*************************************");
		System.out.println("TIPO DE SINISTRO: Residencial");
		System.out.println("*************************************");
		
		System.out.println("DADOS DO CLIENTE");
		System.out.println("-------------------------------------");
		System.out.println("CPF: " + this.getPf().getCpf());
		System.out.println("Nome: " + this.getPf().getNome());
		System.out.println("Endereço: " + this.getPf().getEndereco());
		System.out.println("-------------------------------------");
		
		System.out.println("DADOS DO CONTRATO");
		System.out.println("-------------------------------------");
		System.out.println("Endereço: " + this.getContrato().getEndereco());
		System.out.printf("Valor do Imóvel: R$ %.2f \n", this.getContrato().getVlrimv());
		
		// Zona
		
		if (this.getContrato().getZona() == 1) {
			System.out.println("Zona: Urbana");
		} else if (this.getContrato().getZona() == 2) {
			System.out.println("Zona: Suburbana");
		} else if (this.getContrato().getZona() == 3) {
			System.out.println("Zona: Rural");
		}
		
		// Tipo de Residência
		
		if (this.getContrato().getTipo() == 1) {
			System.out.println("Tipo de Residêcia: Apartamento");
		} else if (this.getContrato().getTipo() == 2) {
			System.out.println("Tipo de Residência: Casa");
		}
		
		System.out.printf("Valor do Seguro: R$ %.2f \n", this.getContrato().getVlrseguro());
		System.out.println("-------------------------------------");
		
		System.out.println("DADOS DO SINISTRO");
		System.out.println("-------------------------------------");
		System.out.println("Data: " + this.getData());
		System.out.println("Porcentagem: " + this.getPorcentagem() + " %");
		System.out.println("Perca: " + this.getTipo());
		System.out.println("-------------------------------------");
		
	}
	
	// Métodos Acessores e Modificadores
	
	public ContratoResidencial getContrato() {
		return contrato;
	}
	public void setContrato(ContratoResidencial contrato) {
		this.contrato = contrato;
	}
	
	public PessoaFisica getPf() {
		return pf;
	}
	public void setPf(PessoaFisica pf) {
		this.pf = pf;
	}
}
