import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe dois números inteiros: ");
    int A = teclado.nextInt();
    int B = teclado.nextInt();

    if (A % B == 0 || B % A == 0) {
        System.out.println("São múltiplos");
    }
    else { 
        System.out.println("Não são múltiplos ");
    }
    teclado.close();
}
    
}
