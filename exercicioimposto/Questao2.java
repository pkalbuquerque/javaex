package POO.introducao.exercicioimposto;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Imposto vetor[] = new Imposto[5];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o nome do funcionário e o salario recebido: ");    
            vetor[i] = new Imposto(sc.next(), sc.nextDouble());
            
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("\nNome: " + vetor[i].getNome()
                                + "\nSalário: " + vetor[i].getSalario()
                                + "\nImposto: " + vetor[i].calcularIrpf());
        }

        sc.close();
    }
}
