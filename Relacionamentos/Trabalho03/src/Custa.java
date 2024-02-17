
import java.time.LocalDate;
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class Custa {

	private String despesa;
	private double valorDespesa;
	private LocalDate dataDespesa;

	public Custa(String despesa, double valorDespesa, LocalDate dataDespesa) {
		setDespesa(despesa);
		setValorDespesa(valorDespesa);
		setDataDespesa(dataDespesa);
	}

	public String getDespesa() {
		return despesa;
	}

	public void setDespesa(String despesa) throws IllegalArgumentException {
		if (despesa == null || despesa.trim().isEmpty()) {
			throw new IllegalArgumentException("Despesa inválida");
		}
		this.despesa = despesa;
	}

	public double getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(double valorDespesa) throws IllegalArgumentException {
		if (valorDespesa < 0) {
			throw new IllegalArgumentException("Valor da despesa inválido");
		}
		this.valorDespesa = valorDespesa;
	}

	public LocalDate getDataDespesa() {
		return dataDespesa;
	}

	public void setDataDespesa(LocalDate dataDespesa) throws IllegalArgumentException {
		if (dataDespesa == null || dataDespesa.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data da despesa inválida");
		}
		this.dataDespesa = dataDespesa;
	}

	@Override
	public String toString() {
		return "Nome: " + getDespesa() + "\nValor: " + getValorDespesa() + "\nData: " + getDataDespesa();
	}
}