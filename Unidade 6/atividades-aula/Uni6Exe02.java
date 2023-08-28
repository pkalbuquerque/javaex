import java.util.Scanner;

public class Uni6Exe02 {

	public static void main(String[] args) {

		double vetor[] = lerValor();
		double media = calcularMedia(vetor);
		imprimirAcimaMedia(vetor, media);

	}

	public static double[] lerValor() {
		Scanner input = new Scanner(System.in);
		double vetor[] = new double[12];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextDouble();
		}
        input.close();
		return vetor;
	}

	public static double calcularMedia(double vetor[]) {
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		return media;
	}

	public static void imprimirAcimaMedia(double vetor[], double media) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {
				System.out.println(vetor[i]);
			}
		}
	}

}
