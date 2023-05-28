import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri0006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
     
        //Início
        int worker = teclado.nextInt();
        int hours = teclado.nextInt();
        double perhour = teclado.nextDouble();
        
        //Processo
        double salary = hours * perhour;

        //Saída
        System.out.println("NUMBER = " + (worker));
        System.out.println("SALARY = " + df_2.format(salary));
        teclado.close();

    
}
}