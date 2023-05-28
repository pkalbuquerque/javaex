import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int qtde4 = 0; int qtde5 = 0; int qtde9 = 0; int qtde12 = 0;

    System.out.println("Informe o canal a assistir: ");
    int canal = sc.nextInt();
    while (canal != 0 ) {
        switch (canal) {
            case 4:
                qtde4 += sc.nextInt();
                break;
            case 5:
                qtde5 += sc.nextInt();
                break;
            case 9:
                qtde9 += sc.nextInt();
                break;
            case 12:
                qtde12 += sc.nextInt();
                break;
            default:
                break;
        }
        canal = sc.nextInt();

    }
    System.out.println("A porcentagem de quem assiste o canal 4 é: " + (qtde4 * 1.0) / (qtde4 + qtde5 + qtde9 + qtde12));
    System.out.println("A porcentagem de quem assiste o canal 5 é: " + (qtde5 * 1.0) / (qtde4 + qtde5 + qtde9 + qtde12)); 
    System.out.println("A porcentagem de quem assiste o canal 9 é: " + (qtde9 * 1.0) / (qtde4 + qtde5 + qtde9 + qtde12));
    System.out.println("A porcentagem de quem assiste o canal 12 é: " + (qtde12 * 1.0) / (qtde4 + qtde5 + qtde9 + qtde12));
    sc.close();
    
    
    
    
    }
    
}
