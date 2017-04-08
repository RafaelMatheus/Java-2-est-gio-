
public class ObterValores {
	/**
	 * 
	 * @param salario 
	 * @param valorParcela
	 * @return caso ocorra tudo bem o retorno será 1
	 */

	int validaCredito(float salario, float valorParcela){
		/**
		 * O calculo foi com base na regrinha de 3 onde o
		 * retorno para variavel resultado será 
		 * a porcentagem do valor da parcela em relação
		 * ao salario
		 */
		float resultado = (valorParcela/100)/salario;
		resultado = resultado*1000;
		
		if(resultado >= 3.0 /*equivale a 30 porcento*/ ){
			
			return 1;
			
		}
		else{
			return 0;
		}
			
		
		
	}

}
