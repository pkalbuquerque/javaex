import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
    System.out.println("Informe o valor X: ");
    int X = teclado.nextInt();
    System.out.println("Informe o valor de Y: ");
    int Y = teclado.nextInt();

    if (X == 0 && Y == 0) {
        System.out.println("QUADRANTE 0");
    }
    else if (X > 0 && Y > 0) {
        System.out.println("QUADRANTE 1");
    }
    else if (X > 0 && Y < 0 ) {
        System.out.println("QUADRANTE 2");
    }
    else if (X < 0 && Y < 0 ) {
        System.out.println("QUADRANTE 3");
    }
    else if (X < 0 && Y > 0 ) {
        System.out.println("QUADRANTE 4");
        
    }
    teclado.close();
    
    
    
}
    
}
