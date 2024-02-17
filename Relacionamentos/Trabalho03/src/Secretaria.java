
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class Secretaria extends Usuario {
    
    private String numeroCt;

    public Secretaria(String login, String senha, String numeroCt) {
        super(login, senha);
        setNumeroCt(numeroCt);
    }

    public String getNumeroCt() {
        return numeroCt;
    }

    public void setNumeroCt(String numeroCt) throws IllegalArgumentException {
        if (numeroCt == null || numeroCt.trim().isEmpty()) {
            throw new IllegalArgumentException("Número da certeira de trabalho inválido");
        }
        this.numeroCt = numeroCt;
    }

    @Override
    public String toString() {
        return "Login secretária: " + getLogin() + "\nSenha: " + getSenha() + "\nNúmero carteira de trabalho: " + getNumeroCt();
    }
}