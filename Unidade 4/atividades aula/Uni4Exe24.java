import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int[] valores = new int[3];

        // Solicita os valores do usuário
        System.out.println("Digite três valores:");
        for (int i = 0; i < 3; i++) {
            valores[i] = scanner.nextInt();
        }

        // Menu de opções
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior valor no meio");
        opcao = scanner.nextInt();

        // Ordena os valores de acordo com a opção escolhida
        switch (opcao) {
            case 1:
                ordenaCrescente(valores);
                break;
            case 2:
                ordenaDecrescente(valores);
                break;
            case 3:
                ordenaMaiorNoMeio(valores);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        // Imprime os valores ordenados
        System.out.println("Valores ordenados:");
        for (int valor : valores) {
            System.out.println(valor);
        }
    }

    // Método para ordenar os valores em ordem crescente
    public static void ordenaCrescente(int[] valores) {
        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] > valores[j]) {
                    int temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
    }

    // Método para ordenar os valores em ordem decrescente
    public static void ordenaDecrescente(int[] valores) {
        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] < valores[j]) {
                    int temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
    }

    // Método para ordenar os valores de forma que o maior valor fique no meio
    public static void ordenaMaiorNoMeio(int[] valores) {
        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] < valores[j]) {
                    int temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }

        // Troca os dois primeiros valores de posição
        int temp = valores[0];
        valores[0] = valores[1];
        valores[1] = temp;
    }
}
