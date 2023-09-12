package POO.introducao.começo;

public class Pessoa {
    // definindo que uma pessoa possuí a caracteristica Nome
    String nome;
    double altura;
    double peso;
    double IMC;

    public Pessoa(String nome, double altura, double peso){
        setNome(nome);
        setAltura(altura);
        setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    private double calcularIMC() {
        IMC = getPeso() / (getAltura() * getAltura());
        return IMC;
    }
    public String imprimir(){
        String descPessoa = getNome() + " está com o IMC equivalente a: ";
        double imc = calcularIMC();
        if (imc <= 18.5) {
            descPessoa += "Abaixo do peso normal.";
        }
        else if (imc <= 25) {
            descPessoa += "Peso Normal";
        }
        else if (imc <= 30) {
            descPessoa += "Acima do peso normal";
        }
        else{
            descPessoa += "Obesidade";
        }
        return descPessoa;
    }

    

    
    
   
}
