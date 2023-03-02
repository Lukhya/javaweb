package com.uninter.aula2.exercicios;

public class TesteLivro {

	public static void main(String[] args) {
		
		LivroDeBiblioteca nomeLivro = new LivroDeBiblioteca();
		
		nomeLivro.setTitulo("Chapeuzinho azul");
		System.out.println(nomeLivro.getTitulo());
		
		nomeLivro.getCapa();
	}

}
