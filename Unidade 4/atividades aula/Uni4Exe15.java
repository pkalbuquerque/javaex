import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
    System.out.println("Informe a quantidade de meses que o funcionário foi admitido: ");
    int meses = teclado.nextInt();

    if (meses <= 12) {
        System.out.println("O funcionário ira receber 5% de reajuste salarial.");
        }
    else if (meses >= 13 && meses <= 48 ) {
        System.out.println("O funcionário ira receber 7% de reajuste salarial."); 
        }
    else {
        System.out.println("Por favor informe a quantidade de meses entre 0 e 48.");
    }
teclado.close();
    }
    
}
