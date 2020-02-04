package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.model.conta.ContaCorrente;
import br.com.bancointer.model.conta.ContaInvestimento;
import br.com.bancointer.model.conta.ContaPoupanca;
import br.com.bancointer.model.conta.ContaSalario;
import br.com.bancointer.model.core.Conta;

public class TelaBancoInter {

	Scanner teclado = new Scanner(System.in);
	int tipoConta = 0;

	public String recuperarMenu() {
		return " Informe\n\t" + "0 - Sair\n\t" + "1 - Criar Conta\n\t" + "2 - Exibir Saldo\n\t" + "3 - Depositar\n\t"
				+ "\n=> ";
	}

	public String tipoContaMenu() {
		return " Informe\n\t" + "0 - Conta Poupança\n\t" + "1 - Conta Investimento\n\t" + "2 - Conta Corrente\n\t"
				+ "3 - Conta Salario\n\t" + "\n=> ";
	}

	public void iniciar() {
		Integer opcao;
		Conta c = null;
		do {
			System.out.print(recuperarMenu());
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:

				c = criarConta();
				break;
			case 2:
				exebirSaldo(c);
				break;
			case 3:
				depositar(c);
				break;
			default:

				break;
			}

		} while (!opcao.equals(0));
	}

	private Conta opConta() {
		System.out.print(tipoContaMenu());
		tipoConta = teclado.nextInt();
		Conta continha;
		switch (tipoConta) {
		case 0:
			System.out.println("Você está a criar uma conta poupança");
			continha = new ContaPoupanca();

			break;
		case 1:
			System.out.println("Você está a criar uma conta investimento");
			continha = new ContaInvestimento();
			break;
		case 2:
			System.out.println("Você está a criar uma conta corrente");
			continha = new ContaCorrente();
			break;
		default:
			System.out.println("Você está a criar uma conta salário");
			continha = new ContaSalario();
			break;

		}
		return continha;
	}

	private Conta criarConta() {
		Conta conta = opConta();
		System.out.print("Informe o numero da conta: ");
		conta.setNumero(teclado.nextInt());
		System.out.print("Informe o numero da agencia: ");
		conta.setAgencia(teclado.nextInt());
		System.out.print("Informe o saldo da conta: ");
		conta.depositar(teclado.nextDouble());
		return conta;
	}

	private void exebirSaldo(Conta conta) {
		if (conta != null) {
			System.out.println("Saldo atual: " + conta.recuperarSaldo());
		} else {
			System.out.println("Crie a conta primeiro");
		}
	}

	private void depositar(Conta conta) {
		System.out.println("Informe o valor a depositar");
		Double valor = teclado.nextDouble();
		conta.depositar(valor);
	}
}
