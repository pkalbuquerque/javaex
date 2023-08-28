import java.util.Scanner;

public class Uni5Exe02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int somaP = 0;
    int somaIP = 0;
    
    for (int i = 1; i <= 100; i++){
        if (i % 2 == 0) {
            somaP += i;
            
        } else {
            somaIP += i;
        }
    }
    System.out.println("A soma dos números pares é: " + somaP);
    System.out.println("A soma dos números ímpares é: " + somaIP);
    sc.close();
    
    
    
    
    }
    
}
