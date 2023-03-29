import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Uni3Uri0010 {

       public static void main(String[] args) {
    
       Scanner teclado = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.000");   
      
        //Início
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        //Processo
        double x = Math.pow(x2 - x1, 2);     
        double y = Math.pow(y2 - y1, 2);

        double total = Math.sqrt((x + y));

        //Saída
        System.out.println(df_4.format(total));
        teclado.close();
        
        
    } 
}
