package modulo07situacion03;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Objeto {

	public static void main(String[] args) throws ParseException {
	
		Banco b = new Banco();		
		      b.Nombre = "Banco Nacion";
		      
		Sucursal s = new Sucursal();
		      s.Banco = b;
		      s.Nombre = "Cabildo";
		      s.ID_Sucursal = "123";
		  	  s.Direccion = "Cabildo 111";
		  	  s.verDatos();
		  	  
		System.out.println();
		  	  		
		Cliente cl = new Cliente();
		   cl.DNI = "42.390.555";
		   cl.Nombre = "Jacinta Flores";
		   cl.Direccion = "Magnolia 111";
		   cl.Telefono = "1178903454";
		
	    Cliente cl1 = new Cliente();
		   cl1.DNI = "30.697.444";
		   cl1.Nombre = "Rodolfo Robinson";
		   cl1.Direccion = "Pedro Goyena 333"; 
		   cl1.Telefono = "1190232345";
		   
		Cuenta c = new Cuenta();
		      c.Tipo = "Cuenta Corriente";
			  c.N_Cuenta = "12345678";
			  SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");             
			  c.Apertura = (sdf.parse("03-07-2022"));;
			  c.Saldo = 23000.00;
			  c.Interes = 0.20;
			  c.Cliente = cl;
			  c.verDatos();
			
		System.out.println();
		
		cl.verDatos();
		      
		
	}

}
