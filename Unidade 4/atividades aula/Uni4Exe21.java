import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o seu peso em kg: ");
    double massa = teclado.nextDouble();
    System.out.println("Informe sua altura em metros: ");
    double altura = teclado.nextDouble();


    //Processo
    double IMC =  massa / Math.pow(altura, 2);
    System.out.println(IMC);
    //Saída
    if (IMC < 18.5) {
        System.out.println("Magreza");
        }
    if (IMC >= 18.5 && IMC < 25.0) {
        System.out.println("Saudável");
    }
    if (IMC >= 25.0 && IMC < 30.0) {
        System.out.println("Sobrepeso");
    }
    if (IMC >= 30.0 && IMC < 35.0) {
        System.out.println("Obesidade grau I ");
    }
    if (IMC >= 35.0 && IMC < 40.0) {
        System.out.println("Obesidade grau II (severa)");
    }
    if  (IMC >= 40){
    System.out.println("Obesidade grau III (mórbida)");
    }
    
    teclado.close();
    
    
    
    
    }
    
}
