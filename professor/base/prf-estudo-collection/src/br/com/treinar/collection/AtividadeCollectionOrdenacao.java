package br.com.treinar.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AtividadeCollectionOrdenacao {

	
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria Sophia");
		p1.setIdade(29);
		p1.setPeso(34);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Maria Valentina");
		p2.setIdade(2);
		p2.setPeso(35);
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Bruna Farias");
		p3.setIdade(23);
		p3.setPeso(32);
		
		Pessoa p4 = new Pessoa();
		p4.setNome("Marta Silva");
		p4.setIdade(5);
		p4.setPeso(30);
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		
		Collections.sort(pessoas);
		
		System.out.println(pessoas);
		
		MeuComparadorPorIdade mci = new MeuComparadorPorIdade();
		Collections.sort(pessoas, mci);
		
		System.out.println(pessoas);
		
		
		Comparator<Pessoa> comparadorPeso = new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getPeso().compareTo(o2.getPeso());
			}
		};
		
		Collections.sort(pessoas, comparadorPeso);
		
		System.out.println(pessoas);
		
		//funcao lambda
		pessoas.sort((o1, o2) -> o1.getPeso().compareTo(o2.getPeso()));
		
		pessoas.forEach(System.out::println);
		
	}
	
}
