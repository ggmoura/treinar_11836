package br.com.treinar.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AtividadeCollectionGenerics {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria Sophia");
		nomes.add("Maria Valentina");

		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria Sophia");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Maria Sophia");
		
		pessoas.add(p1);
		pessoas.add(p2);
		
		System.out.println(pessoas.size());
		
		Set<Pessoa> pessoasSet = new HashSet<>();
		pessoasSet.add(p1);
		pessoasSet.add(p2);
		
		System.out.println(pessoasSet.size());
		
		
		Set<Integer> numeros = new HashSet<>();
		System.out.println(numeros.add(1));
		System.out.println(numeros.add(1));
		numeros.add(1);
		numeros.add(1);
		numeros.add(1);
		numeros.add(1);
		numeros.add(5);
		numeros.add(8);
		numeros.add(9);
		numeros.add(0);
		
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
		
		
	}

}
