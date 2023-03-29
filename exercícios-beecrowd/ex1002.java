import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Uni3Uri0002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");


        //Início
        double n = 3.14159;
        double R = teclado.nextDouble();


        //Processo
        double total = n * Math.pow(R, 2);

        //Saída
        System.out.println(" A = " + df_4.format(total));
        teclado.close();
        

    }
    
}
