import java.util.Scanner;

public class Uni3Uri0014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);    
    //Início 
    double value1 = teclado.nextDouble();
    double value = value1;
     (0 ≤ value1 ≤ 1000000.00);
    
    int cem = 0;
    int cinquenta = 0; 
    int vinte = 0;
    int dez = 0;
    int cinco = 0;
    int dois = 0;
    int coin1 = 0;
    int coin05 = 0;
    int coin025 = 0;
    int coin01 = 0;
    int coin005 = 0;
    int coin001 = 0;






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
            coin1++;
    }}
    if (value >= 0.50) {
        while (value >= 0.50) {
            value -=0.50;
            coin05++;
    }}
    if (value >= 0.25) {
        while (value >= 0.25) {
            value -=0.25;
            coin025++;
    }}
    if (value >= 0.10) {
        while (value >= 0.10) {
            value -=0.10;
            coin01++;
    }}
    if (value >= 0.05) {
        while (value >= 0.05) {
            value -=0.05;
            coin005++;
    }}
    if (value >= 0.01) {
        while (value >= 0.01) {
            value -=0.01;
            coin001++;
    }}

    //Saída
    System.out.println("NOTAS:\n"+cem+" nota(s) de R$ 100.00\n"+cinquenta+" nota(s) de R$ 50.00\n"+vinte+" nota(s) de R$ 20.00\n"+dez+" nota(s) de R$ 10.00\n"+cinco+" nota(s) de R$ 5.00\n"+dois+" nota(s) de R$ 2.00\n"+"MOEDAS:\n"+coin1+" moeda(s) de R$ 1.00\n"+coin05+" moeda(s) de R$ 0.50\n"+coin025+" moeda(s) de R$ 0.25\n"+coin01+" moeda(s) de R$ 0.10\n"+coin005+" moeda(s) de R$ 0.05\n"+coin001+" moeda(s) de R$ 0.01");

    teclado.close();
    }
    
}
