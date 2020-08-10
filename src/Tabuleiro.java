

public class Tabuleiro {
	public int mat[][] = new int[3][3];
	

	
	public int decisao() {
		
			// Vencedor humano horizontal
				if (mat [0][0] == 1 && mat [0][1] == 1 && mat[0][2] == 1) { ;
				return 1;
			} else if(mat [1][0] == 1 && mat [1][1] == 1 && mat[1][2] == 1) {
				return 1;
			} else if (mat [2][0] == 1 && mat [2][1] == 1 && mat[2][2] == 1) {
				return 1;
			}
				
				// Vencedor humano vertical
			  else if (mat [0][0] == 1 && mat [1][0] == 1 && mat[2][0] == 1) {
				return 1;
			}else if (mat [0][1] == 1 && mat [1][1] == 1 && mat[2][1] == 1) {
				return 1;
			}else if (mat [0][2] == 1 && mat [1][2] == 1 && mat[2][2] == 1) {
				return 1;
			}
				
				// Vencedor humano diagonal
			 else if(mat [0][0] == 1 && mat [1][1] == 1 && mat[2][2] == 1) {
				return 1;
			}else if (mat [0][2] == 1 && mat [1][1] == 1 && mat[2][0] == 1) {
				return 1;
			}
				
			// vencedor computador horizontal
			else if (mat[0][0] == -1 && mat[0][1] == -1 && mat[0][2] == -1) { 
		        return -1;
		    } else if (mat[1][0] == -1 && mat[1][1] == -1 && mat[1][2] == -1) {
		        return -1;
		    } else if (mat[2][0] == -1 && mat[2][1] == -1 && mat[2][2] == -1) {
		        return -1;
		    }
				
				// vencedor computador vertical
		      else if (mat[0][0] == -1 && mat[1][0] == -1 && mat[2][0] == -1) { 
		        return -1;
		    } else if (mat[0][1] == -1 && mat[1][1] == -1 && mat[2][1] == -1) {
		        return -1;
		    } else if (mat[0][2] == -1 && mat[1][2] == -1 && mat[2][2] == -1) { 
		        return -1;
		    }
				// vencedor computador diagonal
		      else if (mat[0][0] == -1 && mat[1][1] == -1 && mat[2][2] == -1) { 
		        return -1;
		    } else if (mat[0][2] == -1 && mat[1][1] == -1 && mat[2][0] == -1) {
		        return -1;										
		    } 
		    
			// DETERMINA O EMPATE COM TODOS OS CAMPOS PREENCHIDOS
		    else if(mat[0][0] != 0 && mat[0][1] != 0 && mat[0][2] != 0 && 
					mat[1][0] != 0 && mat[1][1] != 0 && mat[1][2] != 0 && 
					mat[2][0] != 0 && mat[2][1] != 0 && mat[2][2] != 0) {
		    	return 2;
		    }
		
		return 0;
    }
		
	// Mostra tabuleiro
	public void visualizar() {
		
		for (int i = 0; i < mat.length; i++) { 		
			for (int j = 0; j < mat.length; j++) {	
				if(mat[i][j]==1) {
					System.out.print("X "); 
				}
				else if(mat[i][j]==-1) {
					System.out.print("O "); 
				}
				else {
					System.out.print("- "); 
				}
			}
			System.out.println();
		}
	}
}
