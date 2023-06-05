import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Uri1182 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df_1 = new DecimalFormat("0.0");

    int C = sc.nextInt();
    String T = sc.next().toUpperCase();

    double [][] matriz = new double[12][12];

    for (int i = 0; i < 12; i++){
        for (int j = 0; j < 12; j++)
        matriz[i][j] = sc.nextDouble();
    }
    if (T.charAt(0) == 'S') {
        int soma = 0;
        for (int i = 0; i < 12; i++){
            soma += matriz[i][C];
        }System.out.println(df_1.format(soma));
        
    }else {
        if (T.charAt(0) == 'M') {
            int soma = 0;
            for (int i = 0; i < 12; i++){
                soma += matriz[i][C];
            }
            double media = (double)soma / 12;
            System.out.println(df_1.format(media));
        }
    }
    
    
    
    sc.close();
    
    
    
    }
    
}

