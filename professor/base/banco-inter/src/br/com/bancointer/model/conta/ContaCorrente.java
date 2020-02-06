package br.com.bancointer.model.conta;

import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaPagavel;

public class ContaCorrente extends Conta implements IContaPagavel {

	private Double limiteCredito;
	private Double taxaManutencao;
	
	@Override
	public void sacar(Double valor) {
		this.sacar(valor, Boolean.TRUE, Boolean.TRUE);
	}
	
	private void sacar(Double valor, Boolean cobrarSaque, Boolean validarLimite) {
		Double incremento = cobrarSaque ? 1.0 : 0.0;
		if (validarLimite) {
			if (recuperarSaldo() >= (valor + incremento)) {
				this.saldo -= (valor + incremento);
			}
		} else {
			this.saldo -= valor;
		}
			
	}
	
	@Override
	public Double recuperarSaldo() {
		System.out.println(this.saldo);
		Double saldoOrigem = super.recuperarSaldo();
		return saldoOrigem + limiteCredito;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	@Override
	public void pagar() {
		sacar(taxaManutencao, Boolean.FALSE, Boolean.FALSE);
	}
	
}
