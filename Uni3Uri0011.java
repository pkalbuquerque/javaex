import java.util.Scanner;

public class Uni3Uri0011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Início
        int km = teclado.nextInt();

        //Processo
        int total = km * 2;

        //Saída
        System.out.println(total + "minutos");
        teclado.close();
    }
    
}
