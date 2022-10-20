package modulo03;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 100;
		int n2 = 500;
		int n3 = 250;
		
		if ((n1 > n2) & (n1 > n3))
		System.out.println("n1 es el mayor: "+n1);
		else 
			if ((n2 > n1) & (n2 > n3))
				System.out.println("n2 es el mayor: "+n2);
			else System.out.println("n3 es el mayor: "+n3);
			

	}

}
