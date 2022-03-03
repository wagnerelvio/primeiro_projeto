package primeiro_projeto;

import java.util.Scanner;

public class Code12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char sexo;
		System.out.printf("Informe o seu sexo: M ou F:  ");
		sexo = sc.next().charAt(0);

		sc.close();
		System.out.println("Foi digitado o tipo:" + sexo);

	}
}