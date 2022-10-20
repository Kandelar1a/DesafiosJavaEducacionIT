package modulo04;

public class Ejercicio02 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a = 2;
		float b = 100;
		int c = 2;
		float interes = a/b;
		double dinero = 1000;
		int mes = 1;
		while (mes<=12)
		      {
			   dinero = dinero+(dinero*interes);
			   mes ++;
			   System.out.println(String.format("%."+c+"f",dinero));
		      }
	}

}
