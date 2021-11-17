package dominio;

import java.util.Comparator;

public class OrdenadoPorNombre implements Comparator<UnidadAlmacenamiento>{

	@Override
	public int compare(UnidadAlmacenamiento o1, UnidadAlmacenamiento o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
