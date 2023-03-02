package com.uninter.aula2.exercicios;

public class LivroDeBiblioteca extends Livro {
	
	private String usuario;
	private int matriculaUsuario;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getMatriculaUsuario() {
		return matriculaUsuario;
	}
	public void setMatriculaUsuario(int matriculaUsuario) {
		this.matriculaUsuario = matriculaUsuario;
	}
	@Override
	public void getCapa() {
		System.out.println("(-_-)");
		
	}
	

}
