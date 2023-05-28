import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe a idade do primeiro homem: ");
    int hom1 = teclado.nextInt();
    System.out.println("Informe a idade do segundo homem: ");
    int hom2 = teclado.nextInt();
    System.out.println("Informe a idade da primeira mulher: ");
    int mul1 = teclado.nextInt();
    System.out.println("Informe a idade da segunda mulher: ");
    int mul2 = teclado.nextInt();
    
    if (hom1 > hom2 && mul1 > mul2 ) {
        int soma = hom1 + mul2;
        int mult = hom2 * mul1;
        System.out.println("A soma do homem mais velho com a mulher mais nova é: " + (soma));
        System.out.println("A multiplicação do homem mais novo com a mulher mais velha é " + (mult));
    }
    else if (hom2 > hom1 && mul1 > mul2 ) {
        int soma = hom2 + mul2;
        int mult = hom1 * mul1;
        System.out.println("A soma do homem mais velho com a mulher mais nova é: " + (soma));
        System.out.println("A multiplicação do homem mais novo com a mulher mais velha é " + (mult));
    }
    
    else if (hom2 > hom1 && mul2 > mul1) {
        int soma = hom2 + mul1;
        int mult = hom1 * mul2;
        System.out.println("A soma do homem mais velho com a mulher mais nova é: " + (soma));
        System.out.println("A multiplicação do homem mais novo com a mulher mais velha é " + (mult));
    }
    
    else if (hom1 > hom2 && mul2 > mul1) {
        int soma = hom1 + mul1;
        int mult = hom2 * mul1;
    System.out.println("A soma do homem mais velho com a mulher mais nova é: " + (soma));
    System.out.println("A multiplicação do homem mais novo com a mulher mais velha é " + (mult));
    }
    teclado.close();
}
}