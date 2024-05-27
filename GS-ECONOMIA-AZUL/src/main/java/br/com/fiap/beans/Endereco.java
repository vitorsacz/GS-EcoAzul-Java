package br.com.fiap.beans;

public class Endereco {
	
	private String cep;
	private String lougradouro;
	private String bairro;
	private String cidade;
	private int numero;
	
	
	public Endereco() {
		super();
	}

	public Endereco(String cep, String lougradouro, String bairro, String cidade, int numero) {
		super();
		this.cep = cep;
		this.lougradouro = lougradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.numero = numero;
	}


	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLougradouro() {
		return lougradouro;
	}
	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	
}
