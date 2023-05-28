import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorProducao = 0;
        int diaMaiorProducao = 0;
        int totalManha = 0;
        int totalTarde = 0;
        String periodoMaiorProducao = "";

        int resposta = 1;
        while (resposta == 1) {
            System.out.print("Digite o dia do mês de abril: ");
            int dia = scanner.nextInt();
            if (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                continue;
            }

            System.out.print("Digite o total de peças produzidas no turno da manhã: ");
            int producaoManha = scanner.nextInt();
            System.out.print("Digite o total de peças produzidas no turno da tarde: ");
            int producaoTarde = scanner.nextInt();

            Double valorDiario;
            if (dia >= 1 && dia <= 15) {
                if (producaoManha >= 30 && producaoTarde >= 30 && (producaoManha + producaoTarde) > 100) {
                    valorDiario = 0.80;
                } else {
                    valorDiario = 0.50;
                }
            } else {
                valorDiario = (producaoManha * 0.40) + (producaoTarde * 0.30);
            }

            System.out.println("Valor a receber no dia: R$" + valorDiario);

            if ((producaoManha + producaoTarde) > maiorProducao) {
                maiorProducao = producaoManha + producaoTarde;
                diaMaiorProducao = dia;
            }

            if (producaoManha > totalManha) {
                totalManha = producaoManha;
                periodoMaiorProducao = "manhã";
            }

            if (producaoTarde > totalTarde) {
                totalTarde = producaoTarde;
                periodoMaiorProducao = "tarde";
            }

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            resposta = scanner.nextInt();
        }

        System.out.println("Maior produção ocorreu no dia: " + diaMaiorProducao);
        System.out.println("Funcionário produz mais no período da " + periodoMaiorProducao + " com " +
                ((periodoMaiorProducao.equals("manhã")) ? totalManha : totalTarde) + " peças.");
    }
}