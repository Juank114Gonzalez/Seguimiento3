package exceptions;

public class NegativeNumberException extends Exception{

	public NegativeNumberException(String name, double weight) {
		super("Est� intentando a�adir un peso negativo ("+ weight +") para el ingrediente: "+name);
	}
	
}
