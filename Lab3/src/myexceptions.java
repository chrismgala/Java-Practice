// myexceptions.java
// All custom exceptions are included in this class.
// This includes exceptions for Boundary and Error test cases.
// Custom messages for each exception are called in the 'catch' block of MovieManager and Movie classes.

// Chris Gala 64338761
// Wai Phyo 60902242

public class myexceptions
{
	public static class DuplicateMovieException extends Exception {
		
	}
	public static class MovieLimitException extends Exception {
		
	}
	public static class EmptyMovieInfoException extends Exception {
		
	}
	public static class MovieNotFoundException extends Exception {
		
	}
	public static class EmptyMovieListException extends Exception {
		
	}
	public static class EmptyRenterListException extends Exception {
		
	}
	public static class RenterLimitException extends Exception {
		
	}
	public static class RenterNotFoundException extends Exception {
		
	}
	public static class DuplicateRenterException extends Exception {
		
	}
	public static class InvalidRenterIDException extends Exception {
		
	}
	public static class EmptyRenterNameException extends Exception {
		
	}
	public static class RentedMovieException extends Exception {
		
	}
	
}
