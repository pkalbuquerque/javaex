import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1038 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");
//Início 
int X = teclado.nextInt();
int Y = teclado.nextInt();
double total;
switch (X) {
    case 1 : total = Y * 4.00; break;
    case 2 : total = Y * 4.50; break;
    case 3 : total = Y * 5.00; break;
    case 4 : total = Y * 2.00; break;
    case 5 : total = Y * 1.50; break;
    default: total = 0;


}
System.out.println("Total: R$ " + df_2.format(total));
teclado.close();
}
    
}
