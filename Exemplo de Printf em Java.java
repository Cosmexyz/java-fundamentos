package cursoudemy;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	 
		String produto1= "Computador";
		String produto2= "Mesa de trabalho";
		
		int idade= 30;
		int code= 5290;
		char genero= 'F';
		
		double preço1= 2100.0;
		double preço2= 650.50;
		double medida= 53.234567;
		
		
		System.out.printf("Produtos:%n%S, cujo o preço é $%.2f%n%s, cujo o preço é $%.2f%n", produto1, preço1, produto2, preço2);
		System.out.println("Produtos:\n" + produto1 + "," + " cujo o  preço é $" + preço1 + "\n" + produto2 + "," + " cujo o preço é $" + preço2 );
		
		System.out.println();
		
		System.out.printf("Registro: %danos, codigo %d e sexo %s%n", idade, code, genero);
		System.out.println("Registro: " + idade + "anos" + "," + " codigo " + code + " e sexo " + genero);
		
		System.out.println();
		
		System.out.printf("Medidas com oito casas decimais: %f%nArredondano(tres casas decimais): %.3f",medida, medida);
		Locale.setDefault(Locale.US);
		System.out.println();
		System.out.printf("Ponto decimal dos EUA: %.3f%n",medida, medida);
		
	}

}
