package br.com.fiap.beans;

public class Ong {
	
	private String nome;
	private String areaAtuacao;
	
	public Ong(String nome, String areaAtuacao) {
		super();
		this.nome = nome;
		this.areaAtuacao = areaAtuacao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	@Override
	public String toString() {
		return "nome: \n" + nome + "areaAtuacao: \n" + areaAtuacao ;
	}
	
	
	
	
}
