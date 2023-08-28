package POO.introducao;

public class principal {
    public static void main(String[] args) {
       // declarando uma variavel string
       // que ira armazenar o nome pedro

        // declarando uma variavel do tipo pessoa
        Pessoa umaPessoa = null;
        // criando um objeto do tipo pessoa 
        umaPessoa = new Pessoa();
        
        umaPessoa.setNome("pedro");
        umaPessoa.setIdade(800);
        

        System.out.println(umaPessoa.getNome());
        System.out.println(umaPessoa.getIdade());

    }
}