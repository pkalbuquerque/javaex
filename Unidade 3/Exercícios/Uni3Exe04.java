import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe04 {
    
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    //Entrada
    System.out.print("Informe a nota 1: ");
    double nota1 = teclado.nextDouble();
    System.out.print("Informe a nota 2: ");
    double nota2 = teclado.nextDouble();
    System.out.print("Informe a nota 3: ");
    double nota3 = teclado.nextDouble();


    //Processo
    double media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) /10;

    //Saída 
    System.out.println("A média ponderada é : " + df_2.format(media));
    teclado.close();


    }
    
}
