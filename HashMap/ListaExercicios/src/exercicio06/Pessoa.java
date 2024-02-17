package exercicio06;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private ArrayList<Endereco> enderecos;
	
	public Pessoa(String nome) {
		setNome(nome);
		enderecos = new ArrayList<Endereco>();
	}
	
	public void setNome(String nome) throws IllegalArgumentException{
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException();
		}
 		this.nome = nome;
	}
	
	public void addEndereco(Endereco endereco) throws IllegalArgumentException{
		if (endereco == null) {
			throw new IllegalArgumentException();
		}
		this.enderecos.add(endereco);
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
	
	public String imprimirEnderecos() {
		String dados = "Nome: " + getNome() + "\nEndereço(s): ";
		for (int i = 0; i < enderecos.size(); i++) {
			dados += enderecos.get(i).toString() + "\n";
		}
		return dados;
		
	}
	
}
