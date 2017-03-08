package br.com.caelum.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(Conta c) {
		for (int i = 0; i < this.contas.length; i++) {
			if (this.contas[i] == null) {
				this.contas[i] = new ContaCorrente();
				this.contas[i] = c;
			}
		}
	}
}
