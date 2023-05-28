import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    for (int i = 1; i <= 20; i++) {
        System.out.println("Indique um número: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " É par");
            
        } else {
            System.out.println(number + " É ímpar");
        }
    }
    
    sc.close();
    
    
    
    
    
    }
    
}
