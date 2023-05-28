import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Início
    double A = teclado.nextDouble();

    if (A != (int) A) {
        System.out.println("Tem casas decimais");
        }
    else{
        System.out.println(("Sem casas decimais"));
    }
    teclado.close();
    
}
    
}
