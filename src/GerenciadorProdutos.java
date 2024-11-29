import factory.IProdutoFactory;
import factory.ProdutoFactory;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    private List<Produto> produtos = new ArrayList<>();
    private IProdutoFactory factory = new ProdutoFactory();

    public void cadastrarProduto(String tipo, String nome, double preco, int quantidade) {
        Produto produto = factory.criarProduto(tipo, nome, preco,  quantidade);
        produtos.add(produto);
        System.out.println("Produto cadastrado: " + produto);
    }

    public void listarProdutos() {
        System.out.println("Lista de produtos:");
        produtos.forEach(System.out::println);
    }

    public void calcularValorEmEstoque() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + "|| " + "Valor em Estoque: " + (produto.getPreco() * produto.getQuantidade()));
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        System.out.println("Total em estoque: " + valorTotal);
    }
}
