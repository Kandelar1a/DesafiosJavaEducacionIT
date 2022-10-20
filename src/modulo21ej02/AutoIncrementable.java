package modulo21ej02;

public interface AutoIncrementable {

	
	default Integer getNumeroGenerado() {

			if (this.getClass() == Cuenta.class) {
			
				Cuenta cuenta = (Cuenta) this;
				switch (cuenta.getTipo().name()) {
				case "CC":
					return Producto.NUMERO_CC++;
				case "CA":
					return Producto.NUMERO_CA++;
				default:
					break;
				}
			} else if (this.getClass() == TarjetaDeCredito.class) {
				return Producto.NUMERO_TC++;
			}

			return null;
		}
}
