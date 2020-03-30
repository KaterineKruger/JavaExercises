package com.segunda.questao;

public class Maiusculo implements IMaiusculo {

	// M�todo implementado de IMaiusculo.
	@Override
	public String converteMaiusculo(String par) {

		String letra;int tamanho = par.length();
		boolean alterar = true;
		String saida = "";

		// Percorre a String.
		for (int i = 0; i < tamanho; i++) {
			// Identifica a letra que deve ser alterada.
			letra = String.valueOf(par.charAt(i));
			
			// Verifica se � espa�o ou v�rgula.   || (letra == virgula)
			if ((letra.equals(" ")) || (letra.equals(","))){
				saida = saida + letra;
				alterar = true;
			} else {

				// Torna mai�scula a letra identificada.
				if (alterar == true) {
					saida = saida + letra.toUpperCase();
					alterar = false;
				} else {
					// Concatena a String.
					saida = saida + letra;
				}
			}

		}

		System.out.println(saida);
		return saida;
	}
}