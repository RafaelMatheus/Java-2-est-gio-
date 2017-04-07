public class Residencial extends Contrato {
	private String enderecoImovel;
	private int zona;
	private String tipoResidencia;
	private float valorImovel /* guarda o valor final após o calculo feito no setValor*/ ;

	public String getEnderecoImovel() {
		return enderecoImovel;
	}

	public void setEnderecoImovel(String enderecoImovel) {
		this.enderecoImovel = enderecoImovel;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public String getTipoResidencia() {
		return tipoResidencia;
	}

	public void setTipoResidencia(String tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}

	public float getValorImovel() {
		return valorImovel;
	}
	
	
	
	/**
	 * 
	 * @param valorImovel Configura o valor do imovel
	 * @return 
	 */
	

	public float setValorImovel(float valorImovel) {
		// Valor do imovel obtido após realizar o aumento
		float valorFinal = 0;
		
		if( this.zona == 1 /* mora na zona urbana*/){
			valorFinal = (float) (getValor() * 0.02);
			
			
		}
		else if(this.zona == 2){
			valorFinal = (float) (getValor() * 0.01);
			
		}
		else if(this.zona == 3){
			valorFinal = (float) (getValor() * 0.005);
			
		}
		else{
			valorFinal = (float) (getValor() * 0.005);
		}
		
		
		return this.valorImovel = valorFinal;
	}

}
