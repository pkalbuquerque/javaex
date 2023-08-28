import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    //Início
    System.out.println("Informe a idade dos filhos: ");
    int M = teclado.nextInt();
    int Z = teclado.nextInt();
    int L = teclado.nextInt();

    if (M > Z && M > L) {
         if (Z > L) {
            System.out.println("Luluzinha é a caçula com: " + (L) + " anos");
             }
        }
    if (Z > M && Z > L) {
         if (M > L) {
            System.out.println("Luluzinha é a caçula com: " + (L) + " anos");
             }
        }
    if (L > Z && L > M) {
         if (Z > M) {
            System.out.println("Marquinhos é o caçula com: " + (M) + " anos");
             }
        }
    if (L > Z && L > M) {
         if (M > Z) {
            System.out.println("Zézinho é o caçula com: " + (Z) + " anos");
             }
        }
    if (M > Z && M > L) {
         if (M > Z) {
            System.out.println("Zézinho é o caçula com: " + (Z) + " anos");
             }
        }
    if (Z > M && Z > L) {
         if (L > M) {
            System.out.println("Marquinhos é o caçula com: " + (L) + " anos");
             }

    
    }
    teclado.close();
 
}
}