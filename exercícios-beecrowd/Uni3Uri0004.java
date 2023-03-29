import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni3Uri0004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_5 = new DecimalFormat("0.00000");
     
        //Início
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();

        //Processo
        double total = (A * 3.5) + (B * 7.5) /11;

        //Saída
        System.out.println("Media = " + df_5.format(total));
        teclado.close();


}
}