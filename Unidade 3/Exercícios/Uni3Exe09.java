import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            DecimalFormat df_2 = new DecimalFormat("0.00");
    
    //Início
    System.out.println(" Informe o raio da lata: ");
    double raio = teclado.nextDouble();
    System.out.println(" Informe a altura da lata: ");
    double altura = teclado.nextDouble();

    //Processo
    double volume = 3.14 * Math.pow(raio, 2) * altura;

    //Saída
    System.out.println(" O resultado da volume da lata é:  " + df_2.format(volume) );
        teclado.close();

    
}
}