import java.util.Scanner;

public class ex1847 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int A = teclado.nextInt();
    int B = teclado.nextInt();
    int C = teclado.nextInt();
    
    if (A > B && B <= C) {
        System.out.println(":)");
    }
    else if (A < B && B >= C ) {
        System.out.println(":(");
    }
    else if (A < B && B < C && (C - B) < (B - A)) {
        System.out.println(":(");
    }
    else if (A < B && B < C && (C - B) >= (B - A)) {
        System.out.println(":)");
    }
    else if (A > B && B > C && (B - C) < (A - B)) {
        System.out.println(":)");
    }
    else if (A > B && B > C && (B - C) >= (A - B)) {
        System.out.println(":(");
    }  
    else if (A == B && B < C ) {
        System.out.println(":)");
    }
     else if (A == B && B > C ) {
        System.out.println(":(");
    }
teclado.close();
}
    
}
