package br.com.bancointer.model.conta;

import javax.persistence.Entity;
import javax.persistence.Transient;

import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaRentavel;

@Entity
public class ContaPoupanca extends Conta implements IContaRentavel {

	@Transient
	private static Double taxaRendimento;

	static {
		taxaRendimento = 0.0;
	}
	
	static {
		System.out.println(taxaRendimento);
	}
	
	@Override
	public void sacar(Double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
	}

	public static Double getTaxaRendimento() {
		return ContaPoupanca.taxaRendimento;
	}

	public static void setTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	public void render() {
		depositar(saldo * taxaRendimento);
	}

}
