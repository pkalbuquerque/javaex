import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o limite diário de pesca em quilogramas: ");
        double limiteDiario = scanner.nextDouble() * 1000; 
        double pesoTotal = 0;
        char resposta = 's';
        
        while (resposta == 's' || resposta == 'S') {
            System.out.print("Informe o peso do peixe em gramas: ");
            double pesoPeixe = scanner.nextDouble();
            
            pesoTotal += pesoPeixe;
            
            if (pesoTotal > limiteDiario) {
                System.out.println("Limite diário excedido!");
                break;
            }
            
            System.out.print("Deseja informar o peso de mais um peixe? (s/n): ");
            resposta = scanner.next().charAt(0);
        }
        
        System.out.println("Peso total da pesca: " + pesoTotal + " gramas.");
    }
}
