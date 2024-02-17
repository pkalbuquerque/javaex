
import java.util.ArrayList;
import java.util.List;
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class Tribunal {
	private String nomeTribunal;
	private List<Vara> listaVaras;
	private List<Audiencia> listaAudiencias;

	public Tribunal(String nomeTribunal) {
		setNomeTribunal(nomeTribunal);
		listaVaras = new ArrayList<>();
		listaAudiencias = new ArrayList<>();
	}

	public String getNomeTribunal() {
		return nomeTribunal;
	}

	public void setNomeTribunal(String nomeTribunal) {
		if (nomeTribunal == null || nomeTribunal.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome do tribunal inválido.");
		}
		this.nomeTribunal = nomeTribunal;
	}

	public List<Vara> getListaVaras() {
		return listaVaras;
	}

	public void setListaVaras(List<Vara> listaVaras) {
		if (listaVaras == null) {
			throw new IllegalArgumentException("Lista de varas nula.");
		}
		this.listaVaras = listaVaras;
	}

	public List<Audiencia> getListaAudiencias() {
		return listaAudiencias;
	}

	public void setListaAudiencias(List<Audiencia> listaAudiencias) {
		if (listaAudiencias == null) {
			throw new IllegalArgumentException("Lista de audiencias nula.");
		}
		this.listaAudiencias = listaAudiencias;
	}

	public void adicionarVara(Vara umaVara) {
		listaVaras.add(umaVara);
	}

	public void adicionarAudiencia(Audiencia umaAudiencia) {
		listaAudiencias.add(umaAudiencia);

	}

	public String toString() {
		String str = "Nome do tribunal: " + getNomeTribunal() + "\n-- Lista de processos --\n";

		str += "\n--Lista de varas --\n";
		for (Vara v : listaVaras) {
			str += v.getTipoVara() + "\n";
		}

		str += "\nLista de audiencias --\n";
		for (Audiencia a : listaAudiencias) {
			str += a.toString() + "\n";
		}
		return str;
	}

}
