package modulo07situacion02;

import java.util.List;

public class Alumno {

	public String ID_Alumno;	
	public Persona Datos;
	private Carrera Carrera;
	public List<AsignaturaActual> Materias;
	
	public Carrera getCarrera() {
		return Carrera;			
	}
	public void setCarrera(Carrera pCarrera) {
		Carrera = pCarrera;		
	}

}
