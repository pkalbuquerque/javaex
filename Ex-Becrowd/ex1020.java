import java.util.Scanner;

public class ex1020 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Início 
    int days = teclado.nextInt();

    //Processo
    int years = days / 365; 
    int qtdeDias = days % 365;

   int months = qtdeDias / 30 ; 
   int qtdeDias2 = qtdeDias % 30;

   int days2 = qtdeDias2;

   //Saída
   System.out.println(years + (" ano(s)\n") + months + (" mes(es)\n") + days2 + (" dia(s)"));
   teclado.close();
   
   


    }
    
}
