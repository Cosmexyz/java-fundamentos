package cursoudemy;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
	
		Scanner sc= new Scanner(System.in);
		int hora;
		
		   System.out.printf("Que horas?");
		   hora= sc.nextInt();
		   
		if(hora  < 6) {
		   System.out.printf("boa madrugada%n");
		}
		else if(hora < 12) { 
			System.out.printf("bom dia%n"); 
			 }
	    else if(hora < 18){
			System.out.printf("boa tarde%n");
			 }
		else {
			System.out.printf("boa noite%n"); 
			 }
		
		sc.close();

	}
}