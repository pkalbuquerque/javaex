import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o nome do aluno: ");
    String name = sc.next();

    while (!name.equals("Fim" )) {
        System.out.println("Informe a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a nota 2: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;

        System.out.println("A média do " + name + " é de " + media) ;
        System.out.println("Informe Fim para sair ou informe outro aluno: ");
        name = sc.next(); 
    }
    
    
    sc.close();
    
    
    
    
    
    
    
    }
    
}
