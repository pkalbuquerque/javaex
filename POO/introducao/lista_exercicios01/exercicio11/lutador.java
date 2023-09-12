package POO.introducao.lista_exercicios01.exercicio11;

public class lutador {
    private String nome;
    private double peso;

    public lutador(String nome, double peso){
        setnome(nome);
        setpeso(peso);    
    }
    
    
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setpeso(double peso){
        this.peso = peso;
    }
    public String getnome(){
        return this.nome;
    } 
    public double getpeso(){
        return this.peso;
    } 
    
    public String definirCategoria(){
        String categoria = "";
        if (getpeso() <= 54) {
            categoria = "Pluma";
        }
        else if (getpeso() <= 60) {
            categoria = "Leve";
        }
        else if (getpeso() <= 75) {
            categoria = "Meio-Leve";
        }
        else {
            categoria = "Pesado";
        }
        return categoria;
    }
    public String imprimir(){
        return "O lutador: " + getnome() + " Pertence a categoria " + definirCategoria();
                
    }
}
