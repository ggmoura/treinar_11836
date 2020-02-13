package br.com.treinar.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class AtividadeCollection {

	public static void main(String[] args) {
		Collection itens = new ArrayList();
		
		itens.add("Gleidson");
		itens.add(100);
		itens.add(3.14);
		itens.add(8.14);
		
		Iterator it = itens.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
	
}
