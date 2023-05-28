import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Uni3Exe14 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
            DecimalFormat df_2 = new DecimalFormat("0.00");
    
    //Início
    System.out.println("Informe a distância percorrida em KM: ");
    double distance = teclado.nextDouble();
    System.out.println("Informe o tempo gasto na viagem em horas: ");
    double time = teclado.nextDouble();

    //Processo
    double average = distance / time;
    double fuel = distance / 12;

    //Saída
    System.out.println("Velocidade média calculada:  "  + df_2.format(average) + (" Km/h") );
    System.out.println("Combustível gasto na viagem:  " +  df_2.format(fuel) + (" Litros") );
    teclado.close();


    
}
}