import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri0007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
    
        //Início
        String name = teclado.next();
        double salary = teclado.nextDouble();
        double seller = teclado.nextDouble();

        //Processo
        double total = salary + (seller * 0.15);

        //Saída
        System.out.println("TOTAL = R$ " + df_2.format(total));
        teclado.close();
}
}
