import java.util.Scanner;

public class ex1003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        //Início
        int A = teclado.nextInt();
        int B = teclado.nextInt();

        //Processo
        int SOMA = A + B;

        //Saída 
    System.out.println("SOMA = " + (SOMA));
    teclado.close();

    }
    
}
