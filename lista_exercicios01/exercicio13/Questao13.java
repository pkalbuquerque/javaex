package POO.introducao.lista_exercicios01.exercicio13;

public class Questao13 {
    public static void main(String[] args) {
        PrincipalEstoque notebook = new PrincipalEstoque("S971", 4000, 0);
    
        notebook.adicionarProduto(200);
        System.out.println(notebook.verificarDisponibilidade(100));
        System.out.println(notebook.retirarProduto(100));
    }
}
