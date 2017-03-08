package br.com.caelum.contas.main;

public class Exercicio137_6 {
	public static void main(String[] args) {
		String testeA = "Socorram-me, subi no ônibus em Marrocos";
		for (int i = (testeA.length() - 1); i >= 0; i--) {
			System.out.print(testeA.charAt(i));
		}
		testeA = "anotaram a data da maratona";
		for (int i = (testeA.length() - 1); i >= 0; i--) {
			System.out.print(testeA.charAt(i));
		}
	}
}
