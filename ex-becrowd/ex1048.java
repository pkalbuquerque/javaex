import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1048 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

   double salary = input.nextDouble();
   double readjust;
   double newsalary;
   int percentual;
        
   if (salary <= 400.00) {
     readjust = salary * 0.15;
     newsalary = salary + readjust;
     percentual = 15;
   }
   else if (salary > 400.00 && salary <= 800.00) {
     readjust = salary * 0.12;
     newsalary = salary + readjust;
     percentual = 12;
   }
   else if (salary > 800.00 && salary <= 1200.00) {
     readjust = salary * 0.10;
     newsalary = salary + readjust;
     percentual = 10;
   }
   else if (salary > 1200.00 && salary <= 2000.00) {
     readjust = salary * 0.07;
     newsalary = salary + readjust;
     percentual = 7;
   }
   else {
     readjust = salary * 0.04;
     newsalary = salary + readjust;
     percentual = 4;
   }
   
    System.out.println("Novo salario: " + df_2.format(newsalary));
    System.out.println("Reajuste ganho: " + df_2.format(readjust));
    System.out.println("Em percentual: "+ percentual + " %");
    
  input.close();  }
    
}
