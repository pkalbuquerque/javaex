import java.util.Scanner;

public class ex1041 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Início
    double X = teclado.nextDouble();
    double Y = teclado.nextDouble();

    //Processo
    if (X > 0 && Y > 0) {
        System.out.println("Q1");
    }
    if (X < 0 && Y > 0) {
        System.out.println("Q2");
    }
    if (X < 0 && Y < 0) {
        System.out.println("Q3");
    }
    if (X > 0 && Y < 0) {
        System.out.println("Q4");
    }
    if (X == 0 && Y == 0) {
        System.out.println("Origem");
    }
    if (X > 0 && Y == 0 || X < 0 && Y == 0) {
        System.out.println("Eixo X");
    }
    if (X == 0 && Y > 0 || X == 0 && Y < 0) {
        System.out.println("Eixo Y");
    }
   
teclado.close();
}
    
}
