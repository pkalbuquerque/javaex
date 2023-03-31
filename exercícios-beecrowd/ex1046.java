import java.util.Scanner;

public class ex1046 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Início
    int start = teclado.nextInt();
    int end = teclado.nextInt();

    //Processo
    if (start > end) {
        System.out.println("O JOGO DUROU "+ (24 - (start - end)) + " HORA(S)");
        
    } if (end > start) {
        System.out.println("O JOGO DUROU " + (24 - (end - start)) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    teclado.close();
    }
    
}
