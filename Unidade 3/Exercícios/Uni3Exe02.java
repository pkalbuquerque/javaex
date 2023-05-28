
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    // Entrada
    System.out.println("Informe o preço do par de sapatos");
    double preco = teclado.nextDouble();

    //  Processo
    double vlrdesconto = preco * 12 / 100;
    double precofinal = preco - vlrdesconto;

    // Saída
    System.out.println("Valor do desconto: " + df_2.format(vlrdesconto));
    System.out.println("Valor do par de sapatos com desconto: " + df_2.format(precofinal));

    teclado.close();
  }
}