import java.util.Scanner;

public class Uri1175jeito2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // declaração
        int N[] = new int[20];

        // populando
        for (int i = 0; i < 20; i++)
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

