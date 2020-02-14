package br.com.bancointer.model.conta;

import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaPagavel;
import br.com.bancointer.model.core.LimiteDiarioException;
import br.com.bancointer.model.core.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements IContaPagavel {

	private Double limiteCredito;
	private Double taxaManutencao;
	
	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException, LimiteDiarioException {
		this.sacar(valor, Boolean.TRUE, Boolean.TRUE);
	}
	
	private void sacar(Double valor, Boolean cobrarSaque, Boolean validarLimite) throws SaldoInsuficienteException, LimiteDiarioException {
		Double incremento = cobrarSaque ? 1.0 : 0.0;
		Double saldoAtual = recuperarSaldo();
		if (valor > saldoAtual * 0.8) {
			if (validarLimite) {
				if (saldoAtual >= (valor + incremento)) {
					this.saldo -= (valor + incremento);
				} else {
					SaldoInsuficienteException sie = new SaldoInsuficienteException();
					sie.setSaldoDisponivel(saldoAtual);
					throw sie;
				}
			} else {
				this.saldo -= valor;
			}
		} else {
			throw new LimiteDiarioException();
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

	public void pagar() {
		try {
			sacar(taxaManutencao, Boolean.FALSE, Boolean.FALSE);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Sem saldo...");
		} catch (LimiteDiarioException e) {
			System.out.println("Sem saldo...");
		}
	}
	
}
