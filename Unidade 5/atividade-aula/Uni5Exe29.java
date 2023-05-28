import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        int valor = scanner.nextInt();

        int[] cedulas = { 20, 10, 5, 2, 1 }; // Cédulas disponíveis no caixa automático
        int[] quantidadeCedulas = new int[5]; // Array para armazenar a quantidade de cada cédula utilizada

        for (int i = 0; i < cedulas.length; i++) {
            if (valor >= cedulas[i]) {
                quantidadeCedulas[i] = valor / cedulas[i]; // Calcula a quantidade de cédulas necessárias
                valor %= cedulas[i]; // Atualiza o valor restante
            }
        }

        System.out.println("Quantidade mínima de cédulas:");
        for (int i = 0; i < cedulas.length; i++) {
            if (quantidadeCedulas[i] > 0) {
                System.out.println(cedulas[i] + ": " + quantidadeCedulas[i]);
            }
        }
    }
}