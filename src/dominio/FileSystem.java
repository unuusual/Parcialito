package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileSystem {
	private Set<UnidadAlmacenamiento>unidades;

	public FileSystem() {
		super();
		this.unidades = new TreeSet<UnidadAlmacenamiento>();
	}

	public List<Character> obtenerListaDeUnidadesDeDiscoRigidos(){
		List<Character> aux = new ArrayList<Character>();
		for (UnidadAlmacenamiento i : unidades) {
			if (i instanceof DiscoRigido) {
				aux.add(i.getLetra());
			}
		}
		return aux;
		
	}

	public Set<UnidadAlmacenamiento> getUnidades() {
		return unidades;
	}

	public void setUnidades(Set<UnidadAlmacenamiento> unidades) {
		this.unidades = unidades;
	}
	
	
	
	
}
