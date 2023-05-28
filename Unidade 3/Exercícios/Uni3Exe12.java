import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Uni3Exe12 {
  public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
            DecimalFormat df_2 = new DecimalFormat("0.00");
    
    //Início
    System.out.println("Informe o nome do funcionário: ");
    String worker = teclado.next();
    System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
    int hour = teclado.nextInt();
    System.out.println("Informe o número de dependentes: ");
    int dependent = teclado.nextInt();

    //Processo
    double bruto = hour * 10 + dependent * 60;
    double liquido = hour * 10 * 0.865 + dependent * 60;
    
    
    //Saída
    System.out.println((worker) + "Salário bruto:  " +  df_2.format(bruto) );
    System.out.println((worker) + "Salário líquido:  " +  df_2.format(liquido) );
    teclado.close();




    
}
}