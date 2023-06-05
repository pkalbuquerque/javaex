import java.util.Scanner;

public class Uni6Uri1175 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int cont = 0;
    int [] N = new int[20];
    for (int i = 0; i < 20; i++)
        N[i] = sc.nextInt();
    for (int i = 19; i >= 0; i--){
        System.out.println("N[" + cont + "] = " + N[i]);
        cont++;
    }
    sc.close();
    
    
    
    }
    
}
