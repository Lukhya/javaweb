package com.uninter.aula;

public class Professor extends Pessoa implements Salario{
	
	private int tempoExperiencia;
	private float sal;

	public int getTempoExperiencia() {
		return tempoExperiencia;
	}

	public void setTempoExperiencia(int tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}

	@Override
	public void getDescricao() {
		System.out.println("você é um professor!");
		
	}

	@Override
	public float getSalario() {
		return sal;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	
	

}
