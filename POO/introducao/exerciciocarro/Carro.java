package POO.introducao.exerciciocarro;

//Pedro Krubniki Albuquerque

public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private String cor;
    private int ano;
    private double preco;
    private int loc;


    public Carro(String modelo, String marca, String placa, String cor, int ano, double preco, int loc){
        setModelo(modelo);
        setMarca(marca);
        setPlaca(placa);
        setCor(cor);
        setAno(ano);
        setPreco(preco);
        setLoc(loc);
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getLoc() {
        return loc;
    }
    public void setLoc(int loc) {
        this.loc = loc;
    }
   
}
