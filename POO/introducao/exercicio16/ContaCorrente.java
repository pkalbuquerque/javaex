package POO.introducao.exercicio16;

public class ContaCorrente {
    private String nome;
    private double saldo;

    public ContaCorrente(){
        setNome("Sem nome");
        setSaldo(0);
    }
    public ContaCorrente(String nome){
        setNome(nome);
        setSaldo(0);
    }
    public ContaCorrente(String nome, double saldo){
        setNome(nome);
        setSaldo(saldo);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void fazerDeposito(double valor){
        if (valor <= 0) {
        throw new IllegalArgumentException("Depósito com valor negativo.");
        } 
        setSaldo(getSaldo() + valor);
    }
    public void fazerRetirada(double valor){
        if (valor <= 0) 
            throw new IllegalArgumentException("Valor do saque com valor negativo.");
        
        if (valor > getSaldo()) 
            throw new IllegalArgumentException("Saldo insuficiente para realizar saque.");
            
        setSaldo(getSaldo() - valor);
    }
    public void fazerTransferencia(ContaCorrente outraconta, double valor){
        if (valor <= 0) 
            throw new IllegalArgumentException("Valor da transferência   com valor negativo.");
        
        if (valor > getSaldo()) 
            throw new IllegalArgumentException("Valor a transferir maior que o saldo.");
        
        fazerRetirada(valor);
        outraconta.fazerDeposito(valor);
    }
}
