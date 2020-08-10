


import java.util.Scanner;

public class Jogador {
	
	void jogar(Tabuleiro tab) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Jogada do humano
		System.out.println("\nEscolha sua posicao: ");
		System.out.println();
		int i = teclado.nextInt();
		int j = teclado.nextInt();
		System.out.println();
		tab.mat[i][j] = 1; 
	}
	
}