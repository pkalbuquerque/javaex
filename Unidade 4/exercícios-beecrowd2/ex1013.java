import java.util.Scanner;

public class ex1013 {
    public static void main(String[] args) {
    Scanner teclado =  new Scanner(System.in);
    
    //Início
    int A = teclado.nextInt();
    int B = teclado.nextInt();
    int S = teclado.nextInt();

    //Processo
    int maiorAB = (A + B + Math.abs(A - B)) /2;
    int maiorABC = (maiorAB + S + Math.abs(maiorAB - S)) / 2; 


    //Saída
    System.out.println(maiorABC + " eh o maior");
    teclado.close();

    }
    
}
