import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Início
    System.out.println(" 1 - Ciência da Computação");
    System.out.println(" 2 - Licenciatura da Computação");
    System.out.println(" 3 - Sistemas de Informação");
    System.out.println("Informe o curso que optou: ");
    int curse = teclado.nextInt();

    //Processo
    switch (curse) {
     case 1:
        System.out.println("Bacharel em Ciência da Computação");
          break;
     case 2:
        System.out.println("Licenciado em Computação");
         break;
     case 3:
        System.out.println("Bacharel em Sistemas de Informação");
        default:
        System.out.println("Entrada incorreta");
            break;
    }

    
    
    teclado.close();
    
    
    
    
    
    }
    
}
