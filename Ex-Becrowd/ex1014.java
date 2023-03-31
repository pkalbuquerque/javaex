import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1014 {
    public static void main(String[] args) {
    Scanner teclado =  new Scanner(System.in);
    DecimalFormat df_3 = new DecimalFormat("0.000");


    //Início
    int X = teclado.nextInt();
    double Y = teclado.nextDouble();


    //Processo
    double total = X / Y;

    //Saída 
    System.out.println(df_3.format(total) + (" km/l"));
    teclado.close();




    }
    
}
