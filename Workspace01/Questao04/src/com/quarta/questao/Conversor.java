package com.quarta.questao;

public class Conversor implements IConversor{

	@Override
	public String converteBase5(int decimal) {
		
		// Vari�vel que armazena o resultado.
		String lResultado = "";
		// Vari�vel flex�vel que recebe o par�metro.
		int lInteiro = decimal;
		// Vari�vel que executa a divis�o.
		double lValor;
		// Vari�vel que incrementa a String lResultado.
		int lResto;

		do {
			
			// Equa��o de convers�o.
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