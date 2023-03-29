import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um numero inteiro de 3 digitos");
        int num = teclado.nextInt();
        String number = String.valueOf(num);

        char[] digits1 = number.toCharArray();
    
        System.out.println(digits1[0] + " Centenas");
        System.out.println(digits1[1] + " Dezenas");
        System.out.println(digits1[2] + " Unidades");
        
        teclado.close();

    }
}
    


    

