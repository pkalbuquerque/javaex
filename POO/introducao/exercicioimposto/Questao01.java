package POO.introducao.exercicioimposto;

public class Questao01 {
    public static void main(String[] args) {
        Imposto pessoa1 = new Imposto("bolsonaro", 3000);
        System.out.println(pessoa1.calcularIrpf());
    }
}
