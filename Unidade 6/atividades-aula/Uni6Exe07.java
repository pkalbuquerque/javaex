import java.util.Scanner;

public class Uni6Exe07 {

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor inteiro para o vetor: ");
    int tam = sc.nextInt();
    while (tam < 0 && tam > 20) {
        System.out.println("Valor incorreto. Favor indicar um número menor que 20: ");
        tam = sc.nextInt();
    }
  int vetor[] = new int[tam];
  Lervalores(vetor, sc);
  OrdenarValores(vetor);
  ImprimirValores(vetor);

  sc.close();
  }
  
public static int[] Lervalores(int vetor[], Scanner sc) {
    for (int i = 0; i < vetor.length; i++){
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        boolean existe = false;
        
        for (int j = 0; j < vetor.length; j++){
            if (num == vetor[j]) {
                existe = true;
                break;
            }
        }
    
        if (existe == true) {
            System.out.println("O número já está cadastrado. Favor digitar outro número.");
            i--;
        } else {
            vetor[i] = num;
        }
    }
    System.out.println("Vetor origem: ");
    for (int i = 0; i < vetor.length; i++){
        System.out.print("[" + vetor[i] + "]");
    }
    sc.close();
    return vetor;
}
public static int[] OrdenarValores(int vetor[]) {
    int i = 0;
    while (i < vetor.length - 1) {
        if (vetor[i] > vetor[i + 1]) {
            int bolha = vetor[i];
            vetor[i] = vetor[i + 1];
            vetor[i + 1] = bolha;
            i = 0;
        } else{
            i = i + 1;
        }
    }
    return vetor;
}
public static void ImprimirValores(int vetor[]) {
    System.out.println();
    System.out.println("Vetor ordenado: ");
    for (int i = 0; i < vetor.length; i++){
        System.out.print("[" + vetor[i] + "]");
    }

}






}