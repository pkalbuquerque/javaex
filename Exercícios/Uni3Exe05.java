import java.text.DecimalFormat;
import java.util.Scanner;


public class Uni3Exe05 {

    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            DecimalFormat df_2 = new DecimalFormat("0.00");

        //Entrada
     System.out.print("Informe a quantidade de frangos na granja: ");
     double chicken = teclado.nextDouble();


       //Processo
       double valuetotal = chicken * 11;
       
       //Saída
       System.out.println("O orçamento total da granja é:  " + df_2.format(valuetotal));
       teclado.close();

        
    }
    
}
