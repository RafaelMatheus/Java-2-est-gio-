import java.util.Scanner;
public class ExecutaCalculo {
	/**
	 * Executa o calculo da distancia 
	 */
	public static void main(){
	Scanner leitor = new Scanner(System.in);
	ObterDistancia obter = new ObterDistancia();
	System.out.println("Informe o tempo e a distancia na ordem ");
	
	float tempo = leitor.nextFloat();
	float distancia = leitor.nextFloat();
	System.out.println("a distancia é " + obter.MediaGastos(distancia, tempo));
	

	}
}
