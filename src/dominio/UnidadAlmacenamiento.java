package dominio;

import java.util.Set;
import java.util.TreeSet;

public class UnidadAlmacenamiento{
	private Set <Archivo> archivos;
	private Double capacidadMaxima;
	private Character letra;
	private String nombre;
	private Double peso;
	
	
	public UnidadAlmacenamiento(Double capacidadMaxima, Character letra, String nombre, Double peso) {
		super();
		this.archivos = new TreeSet<Archivo>();
		this.capacidadMaxima = capacidadMaxima;
		this.nombre = nombre;
		this.letra = letra;
		this.peso = peso;
	}

	//METODOS
	
	public Double obtenerPesoDeLosArchivos() {
		Double pesoTotal = 0.0;
		for (Archivo i : archivos) {
			pesoTotal += i.getPeso();
		}
		return pesoTotal;
	}
	
	
	public void agregarArchivo1(Archivo archivo) throws capacidadExcedidaException, CandadoCerradoException{
		if ((obtenerPesoDeLosArchivos() + archivo.getPeso()) <= this.capacidadMaxima && !archivos.contains(archivo)) {
			archivos.add(archivo); 
		} else {
			throw new capacidadExcedidaException();
		}
	}
	
	public Set<Archivo> obtenerListaDeArchivosTipoJpgOrdenadosPorNombre(){ //dudinhas
		for (Archivo archive : archivos) {
			if (archive.getListaDeArchivos().equals(ListaDeArchivos.JPG)) {
				return archivos;
			}
		}
		return archivos;
	}
	
	public Double calcularEspacioAlmacenado() {
		return obtenerPesoDeLosArchivos();
		
	}
	
	//FIN METODOS
	
	public Set<Archivo> getArchivos() {
		return archivos;
	}

	public void setArchivos(Set<Archivo> archivos) {
		this.archivos = archivos;
	}

	public Double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(Double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Character getLetra() {
		return letra;
	}

	public void setLetra(Character letra) {
		this.letra = letra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadAlmacenamiento other = (UnidadAlmacenamiento) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}


	
	
	
	
	
	
	
}
