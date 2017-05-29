
public class Cliente {

	boolean pessoaFisica;
	boolean pessoaJuridica;
	boolean contratoResidencial;
	boolean contratoEmpresarial;

	public boolean isPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(boolean pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public boolean isPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(boolean pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	public boolean isContratoResidencial() {
		return contratoResidencial;
	}

	public void setContratoResidencial(boolean contratoResidencial) {
		this.contratoResidencial = contratoResidencial;
	}

	public boolean isContratoEmpresarial() {
		return contratoEmpresarial;
	}

	public void setContratoEmpresarial(boolean contratoEmpresarial) {
		this.contratoEmpresarial = contratoEmpresarial;
	}

}
