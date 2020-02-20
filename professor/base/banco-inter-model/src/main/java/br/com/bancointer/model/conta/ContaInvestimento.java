package br.com.bancointer.model.conta;

import javax.persistence.Entity;

import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaPagavel;
import br.com.bancointer.model.core.IContaRentavel;

@Entity
public class ContaInvestimento extends Conta implements IContaPagavel, IContaRentavel {
	
	private Double taxaManutencao;
	private Double taxaRendimento;

	@Override
	public void sacar(Double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
	}
	
	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public void render() {
		depositar(saldo * taxaRendimento);
	}

	public void pagar() {
		sacar(taxaManutencao);
	}

}
