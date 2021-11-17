package dominio;

public class CandadoCerradoException extends Exception {
	public CandadoCerradoException() {
		super("Candado esta cerrado");
	}
}
