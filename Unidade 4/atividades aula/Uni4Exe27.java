import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a hora de chegada (hh mm): ");
        int horaChegada = sc.nextInt();
        int minChegada = sc.nextInt();

        System.out.print("Informe a hora de partida (hh mm): ");
        int horaPartida = sc.nextInt();
        int minPartida = sc.nextInt();

        int tempoEstacionado = calcularTempoEstacionado(horaChegada, minChegada, horaPartida, minPartida);
        double preco = calcularPreco(tempoEstacionado);

        System.out.printf("Tempo estacionado: %d hora(s)\n", tempoEstacionado);
        System.out.printf("Preço a ser cobrado: R$ %.2f\n", preco);

        sc.close();
    }

    public static int calcularTempoEstacionado(int horaChegada, int minChegada, int horaPartida, int minPartida) {
        int tempoTotalMin = (horaPartida - horaChegada) * 60 + (minPartida - minChegada);

        if (tempoTotalMin <= 29) {
            return 1; // menos de 30 minutos = 1 hora
        } else {
            return (int) Math.ceil(tempoTotalMin / 60.0);
        }
    }

    public static double calcularPreco(int tempoEstacionado) {
        if (tempoEstacionado <= 2) {
            return tempoEstacionado * 5.0;
        } else if (tempoEstacionado <= 4) {
            return 2 * 5.0 + (tempoEstacionado - 2) * 7.5;
        } else {
            return 2 * 5.0 + 2 * 7.5 + (tempoEstacionado - 4) * 10.0;
        }
    }}