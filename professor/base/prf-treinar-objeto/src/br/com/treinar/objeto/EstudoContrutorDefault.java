package br.com.treinar.objeto;

@SuppressWarnings("unused")
public class EstudoContrutorDefault {

	public static void main(String[] args) {
		/*
		 * Utilizou o construtor default que nao precisou ser declarado
		 * na classe MyClass1 porque toda classe jah Herda de Object e tem 
		 * o construtor default
		 * 
		 * */
		MyClass1 clazz = new MyClass1();
		//System.out.println(clazz);
	}
	
}
