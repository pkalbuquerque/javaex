package exercicio07;

import java.util.HashMap;

public class EstoqueLivraria {
    private double saldo;
    private HashMap<String, Livro> estoque;

    public EstoqueLivraria(double saldo) {
        setSaldo(saldo);
        estoque = new HashMap<>();
    }

    public void setSaldo(double saldo) {
        if (saldo <= 0) {
            throw new IllegalArgumentException("Saldo deve ser maior que zero.");
        }
        this.saldo = saldo;
    }

    public HashMap<String, Livro> getEstoque() {
        return estoque;
    }

    public double getSaldo() {
        return saldo;
    }

    public void compraLivros(Livro livro, int quantidade) {
        double valorTotal = livro.getPcompra() * quantidade;
        if (valorTotal > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para comprar os livros.");
        }

        if (estoque.containsKey(livro.getIsbn())) {
            Livro livroExistente = estoque.get(livro.getIsbn());
            livroExistente.setEstoque(livroExistente.getEstoque() + quantidade);
        } else {
            livro.setEstoque(quantidade);
            estoque.put(livro.getIsbn(), livro);
        }

        saldo -= valorTotal;
        System.out.println("Compra efetuada.");
    }

    public void vendaLivros(String isbn, int quantidade) {
        if (!estoque.containsKey(isbn)) {
            throw new IllegalArgumentException("Livro com ISBN " + isbn + " não encontrado no estoque.");
        }

        Livro livro = estoque.get(isbn);

        if (livro.getEstoque() < quantidade) {
            throw new IllegalArgumentException("Estoque insuficiente para vender a quantidade desejada.");
        }

        livro.setEstoque(livro.getEstoque() - quantidade);
        double valorTotal = livro.getPvenda() * quantidade;
        saldo += valorTotal;
        System.out.println("Venda efetuada.");
    }

    public void imprimeEstoque() {
        System.out.println("Acervo da livraria:");
        for (Livro livro : estoque.values()) {
            System.out.println("Livro: " + livro.getTitulo() + " | ISBN: " + livro.getIsbn() + " | Estoque: " + livro.getEstoque());
        }
    }
}
