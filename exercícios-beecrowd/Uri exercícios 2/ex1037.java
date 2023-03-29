import java.util.Scanner;

public class ex1037 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Início
    double number = teclado.nextDouble();

    //Processo
    if (0 <= number && 25 >= number) {
        System.out.println("Intervalo [0,25]");
    }
    if (25 < number && 50 >= number) {
        System.out.println("Intervalo (25,50]");
    } 
    if (50 < number && 75 >= number) {
        System.out.println("Intervalo (50,75]");
    }
    if (75 < number && 100 >= number) {
        System.out.println("Intervalo (75,100]");
    }
    if (number < 0 || number > 100) {
        System.out.println("Fora de intervalo");
    }
    teclado.close();
    }
    
}
