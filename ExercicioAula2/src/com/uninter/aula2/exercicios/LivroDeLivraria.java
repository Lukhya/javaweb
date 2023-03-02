package com.uninter.aula2.exercicios;

public class LivroDeLivraria extends Livro{
	
	private String genero;
	private float valor;
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	@Override
	public void getCapa() {
		System.out.println("oi");
		
	}
	
	

}
