public class Uni5Exe20 {
    public static void main(String[] args) {
        double massaInicialKg = 10.0; // Massa inicial em Kg
        double massaFinalGramas = 0.5; // Massa final desejada em gramas

        double massaInicialGramas = massaInicialKg * 1000; // Converter massa inicial para gramas
        double tempoSegundos = 0;

        while (massaInicialGramas >= massaFinalGramas) {
            massaInicialGramas /= 2; // Diminuir a massa pela metade
            tempoSegundos += 50; // Incrementar o tempo em 50 segundos
        }

        System.out.println("Massa inicial: " + massaInicialKg + " Kg");
        System.out.println("Massa final: " + massaFinalGramas + " gramas");
        System.out.println("Tempo necessário: " + tempoSegundos + " segundos");
    }
}






