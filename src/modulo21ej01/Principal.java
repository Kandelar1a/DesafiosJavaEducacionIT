package modulo21ej01;

public class Principal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente[] clientes = new Cliente[3];
		ProductoPerecedero[] productos = new ProductoPerecedero[10];

		clientes[0] = new Cliente(1L, "Octavio", "Robleto","DNI", "01");
		clientes[1] = new Cliente(2L, "Mariana", "Bracho", "DNI", "02");
		clientes[2] = new Cliente(3L, "Pedro", "Montesino", "DNI", "03");

		productos[0] = new ProductoPerecedero(1L, "Leche", 5.6f, 10, 5);
		productos[1] = new ProductoPerecedero(2L, "Queso", 7.6f, 11, 10);
		productos[2] = new ProductoPerecedero(3L, "Panceta", 6.6f, 2, 51);
		productos[3] = new ProductoPerecedero(4L, "Jamon", 54.6f, 4, 15);
		productos[4] = new ProductoPerecedero(5L, "Atun", 57.6f, 10, 2);
		productos[5] = new ProductoPerecedero(6L, "Bife de Chorizo", 52.6f, 9, 8);
		productos[6] = new ProductoPerecedero(7L, "Tomate", 8.6f, 8, 11);
		productos[7] = new ProductoPerecedero(8L, "Cebolla", 596.6f, 25, 8);
		productos[8] = new ProductoPerecedero(9L, "Queso Crema", 51.6f, 98, 96);
		productos[9] = new ProductoPerecedero(10L, "Hamburguesa", 15.6f, 11, 4);
		
		Mensajes.ofertas(clientes, productos);
		
	}

}
