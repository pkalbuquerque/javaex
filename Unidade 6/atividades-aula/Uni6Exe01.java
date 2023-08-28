import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // declaração
        int N[] = new int[10];

        // populando
        for (int i = 0; i < 10; i++)
            N[i] = teclado.nextInt();
        
        // trocando
        inverteVetor(N);

        // listando
        imprimeVetor(N);

        teclado.close();
    }

        public static void inverteVetor(int[] vetor) {
            int tamanho = vetor.length;
            for (int i = 0; i < tamanho / 2; i++) {
                int temp = vetor[i];
                vetor[i] = vetor[tamanho - 1 - i];
                vetor[tamanho - 1 - i] = temp;
            }
        }

        public static void imprimeVetor(int[] vetor) {
            for (int i = 0; i < vetor.length; i++)
                System.out.println("N[" + i + "] = " + vetor[i]);
        }
}
