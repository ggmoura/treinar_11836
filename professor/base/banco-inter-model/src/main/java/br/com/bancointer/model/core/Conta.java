package br.com.bancointer.model.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.bancointer.model.Cliente;
import br.com.bancointer.model.conta.Transferencia;

public abstract class Conta {

	public static final Integer HORA_ABERTURA;

	static {
		HORA_ABERTURA = 10;
	}

	private Integer id;
	protected Double saldo;
	private Integer numero;
	private Integer agencia;
	private Cliente cliente;
	private List<Transferencia> transferencias;
	private Date dataAbertura;

	public Conta(Double saldo) {
		this();
		depositar(saldo);
	}

	public Conta() {
		saldo = 0d;
		transferencias = new ArrayList<Transferencia>();
	}

	/**
	 * 
	 * @param valor - Montante que sera removido da conta
	 * @throws SaldoInsuficienteException - lancada quando o saldo for menor do que o valor a ser sacado 
	 * @throws LimiteDiarioException - lancada quando ultrapassar o limite de saque por dia
	 */
	public abstract void sacar(Double valor) throws SaldoInsuficienteException, LimiteDiarioException;

	public void depositar(Double valor) {
		saldo += valor;
	}

	public Double recuperarSaldo() {
		return saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public List<Transferencia> getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
