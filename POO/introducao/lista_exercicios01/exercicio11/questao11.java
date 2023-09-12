package POO.introducao.exercicio11;

public class questao11 {
    public static void main(String[] args) {
        lutador umLutador = new lutador("pedro", 80);

        umLutador.definirCategoria();
        System.out.println(umLutador.imprimir());
    }
}
