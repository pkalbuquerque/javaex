package POO.introducao.exercicio10;

public class Eleitor {
    private String nome;
    private int idade;

public Eleitor(String nome, int idade){
    setnome(nome);
    setidade(idade);
}
public void setnome(String nome){
    this.nome = nome;
}
public void setidade(int idade){
    this.idade = idade;
}
public String getnome(){
    return this.nome;
}
public int getidade(){
    return this.idade;
}
public String definir(){
    String categoria = "";
    if(getidade() < 16)
    categoria = "Eleitor não pode votar.";
    else if (getidade() >= 16 && getidade() <= 65) 
    categoria = "Eleitor deve votar.";
    else
    categoria = "Voto facultativo.";
    return categoria;    
}
public String imprimir(){
    return getnome() + "\n" + definir();
}
}




