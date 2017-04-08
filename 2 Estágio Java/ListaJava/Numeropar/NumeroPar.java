package ListaJava;

import java.util.Scanner;

public class NumeroPar {
	public static void main() {
		Scanner leitor = new Scanner(System.in);
		CalculaNumero numero = new CalculaNumero();
		for (int c = 0; c < 10; c++) {
			System.out.println("Informe um numero" + c );
			int num = leitor.nextInt();
			System.out.println(numero.realizaOperacao(num));

		}

	}
}
