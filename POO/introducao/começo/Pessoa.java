package POO.introducao;

public class Pessoa {
    // definindo que uma pessoa possuí a caracteristica Nome
    private String nome;
    private int idade;


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if (idade >= 0 && idade < 200){
        this.idade = idade;
    }
        else{
            throw new IllegalArgumentException("Idade Inválida");
        }}
    public int getIdade(){
        return this.idade;
    }
}
