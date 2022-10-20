package modulo21ej01;

public class Cliente {

        private long id;
		private String nombre;
		private String apellido;
		private String tipoDocumento;
		private String numeroDocumento;
		
		public Cliente() {
		}

		public Cliente(long id, String nombre, String apellido, String tipoDocumento, String numeroDocumento) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.tipoDocumento = tipoDocumento;
			this.numeroDocumento = numeroDocumento;
		}
		
		public String getDatos() {
			return "Cliente [id:" + id + ", nombre: " + nombre + ", apellido: " + apellido + ", Documento [Tipo: " + tipoDocumento + ",número: " 
					+ numeroDocumento + "]]";
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getTipoDocumento() {
			return tipoDocumento;
		}

		public void setTipoDocumento(String tipo) {
			this.tipoDocumento = tipo;
		}

		public String getNumeroDocumento() {
			return numeroDocumento;
		}

		public void setNumeroDocumento(String numeroDocumento) {
			this.numeroDocumento = numeroDocumento;
		}

	}

	


