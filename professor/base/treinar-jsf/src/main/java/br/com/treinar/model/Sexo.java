package br.com.treinar.model;

public enum Sexo {

	FEMININO("Feminino"),
	MASCULINO("Masculino"),
	CUSTOMISE("Customisado");
	
	private String descricao;
	
	private Sexo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
