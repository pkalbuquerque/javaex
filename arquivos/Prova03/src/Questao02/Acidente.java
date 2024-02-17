package Questao02;
//Pedro Krubniki Albuquerque
public class Acidente {
	private String cidade;
	private String tipoVeiculo;
	private int numAcidentes;
	private String estCivil;
	
	
	public Acidente(String cidade, String tipoVeiculo, int numAcidentes, String estCivil) {
		setCidade(cidade);
		setTipoVeiculo(tipoVeiculo);
		setNumAcidentes(numAcidentes);
		setEstCivil(estCivil);
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public int getNumAcidentes() {
		return numAcidentes;
	}
	public void setNumAcidentes(int numAcidentes) {
		this.numAcidentes = numAcidentes;
	}
	public String getEstCivil() {
		return estCivil;
	}
	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}
	
	@Override
	public String toString() {
		return "Cidade: " + getCidade() + "\nTipo do Veículo: " + getTipoVeiculo() + "\nNúmero de acidentes: " + getNumAcidentes() +
				"\nEstado Civil: " + getEstCivil();
	}
	
}
