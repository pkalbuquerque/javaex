package exercicio05;

public class ImpostoDeRenda {
	private String nome;
	private String cpf;
	private double renda;

	public ImpostoDeRenda(String nome, String cpf, double renda) {
		setNome(nome);
		setCpf(cpf);
		setRenda(renda);
	}

	public void setCpf(String cpf) {
		if (cpf.trim().isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.nome = nome;
	}

	public void setRenda(double renda) {
		if (renda < 0) {
			throw new IllegalArgumentException();
		}
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getRenda() {
		return renda;
	}
	public double calcularImposto() {
		if (renda >= 0 && renda <= 4000) {
			return 0;
		}
		if (renda > 4000 && renda <= 9000) {
			return renda * 0.058;
		}
		if (renda > 9000 && renda <= 25000) {
			return renda * 0.15;
		}
		if (renda > 25000 && renda <= 35000) {
			return renda * 0.275;
		}
		return renda * 0.3;
	}
}
