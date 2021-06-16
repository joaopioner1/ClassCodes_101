package avaliacao1_continuo;

public class InvalidAgeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String msg) {
		super(msg);
	}
}
