
public class Uni5Exe10 {
    public static void main(String[] args) {

    int contador = 0, numero = 1;
    while (contador < 10) {
        int metade1 = numero / 100;
        int metade2 = numero % 100;
        if (Math.pow(metade1 + metade2, 2) == numero) {
            System.out.println(numero);
            contador++;
        }   numero++;
    }
    
    
    
    
    
    
    }
    

}