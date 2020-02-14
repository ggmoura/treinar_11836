package br.com.bancointer.model.core;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 8280022364556809463L;

	private Double saldoDisponivel;

	public Double getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(Double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}

}
