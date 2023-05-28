import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int numero = scanner.nextInt();

        System.out.println("Número\tDecomposição");

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.println(numero + "\t" + i);
                numero /= i;
            }
        }
    }
}
