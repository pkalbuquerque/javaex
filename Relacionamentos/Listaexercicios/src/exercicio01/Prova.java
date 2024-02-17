package exercicio01;

public class Prova {
	private Concorrente umConcorrente; // Associação (etapa 1)
	private double nota;

	public Prova(Concorrente umConcorrente, double nota) {
		setUmConcorrente(umConcorrente);
		setNota(nota);
	}

	public Concorrente getUmConcorrente() {
		return umConcorrente;
	}

	public void setUmConcorrente(Concorrente umConcorrente) {
		this.umConcorrente = umConcorrente; // (etapa 2)
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String imprimir() {
		return umConcorrente.getNome() + " - " + umConcorrente.getArea() + " - " + umConcorrente.getInscricao() + " - "
				+ getNota();
	}

}
