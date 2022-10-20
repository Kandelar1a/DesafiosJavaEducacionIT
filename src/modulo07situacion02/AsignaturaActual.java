package modulo07situacion02;

import java.util.List;

public class AsignaturaActual {

	public String Nombre;
	private String Tipo;
	public String Carga_Horaria;
	public String Cuatrimestre;
	public List<Carrera> Carreras;
	public Profesor Profesor;
	
	public String getTipo() {
		return Tipo;		
	}
	public void setTipo(String pTipo) {
		Tipo = pTipo;
	}
	
	

}
