package br.com.bancointer.data;

import java.util.HashSet;
import java.util.Set;

import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaPagavel;
import br.com.bancointer.model.core.IContaRentavel;

public class InterDatabase {

	private static InterDatabase instance;
	private Set<Conta> contas;

	static {
		instance = new InterDatabase();
	}

	private InterDatabase() {
		super();
		contas = new HashSet<>();
	}

	public static InterDatabase getInstance() {
		return instance;
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

	public Conta recuperarConta(Integer numeroConta) {
		
		return contas.stream().filter(conta -> conta.getId().equals(numeroConta)).findFirst().get();

	}

	//TODO - criar rotina de um em um minuto para fazer isso
	public void realizarPagamento() {
		contas.forEach(conta -> ((IContaPagavel)conta).pagar());
	}

	//TODO - criar rotina de um em um minuto para fazer isso
	public void obterRendimento() {
		contas.forEach(conta -> ((IContaRentavel)conta).render());
	}
	
	public Set<Conta> recuperarContas() {
		return contas;
	}

}
