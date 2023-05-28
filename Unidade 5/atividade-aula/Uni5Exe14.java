     import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double PCtotal = 0;
    double PVtotal = 0;
    int lucro10 = 0;
    int lucro15 = 0;
    int lucro20 = 0;
    double lucrototal = 0;

    for(int i = 1 ; i <= 5; i++){
        System.out.println("Digite o nome da mercadoria: ");
        String name = sc.next();
        System.out.println("Digite o preço de compra: ");
        double PC = sc.nextDouble();
        System.out.println("Digite o preço de venda: ");
        double PV = sc.nextDouble();
        double lucro = (PV - PC) / PC * 100;
        if (lucro < 10 ) {
            lucro10++;
        }
        else if (lucro >= 10 && lucro <= 20) {
            lucro15++;
        }
        else if (lucro > 20) {
            lucro20++;
        } 
        PCtotal += PC;
        PVtotal += PV;
        lucrototal = (PVtotal - PCtotal) / PCtotal * 100;
    }
    
    System.out.println("Existem " + lucro10 + " com lucro menor que 10%");
    System.out.println("Existem " + lucro15 + " com lucro maior que 10% e menor que 20%");
    System.out.println("Existem " + lucro20 + " com lucro maior que 20%");

    System.out.println("O Valor total de compra é: " + PCtotal);
    System.out.println("O Valor total de venda é: " + PVtotal);
    
    System.out.println("O lucro total da mercadoria foi de: " + lucrototal);
    
    sc.close();
    
    
    
    }
    
}
