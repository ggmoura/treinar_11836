package br.com.treinar.operador;

public class OperadorIncremento {

	public static void main(String[] args) {
		int i = 0;
		i = i + 1;
		System.out.println("i = " + i);
		i += 1;
		System.out.println("i = " + i);
		i++;
		System.out.println("i = " + i);
		
		System.out.println(i++);
		
		int j = i;
		
		System.out.println(j);
		
		int h = i++;
		
		System.out.println("h = " + h);
		System.out.println("i = " + i);
		
		System.out.println(++i);
		
	}

}
