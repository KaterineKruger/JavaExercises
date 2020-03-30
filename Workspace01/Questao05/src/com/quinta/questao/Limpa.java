package com.quinta.questao;

public class Limpa implements ILimpa {

	@Override
	public String limpar(String string, String substring) {
		// Variáveis.
		String retorno = "";
		String flag;
		int tamanhoT = string.length();
		int tamanhoV = substring.length();
		int i2;

		// Percorrer as letras da String de entrada.
		for (int i = 0; i < tamanhoT; i++) {

			// Evita comparativo quando o restante a comparar da string de entrada é menor
			// que o tamanho da variável velho.
			if (i > (tamanhoT - tamanhoV + 1)) {
				// Acrescenta a letra atual ao retorno.
				retorno = retorno + string.charAt(i);
				continue;
			}

			// Índice do loop interno comparativo do trecho da String de entrada com
			// variável velho.
			i2 = 0;

			// Controle de encontro de diferença.
			flag = "";

			// Loop para comparar o trecho da posição atual em diante do mesmo tamanho da
			// variável velho com a própria variável velho.
			while (i2 < tamanhoV) {

				// Caso encontre uma letra diferente, já descarta.
				if (string.charAt(i + i2) != substring.charAt(i2)) {
					flag = "*";
					break;
				}

				i2++;

			}

			/*
			 * Caso o flag esteja com *, encontrou diferença e apenas adiciona a posição
			 * atual ao retorno e inicia novo comparativo na posição seguinte.
			 */
			if (flag == "*") {
				retorno = retorno + string.charAt(i);
				continue;
			}

			// Caso não encontrou diferença, pula o tamanho da variável substring - 1.
			// retorno = retorno + novo;
			i = i + tamanhoV - 1;
		}

		System.out.println(retorno);
		return retorno;
	}

}