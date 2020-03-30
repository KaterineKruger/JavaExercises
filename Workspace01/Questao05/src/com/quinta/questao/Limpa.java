package com.quinta.questao;

public class Limpa implements ILimpa {

	@Override
	public String limpar(String string, String substring) {
		// Vari�veis.
		String retorno = "";
		String flag;
		int tamanhoT = string.length();
		int tamanhoV = substring.length();
		int i2;

		// Percorrer as letras da String de entrada.
		for (int i = 0; i < tamanhoT; i++) {

			// Evita comparativo quando o restante a comparar da string de entrada � menor
			// que o tamanho da vari�vel velho.
			if (i > (tamanhoT - tamanhoV + 1)) {
				// Acrescenta a letra atual ao retorno.
				retorno = retorno + string.charAt(i);
				continue;
			}

			// �ndice do loop interno comparativo do trecho da String de entrada com
			// vari�vel velho.
			i2 = 0;

			// Controle de encontro de diferen�a.
			flag = "";

			// Loop para comparar o trecho da posi��o atual em diante do mesmo tamanho da
			// vari�vel velho com a pr�pria vari�vel velho.
			while (i2 < tamanhoV) {

				// Caso encontre uma letra diferente, j� descarta.
				if (string.charAt(i + i2) != substring.charAt(i2)) {
					flag = "*";
					break;
				}

				i2++;

			}

			/*
			 * Caso o flag esteja com *, encontrou diferen�a e apenas adiciona a posi��o
			 * atual ao retorno e inicia novo comparativo na posi��o seguinte.
			 */
			if (flag == "*") {
				retorno = retorno + string.charAt(i);
				continue;
			}

			// Caso n�o encontrou diferen�a, pula o tamanho da vari�vel substring - 1.
			// retorno = retorno + novo;
			i = i + tamanhoV - 1;
		}

		System.out.println(retorno);
		return retorno;
	}

}