package primeiro_projeto;

import java.util.Scanner;

public class Code16SwitchCaseFaixaEtarias2 {

	public static void main(String args[]) {
		int idade;
		String cat;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a idade do competidor: ");
		idade = entrada.nextInt();
		switch (idade) {
		case 10:
		case 11:
		case 12:
		case 13:
			cat = "Infantil";
			break;
		case 14:
		case 15:
		case 16:
			cat = "Juvenil";
			break;
		case 17:
		case 18:
		case 19:
		case 20:
			cat = "Júnior";
			break;
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
			cat = "Adulto";
			break;
		default:
			if (idade >= 31 && idade <= 99)
				cat = "Veterano";
			else
				cat = "Idade inválida";
		}

		System.out.printf("A categoria do competidor é %s.", cat);
		entrada.close();
	}
}
