
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        setCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) throws IllegalArgumentException {
        if (cnpj == null || cnpj.trim().isEmpty()) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        this.cnpj = cnpj;
    }    

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCNPJ: " + getCnpj();
    }
}