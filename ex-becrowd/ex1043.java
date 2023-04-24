import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1043 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_1 = new DecimalFormat("0.0");
    
    //Início
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();
    double c = teclado.nextDouble();
    

    if (a < (double)(b + c ) && b < (double) (a + c ) && c < (double)(a + b)) {
        double perimetro = a + b + c;
        System.out.println("Perimetro = " + df_1.format(perimetro));
    }
    else { 
        double trapezio = ((a + b) * c) / 2;
        System.out.println("Area = " + df_1.format(trapezio));
    }
teclado.close();
    }
    
}
