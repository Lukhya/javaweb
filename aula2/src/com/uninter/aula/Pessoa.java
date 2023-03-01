package com.uninter.aula;
//palavra chave: abstract
public abstract class Pessoa {

	private String ru;
	protected String nome;
	private String email;
	
//método abstrato tem apenas assinatura. não tem corpo.	
	public abstract void getDescricao();
	
	
	public String getRu() {
		return ru;
	}
	public void setRu(String ru) {
		this.ru = ru;
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
		this.email = email;
	}
	
	public void login() {
		System.out.println("olá " + nome);
	}
	
	public String solicitarServico() {
		return "servico solicitado";
	}
}
