
/**
 * Classe que cadastra vendedores
 * @author: alvaro.santos
 * @author rafael.matheus
 * @date: 31 de mar de 2017
 */

public class Vendedor {
	
	// Atributos
	
	private String nome;
	private String codigo;
	private final int COMISSAO = 5; // CONSTANTE
	private String endereco;

	// Método Construtor
	
	public Vendedor(String nome, String codigo, String endereco) {
		this.nome = nome;
		this.codigo = codigo;
		this.endereco = endereco;
	}
	
	// Métodos Acessores e Modificadores
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public int getCOMISSAO() {
		return COMISSAO;
	}
}