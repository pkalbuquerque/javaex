package Questao01;

import java.io.Serializable;
//Pedro Krubniki Albuquerque
public class Atleta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private float altura;
	private float peso;
	
	public Atleta(String nome, String cpf, float altura, float peso) {
		setNome(nome);
		setCpf(cpf);
		setAltura(altura);
		setPeso(peso);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
}
