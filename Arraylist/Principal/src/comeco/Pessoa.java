package comeco;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade não pode ser menor que zero.");
		}
		this.idade = idade;
	}
	public void setNome(String nome) {
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.nome = nome;
	}
	public String toString() {
		return "Nome: " + this.getNome() +
				"\nIdade: " + this.getIdade();
 	}
	
	
}
