import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada
     System.out.println("Informe a largura do terreno"); 
    double largura = teclado.nextDouble();
    System.out.println("Informe a altura do terreno");
    double altura = teclado.nextDouble();

    //Processo
    double area = largura * altura;

    //Saída
    System.out.println("Área do terreno: " + area);
    teclado.close();
    }
    
}
