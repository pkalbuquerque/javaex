import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double somaAltura = 0;

    for (int i = 1; i <= 20; i++) {
        System.out.println("Indique a altura de 20 pessoas: ");
        double altura = sc.nextDouble();
        somaAltura += altura;
}
System.out.println("A média da altura das pessoas é: " + (somaAltura / 20));

    
    
    sc.close();
    
    
    
    }
    
}
