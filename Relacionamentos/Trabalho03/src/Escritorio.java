

import java.util.ArrayList;
import java.util.List;
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class Escritorio {
    
    private List<Secretaria> listaSecretarias = new ArrayList<Secretaria>();
    private List<Advogado> listaAdvogados = new ArrayList<Advogado>();
    private List<Processo> listaProcessos = new ArrayList<Processo>();
    private List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    public void cadastrarSecretaria(Secretaria umaSecretaria) {
        listaSecretarias.add(umaSecretaria);
    }

    public void cadastrarAdvogado(Advogado umAdvogado) {
        listaAdvogados.add(umAdvogado);
    }

    public void cadastrarProcesso(Processo umProcesso) {
        listaProcessos.add(umProcesso);
    }

    public void cadastrarPessoa(Pessoa umaPessoa) {
        listaPessoas.add(umaPessoa);
    }
}