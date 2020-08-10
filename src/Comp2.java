

public class Comp2 extends Comp {
	// Nivel 2

	public void jogar(Tabuleiro tab) {
		
		if (tab.mat[0][0] == 0 && tab.mat[0][0] != 1)
			tab.mat[0][0] = -1;
		
		else if (tab.mat [0][1]== 0 && tab.mat[0][1] != 1) 
			tab.mat[0][1] = -1;
		
		else if (tab.mat [0][2] == 0 && tab.mat[0][2] != 1) 
			tab.mat[0][2] = -1;
		
		else if (tab.mat [1][0] == 0 && tab.mat[1][0] != 1) 
			tab.mat[1][0] = -1;
		
		else if (tab.mat [1][1] == 0 && tab.mat[1][1] != 1) 
			tab.mat[1][1] = -1;
		
		else if (tab.mat [1][2] == 0 && tab.mat[1][2] != 1) 
			tab.mat[1][2] = -1;
		
		else if (tab.mat [2][0] == 0 && tab.mat[2][0] != 1) 
			tab.mat[2][0] = -1;
		
		else if (tab.mat [2][1] == 0 && tab.mat[2][1] != 1) 
			tab.mat[2][1] = -1;
		
		else if (tab.mat [2][2] == 0 && tab.mat[2][2] != 1) 
			tab.mat[2][2] = -1;

	}}
