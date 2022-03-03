package primeiro_projeto;

import java.util.Scanner;

public class Code13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String x1, x2, x3;

		System.out.printf("Informe o valor de x1:  ");
		x1 = sc.nextLine();
		System.out.printf("Informe o valor de x2:  ");
		x2 = sc.nextLine();
		System.out.printf("Informe o valor de x3:  ");
		x3 = sc.nextLine();

		System.out.println("OS dados informados foram:");
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		sc.close();
	}
}