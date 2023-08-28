import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri0008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        
    //Início
    int code1 = teclado.nextInt();
    int units1 = teclado.nextInt();
    double price1 = teclado.nextDouble();
    int code2 = teclado.nextInt();
    int units2 = teclado.nextInt();
    double price2 = teclado.nextDouble();
    //Processo
    double total = (units1 * price1) + (units2 * price2);
     
    //Saída
    System.out.println("VALOR A PAGAR: R$ " + df_2.format(total));
    teclado.close();
        
        
}
}