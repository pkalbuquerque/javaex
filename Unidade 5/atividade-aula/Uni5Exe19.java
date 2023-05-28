import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double valor = 0; double valortotal = 0;
    double valorcomdesconto = 0;
    while (true) {
        System.out.println("Informe informe o valor da compra: ");
        valor = sc.nextInt();
        if (valor == 0) {
            break;
        }
        if (valor > 500.00) {
            valorcomdesconto = valor * 0.8;
            System.out.println("O valor dessa compra com desconto é de: " + valorcomdesconto);
        } else{
            valorcomdesconto = valor * 0.85;
            System.out.println("O valor dessa compra com desconto é de: " + valorcomdesconto);

        } valortotal += valorcomdesconto;

    }
    System.out.println("O valor total recebido pela loja no dia é de: " + valortotal);
    
    
    
    sc.close();
    
    }
    
}
