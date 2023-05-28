import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    double maior = Integer.MIN_VALUE;     double menor = Integer.MAX_VALUE;
    double media = 0;     int numpar = 0;
    double somaalt = 0;   int numpmaior = 0;
    int numpmenor = 0;

    System.out.println("Informe o número de inscrição do atleta e sua altura: ");
    
    while (true) {
        System.out.print("Número de participante: ");
        int numP = sc.nextInt();
        if (numP == 0) {
            break;
        }
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        numpar++;
        somaalt += altura;
        media = somaalt / numpar;
        if (altura > maior) {
            maior = altura;
            numpmaior = numP;
        }
        if (altura < menor) {
            menor = altura;
            numpmenor = numP;
        }

    } System.out.println("O número de inscrição do participante mais alto é " + numpmaior + " e sua altura é " + maior);
    System.out.println("O número de inscrição do participante mais alto é " + numpmenor + " e sua altura é " + menor);
    System.out.println("A média das alturas dos participantes é de: " + df_2.format(media));
    
sc.close();
}
    
    
}
