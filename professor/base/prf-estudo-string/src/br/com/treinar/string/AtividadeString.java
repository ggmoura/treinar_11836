package br.com.treinar.string;

public class AtividadeString {

	public static void main(String[] args) {
		String nome = "Maria Sophia";
		Character primeiraLetra = nome.charAt(0);
		System.out.println(primeiraLetra);
		
		String nomeF = "Maria Valentina Farias Moura";
		
		System.out.println(nomeF.substring(0, nomeF.indexOf(" ")));
		
		System.out.println(nomeF.contains("Valentina"));
		
		System.out.println(nomeF.isEmpty());
		
	}
	
}
