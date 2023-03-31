import java.util.Scanner;

public class Uni3Uri0005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    //Início 
    int A = teclado.nextInt();
    int B = teclado.nextInt();
    int C = teclado.nextInt();
    int D = teclado.nextInt();
 

    //Processo
    int total = ((A * B) - (C * D));

    //Saída
    System.out.println("DIFERENÇA = " + (total));
    teclado.close();

}
}