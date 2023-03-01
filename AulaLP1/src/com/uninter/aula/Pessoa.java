package com.uninter.aula;

public class Pessoa {
	
//variaveis ou atributos
	private String nome;
	private String email;
	private int idade;

//construtor padr�o
public Pessoa() {
	this.nome = "";
	this.email = "";
	this.idade = 0;
	}

	
//metodo construtor alternativo	
public Pessoa(String nome, String email, int idade) {
	this.nome = nome;
	this.email = email;
	this.idade = idade;
}
	
//para cada vari�vel vai ter um metodo get e set
//metodos de captura e configura��o	

// metodo de configura��o - setter
	public void setNome(String nome) {
		this.nome = nome;
	}
//metodo de captura - getter	
	public String getNome() {
		return nome;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
