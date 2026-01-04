package cursoudemy;

import java.util.Scanner;

public class main22 {

	public static void main(String[] args) {
		 
		Scanner sc= new Scanner(System.in);
		
		double a, b, c, delta, pow, x1, x2;
		
		a = 1;
		b= -5;
		c= 6;
		pow=  Math.pow(b, 2);
		delta= pow - 4*a*c;
		x1= ((-b + Math.sqrt(delta)) / (2*a));
		x2= ((-b - Math.sqrt(delta)) / (2*a));
		
	    System.out.println("O resltado da formlua de bhaskara é: " + x1);
	    System.out.println("O resltado da formlua de bhaskara é: " + x2);
	  
	    sc.close();
		
	}

}
