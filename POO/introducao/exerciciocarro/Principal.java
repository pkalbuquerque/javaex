package POO.introducao.exerciciocarro;

import java.util.Scanner;

//Pedro Krubniki Albuquerque

public class Principal {

    public static void main(String[] args) {
        
        Carro carros[] = new Carro[5];
        carros[4] = new Carro("Gol", "VW", "MMM001", "Preta", 2009, 24000, 1);
        carros[1] = new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 30000, 2);
        carros[2] = new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 32000, 3);
        carros[3] = new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 29000, 1);
        carros[0] = new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 26000, 1);
        
        Carro carroMaisCaro = encontrarCarroMaisCaro(carros, 2009);
        if (carroMaisCaro != null) {
            System.out.print("Carro mais caro do determinado ano: ");
            System.out.print(carroMaisCaro.getModelo());
        } else {
            throw new IllegalArgumentException("Não existe nenhum carro no sistema com essas especificações.");
        }
        System.out.println("\nO carro da determinada marca com as especificações: "+carrosDadaMarca(carros, "VW", 25000, 31000));
        
        
        System.out.println(carroLocalizacao(carros, 1));
       
    }



    public static Carro encontrarCarroMaisCaro(Carro[] carros, int anoDesejado) {
        Carro carroMaisCaro = null;
        double precoMaisAlto = 0;

        for (Carro carro : carros) {
            if (carro.getAno() == anoDesejado && carro.getPreco() >= precoMaisAlto) {
                carroMaisCaro = carro;
                precoMaisAlto = carro.getPreco();
            }
        }

        return carroMaisCaro;
    } 
    public static String carrosDadaMarca(Carro[] carros, String marca, double precox, double precoy){
        String carroespeficico = "";
        for(Carro carro : carros){
            if (carro.getMarca() == marca) {
                if (carro.getPreco() >= precox && carro.getPreco() <= precoy) {
                    carroespeficico = carro.getModelo();
                    return carroespeficico;
                }
            } 
            }
    return "Nenhum carro com essa especificação.";

}
public static String carroLocalizacao(Carro[] carros, int localizacao){
    double precoMaisAlto = Double.MIN_VALUE;
    double precoMaisBaixo = Double.MAX_VALUE;
    String caroebarato = null;

    for (Carro carro : carros) {
        if (carro.getLoc() == localizacao) {
            if (carro.getPreco() > precoMaisAlto) {
                precoMaisAlto = carro.getPreco();
                caroebarato = "O carro mais caro da determinada localização foi: " + carro.getModelo();
            }
        else{
            if (carro.getPreco() < precoMaisBaixo) {
                precoMaisBaixo = carro.getPreco();
                caroebarato += "\nO carro mais barato da determinada localização foi: " + carro.getModelo();
            }
        }}
    }
return caroebarato;
    

   
}
}
