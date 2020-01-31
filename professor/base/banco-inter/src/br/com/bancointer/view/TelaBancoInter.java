package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.model.core.Conta;

public class TelaBancoInter {

	Scanner teclado = new Scanner(System.in);

	public void iniciar() {
		Integer opcao;
		Conta c = null;
		do {
			System.out.print("Informe\n\t0 - Sair\n\t1 - Criar Conta\n\t2 - Exibir Saldo\n=> ");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				c = new Conta();
				System.out.print("Informe o numero da conta: ");
				c.numero = teclado.nextInt();
				System.out.print("Informe o numero da agencia: ");
				c.agencia = teclado.nextInt();
				System.out.print("Informe o saldo da conta: ");
				c.saldo = teclado.nextDouble();
				break;
			case 2:
				if (c != null) {
					System.out.println("Saldo atual: " + c.saldo);
				} else {
					System.out.println("Crie a conta primeiro.");
				}
			case 3:
			// TODO - implementar funcionalidade depositar
				break;
			default:
				break;

			}
		} while (!opcao.equals(0));
	}

}
