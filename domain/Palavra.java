package com.uninter.aulaweb.demoweb.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "PALAVRAS")
public class Palavra extends AbstractEntity<Long> {
	
	@Column(name="nome",nullable=false,unique=true,length=60)
	private String nome;
	
	@Column(name="significado",nullable=false,unique=true,length=300)
	private String significado;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSignificado() {
		return significado;
	}
	public void setSignificado(String significado) {
		this.significado = significado;
	}
	
	

}
