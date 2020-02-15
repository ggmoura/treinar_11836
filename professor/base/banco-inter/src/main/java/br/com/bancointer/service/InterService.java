package br.com.bancointer.service;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import br.com.bancointer.model.conta.ContaCorrente;
import br.com.bancointer.model.conta.TipoTransferencia;
import br.com.bancointer.model.conta.Transferencia;
import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.LimiteDiarioException;
import br.com.bancointer.model.core.SaldoInsuficienteException;

public class InterService {

	private static final int PERIOD = 1000 * 15 * 100;
	private static InterService instance;
	
	static {
		instance = new InterService();
	}
	
	public static InterService getInstance() {
		return instance;
	}
	
	private InterService() {
		super();
	}
	
	public void iniciarMonitoramento() {
		Timer timer = new Timer("MEU_TIMER");
		TimerTask task = new MonitoramentoTask();
		timer.schedule(task, 0, PERIOD);
	}
	
	public void efetuarTransferencia(Conta origem, Conta destino, TipoTransferencia tipo, Double valor) {
		Calendar agora = Calendar.getInstance();
		switch (tipo) {
		case DIRETA:
			agora.add(Calendar.SECOND, 2);		
			break;
		case DOC:
			agora.add(Calendar.SECOND, 60);
			break;
		case TED:
			agora.add(Calendar.SECOND, 30);
			break;
		default:
			break;
		}
		Timer timerTransferencia = new Timer("TIMER_TRANSFERENCIA");
		timerTransferencia.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					if (origem instanceof ContaCorrente) {
						((ContaCorrente)origem).sacar(valor, Boolean.FALSE, Boolean.TRUE);
					} else {
						origem.sacar(valor);
					}
					criarTransferencia(origem, destino, valor);
				} catch (SaldoInsuficienteException | LimiteDiarioException e) {
					System.out.println("Transferencia nao executada");
				}
			}

			private void criarTransferencia(Conta origem, Conta destino, Double valor) {
				destino.depositar(valor);
				Transferencia t = new Transferencia();
				t.setDestino(destino);
				t.setOrigem(origem);
				t.setValor(valor);
				t.setDataRealizacao(new Date());

				origem.getTransferencias().add(t);
				destino.getTransferencias().add(t);
			}
		}, agora.getTime());
	}
	
	
}
