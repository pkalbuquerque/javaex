import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1040 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df_1 = new DecimalFormat("0.0");
    //Início 
    double A = input.nextDouble();
    double B = input.nextDouble();
    double C = input.nextDouble();
    double D = input.nextDouble();
     
    //Processo
    double average = ((A * 2) + (B * 3) + (C * 4) + (D * 1)) / 10;
    System.out.println("Media: " + df_1.format(average));
    if (average >= 7.0) {
        System.out.println("Aluno aprovado.");   
    }
    if (average >= 5.0 && average < 7.0 ){
        System.out.println("Aluno em exame.");
        double exame = input.nextDouble();
        System.out.println("Nota do exame: " + df_1.format(exame));
        double average2 = (average + exame) / 2;
        if (average2 > 5.0){
            System.out.println("Aluno aprovado.");
        }
        else{
            System.out.println("Aluno reprovado.");
        }
        System.out.println("Media final: " + df_1.format(average2));

    }
    if (average < 5.0){
        System.out.println("Aluno reprovado");
    }
    
input.close();
}
    
}
