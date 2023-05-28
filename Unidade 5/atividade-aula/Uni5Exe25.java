import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pontosDireita = 0;
        int pontosEsquerda = 0;

        while (true) {
            System.out.print("Informe o código do ponto (D/E): ");
            char codigoPonto = scanner.next().toUpperCase().charAt(0);

            if (codigoPonto == 'D') {
                pontosDireita++;
            } else if (codigoPonto == 'E') {
                pontosEsquerda++;
            } else {
                System.out.println("Código de ponto inválido!");
                continue;
            }

            if (pontosDireita >= 21 && pontosDireita - pontosEsquerda >= 2) {
                System.out.println("Jogador da direita venceu!");
                break;
            } else if (pontosEsquerda >= 21 && pontosEsquerda - pontosDireita >= 2) {
                System.out.println("Jogador da esquerda venceu!");
                break;
            }
        }
    scanner.close();
}
}