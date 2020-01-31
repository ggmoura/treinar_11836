package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.model.Cliente;
import br.com.bancointer.model.core.Conta;

public class TelaBancoInter {

	Scanner teclado = new Scanner(System.in);

	public void iniciar() {
		Integer opcao;
		Conta conta;
		conta = null;
		do {
			System.out.print("Informe\n\t0 - Sair\n\t1 - Criar Conta\n\t2 - Exibir Saldo\n=> ");
			opcao = teclado.nextInt();

			if (opcao == 2 && conta == null) {
				System.out
						.println("Voce n�o possui conta. Deseja criar uma conta agora? \n Informe S (Sim) ou N (n�o)");
				String criaConta = teclado.next();

				if (criaConta.equals("S") || criaConta.equals("Sim") || criaConta.equals("s")
						|| criaConta.equals("sim")) {
					opcao = 1;
				} else {
					System.out.println("Opera��o Cancelada.");
					opcao = 0;
				}
			}

			switch (opcao) {
			case 0:
				break;
			case 1:
				System.out.println(
						"------------------------------------------------\n              Cadastrando Cliente\n------------------------------------------------");
				// Criando o Cliente
				Cliente cliente = new Cliente();
				System.out.print("Digite o nome do Cliente: ");
				String nomeCliente = teclado.next();
				cliente.nome = nomeCliente;
				System.out.print("Digite a idade: ");
				int idadeCliente = teclado.nextInt();
				cliente.idade = idadeCliente;

				System.out.println(
						"------------------------------------------------\n                 Crindo Conta\n------------------------------------------------");
				// Criando a Conta
				conta = new Conta();
				System.out.print("Informe o numero da conta: ");
				conta.numero = teclado.nextInt();
				conta.cliente = cliente;
				System.out.print("Informe o numero da agencia: ");
				conta.agencia = teclado.nextInt();
				conta.saldo = 0d;
				String nome = conta.cliente.nome;
				int idade = conta.cliente.idade;
				System.out.println("Cliente: " + nome + "\n Idade: " + idade + "\n CC: " + conta.numero + "\n AG: "
						+ conta.agencia + "\n Saldo: " + conta.saldo + "\n------------------------\n");
				break;
			case 2:
				if (conta == null) {
					System.out.println("Favor criar a conta primeiro. \n------------------------\n");
				} else {
					System.out.println("O Saldo da conta �: " + conta.saldo + "\n------------------------\n");
				}
				break;
			default:
				System.out.println("Favor digitar um numero valido\n------------------------\n");
				break;
			}
		} while (!opcao.equals(0));
	}

}
