package br.com.jb.operador;

public class Atividade2 {
	public static void main(String[] args) {
		int i = 0;
		i = i + 1;
		System.out.println("i = i+ " + i);
		i += 1;
		System.out.println("i +=  " + i);
		i++;
		System.out.println("i++  " + i);
		int h = i++;
		System.out.println("h = " + h);
		System.out.println("i = " + i);
		System.out.println("i++ = " + i++);
		System.out.println("i++2 = " + i++);
	}
}
