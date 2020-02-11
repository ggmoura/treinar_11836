package br.com.treinar;

import java.util.Scanner;

public class AtividadeEnum {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o dia da semana 0 ~ 6: ");
		AtividadeEnum minhaClasse = new AtividadeEnum();
		DiaSemana dia = minhaClasse.recuperarDia(teclado.nextInt());

		teclado.close();
		
		DiaSemana.DOMINGO.ehDiaUtil(10);
	
		System.out.println(dia.ehDiaUtil(10));
	
	}
	
	public DiaSemana recuperarDia(Integer dia) {
		return DiaSemana.values()[dia];
	}
	
}
