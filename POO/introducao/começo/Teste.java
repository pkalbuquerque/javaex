package POO.introducao.começo;

import java.util.Scanner;

//Pedro Krubniki Albuquerque
public class Teste {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de telhados: ");
        int telhado = sc.nextInt();
        double vetor[] = new double[telhado];
        for (int i = 0; i < telhado; i++) {
        System.out.println("Informe a altura do telhado: ");
        double alturatelhado = sc.nextDouble();
        System.out.println("Informe o comprimento do telhado: ");
        double comprimentotelhado = sc.nextDouble();
        
        vetor[i] = alturatelhado * comprimentotelhado;
        
        Telhado umTelhado = new Telhado(alturatelhado, comprimentotelhado);

        System.out.println("Existe telhado sobreposto? \n1 - Sim\n2 - Não");
        int opcao = sc.nextInt();
        double det = umTelhado.calcularCalhas();

        switch (opcao) {
            case 1:
                System.out.println("Informe a altura do telhado sobreposto: ");
                double altura = sc.nextDouble();
                System.out.println("Informe o comprimento do telhado sobreposto: ");
                double comprimento = sc.nextDouble();
                Telhado sobreposto = new Telhado(altura, comprimento);
                sobreposto.calcularCalhas();
                det = umTelhado.calcularCalhas() - sobreposto.calcularCalhas();
                break;
            default:
                break;
        }
        System.out.println("A quantidade de condutores para este telhado é: " + umTelhado.calcularCondutores(det));
        
    }
        System.out.println("Maior área de telhado indicado na " + maiorArea(vetor) + " vez");

    sc.close();
    }
        
private static double maiorArea(double vetor[]){
        double maiortelhado = Double.MIN_VALUE;
        int num = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiortelhado) {
                maiortelhado = vetor[i];
                num = i;
            }
        }
        return (int) num + 1;
    }
        
         
       
}
