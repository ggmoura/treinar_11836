package br.com.maxdoliveira.view;

import java.util.Scanner;

import br.com.maxdoliveira.calc.Calc;

public class Tela {
	
	Scanner teclado = new Scanner(System.in);
	public Integer numUm, numDois, operador; 
	
	Calc C = new Calc();
	Integer resultado;
	
	public void iniciar() {
		
		System.out.print("Entre com o Primeiro Numero!\n" + "=>>");
		numUm = teclado.nextInt();
		System.out.print("Entre com o Segundo Numero!\n" + "=>>");
		numDois = teclado.nextInt();
		System.out.println("Qual operação deseja realizar?\n\n");
		System.out.print(menuOperações());
		operador = teclado.nextInt();
		
		
		
		switch (operador) {
		case 1:
			resultado = C.soma(numUm, numDois);
			System.out.println("O resultado do Calculo é: " + resultado);
			break;

		case 2:
			resultado = C.sub(numUm, numDois);
			System.out.println("O resultado do Calculo é: " + resultado);
			break;
			
		case 3:
			resultado = C.div(numUm, numDois);
			Integer resto = C.mod(numUm, numDois);
			System.out.println("O resultado desta Divisão é: " + resultado + " Com resto " + resto);
			break;
			
			
		case 4:
			resultado = C.mult(numUm, numDois);
			System.out.println("O resultado do Calculo é: " + resultado);
			break;

		default:
			break;
		}
		
	}
	
	public String menuOperações() {
		return    "1 - Soma\n"
				+ "2 - Subtração\n"
				+ "3 - Divisão\n"
				+ "4 - Multiplicação\n"
				+ "0 - Sair"
				+ "\n=>>  ";
	}
}
