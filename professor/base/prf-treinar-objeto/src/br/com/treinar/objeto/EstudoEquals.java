package br.com.treinar.objeto;

public class EstudoEquals {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria Sophia");
		p1.setIdade(7);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Maria Sophia");
		p2.setIdade(7);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals("batata"));
	}
	
}
