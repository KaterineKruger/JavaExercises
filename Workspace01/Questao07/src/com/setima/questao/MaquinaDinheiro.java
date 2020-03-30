package com.setima.questao;

import java.util.ArrayList;
import java.util.List;

import com.setima.questao.Troco.ECedula;

public class MaquinaDinheiro implements IMaquina {

	@Override
	public List<Troco> montarTroco(double troco) {

		List<Troco> lista = new ArrayList<Troco>();

		int qtdNotaMoeda;

		troco = Math.round(troco * 100);
		//System.out.println(troco);
		troco = troco / 100;
		//System.out.println(troco);

		qtdNotaMoeda = (int) (troco / Troco.ECedula.NOTA100.getValor()); // Somente a parte inteira (quantidade de notas
																			// 100)
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.NOTA100.getValor(); // Resto para dividir em outras notas
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.NOTA100, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.NOTA50.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.NOTA50.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.NOTA50, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.NOTA20.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.NOTA20.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.NOTA20, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.NOTA10.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.NOTA10.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.NOTA10, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.NOTA5.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.NOTA5.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.NOTA5, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.NOTA2.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.NOTA2.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.NOTA2, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.MOEDA100.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.MOEDA100.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.MOEDA100, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.MOEDA50.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.MOEDA50.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.MOEDA50, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.MOEDA25.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.MOEDA25.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.MOEDA25, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.MOEDA10.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.MOEDA10.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.MOEDA10, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.MOEDA5.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.MOEDA5.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.MOEDA5, qtdNotaMoeda));
		}

		if (troco == 0) { // Nao tem mais troco
			System.out.println(lista);
			System.exit(0);
			return lista;
		}

		qtdNotaMoeda = (int) (troco / Troco.ECedula.MOEDA1.getValor());
		//System.out.println(qtdNotaMoeda);
		troco = troco % Troco.ECedula.MOEDA1.getValor();
		troco = Math.round(troco * 100); // precisa arredondar porque o "%" traz decimais quebrados
		troco = troco / 100;
		//System.out.println(troco);

		if (qtdNotaMoeda > 0) {
			lista.add(new Troco(ECedula.MOEDA1, qtdNotaMoeda));
		}

		System.out.println(lista);
		return lista;
	}

}