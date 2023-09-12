package POO.introducao.lista_exercicios01.exercicio12;

public class Apolice {
    private String nome;
    private int idade;
    private double valorPremio;
    
    
    public Apolice(String nome, int idade, double valorPremio){
        setNome(nome);
        setIdade(idade);
        setValorPremio(valorPremio);
    }   

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade não pode ser menor que zero");
        }
        this.idade = idade;
    }
    public double getValorPremio() {
        return valorPremio;
    }
    public void setValorPremio(double valorPremio) {
        if (valorPremio < 0) {
            throw new IllegalArgumentException("Valor não pode ser menor que zero");
        }
        this.valorPremio = valorPremio;
    }

    public double calcularPremio(){
        
        if (getIdade() >= 18 && getIdade() <= 25) {
            valorPremio += (valorPremio * 20) / 100;
        }
        else if(getIdade() <= 36){
            valorPremio += (valorPremio * 15) / 100;
        }
        else{
            valorPremio += (valorPremio * 10) / 100;
        }
        return valorPremio;
    }

    public void oferecerDesconto(String cidade){
        if (cidade.equals("Ilhota")) {
            valorPremio = valorPremio * 0.95;
        }
        else if (cidade.equals("Blumenau")) {
            valorPremio = valorPremio * 0.97;
        }
        else if (cidade.equals("Itajaí")) {
            valorPremio = valorPremio * 0.99;
        }
        else{
            throw new IllegalArgumentException("A cidade não está cadastrada.");
        }
    }
    public String imprimir(){
        return "Nome: " + getNome() + 
        "\nIdade: " + getIdade() + 
        "\nValor Prêmio: " + getValorPremio();
    }



}
