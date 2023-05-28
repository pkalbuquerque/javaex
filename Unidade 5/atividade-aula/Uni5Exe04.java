
public class Uni5Exe04 {
    public static void main(String[] args) {
    double soma =0;
    int j = 2; 

    for (int i = 1; i <= 20; i += 2){
        soma += (i + 2.0) / j;
        System.out.println("Dividendo: " + (i + 2));
        System.out.println("Divisor: " + j);
        j = (i + 2) + j + 1;    
    }
    System.err.println("A soma da série é: " + soma);
    
    
    
    
    
    
    
    }
    
}
