import java.util.ArrayList;
import java.util.List;
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class Processo {
	private StatusProcesso situacao;
	private String codigoProcesso;
	private Tribunal umTribunal;
	private Vara umaVara;
	private Pessoa cliente;
	private Pessoa parteContraria;
	private String motivoProcesso;
	private Usuario umaSecretaria;
	private Usuario umAdvogado;
	private List<Audiencia> listaAudiencia;
	private List<Custa> listaCustas;
	public static List<Processo> listaProcessos = new ArrayList<>();

	public Processo(StatusProcesso situacao, String codigoProcesso, Tribunal umTribunal, Vara umaVara, Pessoa cliente,
			Pessoa parteContraria, String motivoProcesso, Usuario umaSecretaria, Usuario umAdvogado) {
		setSituacao(situacao);
		setCodigoProcesso(codigoProcesso);
		setUmTribunal(umTribunal);
		setUmaVara(umaVara);
		setCliente(cliente);
		setParteContraria(parteContraria);
		setMotivoProcesso(motivoProcesso);
		setUmaSecretaria(umaSecretaria);
		setUmAdvogado(umAdvogado);
		listaAudiencia = new ArrayList<>();
		listaCustas = new ArrayList<>();
		listaProcessos.add(this);
	}

	public StatusProcesso getSituacao() {
		return situacao;
	}

	public void setSituacao(StatusProcesso situacao) {
		this.situacao = situacao;
	}

	public String getCodigoProcesso() {
		return codigoProcesso;
	}

	public void setCodigoProcesso(String codigoProcesso) {
		if (codigoProcesso == null || codigoProcesso.trim().isEmpty()) {
			throw new IllegalArgumentException("Codigo do processo inválido.");
		}
		this.codigoProcesso = codigoProcesso;
	}

	public Tribunal getUmTribunal() {
		return umTribunal;
	}

	public void setUmTribunal(Tribunal umTribunal) {
		if (umTribunal == null) {
			throw new IllegalArgumentException("Tribunal não pode estar vazio.");
		}
		this.umTribunal = umTribunal;
	}

	public Vara getUmaVara() {
		return umaVara;
	}

	public void setUmaVara(Vara umaVara) {
		if (umaVara == null) {
			throw new IllegalArgumentException("Vara não pode estar nula.");
		}
		this.umaVara = umaVara;
		umaVara.adicionarProcesso(this);
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		if (cliente == null) {
			throw new IllegalArgumentException("Cliente não pode estar vazio.");
		}
		this.cliente = cliente;
	}

	public Pessoa getParteContraria() {
		return parteContraria;
	}

	public void setParteContraria(Pessoa parteContraria) {
		if (parteContraria == null) {
			throw new IllegalArgumentException("Parte contrária não pode estar nula.");
		}
		this.parteContraria = parteContraria;
	}

	public String getMotivoProcesso() {
		return motivoProcesso;
	}

	public void setMotivoProcesso(String motivoProcesso) {
		if (motivoProcesso == null || motivoProcesso.trim().isEmpty()) {
			throw new IllegalArgumentException("Motivo do processo inválido.");
		}
		this.motivoProcesso = motivoProcesso;
	}

	public Usuario getUmaSecretaria() {
		return umaSecretaria;
	}

	public void setUmaSecretaria(Usuario umaSecretaria) {
		if (umaSecretaria == null) {
			throw new IllegalArgumentException("Secretária não pode estar nula.");
		}
		this.umaSecretaria = umaSecretaria;
	}

	public Usuario getUmAdvogado() {
		return umAdvogado;
	}

	public void setUmAdvogado(Usuario umAdvogado) {
		if (umAdvogado == null) {
			throw new IllegalArgumentException("Advogado não pode estar vazio.");
		}
		this.umAdvogado = umAdvogado;
	}

	public List<Audiencia> getListaAudiencia() {
		return listaAudiencia;
	}

	public void setListaAudiencia(List<Audiencia> listaAudiencia) {
		if (listaAudiencia == null) {
			throw new IllegalArgumentException("Lista de audiência está nula.");
		}
		this.listaAudiencia = listaAudiencia;
	}

	public List<Custa> getListaCustas() {
		return listaCustas;
	}

	public void setListaCustas(List<Custa> listaCustas) {
		if (listaCustas == null) {
			throw new IllegalArgumentException("Lista de custas está nula.");
		}
		this.listaCustas = listaCustas;
	}

	public void adicionarAudiencia(Audiencia umaAudiencia) {
		listaAudiencia.add(umaAudiencia);
	}

	public void adicionarCusta(Custa umaCusta, String codigoProcesso) {
		for(Processo p: listaProcessos){
			if(p.getCodigoProcesso().equalsIgnoreCase(codigoProcesso)){
				listaCustas.add(umaCusta);
			}
		}
	}

	public String processosEmAndamento() {
		String str = "";
		for (Processo p : listaProcessos) {
			if (p.situacao == StatusProcesso.ATIVO) {
				str += p.toString() + "\n----------------------\n";
			}
		}
		return str;
	}

	public double calcularDespesaTotal() {
		double valor = 0;
		for (Custa custa : listaCustas) {
			valor += custa.getValorDespesa();
		}
		return valor;
	}

	public String despesasProcesso(String codProcesso) {
		String str = "";
		for (Custa c : listaCustas) {
			str += c.toString() + "\n--------------------------\n";
		}
		return str;
	}


	@Override
	public String toString() {
		String str = "--- PROCESSO ---";
		if (situacao == StatusProcesso.ATIVO) {
			str = "\nSituação: aberta";
		} else {
			str += "\nSituação: fechada";
		}
		str += "\nCodigo: " + getCodigoProcesso() + "\n-- Tribunal --\n" + getUmTribunal() + "\n-- Vara --\n"
				+ getUmaVara() + "\n-- Cliente --\n" + getCliente() + "\n-- Parte Contraria --\n" + getParteContraria()
				+ "\nMotivo do processo: " + getMotivoProcesso() + "\n-- Secretária --\n" + getUmaSecretaria()
				+ "\n-- Advogado --\n" + getUmAdvogado() + "\n-- Lista de Audiencias --\n";

		for (Audiencia a : listaAudiencia) {
			str += a.toString() + "\n";
		}

		str += "\n-- Lista de Custas --\n";

		for (Custa c : listaCustas) {
			str += c.toString() + "\n";
		}

		str += "\nValor Final: R$" + calcularDespesaTotal();

		return str;
	}
}