import java.util.Scanner;

public class Uni6Exe07 {

    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor para o vetor até 20: ");
        int N = sc.nextInt();
        int vetor[] = new int[N];
        LerValor(vetor, sc);
    }
    
    public static void LerValor(int vetor[], Scanner sc) {
        for (int i = 0; i < vetor.length; i++){
        System.out.println("Informe um valor para o vetor: ");
        vetor [i]= sc.nextInt();
        if (vetor[i] == vetor[i]) {
            System.out.println("Informe um valor diferente: ");
            vetor[i] = sc.nextInt();
        }
    }
}
}