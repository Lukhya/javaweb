package com.uninter.aula;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
	Scanner tc = new Scanner(System.in)	;
	
	//criação e instanciação de objetos	
		Pessoa p = new Pessoa();
		System.out.println("Digite nome");
		String n = tc.next();
		p.setNome(n);
		
		
	//criação
		Pessoa p2;
	//instaciação --- inicialização da variável
		p2 = new Pessoa();
		
		//p.nome = "Maria";
		
		p.setNome("Maria");
		System.out.println(p.getNome());
		
		p2.setNome("João Marcos");
		System.out.println(p2.getNome());
		
		Pessoa p3 = new Pessoa("Lu","lu@gmail.com",30);
		System.out.println(	p3.getNome());
		System.out.println(p3.getEmail());
		System.out.println(p3.getIdade());

	}

}
