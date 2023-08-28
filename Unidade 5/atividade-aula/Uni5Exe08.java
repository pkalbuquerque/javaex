import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe um número inteiro: ");
    int n = sc.nextInt();
    int menor = 0;
    int pos = 0;
    
    for (int i = 1; i <= n; i++ ) {
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();
        if (num < menor && num < 0) {
            menor = num;     
        } 
        if ( num > 0 && n > 0) {
            pos += num;
        }
}
        System.out.println("O menor valor negativo é: " + menor);
        System.out.println("A média dos números positivos é: " + (pos / n ));

    
    
    
    
    
    sc.close();
    
    
    
    }
    
}
