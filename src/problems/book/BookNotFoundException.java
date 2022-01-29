package problems.book;

public class BookNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;

	public BookNotFoundException(String message) {
		this.message = message;
		System.out.println(message);
	}
	
	


	
}
