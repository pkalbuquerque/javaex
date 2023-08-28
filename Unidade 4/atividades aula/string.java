import java.util.Scanner;

public class string {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String letra = teclado.nextLine().toUpperCase();

    switch (letra.charAt(0)) {
        case 'F': 
        System.out.println("Feminino");
            
            break;
        case 'M' :
        System.out.println("Masculino");
         break;
        default:
        System.out.println("Indefinido");
            break;
    }
    
    teclado.close();
    
    
    
    }
    
}
