package com.uninter.aula2.exercicios;

public abstract class Livro {
	
	public abstract void getCapa();
	
	private String titulo;
	private int numPag;
	private String autor;
	private int anoEdicao;
	private String editora;
	private int isbn;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoEdicao() {
		return anoEdicao;
	}
	public void setAnoEdicao(int anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
	

}
