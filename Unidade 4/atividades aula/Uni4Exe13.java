import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Início 
    System.out.println("Informe a carta 1: ");
    int carta1 = teclado.nextInt();
    System.out.println("Informe a carta 2: ");
    int carta2 = teclado.nextInt();
    System.out.println("Informe a carta 3: ");
    int carta3 = teclado.nextInt();
    
    int cartasboas = 0;

    if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
        cartasboas = 1;
    }
    if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
        cartasboas = cartasboas + 1;
    }
    if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
        cartasboas = cartasboas + 1;
    }
    if (cartasboas == 1 ) {
        System.out.println("TRUCO");
    }
    if (cartasboas == 2 ){
        System.out.println("SEIS");
    }
    if (cartasboas == 3 ){
        System.out.println("NOVE");
    }
    else {
        System.out.println(" ");
    }
    teclado.close();
}
    
}
