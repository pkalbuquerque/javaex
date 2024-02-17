package exercicio04;

public class Site {
	private String nome;
	private String enderecoip;
	private boolean acesso;
	
	public Site(String nome, String enderecoip, boolean acesso) {
		setNome(nome);
		setEnderecoip(enderecoip);
		setAcesso(acesso);
	}
	public void setAcesso(boolean acesso) {
		if (acesso != true && acesso != false) {
			throw new IllegalArgumentException();
		}
		this.acesso = acesso;
	}
	public void setEnderecoip(String enderecoip) {
		this.enderecoip = enderecoip;
	}
	public void setNome(String nome) {
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.nome = nome;
	}
	public String getEnderecoip() {
		if (enderecoip.trim().isEmpty()) {
			throw new IllegalArgumentException();
		}
		return enderecoip;
	}
	public String getNome() {
		return nome;
	}
	public boolean getAcesso() {
		return acesso;
	}
	
	public String toString() {
		return "Site: " + getNome() + 
				"\nIP: " + getEnderecoip() + 
				"\nAcesso: " + getAcesso();
	}
}
