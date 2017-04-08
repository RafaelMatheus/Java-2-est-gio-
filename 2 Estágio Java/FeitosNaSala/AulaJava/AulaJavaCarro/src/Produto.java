
public class Produto {
	private String id;
	private String nome;
	private String modelo;
	private String descricao;
	private String cor;

	public void cadastrar(){
		System.out.println("Cadastrando...");
		
	}
	public void atualizar(){
		System.out.println("atualizando...");
		
	}
	public void excluir(){
		System.out.println("excluindo...");
		
	}
	public void listar(){
		System.out.println("listando...");
		

}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	}
