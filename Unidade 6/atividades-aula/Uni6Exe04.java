import java.util.Scanner;

public class Uni6Exe04 {
    
    
    public static void main(String[] args) {
    
        int [] N1 = new int[10];
        int [] N2 = new int[10];
        int [] N3 = new int[10];
        lerValores(N1, N2);
        Valor3(N1, N2, N3);
        imprimirValores(N1, N2, N3);
}
    public static void lerValores(int N1[], int N2[]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < N1.length; i++){
        System.out.println("Indique um valor para o primeiro vetor: ");
        N1[i] = sc.nextInt();
        System.out.println("Indique um valor para o segundo vetor: ");
        N2[i] = sc.nextInt();
    }
    sc.close();}  
  
         public static void Valor3(int N1[], int N2[], int N3[]) {
        for (int i = 0; i < N3.length; i++){
            N3[i] = (N1[i]) + (N2[i]);
        }
    }     
    public static void imprimirValores(int N1[], int N2[], int N3[]) {
        for (int i = 0; i < N1.length; i++){
            System.out.println("O valor do vetor 1 é: " + N1[i]);
            System.out.println("O valor do vetor 2 é: " + N2[i]);
            System.out.println("O valor do vetor 3 é: " + N3[i]);

        }
    }     
}
