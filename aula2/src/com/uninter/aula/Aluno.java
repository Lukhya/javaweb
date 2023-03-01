package com.uninter.aula;

public class Aluno extends Pessoa{

	private boolean ehestudante;
	
	
	public boolean isEhestudante() {
		return ehestudante;
	}

	public void setEhestudante(boolean ehestudante) {
		this.ehestudante = ehestudante;
	}
	
	public void pagamento() {
		System.out.println("Pagamento efetuado");
	}

	@Override
	public void getDescricao() {
		
		System.out.println("você é um aluno!");
	}
	
}
