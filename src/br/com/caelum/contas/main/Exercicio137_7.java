package br.com.caelum.contas.main;

public class Exercicio137_7 {
	public static void main(String[] args) {
		StringBuilder testeC = new StringBuilder();
		testeC.insert(0, "Socorram-me, subi no ônibus em Marrocos");
		for (int i = (testeC.length() - 1); i >= 0; i--) {
			testeC.append("1", i, i);
		}
		System.out.println(testeC);
	}
}
