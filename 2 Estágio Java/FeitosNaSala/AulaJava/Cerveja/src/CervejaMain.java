import java.util.Scanner;

public class CervejaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		MetodosCervejas cerveja = new MetodosCervejas();
		System.out.print("informe a quantidade de cervejas disponiveis no momento: ");
		int qntCervejasMomento = leitor.nextInt();

		cerveja.pegarCervejas(qntCervejasMomento);

	}

}
