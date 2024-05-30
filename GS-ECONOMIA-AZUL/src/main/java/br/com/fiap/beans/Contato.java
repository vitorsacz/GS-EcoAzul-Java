package br.com.fiap.beans;

public class Contato {
	
	private String idContato;
	private String nome;
	private String email;
	private String telefone;
	
	public Contato() {
		super();
	}

	
	public Contato(String idContato, String nome, String email, String telefone) {
		super();
		this.idContato = idContato;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}


	
	public String getIdContato() {
		return idContato;
	}


	public void setIdContato(String idContato) {
		this.idContato = idContato;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		return "Numero do ID: " + idContato + "\nnome: " + nome + "\nemail: " + email + "\ntelefone: " + telefone;
	}
	
	
	
	
	
}
