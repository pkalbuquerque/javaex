import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o valor máximo de pedágio: ");
    double max = sc.nextDouble();
    double pago =  0;
    int distancia = 0;
    int trechos = 0;
    int trechos_passaram = 0;
    int trechos150 = 0;

    while (true) {
        System.out.println("Informe o valor pago no pedágio: \nIndique um número negativo para Fim.");
        pago = sc.nextDouble();
        if (pago < 0) {
            break;
        }
        System.out.println("Informe a distância nesse pedágio pago: ");
        distancia = sc.nextInt();
        trechos++;
        if (pago > max) {
            trechos_passaram++;
        } else if (distancia > 150 && pago <= max) {
            trechos150++;
        }

    }
    System.out.println("A quantidade de trechos que tem valor acima que ele se nega a pagar é de: " + trechos_passaram);
    System.out.println("A quantidade de trechos informados foi de: " + trechos);
    System.out.println("Teve " + trechos150 + " que passaram de 150km e com valor aceito por ele.");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
