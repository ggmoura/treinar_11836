package br.com.treinar.operadorlogico;

public class OperadorOu {

	public static void main(String[] args) {
		int idade = 18;
		boolean convidado = false;
		boolean ehMulher = true;
		boolean podeEntrarNaFesta = (idade >= 18 || convidado) & ehMulher;
		System.out.println(podeEntrarNaFesta);
		
		boolean a = false;
		boolean b = false;
		boolean c = a || b;
		System.out.println(c);
	}
	
}