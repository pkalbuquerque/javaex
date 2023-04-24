import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1006 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_1 = new DecimalFormat("0.0");
    //Início 
    double A = teclado.nextDouble();
    double B = teclado.nextDouble();
    double C = teclado.nextDouble();

    //Processo
    double media = A * 2 + B * 3 + C * 5 /10;

    //Saída
    System.out.println("MEDIA = " + df_1.format(media));
    teclado.close();
        
    



    }
    
}
