import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Informe um número inteiro para o vetor: ");
        int N = sc.nextInt();
        double vetor[] = new double[N];     
        
        lerVetor(vetor, sc);
        System.out.println("Informe um valor real: ");
        double valor = sc.nextDouble();
       
        boolean encontrado = verificarValor(vetor, valor);
       
        if (encontrado) {
            System.out.println("O valor " + valor + " esta dentro do vetor.");
        } else {
            System.out.println("O valor " + valor + " não está dentro do vetor.");
        }
        sc.close();
    }
    public static void lerVetor(double vetor[], Scanner sc) {
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Informe o número " + (i + 1) + " para o vetor: ");
            vetor[i] = sc.nextDouble();
        };        
    }
    public static boolean verificarValor(double vetor[], double valor) {
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
