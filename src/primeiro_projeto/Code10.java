package primeiro_projeto;

import java.util.Scanner;

public class Code10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x;
		System.out.printf("Digite uma palavra: ");
		x = sc.next();

		sc.close();
		System.out.println("Foi digitado a palavra:  " + x);

	}
}