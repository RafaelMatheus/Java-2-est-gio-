import java.util.Scanner;
public class ExecutaCalculoMedia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		ObterMedia media = new ObterMedia();
		System.out.println("informe as duas medias: ");
		float n1 = leitor.nextFloat();
		float n2 = leitor.nextFloat();
		
		System.out.println(media.obterMedia(n1, n2));
		

	

	}
}