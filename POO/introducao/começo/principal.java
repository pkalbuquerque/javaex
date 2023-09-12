package POO.introducao.começo;

public class principal {
    public static void main(String[] args) {
       // declarando uma variavel string
       // que ira armazenar o nome pedro

        // declarando uma variavel do tipo pessoa
        Pessoa objeto4 = null;
        Pessoa objeto1 = new Pessoa("Maria");
        Pessoa objeto3;
        Pessoa objeto2 = objeto1;

        objeto3 = objeto2;
        objeto1 = objeto3;
        objeto4 = new Pessoa("Simone");
        objeto2 = new Pessoa("Barbara");
        objeto1 = objeto2;
        objeto3 = null;
        objeto2 = objeto4;
        objeto4 = null;
        // criando um objeto do tipo pessoa 
       System.out.println(objeto1.getNome());
       System.out.println(objeto2.getNome());
       System.out.println(objeto3.getNome());
       System.out.println(objeto4.getNome());

    }
}