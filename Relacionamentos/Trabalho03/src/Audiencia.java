
import java.time.LocalDate;
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class Audiencia {

	private LocalDate dataAudiencia;
	private String recomendacaoTribunal;

	public Audiencia(LocalDate dataAudiencia, String recomendacaoTribunal) {
		setDataAudiencia(dataAudiencia);
		setRecomendacaoTribunal(recomendacaoTribunal);

	}

	public LocalDate getDataAudiencia() {
		return dataAudiencia;
	}

	public void setDataAudiencia(LocalDate dataAudiencia) throws IllegalArgumentException {
		if (dataAudiencia == null || dataAudiencia.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data da audiência inválida");
		}
		this.dataAudiencia = dataAudiencia;
	}

	public String getRecomendacaoTribunal() {
		return recomendacaoTribunal;
	}

	public void setRecomendacaoTribunal(String recomendacaoTribunal) throws IllegalArgumentException {
		if (recomendacaoTribunal == null || recomendacaoTribunal.trim().isEmpty()) {
			throw new IllegalArgumentException("Recomendação do tribunal inválida");
		}
		this.recomendacaoTribunal = recomendacaoTribunal;
	}

	@Override
	public String toString() {
		return "Data: " + getDataAudiencia() + "Recomendação: " + getRecomendacaoTribunal();
	}
}
