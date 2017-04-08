/** 
 * Classe que efetua as vendas
 * @author: alvaro.santos
 * @author rafael.matheus
 * @date: 31 de mar de 2017
 * 
 */

public class Venda {
	
	// Atributos
	
	private Produto produto;
	private Vendedor vendedor;
	private double desconto;
	private int quantidadeItens;
	private double valor;
	
	// Métodos Especiais
	
	/**
	 * Método que efetua o desconto sobre uma venda
	 * 
	 * @param pDesconto porcentagem do desconto
	 * 
	 */
	
	public void efetuarDesconto(int pDesconto) {
		
		double desconto = 0.0;
		
		double valorFinal = 0.0;
		
		double valorVenda = produto.getValorVenda();
		
		desconto = (valorVenda * pDesconto) / 100;
		
		valorFinal = valorVenda - desconto;
		
		if (valorFinal < produto.getValorCusto()) {
			System.out.println("\n\nATENÇÃO: O valor do produto com desconto não pode ser menor que o valor de custo.");
			this.setDesconto(valorFinal);
		}
	}

	/**
	 * Método que calcula o valor da venda
	 * 
	 * @param quantItens quantidade de itens
	 * @param vlrVenda valor da venda
	 * @param valor do desconto
	 * 
	 */
	
	public void calcularValor(int quantItens, double vlrVenda, double desconto) {
		
		double valorVenda = 0.0;
		
		valorVenda = (vlrVenda * quantItens) - desconto;
		
		this.setValor(valorVenda);
		
	}

	/**
	 * Método que calcula a comissão do vendedor em relação a uma venda
	 * 
	 * @param vlrVenda valor da venda
	 * @param quantItens quantidade de itens
	 * @param comissaoVendedor comissao do vendedor em relação as vendas
	 * @param pPromocao indica se o produto está ou não em promoção
	 * 
	 * @return comissao valor calculado da comissao em relação a venda efetuada
	 * 
	 */
	
	public double calcularComissao(double vlrVenda, int quantItens, double comissaoVendedor, boolean pPromocao) {
		
		double comissao = 0.0;
		
		comissao = (vlrVenda * quantItens * comissaoVendedor) / 100;
		
		if (pPromocao == true) {
			
			comissao = comissao / 2;
			
		}
		
		return comissao;
	}
	
	/**
	 * Método que imprime os dados do vendedor e da venda
	 */
	
	public void imprimir() {
		
		System.out.println("----------------------------------------------------------");
		System.out.println("# Dados do Vendedor");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Código: " + vendedor.getCodigo());
		System.out.println("Nome: " + vendedor.getNome());
		System.out.printf("Comissão pela Venda: R$ %.2f\n", this.calcularComissao(produto.getValorVenda(), this.getQuantidadeItens(), vendedor.getCOMISSAO(), produto.isPromocao()));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("# Dados da Venda");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Quantidade de produtos: " + this.getQuantidadeItens());
		System.out.println("Código do produto: " + produto.getCodigo());
		System.out.println("Descrição do produto: " + produto.getDescricao());	
		System.out.printf("Valor de venda: R$ %.2f\n",  produto.getValorVenda());

		if (produto.isPromocao() == false) {
			System.out.println("Promoção: Não");
		} else {
			System.out.println("Promoção: Sim");
		}
				
		System.out.printf("Valor de desconto sobre o produto: R$ %.2f\n", this.getDesconto());
		System.out.printf("Valor total da venda: R$ %.2f\n ", this.getValor());
		
	}
	
	// Método Construtor
	
	public Venda(Produto produto, Vendedor vendedor, int quantidadeItens) {
		this.produto = produto;
		this.vendedor = vendedor;
		this.quantidadeItens = quantidadeItens;
	}
	
	// Métodos Acessores e Modificadores
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}