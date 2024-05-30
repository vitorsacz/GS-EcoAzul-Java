package br.com.fiap.exceptions;

public class ValidationException extends ContatoException {

	public ValidationException(String message) {
		super(message);
	}

	public ValidationException(String message, Throwable cause) {
		super(message, cause);
	}
}
