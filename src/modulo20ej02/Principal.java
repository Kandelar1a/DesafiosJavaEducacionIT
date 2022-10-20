package modulo20ej02;

import java.util.Scanner;


public class Principal {


	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		final String mensajeDocumentos = "\n\t1-Documento Nacional de Identidad -DNI \n\t2-Libreta "
				+ "Cívica - LC \n\t3-Libreta de Enrolamiento - LE \n\t4-Pasaporte - PAS \n\t5-Cédula de Identidad -CI";
		boolean existePersona = false;
		Persona[] personas;
		String[] documentos = {"DNI","LC","LE","PA","CI"};
		
		System.out.print("Indique la cantidad de personas: ");
		int cantidadPersonas = teclado.nextInt();
	    personas = new Persona[cantidadPersonas];
		
	    for (int i=0; i<personas.length; i++ ) {
	    System.out.println("Persona ["+ (i + 1) + "]:");
	    System.out.print("Indique el nombre: ");
	    String nombre = teclado.next();
	    System.out.print("Indique el apellido: ");
	    String apellido = teclado.next();
	    
	    	existePersona = false;
	        System.out.println("Documentos de "+ nombre + " " + apellido + ":" + mensajeDocumentos);
	        
	        System.out.print("Tipo: ");
	    	int indiceTipoDocumento = teclado.nextInt();
			String tipo = documentos[indiceTipoDocumento - 1];
	   
	    	System.out.print("Número: ");
	    	String numero = teclado.next();
	    	
	   do {	
	    	for (int j=0, e=0; j<e; j++ ) {
	    	   if (personas[j].getNumeroDocumento() == numero && personas[j].getTipoDocumento().equals(tipo))
	    	      {existePersona = true;    		   
	    		   System.out.println("Tipo y Número de Documento Existente");
	    		   break;
	    		   }
	         }
	    }while (existePersona);
	    
	    Persona p = new Persona();
		  
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setTipoDocumento(tipo);
		p.setNumeroDocumento(numero);
		System.out.println(p.getDatos());
		}

	teclado.close();    
}}
