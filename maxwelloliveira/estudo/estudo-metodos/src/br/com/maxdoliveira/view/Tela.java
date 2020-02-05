package br.com.maxdoliveira.view;

import java.util.Scanner;

import br.com.maxdoliveira.calc.Calc;

public class Tela {

	Scanner teclado = new Scanner(System.in);
	Integer numUm; 
	Integer numDois;
	Integer operador;

	public String menuOp() {
		return 	  "1 - Soma\n" 
				+ "2 - Subtração\n" 
				+ "3 - Divisão\n"
				+ "4 - Multiplicação";
	}

	public void iniciar() {

		System.out.print(" Favor entrar com o Primeiro Numero!");
		numUm = teclado.nextInt();
		System.out.print(" Favor entrar com o Segundo Numero!");
		numDois = teclado.nextInt();
		System.out.println("Qual operação deseja realizar?");
		System.out.println(menuOp());
		operador = teclado.nextInt();

		Calc op = new Calc();

		switch (operador) {
		case 1:
			Integer resultado = op.soma(numUm, numDois);
			System.out.println("O Resutado da operação é " + resultado);
			break;

		default:
			break;
		}
	}
}
