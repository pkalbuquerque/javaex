package exercicio01;

public class Concorrente {
	private String nome, area, telefone, endereco;
	private int inscricao;

	public Concorrente(String nome, String area, String telefone, String endereco, int inscricao) {
		setNome(nome);
		setArea(area);
		setTelefone(telefone);
		setEndereco(endereco);
		setInscricao(inscricao);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setInscricao(int inscricao) {
		this.inscricao = inscricao;
	}

	public String getNome() {
		return nome;
	}

	public String getArea() {
		return area;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public int getInscricao() {
		return inscricao;
	}
}
