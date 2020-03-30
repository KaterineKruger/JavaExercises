package com.oitava.questao;

public class JurosCompostos implements IJurosCompostos{

	@Override
	public double calcularValorFinal(double valorInicial, double juros, int parcelas) {
		// Definir a formatação do valor da parcela. 
 
        // VARIÁVEIS 
        double valorFinal = 0; 
        int lCont; // Controlar o loop de parcelas. 
             
            // Se algum valor de entrada for negativo, retorna zero. 
            if ((valorInicial < 0) || (juros < 0) || (parcelas < 0)){ 
            	System.exit(0);
                return valorFinal;
            } 
 
            //  
            valorFinal = (int) (valorInicial * 100);
            valorFinal = valorFinal / 100;
 
            // Repete a quantidade de vezes de parcelas informadas. 
            for(lCont = 0; lCont < parcelas; lCont++){
 
                // Adição de Juros. 
                valorFinal = (valorFinal * (1 + (juros / 100)));

            }
          
            valorFinal = (int) (valorFinal * 100);
    	    valorFinal = valorFinal / 100;

            System.out.println(valorFinal);
            return valorFinal;
	}

}