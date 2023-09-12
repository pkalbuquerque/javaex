package POO.introducao.lista_exercicios01.exercicio13;

public class PrincipalEstoque {
    private String codigo;
    private double valor;
    private int quantidade;


    public PrincipalEstoque(String codigo, double valor, int quantidade){
        setCodigo(codigo);
        setValor(valor);
        setQuantidade(quantidade);
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getValor() {
        return valor; 
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void adicionarProduto(int quantidadeadd){
        if (quantidadeadd <= 0) {
            throw new IllegalArgumentException("Não há possibilidade de adicionar negativo/zerado produtos.");
        }
        quantidade += quantidadeadd;;
    }
    public boolean verificarDisponibilidade(int quantidadeadd){
        if (quantidadeadd > 0) {
            if (quantidadeadd <= getQuantidade()) {
            System.out.println("Há Disponibilidade do produto.");
            return true;
        }}
    System.out.println("Não há Disponibilidade do produto.");
    return false;
    }
    public boolean retirarProduto(int quantidadeadd){
        if (quantidadeadd > 0) {
            if (quantidadeadd <= getQuantidade()) {
            System.out.println("Retirada realizada com sucesso.");
            quantidade -= quantidadeadd;
            return true;
        }}
    System.out.println("Quantidade insuficiente para retirada.");
    return false;
    }


}
