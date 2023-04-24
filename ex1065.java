import java.util.Scanner;

public class ex1065 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int cont = 0;
    int valor1 = teclado.nextInt();
    int valor2 = teclado.nextInt();
    int valor3 = teclado.nextInt();
    int valor4 = teclado.nextInt();
    int valor5 = teclado.nextInt();
    
    if (valor1 % 2 == 0) {
        cont++;
    }
    if (valor2 % 2 == 0) {
        cont++;
    }
    if (valor3 % 2 == 0) {
        cont++;
    }
    if (valor4 % 2 == 0) {
        cont++;
    }
    if (valor5 % 2 == 0) {
        cont++;
    }
    System.out.println(cont + " valores pares");
    
 teclado.close();   }
    
}
