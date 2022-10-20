package modulo21ej02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	

	public static void main(String[] args) throws TipoProductoExcepcion {
		
		Scanner teclado = new Scanner(System.in);
		TipoDocumento tipoDocumento;
		String numeroDocumento;
		Documento documento;
		Cliente cliente1 = new Cliente();
		
		List<Producto> productosCliente1 = new ArrayList<>();
	
		Map<Documento, Cliente> clientes = new HashMap<>();
		try {

			cliente1.setDocumento(new Documento(TipoDocumento.CI, "01"));
			cliente1.setDescripcion("Cliente 01");
			cliente1.setFechaNacimiento(Fecha.getLocalDate("1983-03-15"));
			
			productosCliente1.add(new TarjetaDeCredito(87, 74, 89));
			cliente1.setProductos(productosCliente1);


			clientes.put(cliente1.getDocumento(), cliente1);
			
			System.out.println("Sistema de busqueda Bancario:");

			while (true) {
				try {
					System.out.print("Ingrese el tipo de documento:");
					tipoDocumento = TipoDocumento.valueOf(teclado.next().toUpperCase());
					break;
				} catch (Exception e) {
					System.out.println(
							"Tipo de Documento invalido solo se permiten " + Arrays.toString(TipoDocumento.values()));
				}
			}

			System.out.print("Ingrese el numero de documento:");
			numeroDocumento = teclado.next();

			documento = new Documento(tipoDocumento, numeroDocumento);

			Cliente cliente = clientes.get(documento);

			if (cliente != null) {
				System.out.println(cliente.getDescripcion());
				System.out.println(cliente.getDocumento());
				System.out.println("Fecha de Nacimiento: " + cliente.getFechaNacimiento());
				System.out.println("Productos:");
					System.out.println(cliente.getProductos());
				
			} else {
				System.out.println("Cliente no existe en nuestro sistema");
			}

		} finally {
			teclado.close();
		}
}}
