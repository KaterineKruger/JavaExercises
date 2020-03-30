package com.decima.questao;

public class Main {

	public static void main(String[] args) {
                char [][] entrada = new char[3][3];
		entrada[0][0] = 'X';
		entrada[0][1] = '_';
		entrada[0][2] = 'X';
		entrada[1][0] = 'O';
		entrada[1][1] = 'O';
		entrada[0][2] = '_';
		entrada[2][0] = '_';
		entrada[2][1] = 'O';
		entrada[2][2] = 'X';

		JogoVelha jv = new JogoVelha();
		jv.verificaGanhador(char tabuleiro[][]);
		
	}

}