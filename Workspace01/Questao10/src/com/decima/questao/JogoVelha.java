package com.decima.questao;

public class JogoVelha implements IJogoVelha {

	@Override
	public char verificaGanhador(char[][] tabuleiro) throws Exception {
		
		tabuleiro = new char[3][3];
		char vencedor = '_';
	    		
		if (((tabuleiro [1][1] != 'X') && (tabuleiro [1][1] != 'O') && (tabuleiro [1][1] != '_')) ||
         	       ((tabuleiro [0][1] != 'X') && (tabuleiro [0][1] != 'O') && (tabuleiro [0][1] != '_')) ||
         	       ((tabuleiro [0][2] != 'X') && (tabuleiro [0][2] != 'O') && (tabuleiro [0][2] != '_')) ||
         	       ((tabuleiro [1][0] != 'X') && (tabuleiro [1][0] != 'O') && (tabuleiro [1][0] != '_')) ||
         	       ((tabuleiro [1][1] != 'X') && (tabuleiro [1][1] != 'O') && (tabuleiro [1][1] != '_')) ||
         	       ((tabuleiro [1][2] != 'X') && (tabuleiro [1][2] != 'O') && (tabuleiro [1][2] != '_')) ||
         	       ((tabuleiro [2][0] != 'X') && (tabuleiro [2][0] != 'O') && (tabuleiro [2][0] != '_')) ||
         	       ((tabuleiro [2][1] != 'X') && (tabuleiro [2][1] != 'O') && (tabuleiro [2][1] != '_')) ||
         	       ((tabuleiro [2][2] != 'X') && (tabuleiro [2][2] != 'O') && (tabuleiro [2][2] != '_'))){
	    		System.exit(0);
	    		throw new Exception("Erro");
	    	}
  
			//-> Testar considerando que o 1,1 tenha X ou O
	    	if ((tabuleiro [0][0] != '_') && 
	    			(((tabuleiro [0][0] == tabuleiro [0][1]) && (tabuleiro [0][0] == tabuleiro [0][2])) ||
	    	        ((tabuleiro [0][0] == tabuleiro [1][1]) && (tabuleiro [0][0] == tabuleiro [2][2])) ||
	    	        ((tabuleiro [0][0] == tabuleiro [1][0]) && (tabuleiro [0][0] == tabuleiro [2][0])))){
	    		vencedor = tabuleiro [1][1];	
	    	}
	    
	    	//-> Testar considerando que o 1,2 tenha X ou O
	    	if ((tabuleiro [0][1] != '_') &&
	    			((tabuleiro [0][1] == tabuleiro [1][1]) && (tabuleiro [0][1] == tabuleiro [2][1]))){
	    		if ((vencedor != '_') && (vencedor != tabuleiro [0][1])){
	    			System.exit(0);
	    			throw new Exception("Erro"); // ERRO DE VENCEDOR DIFERNTE DO IF ANTERIOR
	    		}
        		vencedor = tabuleiro [0][1]; // MESMO SE JA TEM VENCEDOR, SE FOR IGUAL PODE SOBREPOR SEM PROBLEMAS
	    	}
	
	    	//-> Testar considerando que o 3,1 tenha X ou O
	    	if ((tabuleiro [0][2] != '_') && 
	    			(((tabuleiro [0][2] == tabuleiro [1][2]) && (tabuleiro [0][2] == tabuleiro [2][2])) ||
                    ((tabuleiro [0][2] == tabuleiro [1][1]) && (tabuleiro [0][2] == tabuleiro [2][0])))){
	    		if ((vencedor != '_') && (vencedor != tabuleiro [0][2])){
	    			System.exit(0);
	    			throw new Exception("Erro"); // ERRO DE VENCEDOR DIFERNTE DO IF ANTERIOR
	    		}
        		vencedor = tabuleiro [0][2]; // MESMO SE JA TEM VENCEDOR, SE FOR IGUAL PODE SOBREPOR SEM PROBLEMAS
	        }
	    	
	    	//-> Testar considerando que o 2,1 tenha X ou O
	    	if ((tabuleiro [1][0] != '_') &&
	    			((tabuleiro [1][0] == tabuleiro [1][1]) && (tabuleiro [1][0] == tabuleiro [1][2]))){
	    		if ((vencedor != '_') && (vencedor != tabuleiro [1][0])){
	    			System.exit(0);
	    			throw new Exception("Erro"); // ERRO DE VENCEDOR DIFERNTE DO IF ANTERIOR
	    		}
        		vencedor = tabuleiro [1][0]; // MESMO SE JA TEM VENCEDOR, SE FOR IGUAL PODE SOBREPOR SEM PROBLEMAS
	    	}
	    
	    	//-> Testar considerando que o 3,1 tenha X ou O
	    	if ((tabuleiro [2][0] != '_') &&
	    			((tabuleiro [2][0] == tabuleiro [2][1]) && (tabuleiro [2][0] == tabuleiro [2][2]))){
	    		if ((vencedor != '_') && (vencedor != tabuleiro [2][0])){
	    			System.exit(0);
	    			throw new Exception("Erro"); // ERRO DE VENCEDOR DIFERNTE DO IF ANTERIOR
	    		}
        		vencedor = tabuleiro [2][0]; // MESMO SE JA TEM VENCEDOR, SE FOR IGUAL PODE SOBREPOR SEM PROBLEMAS
	    	}
	    
	    return vencedor;		
			
		}
}