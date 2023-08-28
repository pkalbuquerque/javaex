import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Início
    System.out.println("Informe o peso da carta em gramas: ");
    int peso = teclado.nextInt();

    //Processo
    if (peso > 50) {
        int resto = peso - 50;
        int excesso = (resto / 20) + 1;
        double preço = 0.45 + (excesso * 0.45);
        System.out.println("Custo do selo: R$" + preço);
    }
    else{
        System.out.println("Custo do selo: R$:0.45");
        
    }

      teclado.close();
        
    }
    }
    

