import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;


public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            DecimalFormat df_2 = new DecimalFormat("0.00");

    //Início
    System.out.println(" Informe o cateto 1: ");
    double cat1 = teclado.nextDouble();
    System.out.println(" Informe o cateto 2: ");
    double cat2 = teclado.nextDouble();

    //Processo
    double hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

    //Saída
    System.out.println("Resultado da hipotenusa:  " + df_2.format(hip) );
        teclado.close();
}
}