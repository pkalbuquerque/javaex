package POO.introducao.exercicio16;

public class Questao16 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("João", 950.0);
        ContaCorrente oc = new ContaCorrente(null, 0);
        cc.fazerDeposito(2000);
        cc.fazerRetirada(10);
        cc.fazerTransferencia(oc, 3000);
        System.out.println(oc.getSaldo());
        System.out.println(cc.getSaldo());
    }
}
