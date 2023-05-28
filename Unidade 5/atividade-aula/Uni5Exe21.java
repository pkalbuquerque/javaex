public class Uni5Exe21 {
    public static void main(String[] args) {
    
    double chico = 1.5;
    double ze = 1.1;
    int anos = 0;
    while (chico > ze) {
        chico += 0.02;
        ze += 0.03;
        anos++;
    }
    System.out.println("A quantidade de anos que zé precisou para ficar maior aue o chico é de: " + anos);
    
    }
    
}
