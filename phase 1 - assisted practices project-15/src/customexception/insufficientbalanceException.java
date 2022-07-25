package customexception;

public class insufficientbalanceException extends RuntimeException {
	public insufficientbalanceException(String message)
	{
		super(message);
}

}
