package POO.introducao.exercicio7;

public class questao7 {
    
    public static double calculardistancia(Ponto p1, Ponto p2){
        double x = Math.pow(p1.getx() - p2.getx() , 2);
        double y = Math.pow(p1.gety() - p2.gety() , 2);

        return Math.sqrt(x + y);
    }
    
    
    public static void main(String[] args) {
       Ponto vetor[] = new Ponto[7];
       vetor[0] = new Ponto(1,1);
       vetor[1] = new Ponto(1,3);
       vetor[2] = new Ponto(2,2);
       vetor[3] = new Ponto(4,5);
       vetor[4] = new Ponto(-1,3);
       vetor[5] = new Ponto(1,4);
       vetor[6] = new Ponto(-1,-3);

       double menorDistancia = 99.0;
       double distancia = 0;
       Ponto p1 = null, p2 = null;
       for (int i = 0; i < vetor.length; i++) {
        for (int j = i + 1; j < vetor.length; j++) {
            distancia = calculardistancia(vetor[i], vetor[j]);
            if (distancia < menorDistancia) {
                menorDistancia = distancia;
                p1 = vetor[i];
                p2 = vetor[j];   
            }
            
        }
        System.out.println("Distancia: " + distancia);
     }  
   System.out.println("Menor distância encontrada: " + menorDistancia + "\nAs coordenadas da menor distância: (" + p1.getx() + "," + p1.gety() + ") " + p2.getx() + "," + p2.gety());
    
}
}
