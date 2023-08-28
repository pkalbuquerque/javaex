import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe a primeira nota: ");
    double nota1 = teclado.nextDouble();
    System.out.println("Informe a segunda nota: ");
    double nota2 = teclado.nextDouble();
    System.out.println("Informe a terceira nota: ");
    double nota3 = teclado.nextDouble();
    System.out.println("Informe a nota de exercícios: ");
    double ex = teclado.nextDouble();

    double media = (nota1 + (nota2 * 2) + (nota3 * 3 ) + ex) / 7;

    if (media >= 9.0 ) {
        System.out.println("A");
        System.out.println("Aprovado");
    }
    if (media >= 7.5 && media < 9.0 ) {
        System.out.println("B");
        System.out.println("Aprovado");
    }
    if (media >= 6.0 && media < 7.5 ) {
        System.out.println("C");
        System.out.println("Aprovado");
    }
    if (media >= 4.0 && media < 6.0 ) {
        System.out.println("D");
        System.out.println("Reprovado");
    }
    if (media < 4.0 ) {
        System.out.println("E");
        System.out.println("Reprovado");
    }
    
    
    
    teclado.close();
    
    
    
    
    
    }
}
