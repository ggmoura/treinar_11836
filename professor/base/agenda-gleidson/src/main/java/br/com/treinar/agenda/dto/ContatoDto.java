package br.com.treinar.agenda.dto;

public class ContatoDto {

	private String nome;
	private String email;

	public ContatoDto(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public ContatoDto() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
