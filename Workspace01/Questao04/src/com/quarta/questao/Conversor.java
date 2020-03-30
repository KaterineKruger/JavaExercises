package com.quarta.questao;

public class Conversor implements IConversor{

	@Override
	public String converteBase5(int decimal) {
		
		// Variável que armazena o resultado.
		String lResultado = "";
		// Variável flexível que recebe o parâmetro.
		int lInteiro = decimal;
		// Variável que executa a divisão.
		double lValor;
		// Variável que incrementa a String lResultado.
		int lResto;

		do {
			
			// Equação de conversão.
			lValor = (lInteiro / 5);
			lResto = lInteiro % 5;
			String lRestoStr = Integer.toString(lResto);
			lResultado = lRestoStr + lResultado; //FmtNum('0',(lResto * 5)) + lResultado;
			lInteiro = (int) lValor;

		} while (lInteiro != 0);

			System.out.println(lResultado);
		    return lResultado;
		    
	}

}