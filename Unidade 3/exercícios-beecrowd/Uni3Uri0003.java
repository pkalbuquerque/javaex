import java.util.Scanner;


public class Uni3Uri0003 {
    public static void main(String[] args) {    
        Scanner teclado = new Scanner(System.in);

        //Início 
        int A = teclado.nextInt();
        int B = teclado.nextInt();

        //Processo
        int PROD = A * B;

        //Saída
        System.out.println("PROD = " + (PROD));
        teclado.close();
        
    }
    
}
