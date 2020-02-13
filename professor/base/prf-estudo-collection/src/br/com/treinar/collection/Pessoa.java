package br.com.treinar.collection;

public class Pessoa implements Comparable<Pessoa> {

	private Integer idade;
	private String nome;
	private Integer peso;

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.nome);
	}

	@Override
	public String toString() {
		return this.nome + " " + this.idade + " " + this.peso;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

}
