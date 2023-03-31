import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1036 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_5 = new DecimalFormat("0.00000");

    //Início
    double A = teclado.nextDouble();
    double B = teclado.nextDouble();
    double C = teclado.nextDouble();
   
    //Processo
    double delta = Math.pow(B, 2) - (4 * A * C);
    double R1 = (-B + Math.sqrt(delta)) / (2 * A) ;
    double R2 = (-B - Math.sqrt(delta)) / (2 * A) ;

    if (delta > 0 && A != 0 ) {
        System.out.println(("R1 = ") + df_5.format(R1));
        System.out.println(("R2 = ") + df_5.format(R2));
    }
    else {
        System.out.println("Impossivel calcular");
    }
    
    teclado.close();
    }
    
}
