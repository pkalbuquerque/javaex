import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;


public class Uni3Uri0009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");
        
        //Início
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();   
        
        //Processo
        double triângulo = (A * C) / 2;
        double circle = 3.14159 * Math.pow(C, 2);
        double trapezio = (A + B) * C / 2;
        double square = B * B;
        double rectangle = A * B;

        //Saída
        System.out.println("TRIANGULO: " + df_3.format(triângulo));
        System.out.println("CIRCULO: " + df_3.format(circle));
        System.out.println("TRAPEZIO: " + df_3.format(trapezio));
        System.out.println("QUADRADO: " + df_3.format(square));
        System.out.println("RETANGULO: " + df_3.format(rectangle));
        teclado.close();





}
}