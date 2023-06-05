import java.util.Scanner;

public class Uni6Uri1180 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int menor = 0;
    int pos = 0;
    int n = sc.nextInt();
    int[] X = new int[n];
    
    for (int i = 0; i< n; i++)
        X[i] = sc.nextInt();
    for (int i = 0; i < n; i++){
        if (i == 0) {
            menor = X[i];
            pos = i;
        } else {
            if (menor > X[i]) {
                menor = X[i];
                pos = i;
            }
        }
    }
    System.out.println("Menor valor: " + menor);
    System.out.println("Posicao: " + pos);
    
    sc.close();
    
    }
    
}
