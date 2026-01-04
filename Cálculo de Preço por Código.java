package cursoudemy;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int cod;
		int valorHotdog = 4;
		int valorXsalada = 5;
		int valorXbacon = 5;
		int valorTorrada = 2;
		int valorRefri = 1;
		int quantidade;
		int preco = 0;
		
		
		System.out.printf("digite o numero do pedido\n");
		cod= sc.nextInt();	  
		  
		System.out.printf("quantos vai querer?\n");
		quantidade = sc.nextInt();
			
		if(cod == 1 ) {
			 preco = quantidade * valorHotdog;
		}  
		else if(cod == 2  ) {
			 preco = quantidade * valorXsalada;
		}  
		else if(cod == 3   ) {
			 preco = quantidade * valorXbacon;
		}  
		else if(cod == 4  ) {
			 preco = quantidade *  valorTorrada;
		}  
		else if(cod == 5  ) {
			 preco = quantidade *  valorRefri;
		}  
		
			 		          
	        
	     System.out.printf("Deu: %d REAIS\n", preco);   
	        
	       
		
		
		
		
		
		
		
	


}



	}


