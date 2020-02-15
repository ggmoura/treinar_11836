package br.com.bancointer.view;

import java.util.Arrays;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.bancointer.data.InterDatabase;
import br.com.bancointer.model.conta.ContaCorrente;
import br.com.bancointer.model.conta.ContaInvestimento;
import br.com.bancointer.model.conta.ContaPoupanca;
import br.com.bancointer.model.conta.TipoTransferencia;
import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.LimiteDiarioException;
import br.com.bancointer.model.core.SaldoInsuficienteException;
import br.com.bancointer.service.InterService;

public class TelaBancoInter {

	private Scanner teclado = new Scanner(System.in);
	private InterDatabase database;
	
	public TelaBancoInter() {
		database = InterDatabase.getInstance();
	}
	
	public String recuperarMenu() {
		return "Informe\n\t"
				+ "0 - Sair\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Exibir Saldo\n\t"
				+ "3 - Depositar\n\t"
				+ "4 - Sacar\n\t"
				+ "5 - Exibir Limite De Crédito\n\t"
				+ "6 - Obter Rendimento\n\t"
				+ "7 - Realizar Pagamento\n\t"
				+ "8 - Cadastrar taxa de rendimento\n\t"
				+ "9 - Efetuar transferência\n\t"
				+ "\n=> ";
	}

	public void iniciar() {
		Integer opcao;
		do {
			System.out.print(recuperarMenu());
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				menuCriarConta();
				break;
			case 2:
				exibirSaldo();
				break;
			case 3:
				depositar();
				break;
			case 4:
				sacar();
				break;
			case 5:
				exibirLimiteCredito();
				break;
			case 6:
				obterRendimento();
				break;
			case 7:
				realizarPagamento();
				break;
			case 8:
				cadastrarTaxaRendimento();
				break;
			case 9:
				efetuarTransferencia();
				break;
			case 10:
				listarTransferencia();
				break;
			case 0:
				imprimirContas();
				break;
			default:
				break;

			}
		} while (!opcao.equals(0));
	}

	private void listarTransferencia() {
		System.out.println("-----------------------------------------");
		Conta c = recuperarConta();
		c.getTransferencias().forEach(t -> {
			String acao = c.getNumero().equals(t.getOrigem().getNumero()) ? "Efetuada" : "Recebida";
			System.out.println("Valor: " + t.getValor() + " " + acao);
		});
		System.out.println("-----------------------------------------");
	}

	private void efetuarTransferencia() {
		System.out.print("Origem: ");
		Conta origem = recuperarConta();
		System.out.print("Destino: ");
		Conta destino = recuperarConta();
		System.out.print("Informe o valor da transferência: ");
		Double valor = teclado.nextDouble();
		System.out.print("Informe o tipo da conta " + Arrays.asList(TipoTransferencia.values()) + ": ");
		teclado.nextLine();
		TipoTransferencia tipo = TipoTransferencia.valueOf(teclado.nextLine());
		InterService.getInstance().efetuarTransferencia(origem, destino, tipo, valor);
	}

	private void imprimirContas() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(database.recuperarContas()));
	}

	private void cadastrarTaxaRendimento() {
		System.out.print("Informe a taxa de rendimento: ");
		ContaPoupanca.setTaxaRendimento(teclado.nextDouble());
		System.out.println("Taxa cadastrada com sucesso!");
	}

	private void realizarPagamento() {
		database.realizarPagamento();
	}

	private void obterRendimento() {
		database.obterRendimento();
	}

	private void exibirLimiteCredito() {
		Conta c = recuperarConta();
		if (c instanceof ContaCorrente) {
			System.out.println("Limite de crédito: " + ((ContaCorrente)c).getLimiteCredito());
		} else {
			System.out.println("Este tipo de conta nao possui limite de crédito, faça um empréstimo!");
		}
	}

	private void sacar() {
		Conta c = recuperarConta();
		System.out.print("Informe o valor a ser sacado: ");
		Double valor = teclado.nextDouble();
		try {
			c.sacar(valor);
			System.out.println("Saque efetuado com sucesso!");
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente, você pode sacar o valor de :".concat(e.getSaldoDisponivel().toString()).concat(", contrate um empréstimo!"));
		} catch (LimiteDiarioException e) {
			System.out.println("Passa amanhã!");
		}
	}

	public String recuperarMenuCriarConta() {
		return "Informe\n\t"
				+ "1 - Conta Corrente\n\t"
				+ "2 - Conta Poupança\n\t"
				+ "3 - Conta Salário\n\t"
				+ "4 - Conta Investimento\n\t"
				+ "\n=> ";
	}
	
	private void criarConta(Conta conta) {
		System.out.print("Informe o numero da conta: ");
		Integer numeroConta = teclado.nextInt();
		conta.setNumero(numeroConta);
		System.out.print("Informe o numero da agencia: ");
		conta.setAgencia(teclado.nextInt());
		System.out.print("Informe o saldo da conta: ");
		conta.depositar(teclado.nextDouble());
	}
	
	private void menuCriarConta() {
			System.out.print(recuperarMenuCriarConta());
			Integer opcao = teclado.nextInt();
			Conta c = null;
			switch (opcao) {
			case 1:
				c = criarContaCorrente();
				break;
			case 2:
				c = criarContaPoupanca();
				break;
			case 3:
				c = criarContaSalario();
				break;
			case 4:
				c = criarContaInvestimento();
				break;
			default:
				break;
			}
			database.adicionarConta(c);
	}

	private Conta criarContaCorrente() {
		ContaCorrente c = new ContaCorrente();
		criarConta(c);
		System.out.print("Informe a taxa de manutencao: ");
		c.setTaxaManutencao(teclado.nextDouble());
		System.out.print("Informe o limite de Crédito: ");
		c.setLimiteCredito(teclado.nextDouble());
		return c;
	}
	
	private Conta criarContaInvestimento() {
		ContaInvestimento c = new ContaInvestimento();
		criarConta(c);
		System.out.print("Informe a taxa de manutencao: ");
		c.setTaxaManutencao(teclado.nextDouble());
		System.out.print("Informe a taxa de rendimento: ");
		c.setTaxaRendimento(teclado.nextDouble());
		return c;
	}
	
	private Conta criarContaPoupanca() {
		ContaPoupanca c = new ContaPoupanca();
		criarConta(c);
		return c;
	}
	
	private Conta criarContaSalario() {
		ContaCorrente c = new ContaCorrente();
		criarConta(c);
		return c;
	}

	private void exibirSaldo() {
		Conta conta = recuperarConta();
		if (conta != null) {
			System.out.println("Saldo atual: " + conta.recuperarSaldo());
		} else {
			System.out.println("Crie a conta primeiro.");
		}
	}

	private void depositar() {
		Conta conta = recuperarConta();
		System.out.print("Informe o valor a ser depositado: ");
		Double valor = teclado.nextDouble();
		conta.depositar(valor);
	}
	
	private Conta recuperarConta() {
		System.out.print("Informe o numero da conta: ");
		Integer numeroConta = teclado.nextInt();
		return database.recuperarConta(numeroConta);
	}

}

