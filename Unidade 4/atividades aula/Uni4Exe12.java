import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    //Início
    System.out.println("Informe o comprimento do lado 1: ");
    int lado1 = teclado.nextInt();
    System.out.println("Informe o comprimento do lado 2: ");
    int lado2 = teclado.nextInt();
    System.out.println("Informe o comprimento do lado 3: ");
    int lado3 = teclado.nextInt();

    if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1 ) {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("TRIÂNGULO EQUILÁTERO");
        }
        else if (lado1 == lado2 || lado2 == lado3 || lado2 == lado3) {
            System.out.println("TRIÂNGULO ISÓSCELES");
        }
        else if (lado1 != lado2 && lado2 != lado3) {
            System.out.println("TRIÂNGULO ESCALENO");
        }}
    else  {
        System.out.println("Os números não formam um triângulo.");
    

    }
    teclado.close();
}
    
}
