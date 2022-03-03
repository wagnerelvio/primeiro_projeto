package primeiro_projeto;

import java.util.Scanner;

public class Code11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x;
		System.out.printf("Digite um numero com duas casas decimais: ");
		x = sc.nextDouble();

		sc.close();
		System.out.printf("Foi digitado o numero: %.2f%n", + x);

	}
}