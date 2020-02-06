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
		System.out.println("Qual opera��o deseja realizar?\n\n");
		System.out.print(menuOpera��es());
		operador = teclado.nextInt();
		
		
		
		switch (operador) {
		case 1:
			resultado = C.soma(numUm, numDois);
			System.out.println("O resultado do Calculo �: " + resultado);
			break;

		case 2:
			resultado = C.sub(numUm, numDois);
			System.out.println("O resultado do Calculo �: " + resultado);
			break;
			
		case 3:
			resultado = C.div(numUm, numDois);
			Integer resto = C.mod(numUm, numDois);
			System.out.println("O resultado desta Divis�o �: " + resultado + " Com resto " + resto);
			break;
			
			
		case 4:
			resultado = C.mult(numUm, numDois);
			System.out.println("O resultado do Calculo �: " + resultado);
			break;

		default:
			break;
		}
		
	}
	
	public String menuOpera��es() {
		return    "1 - Soma\n"
				+ "2 - Subtra��o\n"
				+ "3 - Divis�o\n"
				+ "4 - Multiplica��o\n"
				+ "0 - Sair"
				+ "\n=>>  ";
	}
}
