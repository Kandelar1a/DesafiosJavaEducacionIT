package modulo03;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=-2, c=5;
		
		if(a>0 & b>0)
		{
			System.out.println("a y b son numeros positivos");
			System.out.print("Multiplicación a*b= ");
			int d = a*b;
		    System.out.println(d);
	    }
		else 
			if(a>0 & c>0)
			{
				System.out.println("a y c son numeros positivos");
				System.out.print("Multiplicación a*c= ");
				int d = a*c;
			    System.out.println(d);
		    }
			else 
			{
			    System.out.println("b y c son numeros positivos");
		        System.out.print("Multiplicación b*c= ");
		        int d = b*c;
	            System.out.println(d);
			}
				
}}
