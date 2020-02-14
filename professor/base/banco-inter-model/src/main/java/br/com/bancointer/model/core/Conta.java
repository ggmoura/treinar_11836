package br.com.bancointer.model.core;

import br.com.bancointer.model.Cliente;
import br.com.bancointer.model.conta.Transferencia;

public abstract class Conta {

	public static final Integer HORA_ABERTURA;

	static {
		contador = 0;
		HORA_ABERTURA = 10;
	}

	private static Integer contador;
	private final Integer id;
	protected Double saldo;
	private Integer numero;
	private Integer agencia;
	private Cliente cliente;
	private Transferencia[] transferencias;

	public Conta(Double saldo) {
		this();
		depositar(saldo);
	}

	public Conta() {
		id = ++contador;
		saldo = 0d;
	}

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

	public Transferencia[] getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(Transferencia[] transferencias) {
		this.transferencias = transferencias;
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
