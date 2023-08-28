import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o ano de nascimento dos 3 filhos: ");
    int prim = teclado.nextInt();
    int seg = teclado.nextInt();
    int ter = teclado.nextInt();

    if (prim == seg && seg == ter) {
        System.out.println("TRIGÊMEOS");
    }
    else if (prim == seg || seg == ter || prim == ter) {
        System.out.println("GÊMEOS");
    }
    else {
        System.out.println("IRMÃOS");
    }
    teclado.close();
}
    
}
