package com.primeira.questao;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal implements INotaFiscal {

    // Método implementado de IMaiusculo.
@Override
public List<Double> geraParcelas(int nrParcelas, double valorTotal) {

    List<Double> lista = new ArrayList<Double>();
 
        // VARIÁVEIS

        double lParcela = (valorTotal / nrParcelas);
        lParcela = Math.round(lParcela * 100);
        lParcela = lParcela / 100;
        double lSubValor = 0;
        double lUltParcela = 0;
        int lCont = 1;
 
        do{
            // Se a contagem for igual ao número total de parcelas:
            if(lCont == (nrParcelas)){
                // Definir o valor da última parcela (valor total menos a sumatória de todas as outras parcelas).
                lUltParcela = (valorTotal - lSubValor);
                // Exibir o número da última parcela (contagem) e formatar o valor da mesma para duas casas após a vírgula.

                lista.add(lUltParcela);
                break;                
            }

            // Adicionar.  
            lSubValor = lSubValor + lParcela;
            
            // Adicionar a parcela à lista
            lista.add(lParcela);
            
            lCont++;

        // Enquanto a contagem for menor ou igual ao número de parcelas.
        }while(lCont <= nrParcelas);

        System.out.println(lista);
        return lista;
	}
}