package exercicio05;

public class ImpostodeRenda {
	private String nome;
	private int cpf;
	private double renda;
	
	public ImpostodeRenda(String nome, int cpf, double renda) {
		setNome(nome);
		setCpf(cpf);
		setRenda(renda);
	}
	public int getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public double getRenda() {
		return renda;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
}
