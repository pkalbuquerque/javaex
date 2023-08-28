public class Uni5Exe22 {
    public static void main(String[] args) {
    
    double salario= 2000.00;
    int ano = 1995;
    int anofinal = 2023;
    double aumento = 1.5;

    while (ano < anofinal) {
        ano++;
        salario = salario + (salario * aumento / 100);
        aumento = aumento * 2;
    }
    System.out.println("O salário atual do funcionário é de: " + salario);
    }
    
}
