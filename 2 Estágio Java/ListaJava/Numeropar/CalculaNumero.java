package ListaJava;

public class CalculaNumero {
	/**
	 * 
	 * @param numero pega o numero para realizar o calculo
	 * @return me retorna 1 caso o numero for par
	 * e 0 caso o numero seja impar 
	 */
	int realizaOperacao(int numero){
		
		if ((numero % 2)== 0 ){
			System.out.println("Numero par ");
			return 1;
		}
		else{
			System.out.println("Numero impar ");
			return 0;
		}
		
		
	}

}
