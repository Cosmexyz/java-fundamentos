package cursoudemy;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda;
		double imposto = 0;
		
		System.out.println("Digite o seu salario");
		renda = sc.nextDouble();
		
		if(renda >= 0.00 && renda <= 2000.00) {
			imposto = 0;
		}
        else if (renda >= 2000.01 && renda <= 3000.00) {
        	imposto = renda * 8.0/100;
		}
        else if (renda >= 3000.01 && renda < 4500.00) {
        	imposto = (renda - 2000 - 2 ) *8.0/100 + 2 *18.0/100;
        }
        else if (renda >= 4500.00) {
        	imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}		
		
		
		if(renda <2000) {
			System.out.println("isento");
		}
		else {
			System.out.println("seu imposto é de " + imposto );
			
		}
		
		sc.close();

	}

}
