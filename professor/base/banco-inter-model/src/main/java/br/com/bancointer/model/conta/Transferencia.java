package br.com.bancointer.model.conta;

import br.com.bancointer.model.core.Conta;

/**
 * @author ADM
 *
 */
public class Transferencia {

	private Conta origem;
	private Conta destino;
	private Double valor;
	private TipoTransferencia tipo;

	public Conta getOrigem() {
		return origem;
	}

	public void setOrigem(Conta origem) {
		this.origem = origem;
	}

	public Conta getDestino() {
		return destino;
	}

	public void setDestino(Conta destino) {
		this.destino = destino;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoTransferencia getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransferencia tipo) {
		this.tipo = tipo;
	}

}
