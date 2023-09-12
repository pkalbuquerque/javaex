package POO.introducao.lista_exercicios01.exercicio15;

public class Questao15 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.acelerar(25.0); // Não foi possível acelerar
        carro.acelerar(15.0);
        System.out.println(carro.getCarro()); // A velocidade atual do carro é 15.0

        carro.reduzir(35.0); // Não foi possível reduzir
        carro.reduzir(10.0);
        System.out.println(carro.getCarro()); 
    }
}
