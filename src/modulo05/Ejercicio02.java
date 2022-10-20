package modulo05;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] vector = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
		int x = 0;
		double suma = 0;
		int mesMin = 0;
		int mesMax = 0;
		double menor = vector[0];
		double mayor = vector[0];
		for(x=0; x<vector.length; x++)
			{
			suma = suma + vector[x];
			if(vector[x]<menor)
				{menor = vector[x];
			     mesMin=x+1;}
			if(vector[x]>mayor)
			    {mayor = vector[x];
		         mesMax=x+1;}
			}
		System.out.println("La inflacion anual es: " + suma);
		System.out.println("La inflacion minima es " + menor + " en el mes " + mesMin);
		System.out.println("La inflacion maxima es " + mayor + " en el mes " + mesMax);
		System.out.println("El promedio es: " + (suma/12));
	}
}
