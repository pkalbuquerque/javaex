import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Indique: \n1- Nenhum de nós\n2 - CPM22\n3 - Shank \n4- Jota Quest" );
    int escolha = sc.nextInt();
    int nenhumdenos = 0;
    int CPM22 = 0;
    int Shank = 0;
    int Jotaq = 0;

    while (true) {
        System.out.println("Deseja indicar mais um voto? \nS - Sim \nN - Não");
        String ops = sc.next().toUpperCase();
        if (!ops.equals("S")) {
            break;
        }
        System.out.println("Indique um valor de 1 a 4");
        escolha = sc.nextInt();
        if (escolha == 1) {
            nenhumdenos++;
        }
        else if (escolha == 2) {
            CPM22++;
        }
        else if (escolha == 3) {
            Shank++;
        }
        else if (escolha == 4) {
            Jotaq++;
        }
    }
    System.out.println("O total de votos para Nenhum de nós é " + nenhumdenos);
    System.out.println("O total de votos para CPM22 é " + CPM22);
    System.out.println("O total de votos para Shank é " + Shank);
    System.out.println("O total de votos para Jota quest é " + Jotaq);

    System.out.println("O percentual de votos para Nenhum de nós é " + (nenhumdenos * 1.0) / (nenhumdenos + CPM22 + Shank + Jotaq));
    System.out.println("O percentual de votos para CPM22 é " + (CPM22 * 1.0) / (nenhumdenos + CPM22 + Shank + Jotaq));
    System.out.println("O percentual de votos para Shank é " + (Shank * 1.0) / (nenhumdenos + CPM22 + Shank + Jotaq));
    System.out.println("O percentual de votos para Jota quest é " + (Jotaq * 1.0) / (nenhumdenos + CPM22 + Shank + Jotaq));

    
    
        
    
    
    
    }
    
}
