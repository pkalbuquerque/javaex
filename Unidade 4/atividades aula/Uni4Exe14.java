import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o dia da data: ");
    int dia = teclado.nextInt();
    System.out.println("Informe o mês da data: ");
    int mes = teclado.nextInt();
    System.out.println("Informe o ano da data: ");
    int ano = teclado.nextInt();

    if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 || mes != 2 && dia < 31 || mes == 2 && dia < 29 ) {
        System.out.println("Válida");
        } 
    else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)){
        System.out.println("Não válida");
}
    else {
        System.out.println("Não válida");
    }
    teclado.close();
    }
    
}
