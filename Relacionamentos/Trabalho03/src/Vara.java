

import java.util.ArrayList;
import java.util.List;
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class Vara {
    private String tipoVara;
    private List<Processo> listaProcessos;

    public Vara(String tipoVara) {
        setTipoVara(tipoVara);
        listaProcessos = new ArrayList<>();
    }

    public String getTipoVara() {
        return tipoVara;
    }

    public void setTipoVara(String tipoVara) {
        if(tipoVara == null || tipoVara.trim().isEmpty()){
            throw new IllegalArgumentException("Vara inválida.");
        }
        this.tipoVara = tipoVara;
    }

    public List<Processo> getListaProcessos() {
        return listaProcessos;
    }

    public void setListaProcessos(List<Processo> listaProcessos) {
        if(listaProcessos == null){
            throw new IllegalArgumentException("Lista está vazia.");
        }
        this.listaProcessos = listaProcessos;
    }
    
    public void adicionarProcesso(Processo umProcesso){
        listaProcessos.add(umProcesso);
    }

    public String toString(){
        String str = "Tipo da vara: " + getTipoVara() + 
                    "\n-- Lista de Processos --\n";
        for(Processo p: listaProcessos){
            str += p.getCodigoProcesso() + "\n";
        }
        return str;
    }
    
}
