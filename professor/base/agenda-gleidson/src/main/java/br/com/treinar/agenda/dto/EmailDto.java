package br.com.treinar.agenda.dto;

import br.com.treinar.agenda.model.Provedor;

public class EmailDto {

	private String nick;
	private String provedor;

	public EmailDto(String nick, Provedor provedor) {
		super();
		this.nick = nick;
		this.provedor = provedor.name();
	}

	public EmailDto() {
		super();
	}
	
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getProvedor() {
		return provedor;
	}

	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}

}
