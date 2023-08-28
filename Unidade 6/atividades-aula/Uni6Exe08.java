import java.util.Scanner;

public class Uni6Exe08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor N (limite máximo 20): ");
        int n = scanner.nextInt();
        while (n > 20) {
            System.out.println("Valor errado. Favor informar um número menor que 20: ");
            n = scanner.nextInt();
        }
        
        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Informe o valor para a posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
        int i = 0;
        while (i < vetor.length - 1) {
            if (vetor[i] > vetor[i + 1]) {
                double bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = 0;
            }
            else{
                i = i + 1;
            }
        }
        double[] valoresUnicos = new double[n];
        int[] frequencia = new int[n];
        int numValoresUnicos = 0;

        for ( i = 0; i < n; i++) {
            double valor = vetor[i];
            boolean valorRepetido = false;

            for (int j = 0; j < numValoresUnicos; j++) {
                if (valoresUnicos[j] == valor) {
                    frequencia[j]++;
                    valorRepetido = true;
                    break;
                }
            }

            if (!valorRepetido) {
                valoresUnicos[numValoresUnicos] = valor;
                frequencia[numValoresUnicos] = 1;
                numValoresUnicos++;
            }
        }

        System.out.println("\nValor\t\tQuantidade");
        for ( i = 0; i < numValoresUnicos; i++) {
            System.out.println(valoresUnicos[i] + "\t\t" + frequencia[i]);
        }
    scanner.close(); }
}