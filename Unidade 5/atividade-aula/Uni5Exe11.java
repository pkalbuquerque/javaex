import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int biscoitos =  0;

    for (int i = 1 ; i <= 16; i++) {
        if (i == 1) {
            biscoitos += 1;
        } 
        else if (i == 2) {
            biscoitos = 3;
        }
        else {
            biscoitos = 3 * biscoitos;
        }
    }
    
    
    System.out.println("A máquina produz " + biscoitos + " por dia");

    
    
    
    sc.close();
    
    
    
    
    }
    
}
