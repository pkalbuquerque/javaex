import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;


public class Uni3Exe13 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
            DecimalFormat df_2 = new DecimalFormat("0.00");

    //Início
    System.out.println("Comprimento da parede em metros: ");
    double comprimento = teclado.nextDouble();
    System.out.println("Comprimento da largura em metros: ");
    double largura = teclado.nextDouble();


    //Processo
    double area = comprimento * largura * 112.50;

    //Saída
    System.out.println("Orçamento dos azulejos:  " + ("  Reais") + df_2.format(area) );
    teclado.close();


    
}
}