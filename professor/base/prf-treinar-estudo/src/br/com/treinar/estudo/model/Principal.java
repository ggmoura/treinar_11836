package br.com.treinar.estudo.model;

public class Principal {

	public static void main(String[] args) {
		Pessoa aluno;
		System.out.println("Daqui a pouco vou criar um aluno...");
		aluno = new Pessoa();
		aluno.idade = 39;
		aluno.nome = "Gleidson";
		
		Pessoa professor = new Pessoa();
		professor.idade = 7;
		professor.nome = "Maria Sophia";
		
		System.out.println(aluno.nome);
		System.out.println(professor.nome);

		aluno = professor;
		
		System.out.println(aluno.nome);
		
		professor.nome = "Maria Sophia de Oliveira";
		aluno.idade = 41;
		
		System.out.println(aluno.nome);
		System.out.println(professor.idade);
		
		String s = "teste";
		String s2 = "teste";
		s = "teste1";
		
		aluno = new Pessoa();
		aluno.nome = "Davi";
		aluno.idade = 11;
		
		System.out.println(aluno.nome);
		System.out.println(professor.nome);
		
		aluno = null;
		
		aluno.idade = 10;
		
		if ("a".equals("b")) {
			Pessoa inner = new Pessoa();
			inner.nome = "Bruna Farias";
			inner.idade = 25;
		}
		System.out.println("saiu na 42");
	}

}
