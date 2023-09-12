package POO.introducao.exercicio7;

public class quadrante {
    public static void main(String[] args) {
        Ponto vetor[] = new Ponto[7];
        vetor[0] = new Ponto(-10,0);
        vetor[1] = new Ponto(1,3);
        vetor[2] = new Ponto(2,2);
        vetor[3] = new Ponto(4,-5);
        vetor[4] = new Ponto(-1,3);
        vetor[5] = new Ponto(1,4);
        vetor[6] = new Ponto(-1,-3);
        
        for (int i = 0; i < vetor.length; i++) {
        System.out.println(vetor[i].imprimir());
        }
    }
}
