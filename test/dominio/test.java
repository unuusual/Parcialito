package dominio;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;


public class test {

	@Test 
	public void intentarAgregarArchivoDVD() throws CandadoCerradoException {
		Set<Archivo> archivinho = new TreeSet<Archivo>();
		Archivo archivo = new Archivo(500.0, 'A', "Archivo", 50.0, ListaDeArchivos.JPG,1);
		DVD dvd = new DVD(100.0, 'D', true, "dvd", 50.0);
		DVD dvd1 = new DVD(105.0, 'D', false, "dvd", 50.0);
		
		dvd1.agregarArchivo(archivo);
		
	}
	
	@Test
	public void agregarArchivoUnidadAlmacenamiento() throws capacidadExcedidaException, CandadoCerradoException {
		Set<Archivo> archivinho = new TreeSet<Archivo>();
		Archivo archivo1 = new Archivo(50.0, 'A', "Archivo", 50.0, ListaDeArchivos.JPG,2);
		UnidadAlmacenamiento dvd =  new UnidadAlmacenamiento(50.0, 'D', "dvd", 50.0);
		
		dvd.agregarArchivo1(archivo1);
		
	}
	
	@Test
	public void calcularEspacioAlmacenado() throws capacidadExcedidaException, CandadoCerradoException {
		Set<Archivo> archivinho = new TreeSet<Archivo>();
		Archivo archivo1 = new Archivo(50.0, 'A', "Archivo", 50.0, ListaDeArchivos.JPG,1);
		UnidadAlmacenamiento dvd =  new UnidadAlmacenamiento(50.0, 'D', "dvd", 50.0);
		
		dvd.agregarArchivo1(archivo1);
		
		Double valorEsperado = 50.0;
		
		assertEquals(valorEsperado, dvd.obtenerPesoDeLosArchivos());
	}
	
	@Test
	public void agregarArchivoADiscoRigido() throws capacidadExcedidaException, CandadoCerradoException{
		
		Archivo dr2 = new Archivo(30.0, 'S', "Disco Rigido2", 30.0, ListaDeArchivos.JEPG,2);
		Archivo dr3 = new Archivo(20.0, 'S', "Disco Rigido3", 20.0, ListaDeArchivos.JPG,3);
		Archivo dr4 = new Archivo(10.0, 'S', "Disco Rigido4", 10.0, ListaDeArchivos.PNG,4);
		DiscoRigido dr = new DiscoRigido(50.0, 'S', "Disco Rigido", 50.0, 1);
		
		dr.getArchivos().add(dr2);
		dr.getArchivos().add(dr3);
		dr.getArchivos().add(dr4);
		
		System.out.println(dr.getDiscoRigido().size());
		
	}
	
	@Test
	public void formatearDiscoRigido() throws capacidadExcedidaException, CandadoCerradoException{
		DiscoRigido dr = new DiscoRigido(50.0, 'S', "Disco Rigido", 50.0, 1);
		Archivo dr2 = new Archivo(30.0, 'S', "Disco Rigido2", 30.0, ListaDeArchivos.JEPG,2);
		Archivo dr3 = new Archivo(20.0, 'S', "Disco Rigido3", 20.0, ListaDeArchivos.JPG,3);
		Archivo dr4 = new Archivo(10.0, 'S', "Disco Rigido4", 10.0, ListaDeArchivos.PNG,4);
		
		
		dr.getDiscoRigido().add(dr2);
		dr.getDiscoRigido().add(dr3);
		dr.getDiscoRigido().add(dr4);
		
		System.out.println(dr.getDiscoRigido().size());
		
		dr.formatearDiscoRigido();
		
		System.out.println(dr.getDiscoRigido().size());
		

		
		
		
		
		
		
	
	}
	

}
