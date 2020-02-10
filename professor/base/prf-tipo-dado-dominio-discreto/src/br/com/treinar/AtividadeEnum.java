package br.com.treinar;

public class AtividadeEnum {

	public static void main(String[] args) {
		
		DiaSemana dom = DiaSemana.DOMINGO;
		
		System.out.println(dom);
		
		DiaSemana[] dias = DiaSemana.values();
		
		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana);
		}
		
		DiaSemana sabado = DiaSemana.valueOf("SABADO");

		System.out.println(sabado);
		System.out.println(sabado.name());
		System.out.println(DiaSemana.TERCA.ordinal());
		
	}
	
}
