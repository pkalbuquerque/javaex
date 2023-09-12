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
    if (idade < 0) {
        throw new IllegalArgumentException("Idade inválida/negativa");
    }
    this.idade = idade;
}
public String getnome(){
    return this.nome;
}
public int getidade(){
    return this.idade;
}
private String definir(){
    String categoria = "";
    if(getidade() < 16)
    categoria = "não pode votar.";
    else if (getidade() <= 65) 
    categoria = "deve votar.";
    else
    categoria = "vota se quiser.";
    return categoria;    
}
public String imprimir(){
    return "O Eleitor: " + getnome() + " " + definir();
}
}




