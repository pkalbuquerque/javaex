import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe sua renda anual: ");
    double renda = teclado.nextDouble();
    System.out.println("Informe o número de dependentes: ");
    int dependentes = teclado.nextInt();
    
    if (renda > 2000 && renda <= 5000) {
        double ir = renda * 0.05 - (dependentes * 0.02);
        System.out.println("O imposto de renda a se pagar é de " + (ir));       
    }
    else if (renda > 5000 && renda < 10000) {
        double ir2 = renda * 0.1 - (dependentes * 0.02);
        System.out.println("O imposte de renda a se pagar é de " + (ir2));
    }
    else if (renda > 10000) {
        double ir3 = renda * 0.15 - (dependentes * 0.15);
        System.out.println("O imposto de renda a se pagar é de " + (ir3));    
    }
    else { 
        System.out.println("Não paga impostos.");
    }
    
    teclado.close();
    
    
    
    
    }
    
}
