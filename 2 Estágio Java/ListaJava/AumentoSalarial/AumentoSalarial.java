package ListaJava;
/**
 * @author rafael
 *
 */
public class AumentoSalarial {
	/**
	 * 
	 * @param salario Recebe o sálario 
	 * @param aumento Recebe o valor do aumento em porcentagem 
	 * @return retorna a soma do valor do aumento obtido após o termino do calculo 
	 */
	float calculaAumento(float salario, float aumento){
		int porcentagemTotalDoSalario = 100;
		
		float valorAumento = (salario * aumento)/porcentagemTotalDoSalario;
		/**
		 * Uma regra de três
		 */
		return valorAumento + salario;
		
		
	}
	
	
	
}
