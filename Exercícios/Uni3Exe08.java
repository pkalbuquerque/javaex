import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            DecimalFormat df_2 = new DecimalFormat("0.00");

        //Início
        System.out.println("Insira a quantidade de dólares: ");
        double dollar = teclado.nextDouble();

        //Procesos
        double valuetotal = dollar * 5.25;

        //Saída
        System.out.println(" Receba:  " + df_2.format(valuetotal) + "  Reais");
        teclado.close();
    
}
}