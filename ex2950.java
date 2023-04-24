import java.text.DecimalFormat;
import java.util.Scanner;

public class ex2950 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");


    int d = teclado.nextInt();
    int d1 = teclado.nextInt();
    int d2 = teclado.nextInt();

   if (d > 0 && d < 10000 && d1 > 0 && d2 < 100) {
        double icm = (double) d / (double)(d2 + d1);
        System.out.println(df_2.format(icm));

   }    
   

    
    teclado.close();
    
    
    
    
    
    }
    
}
