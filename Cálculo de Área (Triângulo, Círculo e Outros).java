package cursoudemy;

public class Main3 {

	public static void main(String[] args) {
		
		
		double a, b, c, areaTriangulo, areaCirculo, pi, areaTrapezio, 
		areaQuadrado, areaRetangulo; 
		
        a= 12.7 ;
        b= 10.4;
        c=  15.2 ;
        pi= 3.14159;
        
        areaTriangulo= a * c / 2;
        areaCirculo= pi * (Math.pow(c, 2.0));
        areaTrapezio= (a + b) * c / 2;
        areaQuadrado= b * b;
        areaRetangulo= a * b;
		
        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: "
        		+ "%.3f%nRETANGULO: %.3f", areaTriangulo, areaCirculo, areaTrapezio,  
        		areaQuadrado,  areaRetangulo );
        
        
        
        
	}
}
