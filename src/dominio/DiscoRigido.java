package dominio;

import java.util.Set;
import java.util.TreeSet;

public class DiscoRigido extends UnidadAlmacenamiento implements Comparable<DiscoRigido>{
	private Set<Archivo> discoRigido;
	private Integer codigo;
	
	public DiscoRigido(Double capadidadMaxima, Character letra, String nombre, Double peso, Integer codigo) {
		super(capadidadMaxima, letra, nombre, peso);
		this.discoRigido = new TreeSet<Archivo>();
		this.codigo = codigo;
	}
	

	
	public void formatearDiscoRigido() {
		discoRigido.clear();
	}
	
	


	public Set<Archivo> getDiscoRigido() {
		return discoRigido;
	}



	public void setDiscoRigido(Set<Archivo> discoRigido) {
		this.discoRigido = discoRigido;
	}



	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	@Override
	public int compareTo(DiscoRigido o) {
		return this.codigo.compareTo(o.codigo);
	}



	
}
