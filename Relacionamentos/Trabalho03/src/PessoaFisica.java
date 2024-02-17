
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws IllegalArgumentException {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.cpf = cpf;
    }   

    @Override
    public String toString() {
        return "Cliente: " + getNome() + "\nCPF: " + getCpf();
    }
}