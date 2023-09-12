package POO.introducao.lista_exercicios01.exercicio12;

public class Questao12 {
    
    
    public static String menorIdade(Apolice vetor[]){
    int menoridade = Integer.MAX_VALUE;
        String retorno = "";
        for (int i = 0; i < vetor.length; i++) {
            if (menoridade > vetor[i].getIdade()) {
                menoridade = vetor[i].getIdade();
                retorno = vetor[i].imprimir();
        }
            else{
                if (vetor[i].getIdade() == menoridade) {
                    retorno = retorno + "\n" +
                        vetor[i].imprimir();
                        }
                    }
                }
        return retorno;
    }
    
    
    
    
    public static void main(String[] args) {
        Apolice pessoa1 = new Apolice("Pedro", 18, 2200);

        System.out.println("Item B: ");
        System.out.println(pessoa1.imprimir());
        
        pessoa1.calcularPremio();
        System.out.println("Item D: ");
        System.out.println(pessoa1.imprimir());
        
        pessoa1.oferecerDesconto("Blumenau");
        System.out.println("Item F: ");
        System.out.println(pessoa1.imprimir());


        Apolice vetor[] = new Apolice[5];
        vetor[0] = new Apolice("el bardo", 27, 900);
        vetor[1] = new Apolice("nath bahia", 18, 2000);
        vetor[2] = new Apolice("bezabepe", 39, 1600);
        vetor[3] = new Apolice("el pitman", 24, 2300);
        vetor[4] = new Apolice("pm10", 18, 1700);
 
        System.out.println(menorIdade(vetor));
    }
}
