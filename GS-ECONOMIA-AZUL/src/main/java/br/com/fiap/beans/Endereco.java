package br.com.fiap.beans;

public class Endereco {
	
	private String cep;
	private String lougradouro;

	public Endereco() {
		super();
	}


	public Endereco(String cep, String lougradouro) {
		super();
		this.cep = cep;
		this.lougradouro = lougradouro;
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

	
	@Override
	public String toString() {
		return "cep: \n" + cep + "lougradouro: \n" + lougradouro ;
	}

	
	
	
}
