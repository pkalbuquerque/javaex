import java.util.Scanner;

public class Uni6Uri1173 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  

    int V = sc.nextInt();
    int [] N = new int[10];
    N[0] = V;

    for (int i = 0; i < N.length; i++){
        if (i == 0) {
            N[0] = V;
        } else {
            N[i] = N[i-1] * 2;
        }
    }
    for (int i = 0; i < N.length; i++)
        System.out.println("N[" + i + "] = " + N[i]);
    
        sc.close();
    }
    
}
