package br.com.economiaazul.beans;

public class Ong {
	
	private String idOng;
	private String nome;
	private String pais;
	private String estado;
	private String areaAtuacao;		
	
	public Ong() {
		super();
	}

	public Ong(String idOng, String nome, String pais, String estado, String areaAtuacao) {
		super();
		this.idOng = idOng;
		this.nome = nome;
		this.pais = pais;
		this.estado = estado;
		this.areaAtuacao = areaAtuacao;
	}
	
	
	public String getIdOng() {
		return idOng;
	}
	public void setIdOng(String idOng) {
		this.idOng = idOng;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	@Override
	public String toString() {
		return "\nidOng: " + idOng + "\nnome: " + nome + "\npais: " + pais + "\nestado: " + estado + "\nareaAtuacao: "
				+ areaAtuacao ;
	}

}
