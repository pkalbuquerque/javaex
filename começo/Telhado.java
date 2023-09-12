package POO.introducao.começo;


//Pedro Krubniki Albuquerque
public class Telhado {
    private double altura;
    private double comprimento;
    
    public Telhado(double altura, double comprimento){
        setAltura(altura);
        setComprimento(comprimento);
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public double calcularCalhas(){
        double calha = 0.067 * getAltura() * getComprimento();
        return calha;
    }
    public double calcularCondutores(double sobreposto){
        int condutores = 1;
        double variavel = sobreposto;
        sobreposto /= condutores;
        while (sobreposto >= 7.1) {
            sobreposto = variavel;
            condutores++;
            sobreposto /= condutores;
            
            
        }
        return condutores;
    }
   
}
