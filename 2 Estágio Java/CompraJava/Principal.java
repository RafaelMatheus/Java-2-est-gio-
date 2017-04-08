/**
 * Classe com main que simula um registrador de vendas
 * @author: alvaro.santos
 * @author rafael.matheus
 * @date: 31 de mar de 2017
 */

public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Instanciando objetos
		 */
		
		Produto produto[] = new Produto[3];
		Vendedor vendedor[] = new Vendedor[3];
		Venda venda[] = new Venda[3];
		
		/**
		 * Primeira parte do projeto
		 */
		
		/***********************************************************************************************************/
		
		produto[0] = new Produto("0000001", "Calça Jeans", 50.0, 20.0, false);
		vendedor[0] = new Vendedor("Alvaro", "0001", "Rua do Ipê");
		venda[0] = new Venda(produto[0], vendedor[0], 2);
		
		System.out.println("\n-----------------------------------------------------------------------------------");
				
		venda[0].calcularValor(venda[0].getQuantidadeItens(), produto[0].getValorVenda(), venda[0].getDesconto());
		System.out.println("Comissao do Vendedor:" + venda[0].getVendedor().getCOMISSAO() + "%");
		
		venda[0].imprimir();
		
		System.out.println("\n-----------------------------------------------------------------------------------");
		
		/***********************************************************************************************************/
		
		
		/**
		 * Segunda parte do projeto
		 */
		
		/***********************************************************************************************************/
		
		produto[1] = new Produto("0000002", "Camisa Polo", 100.0, 80.0, true);
		vendedor[1] = new Vendedor("Philipe", "0002", "Rua dos Guararapes");
		venda[1] = new Venda(produto[1], vendedor[1], 3);
		
		venda[1].efetuarDesconto(10);
		venda[1].calcularValor(venda[1].getQuantidadeItens(), produto[1].getValorVenda(), venda[1].getDesconto());
		System.out.println("\n\nComissao do Vendedor: " + venda[1].getVendedor().getCOMISSAO() + "%");
		
		venda[1].imprimir();
		
		System.out.println("\n-----------------------------------------------------------------------------------");
		
		/***********************************************************************************************************/
		
		/**
		 * Terceira parte do projeto
		 */
		
		/***********************************************************************************************************/
		
		venda[2] = new Venda(produto[1], vendedor[1], 2);
		
		venda[2].efetuarDesconto(30);
		venda[2].calcularValor(venda[2].getQuantidadeItens(), produto[1].getValorVenda(), venda[2].getDesconto());
		System.out.println("\n\nComissao do Vendedor: " + venda[2].getVendedor().getCOMISSAO() + "%");
		
		venda[2].imprimir();
		
		System.out.println("\n-----------------------------------------------------------------------------------");
		
		/***********************************************************************************************************/
	}
}