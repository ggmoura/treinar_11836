package br.com.bancointer.data;

import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaPagavel;
import br.com.bancointer.model.core.IContaRentavel;

public class InterDatabase {

	private static InterDatabase instance;
	private Conta[] contas;
	private Integer index;

	static {
		instance = new InterDatabase();
	}

	private InterDatabase() {
		super();
		index = 0;
		contas = new Conta[10];
	}

	public static InterDatabase getInstance() {
		return instance;
	}

	public void adicionarConta(Conta conta) {
		if (index < 10) {
			contas[index++] = conta;
		}
	}

	public Conta recuperarConta(Integer numeroConta) {
		Conta solicitada = null;
		for (int i = 0; i < contas.length; i++) {
			Conta conta = contas[i];
			if (conta != null && conta.getNumero().equals(numeroConta)) {
				solicitada = conta;
				break;
			}
		}
		return solicitada;
	}

	//TODO - criar rotina de um em um minuto para fazer isso
	public void realizarPagamento() {
		for (Conta conta : contas) {
			if (conta != null && conta instanceof IContaPagavel) {
				((IContaPagavel)conta).pagar();
			}
		}
	}

	//TODO - criar rotina de um em um minuto para fazer isso
	public void obterRendimento() {
		for (Conta conta : contas) {
			if (conta != null && conta instanceof IContaRentavel) {
				((IContaRentavel)conta).render();
			}
		}
	}
	
	public Conta[] recuperarContas() {
		return contas;
	}

}
