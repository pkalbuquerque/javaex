import java.util.Scanner;

public class Uni5Exe09 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); // Lê o número de alunos
      String[] nomes = new String[n]; // Cria um vetor para os nomes dos alunos
      int[] idades = new int[n]; // Cria um vetor para as idades dos alunos
      int acimaDe20 = 0; // Contador de alunos com idade acima de 20 anos
      
      // Lê os nomes e idades dos alunos
      for (int i = 0; i < n; i++) {
         nomes[i] = sc.next();
         idades[i] = sc.nextInt();
      }
      
      // Escreve os nomes dos alunos com 18 anos
      System.out.println("Alunos com 18 anos:");
      for (int i = 0; i < n; i++) {
         if (idades[i] == 18) {
            System.out.println(nomes[i]);
         }
      }
      
      // Conta a quantidade de alunos com idade acima de 20 anos
      for (int i = 0; i < n; i++) {
         if (idades[i] > 20) {
            acimaDe20++;
         }
      }
      
      // Escreve a quantidade de alunos com idade acima de 20 anos
      System.out.println("Quantidade de alunos com idade acima de 20 anos: " + acimaDe20);
 sc.close();  }
}
