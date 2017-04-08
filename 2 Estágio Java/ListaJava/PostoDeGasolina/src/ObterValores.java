import java.util.Scanner;


public class ObterValores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		informacoes info = new informacoes();
		Scanner leitor = new Scanner(System.in);
		System.out.println("informe a quantidade de litros de gasolina e em seguida a quantidade de refrigerates");
		float qntGasolina = leitor.nextFloat();
		int qntRefri = leitor.nextInt();

		float result = info.realizaCalculoGasolina(qntGasolina) + info.realizaCalculoRefrigerante(qntRefri);
		
		System.out.println("O valor do resultado é :  "+ result);
	}

}
