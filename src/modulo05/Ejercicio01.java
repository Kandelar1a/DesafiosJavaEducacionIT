package modulo05;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		short[]vector = {10,20,5,15,30,20};
		short x = 0;
		int suma = 0;
		short mayor = Short.MIN_VALUE;
		int cont = 0;
		for(x=0;x<vector.length;x++)
			{
			suma=suma+vector[x];
			if((x%2)!=0)	
				System.out.println("El contenido de la posicion impar "+x+" es: "+vector[x]);
			if(vector[x]>mayor)
				mayor=vector[x];
		    if(vector[x]==20)
		    	cont++;
			}
		System.out.println("La suma de los valores del vector es: " + suma);	
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("Cantidad de veces que se repite el numero 20: " + cont);

		}

}

