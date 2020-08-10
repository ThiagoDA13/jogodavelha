



import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Tabuleiro tab =new Tabuleiro();
		Jogador jogador = new Jogador();
		Scanner teclado = new Scanner(System.in);
		
		// Inicio
		System.out.println("Jogo da Velha\n");
		System.out.println("Escolha o n�vel: ");
		System.out.println("1 - F�cil");
		System.out.println("2 - M�dio");
		System.out.println("3 - Dif�cil");
		int opcao = teclado.nextInt();
		
		
		Comp comp=null;
		
		// Escolha do nivel
		switch(opcao){
			case 1: comp= new Comp1(); 
				System.out.println("\nN�vel 1: ");
				System.out.println();
				break;
			case 2: comp= new Comp2(); // HORIZONTAL
				System.out.println("\nN�vel 2: ");
				System.out.println();
				break;
			case 3: comp= new Comp3(); // DIAGONAL
				System.out.println("\nN�vel 3: ");
				System.out.println();
				break;
		}
		
		
		int vez=1;
		
		tab.visualizar();
		
		while(tab.decisao()==0) {
			
			if(vez==1) { // Vez do jogador
				jogador.jogar(tab);
				vez = 2;
			}
			else if(vez==2) { // Vez do computador
				System.out.println("\nMaquina jogou");
				System.out.println();
				comp.jogar(tab);
				vez = 1;
			}
			
			tab.visualizar();
		}
		
		// Mostra quem ganhou ou se deu velha
		if (tab.decisao() == 1) {
			System.out.println("Voce venceu!");
		}else if(tab.decisao()== -1) {
			System.out.println("Maquina venceu!");
		}else if(tab.decisao()==2) {
			System.out.println("Velha");
		}
	}
}
