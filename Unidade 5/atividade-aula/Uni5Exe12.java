import java.util.Scanner;

public class Uni5Exe12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Entre com a quantidade de linhas");
		int linhasTotal = input.nextInt();
		int qtdNums = 0; // Quantidade de números naquela linha
		int largura = 1; // Largura máxima daquela linha
		String saida = "";
		int qtdLinhas = 0; // Quantidade de linhas até agora
		for (int i = 1; linhasTotal != qtdLinhas; i++) {
			saida += i + " ";
			qtdNums++;
			if (qtdNums == largura) {
				saida += "\n";
				largura++;
				qtdLinhas++;
				qtdNums = 0;
			}
		}

		System.out.println(saida);
input.close();
	}

}
