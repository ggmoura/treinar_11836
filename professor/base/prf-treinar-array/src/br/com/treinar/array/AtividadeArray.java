package br.com.treinar.array;

public class AtividadeArray {

	public static void main(String[] args) {
		int[] idades = new int[3];
		idades[0] = 10;
		idades[1] = 100;
		idades[2] = 1000;

		System.out.println(idades.length);

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

		for (int idade : idades) {
			System.out.println(idade);
		}
		
		String[] nomes = { "Maria Sophia", "Davi Lucas", "Ana Cecília" };
		System.out.println(nomes.length);
		
		// Integer[][] matriz = new Integer[4][];

	}

}
