package exceptions;

public class SpecificationNotSelectedException extends Exception {
	private static String mensaje = "Falta seleccionar especificaciones.";

	public SpecificationNotSelectedException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		return mensaje;
	}
}
