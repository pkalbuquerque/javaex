
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public abstract class Pessoa {
    
    private String nome;

    public Pessoa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    @Override
    public abstract String toString();
}
