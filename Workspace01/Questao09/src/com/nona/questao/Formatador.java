package com.nona.questao;

public class Formatador implements IFormatador{	
	
	@Override
	public String formatar(double num) {
		
		int numMult = (int) (num*100);
		String texto = String.valueOf(numMult);
		int i = texto.length() - 1; // posicao é length -1 porque charAt começa no 0 e vai até tamanho -1
		String resultado = String.valueOf(texto.charAt(i)); // ultimo digito
                i--;
		resultado = texto.charAt(i) + resultado; // penultimo digito
                resultado = ',' + resultado;
		i--;

		int cont = 0; // contador para controlar o ponto de 3 em 3
        	
	        while (i >= 0) {
			cont++;
			if(cont == 4) {
				resultado = "." + resultado;
				cont = 1; // aqui coloca 1 porque aqui abaixo ja vai entrar o primeiro digito do proximo grupo de 3 digitos
			}
			resultado = texto.charAt(i) + resultado;
			i--;
		}
			        
        System.out.println(resultado);
		return resultado;
		
	}
}