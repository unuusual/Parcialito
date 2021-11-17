package dominio;

public class DVD extends UnidadAlmacenamiento{
	private Boolean cerrado;

	public DVD(Double capadidadMaxima, Character letra, Boolean cerrado, String nombre, Double peso) {
		super(capadidadMaxima, letra, nombre, peso);
		this.cerrado = cerrado;
	}

	public void agregarArchivo(Archivo archivo) throws CandadoCerradoException{
		if (cerrado) {
			throw new CandadoCerradoException();
		} else {
			getArchivos().add(archivo);
		}
			

	}
	
	public Boolean getCerrado() {
		return cerrado;
	}

	public void setCerrado(Boolean cerrado) {
		this.cerrado = cerrado;
	}
	
	
}
