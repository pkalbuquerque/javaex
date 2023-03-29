import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1017 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_3 = new DecimalFormat("0.000");

    //Início
    int hours = teclado.nextInt();
    int km = teclado.nextInt();
    int spent = 12;

    //Processo
    double distance = hours * km;
    double liters = distance / spent;

    //Saída
    System.out.println(df_3.format(liters));
    teclado.close();

    }
    
}
