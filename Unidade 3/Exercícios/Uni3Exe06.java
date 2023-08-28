import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
     
        //Entrada
    System.out.print("Informe o peso do prato informado pelo cliente: ");
    double prato = teclado.nextDouble();
    
        //Processo
    double valor = (prato - 0.75)* 25; 

        //Saída
        System.out.println("O preço do seu prato é:  " + df_2.format(valor));
        teclado.close();







    } 
    
}
