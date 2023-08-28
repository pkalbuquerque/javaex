import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      
    String respostasMoca[] = new String[5];
    String respostasRapaz[] = new String[5];

    lerRespostas(respostasMoca, respostasRapaz);
    calcularRetornarindice(respostasMoca, respostasRapaz);

    int indice = calcularRetornarindice(respostasMoca, respostasRapaz);
    
    if (indice == 15) {
        System.out.println("Casem!");
    } else if (indice >= 10 && indice <= 14) {
        System.out.println("Voces têm muita coisa em comum!");
    } else if (indice >= 5 && indice <= 9) {
        System.out.println("Talvez não dê certo :(");
    } else if (indice >= 0 && indice <= 4) {
        System.out.println("Vale um encontro");
    } else if (indice <= -1 && indice >= -9) {
        System.out.println("Melhor não perder tempo");
    } else {
        System.out.println("Vocês se odeiam!");
    }
   
    input.close();
    }

    public static void lerRespostas(String respostasMoca[], String respostasRapaz[]) {
        Scanner input = new Scanner(System.in);
        String perguntas[] = { "Gosta de música sertaneja? ",
                "Gosta de futebol? ", "Gosta de seriados? ",
                "Gosta de redes sociais? ", "Gosta da Oktoberfest? " };

        System.out.println("----------------------------");
        System.out.println("Perguntas para a moça!");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            respostasMoca[i] = input.next().toUpperCase();
        }
        
        System.out.println("----------------------------");
        System.out.println("Perguntas para o rapaz!");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            respostasRapaz[i] = input.next().toUpperCase();
        }
        input.close();
    }

    public static int calcularRetornarindice(String respostasMoca[], String respostasRapaz[]) {
        int indice = 0;
        for (int i = 0; i < 5; i++) {
            if ((respostasMoca[i].equals("SIM") && respostasRapaz[i].equals("SIM")) || (respostasMoca[i].equals("NAO") && respostasRapaz[i].equals("NAO")) || (respostasMoca[i].equals("IND") && respostasRapaz[i].equals("IND"))) {
                indice += 3;
            }
            else if ((respostasMoca[i].equals("NAO") && respostasRapaz[i].equals("SIM")) || (respostasMoca[i].equals("SIM") && respostasRapaz[i].equals("NAO"))) {
                indice -= 2;
            }
            else {
                indice += 1;
            }
        }

        return indice;
    }

}
