import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de reabastecimentos feitos: ");
        int n = scanner.nextInt();

        double total = 0;
        double fuel = 0;
        System.out.println("Digite os dados de cada reabastecimento: ");

        for(int i = 1; i <= n; i++){
            System.out.println("Reabastecimento " + i);
            System.out.println("Odômetro no início: ");
            double initialodom = scanner.nextDouble();
            System.out.println("Odômetro no final: ");
            double finalodom = scanner.nextDouble();
            System.out.println("Quantidade combustível comprado em litros: ");
            double fuelbought = scanner.nextDouble();
            
            double kilometers = finalodom - initialodom;
            double mileage = kilometers / fuelbought;
            
            System.out.println("Quilometragem obtida em cada parada: " + mileage);

            total += kilometers;
            fuel += fuelbought;

            

        }
        double averagemileage = total / fuel;

        System.out.println("A quilometragem média no final do percuso: " + averagemileage);



        scanner.close();
        
        
        
        
        
        

    }}