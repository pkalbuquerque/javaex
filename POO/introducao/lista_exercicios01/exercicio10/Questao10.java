package POO.introducao.exercicio10;

public class Questao10{
    public static void main(String[] args) {
    Eleitor umEleitor = new Eleitor("nathan baiano", 70); 
    try {
            System.out.println(umEleitor.imprimir());

    } catch (Exception e) {
    // tratando a exceção caso a idade seja negativa
        System.out.println(e.getMessage()); 
   }
    }
}