package cursoudemy;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int intervalo1= 0;
		int intervalo2= 25;
		int intervalo3= 50;
		int intervalo4= 75;
		int intervalo5= 100;
		double numero;
		
		System.out.println("Digite um numero:");
		numero = sc.nextDouble();
		
		
		if (numero < 0 || numero > 100) {
			System.out.println("numero invalido"); 	 
		}
		else if(numero <= 25) {
			System.out.println("intervalo " + intervalo1 + "," + intervalo2 ); 
		}
		else if(numero < 50){		
			System.out.println("intervalo " + intervalo2 + "," + intervalo3 ); 
		}
	    else if (numero < 75){
	    	System.out.println("intervalo " + intervalo3 + "," + intervalo4 ); 	    	
	    }
	    else if (numero <= 100) {
	    	System.out.println("intervalo " + intervalo4 + "," + intervalo5 ); 	 
	    }
	      
	    
	    	
	    	
	    
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
