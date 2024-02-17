package exercicio14;

public class Vereador {
	private String nome;
	private String partido;
	private int qtdprojetosapresentados;
	private int qtdprojetosaprovados;
	private double indiceTrabalho;
	private double desempenho;

	public Vereador(String nome, String partido, int qtdprojetosapresentados, int qtdprojetosaprovados) {
		setNome(nome);
		setPartido(partido);
		setQtdprojetosapresentados(qtdprojetosapresentados);
		setQtdprojetosaprovados(qtdprojetosaprovados);
		indiceTrabalho = calcularIndiceTrabalho(qtdprojetosapresentados);
		desempenho = calcularDesempenho();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getQtdprojetosapresentados() {
		return qtdprojetosapresentados;
	}

	public void setQtdprojetosapresentados(int qtdprojetosapresentados) {
		this.qtdprojetosapresentados = qtdprojetosapresentados;
	}

	public int getQtdprojetosaprovados() {
		return qtdprojetosaprovados;
	}

	public void setQtdprojetosaprovados(int qtdprojetosaprovados) {
		this.qtdprojetosaprovados = qtdprojetosaprovados;
	}

	private double calcularIndiceTrabalho(int projetosApresentados) {
		if (projetosApresentados >= 1 && projetosApresentados <= 5) {
			return 0.80;
		} else if (projetosApresentados >= 6 && projetosApresentados <= 10) {
			return 1.00;
		} else if (projetosApresentados >= 11 && projetosApresentados <= 17) {
			return 1.08;
		} else {
			return 1.22;
		}
	}

	private double calcularDesempenho() {
		if (qtdprojetosapresentados == 0) {
			return 0.0;
		}
		return (qtdprojetosaprovados / (double) qtdprojetosapresentados) * indiceTrabalho;
	}

	public double getIndiceTrabalho() {
		return indiceTrabalho;
	}

	public void setIndiceTrabalho(double indiceTrabalho) {
		this.indiceTrabalho = indiceTrabalho;
	}

	public double getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(double desempenho) {
		this.desempenho = desempenho;
	}
	
}
