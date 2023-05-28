import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int venc = 10;
    System.out.println("Informe o dia que foi pago: ");
    int pago = teclado.nextInt();
    System.out.println("Informe o valor da prestação: ");
    double valor = teclado.nextDouble();

    if (pago < venc) {
        double preço = valor * 0.9;
        System.out.println("O valor que o cliente deve pagar é de R$ " + (preço));
        }
    else if (pago <= venc + 5) {
        double preço2 = valor;
        System.out.println("O valor que o cliente deve pagar é de R$ " + (preço2));
    }
    else if (pago > venc + 5) {
        double multa = (pago - (venc + 5)) * 0.02;
        double preço3 = valor * (1 + multa);
        System.out.println("O valor que o cliente deve pagar é de R$ " + (preço3));
    }
    
    
    
    teclado.close();
    
    
    }    
}
