package br.com.caelum.contas.modelo;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente pra sacar o valor de: " + valor);
	}

}
