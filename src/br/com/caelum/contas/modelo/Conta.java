package br.com.caelum.contas.modelo;

/**
 * Esta classe representa uma conta bancária
 * 
 * @author Rudiard Rodrigues
 *
 */
public abstract class Conta implements Comparable<Conta> {
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;

	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

	@Override
	public String toString() {
		return "[titular=" + this.titular.toUpperCase() + ", número="
				+ this.numero + ", agencia=" + this.agencia + "]";
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}

		Conta outraConta = (Conta) object;
		if (this.agencia.equals(outraConta.getAgencia())
				&& this.numero == outraConta.numero) {
			return true;
		}
		return false;
	}

	public abstract String getTipo();

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException(
					"Você tentou depositar um valor negativo");
		} else {
			this.saldo = this.saldo + valor;
		}

	}

	/**
	 * Este método realiza saque da conta, validando se há saldo disponível.
	 * 
	 * @param valor
	 *            informar o valor a ser sacado da conta.
	 * @return True se o saque foi realizado ou False se o saque não foi
	 *         realizado.
	 */
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException(
					"Você tentou sacar um valor negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo = this.saldo - valor;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: R$ " + this.saldo;
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}
}
