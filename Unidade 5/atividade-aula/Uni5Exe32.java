import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int primeiroDiaSemana = scanner.nextInt();

        System.out.print("Informe o número de dias do mês: ");
        int numeroDiasMes = scanner.nextInt();

        System.out.println("Dom Seg Ter Qua Qui Sex Sab");

        // Adicionar espaços para posicionar o primeiro dia da semana corretamente
        for (int i = 1; i < primeiroDiaSemana; i++) {
            System.out.print("    ");
        }

        for (int dia = 1; dia <= numeroDiasMes; dia++) {
            System.out.printf("%3d ", dia);

            // Quebrar linha após o sábado (7º dia da semana)
            if ((dia + primeiroDiaSemana - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}