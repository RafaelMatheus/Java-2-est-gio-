
public class Empresarial extends Contrato{
	Cliente cliente;
	private float valorImovel;
	private int numFunc;
	private int numVis;
	private boolean ramo;

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
		float valorFinal = 0;
		
		valorFinal = (float) (getValor() * 0.04);
		
		if(ramo == true /* se for industria */){
			valorFinal *= 0.01;
			
		}
	
		else if(ramo == false ){
			valorFinal *= 0.01;
			
		}
		 
		
		
		this.valorImovel = valorFinal;
	}

	public int getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}

	public int getNumVis() {
		return numVis;
	}

	public void setNumVis(int numVis) {
		this.numVis = numVis;
	}

	public boolean getRamo() {
		return ramo;
	}

	public void setRamo(boolean ramo) {
		this.ramo = ramo;
	}

}
