import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o primeiro número: ");
    int A = teclado.nextInt();
    System.out.println("Informe o segundo número: ");
    int B = teclado.nextInt();
    System.out.println("Informe qual opção: \n 1 - Soma de dois números. \n 2 - Diferença entre dois números. \n 3 - Produto entre dois números. \n 4 - Divisão entre dois números (o denominador não pode ser zero).");
    int ops = teclado.nextInt();
    switch (ops) {
        case 1:
            int soma = A + B; 
            System.out.println("A soma dos números é: " + (soma));
            break;
        case 2: 
            int dif = A - B; 
            System.out.println("A diferença dos números é: " + (dif));
            break;
        case 3: 
            int mult = A * B; 
            System.out.println("A multiplicação dos números é: " + (mult));
            break;
        case 4: 
            if (B == 0) {
                System.out.println("Inválido");
            } else {
                double div = A / B;
                System.out.println("A divisão dos números é: " + (div));
            } break;
        default:
        System.out.println("Opção inválida");
            break;
    }

    
    
    
    teclado.close();
    
    
    
    
    }
    
}
