import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            DecimalFormat df_2 = new DecimalFormat("0.00");
    
    //Início
    System.out.println("Insira a temperatura em °C ");
    double tempC = teclado.nextDouble();

    //Processo
    double valuetotal = tempC * 9/5 + 32;


    //Saída
    System.out.println("Temperatura em °F:  " + df_2.format(valuetotal) );
    teclado.close();
}

        
    
}
