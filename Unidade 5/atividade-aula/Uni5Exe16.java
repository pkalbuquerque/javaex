import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPessoas = 0;
        double somaAlturas = 0.0;
        double somaAlturasMulheres = 0.0;
        int totalMulheres = 0;

        System.out.println("Digite a altura em metros e o sexo ('M' ou 'F') das pessoas (Digite 0 para finalizar):");

        while (true) {
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            if (altura == 0) {
                break;
            }
            
            System.out.print("Sexo ('M' ou 'F'): ");
            char sexo = scanner.next().charAt(0);
            
            somaAlturas += altura;
            totalPessoas++;

            if (sexo == 'F' || sexo == 'f') {
                somaAlturasMulheres += altura;
                totalMulheres++;
            }
        }

        double mediaAlturaGrupo = somaAlturas / totalPessoas;
        double mediaAlturaMulheres = somaAlturasMulheres / totalMulheres;

        System.out.println("Média de altura do grupo: " + mediaAlturaGrupo + " metros");
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " metros");

        scanner.close();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

