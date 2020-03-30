package com.terceira.questao;

public class ValidaProtocolo implements IValidaProtocolo {

	// Método implementado de IMaiusculo.
	@Override
	public boolean validaProtocolo(String protocolo) {

		if (protocolo.length() < 8) {
			System.out.println("O número de caracteres do Protocolo é insuficiente.");
			System.exit(0);
			return false;
		} else {

			/*
			 * Identificar o dígito do protocolo, retornando o protocoloNew.charAt(6) e
			 * protocoloNew.charAt(7) --> o protocolo tem 8 caracteres, charAt começa no 0 e
			 * o que precisamos são os dois últimos, sendo assim, 6 e 7.
			 */
			int resultadoDig0601, resultadoDig0602, resultadoDig0603, resultadoDig0604, resultadoDig0605,
					resultadoDig0606, resultadoSomDig06, resultadoMultDig06;
			int resultadoDig0701, resultadoDig0702, resultadoDig0703, resultadoDig0704, resultadoDig0705,
					resultadoDig0706, resultadoDig0707, resultadoSomDig07, resultadoMultDig07;
			String protocoloNew;

			// Remover partes indesejadas da String.
			protocoloNew = protocolo.replace("-", "").replace(".", "").replace(" ", "");

			// EQUAÇÃO:

			// Lê um caracter específico da String, transforma a String em int e multiplica
			// por dígitos em ordem crescente.
			resultadoDig0601 = Character.getNumericValue(protocoloNew.charAt(5)) * 2;
			resultadoDig0602 = Character.getNumericValue(protocoloNew.charAt(4)) * 3;
			resultadoDig0603 = Character.getNumericValue(protocoloNew.charAt(3)) * 4;
			resultadoDig0604 = Character.getNumericValue(protocoloNew.charAt(2)) * 5;
			resultadoDig0605 = Character.getNumericValue(protocoloNew.charAt(1)) * 6;
			resultadoDig0606 = Character.getNumericValue(protocoloNew.charAt(0)) * 7;

			// Soma todos os resultados das multiplicações pelos dígitos em ordem crescente.
			resultadoSomDig06 = (resultadoDig0601 + resultadoDig0602 + resultadoDig0603 + resultadoDig0604
					+ resultadoDig0605 + resultadoDig0606);
			// Multiplica a soma total por 10.
			resultadoMultDig06 = (resultadoSomDig06 * 10);

			int digito01 = resultadoMultDig06 % 11;
			if(digito01 == 10) {
				digito01 = 0;
			}
			
			// Lê um caracter específico da String, transforma a String em int e multiplica
			// por dígitos em ordem crescente.
			resultadoDig0701 = digito01 * 2;
			resultadoDig0702 = Character.getNumericValue(protocoloNew.charAt(5)) * 3;
			resultadoDig0703 = Character.getNumericValue(protocoloNew.charAt(4)) * 4;
			resultadoDig0704 = Character.getNumericValue(protocoloNew.charAt(3)) * 5;
			resultadoDig0705 = Character.getNumericValue(protocoloNew.charAt(2)) * 6;
			resultadoDig0706 = Character.getNumericValue(protocoloNew.charAt(1)) * 7;
			resultadoDig0707 = Character.getNumericValue(protocoloNew.charAt(0)) * 8;

			// Soma todos os resultados das multiplicações pelos dígitos em ordem crescente.
			resultadoSomDig07 = (resultadoDig0701 + resultadoDig0702 + resultadoDig0703 + resultadoDig0704
					+ resultadoDig0705 + resultadoDig0706 + resultadoDig0707);
			// Multiplica a soma total por 10.
			resultadoMultDig07 = (resultadoSomDig07 * 10);

			int digito02 = resultadoMultDig07 % 11;
			if(digito02 == 10) {
				digito02 = 0;
			}

			int pDigito01 = Character.getNumericValue(protocoloNew.charAt(6));
			int pDigito02 = Character.getNumericValue(protocoloNew.charAt(7));

			// Se o resto da divisão (da multiplicação) por 11 for igual aos dois caracteres
			// do dígito de validação, retorna verdadeiro.
			if ((pDigito01 == digito01) && (pDigito02 == digito02)) {
				System.out.println("O protocolo é válido.");
				return true;
			} else {
				System.out.println("O protocolo não é válido.");
				return false;
			}
		}
	}
}