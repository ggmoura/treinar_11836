package br.com.treinar;

public enum DiaSemana {

	DOMINGO,
	SEGUNDA,
	TERCA,
	QUARTA,
	QUINTA,
	SEXTA,
	SABADO;
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
	
	
}
