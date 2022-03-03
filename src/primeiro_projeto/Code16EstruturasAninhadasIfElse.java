package primeiro_projeto;

import java.util.Scanner;

public class Code16EstruturasAninhadasIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o numero do dia da semana: ");
		int x = sc.nextInt();

		String dia;
		if (x == 1) {
			dia = "Domingo";
		} else if (x == 2) {
			dia = "Segunda-feira";
		} else if (x == 3) {
			dia = "Terca-feira";
		} else if (x == 4) {
			dia = "Quarta-feira";
		} else if (x == 5) {
			dia = "Quinta-feira";
		} else if (x == 6) {
			dia = "Sexta-feira";
		} else if (x == 7) {
			dia = "Sabado";
		} else {
			dia = "Valor Invalido";
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}