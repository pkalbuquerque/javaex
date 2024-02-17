package exercicio03;

public class Pessoa {
	private String nome;
	private int cpf;
	
	public Pessoa(String nome, int cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
}
