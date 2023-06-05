import java.util.Scanner;

public class Uni6Exe03 {

    
public static void main(String[] args) {
        double vetor[] = new double[12];
        lerValor(vetor);
        calcularValor(vetor);
        imprimirValor(vetor);
        }

public static void lerValor(double vetor[]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < vetor.length; i++){
        vetor[i] = sc.nextDouble();
    } sc.close();
}
public static void calcularValor(double[] vetor) {
    for (int i = 0; i < vetor.length; i++){
        if (vetor[i] % 2 == 0) {
            vetor[i] = vetor[i] * 1.02;
        } else{
            vetor[i] = vetor[i] * 1.05;
        }
    }
}
public static void imprimirValor(double vetor[]) {
    for (int i = 0; i < vetor.length; i++){
        System.out.println(vetor[i]);
    }
}


}

