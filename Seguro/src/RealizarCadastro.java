import java.util.Scanner;


public class RealizarCadastro {
	
	static int menu(){
		Scanner leitor = new Scanner(System.in);
		int opc = 0;
		System.out.println("\n1- Para realizar cadastro de cliente");
		System.out.println("\n2- Para cadastro de contratos \n3- Para lista de clientes \n");
		 
		opc = leitor.nextInt();
		
		
		return opc;
		
		
		
	}
	
	static int obterPessoaFisica(PessoaFisica pessoaFisica){
		Scanner leitor = new Scanner(System.in);
		String cpf = null;
		String nome = null;
		String end = null;
		
		System.out.println("Informe seu cpf: ");
		
		cpf = leitor.nextLine();
		
		System.out.println("Informe seu nome: ");
		
		nome = leitor.nextLine();
		
		System.out.println("Informe seu endereco: ");
		
		end = leitor.nextLine();

		pessoaFisica.setCpf(cpf);
		pessoaFisica.setNome(nome);
		pessoaFisica.setEndereco(end);
		
		
		return 0;
		
		
	}

	
	static void obterPessoaJuridica(PessoaJuridica pessoaJuridica){
			Scanner leitor = new Scanner(System.in);	
			String cnpj = null;
			String nome = null;
			String end = null;
		
			System.out.println("Informe seu cnpj: ");
			
			cnpj = leitor.nextLine();
			
			System.out.println("Informe seu nome: ");
			
			nome = leitor.nextLine();
			
			System.out.println("Informe seu endereco: ");
			
			end = leitor.nextLine();
			
			pessoaJuridica.setCnpj(cnpj);
			pessoaJuridica.setEndereco(end);
			pessoaJuridica.setNome(nome);
		
		
		}
	
		/**
		 * 
		 * @param residencial
		 * @param valorImovelAtual Recebe o valor bruno do imovel para calcular mais a frente 
		 */
	
		 static void obterContratoResidencial(Residencial residencial, float valorImovelAtual){
			/**
			 * 
			 * valorFinal recebe o calculo do valor acrescentado do juros
			 */
			Scanner leitor = new Scanner(System.in);
			int localResidencia;
			float valorFinal;
			residencial.setValor(valorImovelAtual);
			
			System.out.println("Informe 1 para urbana\n 2 Para suburbana\n 3 se for casa");
			localResidencia = leitor.nextInt();
			
			residencial.setZona(localResidencia);
			
			residencial.setValorImovel(valorImovelAtual);
			
			valorFinal = residencial.setValorImovel(valorImovelAtual);
			
			
			
			
		}
	
		
		 static void obterContratoEmpresarial(Empresarial empresarial, float valorAtual){
			 int numFunc = 0;
			 int numVis = 0;
			 int ramo;
			 
			 Scanner leitor = new Scanner(System.in);
			 System.out.println("informe o numero de funcionarios e de visitas: ");
			 
			 numFunc = leitor.nextInt();
			 numVis = leitor.nextInt();
			 
			 
			 System.out.println("Informe o ramo da sua empresa 1 para comercio 2 para industria: ");
			 
			 ramo = leitor.nextInt();
			 
			 empresarial.setRamo(ramo);
			 
			 empresarial.setRamo(ramo);
			 empresarial.setValor(valorAtual);
			 
			 empresarial.setNumFunc(numFunc);
			 empresarial.setNumVis(numVis);
			 
			 empresarial.setValorImovel(valorAtual); // realiza todo calculo para calcular o valor atual do imovel
			 
			 
		 }
		 
		 
		 

		
		 
	public static void main(String[] args) {
		int tipoImovel = 0;
		int tipoPessoa; // Se Pessoa Fisica ou juridica 
		String nomePessoa;
		int re = 0;
		
		int opcSair = 0;
		Scanner leitor = new Scanner(System.in);
		Residencial residencial = new Residencial();
		Empresarial empresarial = new Empresarial();
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		PessoaFisica pessoaFisica = new PessoaFisica();
		
		
		do{
	
			do{
		int opc = menu();
		
		switch(opc){
		
		
		
		case 1:	
			System.out.println("Por favor, responda apenas 1 se sim ou 2 se não");
			System.out.println("Voce e pessoa fisica? ");
			tipoPessoa = leitor.nextInt();
			if(tipoPessoa == 1){
				obterPessoaFisica(pessoaFisica);
						
				
				
			}
			else if(tipoPessoa == 2){
				obterPessoaJuridica(pessoaJuridica);
				
				
			}
			
			
			break;
			
		
			
		case 2:
			System.out.println("Informe o tipo de imovel, 1 para residencial 2 para empresarial: ");
			tipoImovel = leitor.nextInt();
			if(tipoImovel == 1){
			System.out.println("Informe o valor atual do imovel: ");
			float valorAtual = leitor.nextFloat();
			
			obterContratoResidencial(residencial, valorAtual);
			}
			
			
			else if (tipoImovel ==2){
				System.out.println("Informe o valor atual do imovel: ");
				
				float valorAtual = leitor.nextFloat(); // guarda o valor atual passado na referencia da função
				//ObterContratoEmpresarial
				
				obterContratoEmpresarial(empresarial, valorAtual);
	
				
			}
			else{
				System.out.println("Informe um valor valido ");
				
			}
			break;
			
		case 3:
			System.out.println("Seu cadastro foi de pessoa fisica? sim 1 nao 2");
			int cad = leitor.nextInt();
			
			if(cad == 1){
			System.out.println("              Pessoa fisica");
			System.out.println("Nome: " + pessoaFisica.getNome());
			System.out.println("Cpf: "+ pessoaFisica.getCpf());
			System.out.println("Endereço: " + pessoaFisica.getEndereco());
			System.out.println("Valor final: " + residencial.getValorImovel()*100);
			System.out.println("--------------------------------------------------");
			}
			
			
			else if(cad == 2){
				System.out.println("              Pessoa juridica");
				System.out.println("Nome: " + pessoaJuridica.getNome());
				System.out.println("Cnpj: "+ pessoaJuridica.getCnpj());
				System.out.println("Endereço: " + pessoaJuridica.getEndereco());
				System.out.println("Valor final: " + residencial.getValorImovel()*100);
				System.out.println("--------------------------------------------------");
					
			}
			
			break;
			
			
			
			
		}
		System.out.println("Deseja realizar outra opc? para sair digite -1 ou qualquer outro valor para continuar  ");
		re = leitor.nextInt();
			}while(re != -1);
			
			
			System.out.println("Digite -1 sair para sair do programa: ");
			opcSair = leitor.nextInt();
		}while(opcSair!= -1);
		
		
	}

}
