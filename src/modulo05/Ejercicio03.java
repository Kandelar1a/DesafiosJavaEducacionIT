package modulo05;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] vector = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
		String[] mes = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", 
				        "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
		
		int x = 0;
		String mesMin = "";
		String mesMax = "";
		double menor = vector[0];
		double mayor = vector[0];
		for(x=0; x<vector.length; x++)
			{
			if(vector[x]<menor)
				{menor = vector[x];
			     mesMin=mes[x];
			     }
			if(vector[x]>mayor)
			    {mayor = vector[x];
		         mesMax=mes[x];}
			}
		System.out.println("La inflacion minima es " + menor + " en el mes "+ mesMin);
		System.out.println("La inflacion maxima es " + mayor + " en el mes " + mesMax);
		
	}

}
