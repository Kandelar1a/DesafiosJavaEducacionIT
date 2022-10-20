package modulo21ej02;

public class Formato {

	public static String FORMATO_BANCO_SUCURSAL;
	public static String FORMATO_CUENTA;
	public static String FORMATO_TC;
	public static String FORMATO_CLAVE_SEGURIDAD_TC;
	
	static {
		
		FORMATO_BANCO_SUCURSAL = "####";
		FORMATO_CUENTA = "###-#-#####/#";
		FORMATO_TC = "#### #### #### ####";
		FORMATO_CLAVE_SEGURIDAD_TC = "###";
	}

	public static String getFormato(int numero, String tipo) {
		String formato = "";
		switch (tipo.toUpperCase()) {
		
		case "BANCO":
		case "SUCURSAL":
			formato = getNumero(numero, FORMATO_BANCO_SUCURSAL);
			break;		
		case "CC":
		case "CA":
			formato = getNumero(numero, FORMATO_CUENTA);
			break;
		case "TC":
			formato = getNumero(numero, FORMATO_TC);
			break;	
		case "CS":
			formato = getNumero(numero, FORMATO_CLAVE_SEGURIDAD_TC);
			break;
		default:
			break;
		}
		return formato;
	}

	private static String getNumero(int numero, String formato) {
		
		int cantidadCeros = contarCaracteres(formato);

		String numeroCadena = String.format("%0" + cantidadCeros + "d", numero);
		String numeroFinal = "";
		int indiceNumeroCadena = 0;
		
		for (int i = 0; i < formato.length(); i++) {
			numeroFinal += formato.charAt(i);
			
			if (formato.charAt(i) == '#') {
				numeroFinal = numeroFinal.replace("#", String.valueOf(numeroCadena.charAt(indiceNumeroCadena)));
				indiceNumeroCadena++;
			}
		}

		return numeroFinal;
	}

	private static int contarCaracteres(String formato) {
		int cantidad = 0;
		for (int i = 0; i < formato.length(); i++) {
			if (formato.charAt(i) == '#') {
				cantidad++;
			}
		}
		return cantidad;
	}
}
