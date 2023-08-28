import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    
    System.out.println("T: calcular a área de um triângulo de base b e altura h \nQ: calcular a área de um quadrado de lado l \nR: calcular a área de um retângulo de base b e altura h \nC: calcular a área de um círculo de raio r");
    System.out.println("Informe a letra da opção que deseja: ");
    String ops = teclado.next().toUpperCase();
    switch (ops) {
        case "T":
        System.out.println("Informe a área da base em cm: ");
        int base = teclado.nextInt();
        System.out.println("Informe a altura em cm: ");
        int alt = teclado.nextInt();
        double areaT = (base * alt) / 2; 
        System.out.println("A área do triângulo é: " + areaT);  
            break;
        case "Q":
        System.out.println("Informe o lado do quadrado em cm: ");
        int lado = teclado.nextInt();
        int areaQ = lado * lado;
        System.out.println("A área do quadrado é: " + areaQ);  
        break;
        case "R": 
        System.out.println("Informe a área da base em cm: ");
        int baseR = teclado.nextInt();
        System.out.println("Informe a altura em cm: ");
        int altR = teclado.nextInt();
        double areaR = (baseR * altR); 
        System.out.println("A área do retângulo é: " + areaR);
        break;
        case "C": 
        System.out.println("Informe o raio do círculo em cm: ");
        Double raio = teclado.nextDouble();
        double area = 3.1415 * Math.pow(raio, 2);
        System.out.println("A área do circulo é: " + area);
        default:
            break;
    }
 teclado.close();   }
    
}
