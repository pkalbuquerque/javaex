
//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class Advogado extends Usuario {
    
    private String registroOab;

    public Advogado(String login, String senha, String registroOab) {
        super(login, senha);
        setRegistroOab(registroOab);
    }

    public String getRegistroOab() {
        return registroOab;
    }

    public void setRegistroOab(String registroOab) throws IllegalArgumentException {
        if (registroOab == null || registroOab.trim().isEmpty()) {
            throw new IllegalArgumentException("Login inválido");
        }
        this.registroOab = registroOab;
    } 
    
    @Override
    public String toString() {
        return "Login advogado: " + getLogin() + "\nSenha: " + getSenha() + "\nRegisto OAB: " + getRegistroOab();
    }
}