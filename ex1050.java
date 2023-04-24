import java.util.Scanner;

public class ex1050 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Início
    int DDD = teclado.nextInt();
    if (DDD == 61) {
        System.out.println("Brasilia");
        
    }
    else if (DDD == 71) {
        System.out.println("Salvador");
        
    }
    else if (DDD == 11) {
        System.out.println("Sao Paulo");
        
    }
    else if (DDD == 21) {
        System.out.println("Rio de Janeiro");
        
    }
    else if (DDD == 32) {
        System.out.println("Juiz de Fora");
        
    }
    else if (DDD == 19) {
        System.out.println("Campinas");
        
    }
    else if (DDD == 27) {
        System.out.println("Vitoria");
        
    }
    else if (DDD == 31) {
        System.out.println("Belo Horizonte");
    }     
    
   else if (DDD != 61 || DDD != 71 || DDD != 11 ||DDD != 21 ||DDD != 32 ||DDD != 19 ||DDD != 27 ||DDD != 31 ) {
    System.out.println("DDD nao cadastrado");
   } 
teclado.close();
}
    
}
