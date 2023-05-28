import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
    //Início
    System.out.println("Informe F para Feminino, M para masculino e I para Não informado");
    String letra = teclado.next().toUpperCase();
    
    
//Processo
switch (letra) {
  case "M":
  System.out.println("Masculino");
    break;
  case "F":
  System.out.println("Feminino");
    break;
  case "I":
  System.out.println("Não informado");
    break;
  default:
  System.out.println("Entrada Incorreta.");
    break;
}
teclado.close();




    }}
