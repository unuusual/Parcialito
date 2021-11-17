package dominio;

public class Archivo extends UnidadAlmacenamiento implements Comparable<Archivo>{

	private ListaDeArchivos listaDeArchivos;
	private Integer codigo;


	public Archivo(Double capadidadMaxima, Character letra, String nombre, Double peso,  ListaDeArchivos listaDeArchivos,Integer codigo) {
		super(capadidadMaxima, letra, nombre, peso);
		this.codigo = codigo;
		this.listaDeArchivos = listaDeArchivos;
	}

	public ListaDeArchivos getListaDeArchivos() {
		return listaDeArchivos;
	}

	public void setListaDeArchivos(ListaDeArchivos listaDeArchivos) {
		this.listaDeArchivos = listaDeArchivos;
	}

	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public int compareTo(Archivo o) {
		return this.codigo.compareTo(o.getCodigo());
	}
	
	

}
