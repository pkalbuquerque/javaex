import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor inicial (N): ");
        int N = scanner.nextInt();

        System.out.print("Informe o decremento (K): ");
        int K = scanner.nextInt();

        System.out.print("Informe o tamanho da mochila (M): ");
        int M = scanner.nextInt();

        List<Integer> elementosNaMochila = new ArrayList<>();
        List<Integer> elementosForaDaMochila = new ArrayList<>();
        int somaElementosNaMochila = 0;
        int somaElementosForaDaMochila = 0;

        int valorAtual = N;
        while (valorAtual > 0 && M > 0) {
            if (valorAtual <= M) {
                elementosNaMochila.add(valorAtual);
                somaElementosNaMochila += valorAtual;
                M -= valorAtual;
            } else {
                elementosForaDaMochila.add(valorAtual);
                somaElementosForaDaMochila += valorAtual;
            }

            valorAtual -= K;
        }

        System.out.println("Elementos a serem colocados na mochila:");
        for (int elemento : elementosNaMochila) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("Elementos que entraram na mochila:");
        for (int elemento : elementosNaMochila) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("Elementos que ficaram fora da mochila:");
        for (int elemento : elementosForaDaMochila) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("Soma dos elementos que entraram na mochila: " + somaElementosNaMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaElementosForaDaMochila);
    }
}