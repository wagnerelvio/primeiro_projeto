package primeiro_projeto;

import java.text.NumberFormat;
import java.util.Locale;

public class Code7 {
	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Locale localeBR = new Locale("pt", "BR");

		/*
		 * %f = Ponto Flutuante %d = Inteiro %s = Texto %n = Quebra de linha
		 */
		String nome = "Cris";
		int idade = 20;
		double salario = 102000.00;
		
		
		NumberFormat inteiro = NumberFormat.getInstance();
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
		NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
		NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);
		
		
		
		//System.out.print("%s tem %d anos e ganha", nome, idade, salario);
		//System.out.println("Salario" +dinheiro.format(salario));
		System.out.println("Valor Atual: "+salario);
		System.out.println("Valor Formatado em Moeda: "+dinheiro.format(salario));
		
		
	}
}