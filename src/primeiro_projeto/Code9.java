package primeiro_projeto;

import java.text.NumberFormat;
import java.util.Locale;

public class Code9 {
	public static void main(String[] args) {
		 Locale localeBR = new Locale("pt","BR");
		 
	      double valorReal = 291933.1233;
	      float valorPercentual = 0.11f;
	      int valorInteiro = 82819912;
	 
	      NumberFormat inteiro = NumberFormat.getInstance();  
	      NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
	      NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
	      NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);
	 
	      System.out.println("Valor Atual: "+valorReal);
	      System.out.println("Valor Formatado em Moeda: "+dinheiro.format(valorReal));
	 
	      System.out.println("Valor Atual: "+valorPercentual);
	      System.out.println("Valor Formatado em Percentual: "+percentual.format(valorPercentual));
	 
	      System.out.println("Valor Atual: "+valorInteiro);
	      System.out.println("Valor Formatado: "+inteiro.format(valorInteiro));
	 
	      System.out.println("Valor Atual: "+valorReal);
	      System.out.println("Valor Formatado padrão: "+numberFormat.format(valorReal));
	  }
	 }