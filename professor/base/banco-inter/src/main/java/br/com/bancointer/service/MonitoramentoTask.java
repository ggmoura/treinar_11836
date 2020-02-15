package br.com.bancointer.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class MonitoramentoTask extends TimerTask {

	@Override
	public void run() {
		System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + " - Executando");
	}

}
