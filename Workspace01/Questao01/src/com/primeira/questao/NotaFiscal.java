package com.primeira.questao;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal implements INotaFiscal {

    // M�todo implementado de IMaiusculo.
@Override
public List<Double> geraParcelas(int nrParcelas, double valorTotal) {

    List<Double> lista = new ArrayList<Double>();
 
        // VARI�VEIS

        double lParcela = (valorTotal / nrParcelas);
        lParcela = Math.round(lParcela * 100);
        lParcela = lParcela / 100;
        double lSubValor = 0;
        double lUltParcela = 0;
        int lCont = 1;
 
        do{
            // Se a contagem for igual ao n�mero total de parcelas:
            if(lCont == (nrParcelas)){
                // Definir o valor da �ltima parcela (valor total menos a sumat�ria de todas as outras parcelas).
                lUltParcela = (valorTotal - lSubValor);
                // Exibir o n�mero da �ltima parcela (contagem) e formatar o valor da mesma para duas casas ap�s a v�rgula.

                lista.add(lUltParcela);
                break;                
            }

            // Adicionar.  
            lSubValor = lSubValor + lParcela;
            
            // Adicionar a parcela � lista
            lista.add(lParcela);
            
            lCont++;

        // Enquanto a contagem for menor ou igual ao n�mero de parcelas.
        }while(lCont <= nrParcelas);

        System.out.println(lista);
        return lista;
	}
}