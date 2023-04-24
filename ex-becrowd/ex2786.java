import java.util.Scanner;

public class ex2786 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int l = teclado.nextInt();
    int c = teclado.nextInt();

    int c1 = l * c + (l - 1) * (c - 1)
    int c2 = (l -1 ) * 2 + (c - 1) * 2;
    
    System.out.println(c1);
    System.out.println(c2);
    teclado.close();
}
    
}
