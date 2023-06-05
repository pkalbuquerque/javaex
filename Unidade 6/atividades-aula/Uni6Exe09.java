import java.util.Scanner;

public class Uni6Exe09 {
    

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] ops = new int[30];
        LerValores(ops, sc);
        
        }
    

        public static void Lervalores(int ops[], Scanner sc) {
        int masculino = 0;
        int feminino = 0;
        int soma = 0;
         for (int i = 0; i < ops.length; i++){
                System.out.println("Informe o sexo: \n 1 - Masculino \n 2 - Feminino");
                ops[i] = sc.nextInt();
                switch (ops[i]) {
                    case 1:
                        masculino++;
                        System.out.println("Informe uma nota para o cinema de 0 a 10: ");
                        int nota = sc.nextInt();
                        soma += nota;
                        
                        break;
                    case 2:
                        feminino++;
                        System.out.println("Informe uma nota para o cinema de 0 a 10: ");
                        int nota2 = sc.nextInt();
                        soma += nota2;
                        break;
                
                    default:

                        break;
                }
            }
        }
    
}
