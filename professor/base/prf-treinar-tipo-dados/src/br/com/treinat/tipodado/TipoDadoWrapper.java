package br.com.treinat.tipodado;

public class TipoDadoWrapper {

	public static void main(String[] args) {
		Integer i = 100;
		Integer j = new Integer(100);
		Integer k = 1000;
		Integer l = 1000;
		int m = 100;
		int n = 100;
		int o = 1000;
		int p = 1000;
		System.out.println(i == j);//true
		System.out.println(k == l);//false
		System.out.println(k.equals(l));//true
		System.out.println(m == n);//true
		System.out.println(o == p);//true
	}

}
