package com.primeira.questao;

import java.util.List;

public interface INotaFiscal {
	List<Double> geraParcelas(int nrParcelas, double valorTotal);
}