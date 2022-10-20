package modulo07situacion02;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Objeto {

public static void main(String[] args) throws ParseException {
		
		Persona p = new Persona();
		   p.setDNI("42.390.555");
		   p.Nombre = "Jacinta Flores";
		   p.Direccion = "Magnolia 111";
		
	    Persona p1 = new Persona();
		   p1.setDNI("30.697.444");
		   p1.Nombre = "Rodolfo Robinson";
		   p1.Direccion = "Pedro Goyena 333";   
		   
		Persona p2 = new Persona();
		   p2.setDNI("32.111.567");
		   p2.Nombre = "Azul Ocean";
		   p2.Direccion = "Corrientes 222";   
			
		
		System.out.println("");

	    Carrera c = new Carrera();
		   c.Nombre = "Contador";
		   c.Sede = "Cordoba";		   
		Carrera c1 = new Carrera();
		   c1.Nombre = "Actuario";
		   c1.Sede = "Cordoba";
		   
		List<Carrera> ListaDeCarreras = new ArrayList<Carrera>();
		ListaDeCarreras.add(c);
		ListaDeCarreras.add(c1);
		System.out.println("Carreras disponibles:");
		System.out.println(c.Nombre);
		System.out.println(c1.Nombre);
		
		System.out.println("");
		
		Profesor pr = new Profesor();
		   pr.ID_Profesor = "134";
		   pr.Persona = p1;
		   pr.setDepartamento("Matematica");
		Profesor pr1 = new Profesor();
		   pr1.ID_Profesor = "132";
		   pr1.Persona = p2;
		   pr1.setDepartamento("Contabilidad");
	    
		AsignaturaActual asig = new AsignaturaActual();
			asig.Nombre = "Calculo Financiero";
			asig.setTipo("Obligatoria");
			asig.Cuatrimestre = "1";
			asig.Carga_Horaria = "6";
			asig.Carreras = ListaDeCarreras;
            asig.Profesor = pr;
			System.out.println("Datos de la Asignatura/Materia:");
			System.out.println("Nombre: " + asig.Nombre);
			System.out.println("Carrera: " + c.Nombre + " y " + c1.Nombre);
			System.out.println("Tipo de cursada: " + asig.getTipo());
			System.out.println("Cuatrimestre: " + asig.Cuatrimestre);
			System.out.println("Carga horaria: " + asig.Carga_Horaria);
			System.out.println("Profesor: " + asig.Profesor.Persona.Nombre);
			
			System.out.println();
			
		AsignaturaActual asig1 = new AsignaturaActual();
			asig1.Nombre = "Sistemas Contables";
			asig1.setTipo("Optativa");
			asig1.Cuatrimestre = "2";
			asig1.Carga_Horaria = "8";
			asig1.Carreras = ListaDeCarreras;
            asig1.Profesor = pr1;
			System.out.println("Datos de la Asignatura/Materia:");
			System.out.println("Nombre: " + asig1.Nombre);
			System.out.println("Carrera: " + c.Nombre);
			System.out.println("Tipo de cursada: " + asig1.getTipo());
			System.out.println("Cuatrimestre: " + asig1.Cuatrimestre);
			System.out.println("Carga horaria: " + asig1.Carga_Horaria);
			System.out.println("Profesor: " + asig1.Profesor.Persona.Nombre);
			
		List<AsignaturaActual> ListaDeAsignaturas = new ArrayList<AsignaturaActual>();
			ListaDeAsignaturas.add(asig);
			ListaDeAsignaturas.add(asig1);
		System.out.println("");
		
		Alumno a = new Alumno();
		         a.Datos = p;
		         a.ID_Alumno = "103";
		         a.Materias = ListaDeAsignaturas;
		         a.setCarrera(c);
		System.out.println("Datos del alumno: ");
		System.out.println("Nombre: " + a.Datos.Nombre);
		System.out.println("Codigo de alumno: " + a.ID_Alumno);
		System.out.println("Carrera: " + a.getCarrera().Nombre);
		System.out.println("Lista de materias: ");
		System.out.println(asig.Nombre);
		System.out.println(asig1.Nombre);
			
		System.out.println();
		
		AsignaturaCursada ac = new AsignaturaCursada();
		        ac.Nombre = "Sistemas de Costos";
		        ac.Profesor = pr1;
		        ac.Nota = 8.50;
		        ac.setFinal(10);
		System.out.println("Lista de materias cursadas: ");
		System.out.println("Nombre: " + ac.Nombre);
		System.out.println("Profesor: " + ac.Profesor.Persona.Nombre);
		System.out.println("Nota: " + ac.Nota);
		System.out.println("Nota final: " + ac.getFinal());
		
		System.out.println();
		
		Tramite t = new Tramite();
		            t.Alumno = a;	
		            t.Numero = 12345;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                    t.setFecha(sdf.parse("03-07-2022"));

		System.out.println("Datos del Tramite: ");
		System.out.println("Alumno: " + t.Alumno.Datos.Nombre);
		System.out.println("Numero: " + t.Numero);
		System.out.println("Fecha de inicio: " + t.getFecha());
	}

}
