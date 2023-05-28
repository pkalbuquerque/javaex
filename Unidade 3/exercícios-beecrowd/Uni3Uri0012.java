import java.util.Scanner;


public class Uni3Uri0012 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);    
    //Início 
    int value1 = teclado.nextInt();
    int value = value1;
    int cem = 0;
    int cinquenta = 0; 
    int vinte = 0;
    int dez = 0;
    int cinco = 0;
    int dois = 0;
    int um = 0;

    //Processo
    if (value >= 100) {
        while (value >= 100) {
            value -=100;
            cem++;
        }}

    if (value >= 50) {
        while (value >= 50) {
            value -=50;
            cinquenta++;
        }}
    if (value >= 20) {
        while (value >= 20) {
            value -=20;
            vinte++;
    }}
    if (value >= 10) {
        while (value >= 10) {
            value -=10;
            dez++;
    }}
    if (value >= 5) {
        while (value >= 5) {
            value -=5;
            cinco++;
    }}
    if (value >= 2) {
        while (value >= 2) {
            value -=2;
            dois++;
    }}
    if (value >= 1) {
        while (value >= 1) {
            value -=1;
            um++;
    }}

    //Saída
    System.out.println(value + "\n"+ cem + " nota(s) de R$ 100,00 " + "\n"+ cinquenta + " nota(s) de R$ 50,00" + "\n"+ vinte + " nota(s) de R$ 20,00" + "\n" + dez + " nota(s) de R$ 10,00" + "\n" + cinco + " nota(s) de R$ 5,00" + "\n" + dois + " nota(s) de R$ 2,00" + "\n" + um + " nota(s) de R$ 1,00"  );
    teclado.close();



    
}
}