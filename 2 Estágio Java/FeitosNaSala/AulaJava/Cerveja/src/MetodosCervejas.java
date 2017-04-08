import java.util.Scanner;
public class MetodosCervejas {
	Scanner leitor = new Scanner(System.in);
	
	public void pegarCervejas(int qntCervejas){	
		while(qntCervejas > 0){
			qntCervejas -=1;
			System.out.println("Pegando uma cerveja da geladeira, restam apenas " + qntCervejas);			
			
			if(qntCervejas == 2){
				System.out.println("cervejas quase acabando");
				System.out.println("deseja comprar mais? se sim digite 1 em seguida a quantidade, ou 0 para sair: ");
			
				int opc = leitor.nextInt();
				switch (opc){
					case 1: 
						System.out.println("informe a quantidade de cervejas renovada:  ");
						qntCervejas = leitor.nextInt();
						break;
				
					case 0:
						System.out.println("até mais! ");
						break;
				
					default:
						System.out.println("Digite uma opção válida, apenas 0 ou 1");
						break;
				
				
				}
			
			
		}
		
		
		
		
	}
}

}