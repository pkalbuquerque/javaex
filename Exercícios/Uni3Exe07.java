import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni3Exe07 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

    //Entrada
    System.out.println("Informe quantas latas de 350 ml: ");
    double latamenor = teclado.nextDouble();
    System.out.println("Informe quantas latas de 600 ml: ");
    double latamedia = teclado.nextDouble();
    System.out.println("Informe quantas garrafas de 2 l : ");
    double garrafa = teclado.nextDouble();

    //Processo
    double litragem =  latamenor * 0.35 + latamedia * 0.6 + garrafa * 2;

    //Saída
    System.out.println("A quantidade de litros de refrigerante é:  " + df_2.format(litragem));
        teclado.close();


}    
}
