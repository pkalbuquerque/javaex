import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int valor = 8;
    System.out.println("Digite um número maior que 2: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i += 2){
        System.out.println(valor);
        if (i + 1 <= n) {
            System.out.println(valor + 2);
        valor = valor * 2;
            
        }
    }
    
    
    
    
    
    
    sc.close();
    
    
    
    
    }
















}
        








    
    
    
    
    
    
    
    
    

