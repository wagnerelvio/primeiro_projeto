package primeiro_projeto;

import java.util.Locale;

public class Code8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		/*
		 * %f = Ponto Flutuante %d = Inteiro %s = Texto %n = Quebra de linha
		 */
		String nome = "Cris";
		int idade = 20;
		double salario = 10000.00;
		System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, salario);
	}
}