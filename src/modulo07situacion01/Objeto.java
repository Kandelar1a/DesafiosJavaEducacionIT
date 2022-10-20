package modulo07situacion01;

public class Objeto {

	public static void main(String[] args) {
		
		Elemento e = new Elemento();
		   e.Alto = 20;
		   e.Ancho = 10;
		   e.Peso = 50;
		   e.setTipoElemento("Lata");

		System.out.println("Datos del elemento:");
		System.out.println("Peso: " + e.Peso);
		System.out.println("Alto: " + e.Alto);
		System.out.println("Ancho: " + e.Ancho);
		System.out.println("Tipo: " + e.getTipoElemento());
		
		System.out.println("");

	    Recibo r = new Recibo();
		   r.TipoElemento = e.getTipoElemento();
		   r.TotalDiario = 30;
		   r.setValor(200);

	    System.out.println("Datos del recibo:");
		System.out.println("Tipo de elemento: " + r.TipoElemento);
		System.out.println("Total: " + r.TotalDiario);
		System.out.println("Valor: " + r.getValor());
	   
	}

}
