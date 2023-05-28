import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double total = 0;
    double price = 0;
    double salariototal = 0;
    String name = "";
    double value = 0;
    while (true) {
        System.out.println("Digitar os dados de mais um vendedor? \nS- sim e N- não");
        String ops = sc.next().toUpperCase();
        if (ops.equals("N")) {
            break;
        }
        System.out.print("Digite o nome do vendedor: ");
         name = sc.next();

        System.out.print("Informe quantos produtos o vendedor vendeu: ");
        int n = sc.nextInt();
        for(int i  = 1; i <= n ; i++){
            System.out.println("Indique o preço unitário: ");
            double preço = sc.nextDouble();
            System.out.println("Indique quantas unidades foram vendidas: ");
            double und = sc.nextDouble();
            value = und * preço;
            total += value; 
            price = value * 0.3;
            salariototal += price; 
        }
        System.out.println("O nome do vendedor é: " + name);
    System.out.println("O total de vendas foi de: " + total);
    System.out.println("O salário do vendedor é: " + salariototal);
    }
    
    
    
    
    sc.close();
    
    
    }
    
}
