//Pedro Krubniki Albuquerque
public class Municipio {
	
	private int codigo;
	private String cidade;
	private String estado;
	private int populacao;
	
	public Municipio(int codigo, String cidade, String estado, int populacao) {
		setCodigo(codigo);
		setCidade(cidade);
		setEstado(estado);
		setPopulacao(populacao);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	
}
