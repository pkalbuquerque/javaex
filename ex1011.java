import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class ex1011 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_3 = new DecimalFormat("0.000");
    //Início
    double raio = teclado.nextDouble();

    //Processo
    double esfera = (4/3.0) * 3.14 * Math.pow(raio, 3);

    //Saída
    System.out.println("VOLUME = " + df_3.format(esfera));
    teclado.close();

    }
    
}
