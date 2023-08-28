import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Uri1174 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df_1 = new DecimalFormat("0.0");

    double A[] = new double[100];
    for(int i = 0; i < 100; i++)
        A[i] = sc.nextDouble();
    for (int i = 0; i < 100; i++)
        if (A[i] <= 10) {
            System.out.println("A[" + i + "] = " + df_1.format(A[i]));
        }
    
    sc.close();
    
    
}
    
}
