import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Inícip
    int A = teclado.nextInt();
    int B = teclado.nextInt();
  
    //Processo
    if (A > B ) {
        System.out.println(A);
        }
    else {
        System.out.println(B);
    }
    teclado.close();
}
    
}
