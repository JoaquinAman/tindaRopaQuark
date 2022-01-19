package exceptions;

public class NoNumericException extends Exception {
	private static String mensaje = "Ingreso incorrecto, debe ser un numero.";

	public NoNumericException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		return mensaje;
	}
}
