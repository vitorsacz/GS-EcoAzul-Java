package br.com.fiap.exceptions;

public class DatabaseException extends ContatoException {
	
	 public DatabaseException(String message) {
	        super(message);
	    }

	    public DatabaseException(String message, Throwable cause) {
	        super(message, cause);
	    }
}
