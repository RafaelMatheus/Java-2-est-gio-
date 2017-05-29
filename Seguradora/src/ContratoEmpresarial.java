
public class ContratoEmpresarial {
	
	private Cliente cliente;
	private float valorImovel;
	private int numeroDeFuncionarios;// O numero de funcionarios que trabalham no total
	private int numeroDeVisitas; //Recebe o numero de visitas diariamente
	private int Ramo; // Recebe o ramo se é comercio, industria, agropecuaria 
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(float valorImovel) {
		this.valorImovel = valorImovel;
	}
	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}
	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	public int getNumeroDeVisitas() {
		return numeroDeVisitas;
	}
	public void setNumeroDeVisitas(int numeroDeVisitas) {
		this.numeroDeVisitas = numeroDeVisitas;
	}
	public int getRamo() {
		return Ramo;
	}
	public void setRamo(int ramo) {
		Ramo = ramo;
	}
	
	
}
