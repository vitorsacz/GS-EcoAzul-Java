package br.com.fiap.exceptions;

public class DatabaseConnectionException extends Exception {
	public DatabaseConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
