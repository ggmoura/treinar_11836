package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.model.core.Conta;

public class TelaBancoInter {

	Scanner teclado = new Scanner(System.in);

	public String recuperarMenu() {
		return "Informe\n\t"
				+ "0 - Sair\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Exibir Saldo\n\t"
				+ "3 - Depositar\n\t"
				+ "\n=> ";
	}
	
	public String menuTipoConta() {
		return "Inforte o tipo de Conta\n\t"
				+ "1 - Conta Corrente\n\t"
				+ "2 - Conta Investimento\n\t"
				+ "3 - Conta Poupança\n\t"
				+ "4 - Conta Salario\n\t"
				+ "\n=> "; 
	}

	public void iniciar() {
		Integer opcao;
		Conta c = null;
		do {
			System.out.print(recuperarMenu());
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				opcaoConta();
				break;
			case 2:
				exibirSaldo(c);
				break;
			case 3:
				depositar(c);
				break;
			default:
				break;

			}
		} while (!opcao.equals(0));
	}

	private Conta criarConta() {
		Conta batata = new Conta();
		System.out.print("Informe o numero da conta: ");
		Integer numeroConta = teclado.nextInt();		
		batata.setNumero(numeroConta);
		System.out.print("Informe o numero da agencia: ");
		batata.setAgencia(teclado.nextInt());
		System.out.print("Informe o saldo da conta: ");
		batata.depositar(teclado.nextDouble());
		return batata;
	}

	private void exibirSaldo(Conta conta) {
		if (conta != null) {
			System.out.println("Saldo atual: " + conta.recuperarSaldo());
		} else {
			System.out.println("Crie a conta primeiro.");
		}
	}

	private void depositar(Conta conta) {
		System.out.print("Informe o valor a ser depositado: ");
		Double valor = teclado.nextDouble();
		conta.depositar(valor);
	}

	private void opcaoConta() {
		System.out.println(menuTipoConta());
		int opcao = teclado.nextInt();
		switch (opcao) {

		case 1:
			System.out.println("Criando Conta Corrente");
			//criarConta();
			break;
		case 2:
			System.out.println("Criando Conta Investimento");
			//criarConta();
			break;
		case 3:
			System.out.println("Criando Conta Poupança");
			//criarConta();
			break;
		case 4:
			System.out.println("Criando Conta Salario");
			//criarConta();
			break;
		}
		criarConta();
	}
}
