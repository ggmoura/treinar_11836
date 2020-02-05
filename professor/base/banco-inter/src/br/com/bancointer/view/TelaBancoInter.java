package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.model.Cliente;
import br.com.bancointer.model.core.Conta;
import br.com.bancointer.principal.Services;

public class TelaBancoInter {

	Scanner teclado = new Scanner(System.in);

	public void iniciar() {
		Integer opcao;
		Conta conta = null;
		Services servicos = new Services();
		do {
			System.out.print(servicos.recuperarMenu());
			opcao = teclado.nextInt();
			opcao = servicos.validaExistenciaConta(opcao, conta);
			switch (opcao) {
			case 0:
				break;
			case 1:
				Cliente cliente = servicos.criarCliente();
				conta = servicos.criarConta(cliente);
				
				//imprime informações da conta criada
				String nome = conta.getCliente().nome;
				int idade = conta.getCliente().idade;
				System.out.print("Cliente: "   + nome 
						        + "\n Idade: " + idade 
						        + "\n CC: "    + conta.getNumero() 
						        + "\n AG: "    + conta.getAgencia() 
						        + "\n Saldo: " + conta.getSaldo() 
						        + "\n------------------------\n");
				break;
			case 2:
				servicos.exibirSaldo(conta);
				break;
			case 3:
				servicos.depositar(conta);
				break;
			case 4:
				servicos.sacar(conta);
				break;
			case 5:
				servicos.transferir(conta);
				break;
			case 6:
				servicos.exibirLimite(conta);
				break;	
			case 7:
				servicos.obterRendimento(conta);
				break;
			case 8:
				servicos.realizarPagamento(conta);
				break;	
			case 9:
				servicos.cadastrarTaxaRendimento(conta);
				break;	
			default:
				System.out.print("Favor digitar um numero valido"
						       + "\n-----------------------------\n");
				break;
			}
		} while (!opcao.equals(0));
	}

}
