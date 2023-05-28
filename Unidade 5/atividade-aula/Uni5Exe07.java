import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe um número inteiro: ");
    int n = sc.nextInt();
    double maior = Double.NEGATIVE_INFINITY;
    double menor = Double.POSITIVE_INFINITY;
    
    for (int i = 1; i <= n; i++) {
        System.out.println("Digite um número real: ");
        double num = sc.nextDouble();
        if (num > maior) {
            maior = num;
            
        }
        if (num < menor) {
            menor = num;
        }
    }
    System.out.println("O maior número é: " + maior);
    System.out.println("O menor número é: " + menor);
    
    
    
    sc.close();
    
    
    
    
    
    }
    
}
