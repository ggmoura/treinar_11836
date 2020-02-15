package br.com.bancointer.principal;

import br.com.bancointer.service.InterService;
import br.com.bancointer.view.TelaBancoInter;

public class Principal {
	
	public static void main(String[] args) {
		
		InterService.getInstance().iniciarMonitoramento();
		
		TelaBancoInter banco = new TelaBancoInter();
		banco.iniciar();
		System.out.println("Fim do programa... ");
	}

}
