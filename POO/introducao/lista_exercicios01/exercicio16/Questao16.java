package POO.introducao.lista_exercicios01.exercicio16;

public class Questao16 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("pedro", 950.0);
        ContaCorrente oc = new ContaCorrente("nathan", 0);
        cc.fazerDeposito(10000000);
        cc.fazerRetirada(500000);
        cc.fazerTransferencia(oc, 1000000);
        System.out.println(cc.getNome() + " tem um saldo de: "+ cc.getSaldo());
        System.out.println(oc.getNome() + " tem um saldo de: " + oc.getSaldo());
    }
}
