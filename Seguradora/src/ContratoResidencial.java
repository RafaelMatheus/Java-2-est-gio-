
public class ContratoResidencial {
	private Cliente cliente;
	private String endereco;
	private float valorImovel;
	private int tipoZona; // Urbana, Suburbana ou rural. 1 para Zona urbana , 2
							// suburbana , 3 rural
	private int apartamentoOuCasa;

	public void calcularSeguro() {
		float aux; // ajuda quando for setar o valor do imovel
		try {

			if (getTipoZona() == 1) {
				aux = (float) (this.valorImovel * 0.02);
				aux = (float) (aux + (this.valorImovel * 0.05)); // O aumento no
																	// valor do
																	// imovel
																	// quando
																	// for uma
																	// casa é de
																	// 5
																	// porcento

				setValorImovel(aux);

			}

			if (getTipoZona() == 2) {
				aux = (float) (this.valorImovel * 0.02);
				aux = (float) (aux + (this.valorImovel * 0.05));// caso seja
																// suburbana
				setValorImovel(aux);
			}

			if (getTipoZona() == 3) {

				aux = (float) (this.valorImovel * 0.02);
				aux = (float) (aux + (this.valorImovel * 0.01));// caso seja
																// rural
				setValorImovel(aux);
			}

		} catch (NullPointerException e) {
			System.out.println("Informe um valor válido, apenas 1,2 ou 3");
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(float valorImovel) {
		this.valorImovel = valorImovel;
	}

	public int getTipoZona() {
		return tipoZona;
	}

	public void setTipoZona(int tipoZona) {
		this.tipoZona = tipoZona;
	}

	public int getApartamentoOuCasa() {
		return apartamentoOuCasa;
	}

	public void setApartamentoOuCasa(int apartamentoOuCasa) {
		this.apartamentoOuCasa = apartamentoOuCasa;
	}

}
