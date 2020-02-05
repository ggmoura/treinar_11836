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
				+ "2 - Subtra��o\n" 
				+ "3 - Divis�o\n"
				+ "4 - Multiplica��o";
	}

	public void iniciar() {

		System.out.print(" Favor entrar com o Primeiro Numero!");
		numUm = teclado.nextInt();
		System.out.print(" Favor entrar com o Segundo Numero!");
		numDois = teclado.nextInt();
		System.out.println("Qual opera��o deseja realizar?");
		System.out.println(menuOp());
		operador = teclado.nextInt();

		Calc op = new Calc();

		switch (operador) {
		case 1:
			Integer resultado = op.soma(numUm, numDois);
			System.out.println("O Resutado da opera��o � " + resultado);
			break;

		default:
			break;
		}
	}
}
