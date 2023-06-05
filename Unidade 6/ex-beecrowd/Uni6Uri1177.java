import java.util.Scanner;

public class Uni6Uri1177 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    int aux = 0;
    int T = sc.nextInt();
    int[] N = new int[1000];
    
    for (int i = 0; i < 1000; i++){
        if (aux == T) 
            aux = 0;
        N[i] = aux;
        aux++;
}
    for (int i = 0; i < 1000; i++)
    System.out.println("N[" + i + "] = " + N[i]);
    
   
   sc.close(); }
    
}
