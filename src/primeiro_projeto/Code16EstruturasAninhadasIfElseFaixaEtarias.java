package primeiro_projeto;

import java.util.Scanner;

public class Code16EstruturasAninhadasIfElseFaixaEtarias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade;
		String cat;

		System.out.print("Informe a idade do competidor: ");
		idade = sc.nextInt();
		if (idade >= 10 && idade <= 13)
			cat = "Infantil";
		else if (idade >= 14 && idade <= 16)
			cat = "Juvenil";
		else if (idade >= 17 && idade <= 20)
			cat = "Júnior";
		else if (idade >= 21 && idade <= 30)
			cat = "Adulto";
		else if (idade >= 31 && idade <= 99)
			cat = "Veterano";
		else
			cat = "Idade  inválida";
		System.out.printf("A categoria do competidor é %s.", cat);
		sc.close();
	}
}
