package br.com.treinar.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class AtividadeMap {

	
	
	public static void main(String[] args) {
		Map<Integer, Pessoa> pessoasMap = new HashMap<>();
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria Sophia");
		p1.setIdade(29);
		p1.setPeso(34);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Maria Valentina");
		p2.setIdade(26);
		p2.setPeso(35);
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Bruna Farias");
		p3.setIdade(23);
		p3.setPeso(32);
		
		Pessoa p4 = new Pessoa();
		p4.setNome("Marta Silva");
		p4.setIdade(5);
		p4.setPeso(30);
		
		pessoasMap.put(p1.getIdade(), p1);
		pessoasMap.put(p2.getIdade(), p2);
		pessoasMap.put(p3.getIdade(), p3);
		pessoasMap.put(p4.getIdade(), p4);
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a idade: ");
		Integer idade = teclado.nextInt();
		
		System.out.println(pessoasMap.get(idade));
		
		teclado.close();
		
		Map<Integer, List<Pessoa>> pessoasPorIdade = new HashMap<>();
		pessoasPorIdade.put(34, Arrays.asList(p1, p2));
		pessoasPorIdade.put(35, Arrays.asList(p1, p2, p3));
		
		pessoasPorIdade.forEach((k, v) -> v.forEach(System.out::println));
		
		Boolean containsValue = pessoasMap.containsValue(p1);
		System.out.println(containsValue);
		
		System.out.println(pessoasMap.containsKey(34));
		
	}
	
}
