package com.uninter.aula;

public class TesteHeranca {

	public static void main(String[] args) {
		
		//Criar objetos
		Professor prof = new Professor();
		
		prof.setEmail("prof@gmail.com");
		prof.nome = "Lu";
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Ana");
		aluno1.login();
		prof.login();
		
		prof.getDescricao();
		aluno1.getDescricao();
		
		prof.setSal(20000);
		System.out.println(prof.getSalario());
		
	Circulo c = new Circulo();
//classe pessoa é agora abstrata	
	//Pessoa pessoa = new Pessoa();
	
	//pessoa.setNome("Maria");
	
	

		

	}

}
