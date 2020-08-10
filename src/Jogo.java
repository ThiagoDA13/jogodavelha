



import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Tabuleiro tab =new Tabuleiro();
		Jogador jogador = new Jogador();
		Scanner teclado = new Scanner(System.in);
		
		// Inicio
		System.out.println("Jogo da Velha\n");
		System.out.println("Escolha o nível: ");
		System.out.println("1 - Fácil");
		System.out.println("2 - Médio");
		System.out.println("3 - Difícil");
		int opcao = teclado.nextInt();
		
		
		Comp comp=null;
		
		// Escolha do nivel
		switch(opcao){
			case 1: comp= new Comp1(); 
				System.out.println("\nNível 1: ");
				System.out.println();
				break;
			case 2: comp= new Comp2(); // HORIZONTAL
				System.out.println("\nNível 2: ");
				System.out.println();
				break;
			case 3: comp= new Comp3(); // DIAGONAL
				System.out.println("\nNível 3: ");
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
