package br.com.treinar.collection.atividade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExercicioCollection {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		Map<Character, List<String>> mapNomes = new HashMap<>();
		for (int i = 0; i < 3; i++) {
			System.out.print("Informe o ".concat(String.valueOf(i + 1)).concat(": "));
			nomes.add(teclado.nextLine());
		}
		teclado.close();
		
		nomes.forEach(nome -> {
			Character primeiraLetra = nome.charAt(0);
			if (!mapNomes.containsKey(primeiraLetra)) {
				mapNomes.put(primeiraLetra, new ArrayList<>());
			}
			mapNomes.get(primeiraLetra).add(nome);
		});
		
		mapNomes.forEach((k, v) -> {
			if (k == 'M') {
				System.out.println(v);
			}
		});
	}
	
}
