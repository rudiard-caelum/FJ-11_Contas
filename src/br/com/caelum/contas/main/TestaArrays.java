package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
	public static void main(String[] args) {
		ContaCorrente[] contas = new ContaCorrente[10];
		double media = 0.0;
		for (int i = 0; i < contas.length; i++) {
			contas[i] = new ContaCorrente();
			contas[i].deposita(i * 100);
		}
		for (ContaCorrente c : contas){
			media += c.getSaldo();
		}
		media = media / contas.length;
		System.out.println(media);
	}
}
