package POO.introducao.lista_exercicios01.exercicio15;

public class Carro {
    private double velocidade;
    
   public Carro(){
    setCarro(0.0);
    }
    public Carro( double velocidade){
        setVelocidade(velocidade);
    }
    public String getCarro() {
        return "A velocidade atual do carro é " + getVelocidade();
    }
    public void setCarro(double velocidade) {
        setVelocidade(velocidade);
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        if (velocidade > 0) {
         this.velocidade = velocidade;   
        }
    }
    public void acelerar(double velocidadeadd){
        if (velocidadeadd >= 0  && velocidadeadd <= 20) {
            velocidade += velocidadeadd;
        }
        else{
            System.out.println("Não foi possível acelerar.");
        }
    }
    public void reduzir(double velocidadeadd){
        if (velocidadeadd >= 0  && velocidadeadd <= 30) {
            velocidade -= velocidadeadd;
        }
        else{
            System.out.println("Não foi possível reduzir.");
        }
    }
    
}
