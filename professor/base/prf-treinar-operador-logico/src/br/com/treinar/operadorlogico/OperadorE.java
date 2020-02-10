package br.com.treinar.operadorlogico;

public class OperadorE {

	public static void main(String[] args) {
		int idade = 18;
		boolean convidado = true;
		boolean podeEntrarNaFesta = idade >= 18 && convidado;
		System.out.println(podeEntrarNaFesta);
	}
	
}
