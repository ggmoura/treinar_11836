package br.com.treinar.agenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Where(clause = "ativo = true")
@SQLDelete(sql = "update Email set ativo = false where id = ?")
public class Email extends BaseEntity<Integer> {

	private String descricao;

	@ManyToOne(fetch = FetchType.LAZY)
	private Contato contato;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Provedor provedor;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Provedor getProvedor() {
		return provedor;
	}

	public void setProvedor(Provedor provedor) {
		this.provedor = provedor;
	}

}
