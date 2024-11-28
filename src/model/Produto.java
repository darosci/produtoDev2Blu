package model;

import strategy.IDesconto;

public abstract class Produto {
	
	// classe abstrata (Factory Method) 
    protected String nome;
    protected double preco;
    protected int quantidade;
    protected IDesconto descontoStrategy;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setDescontoStrategy(IDesconto discountStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double aplicarDesconto() {
        return descontoStrategy != null ? descontoStrategy.calcularDesconto(preco) : preco;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s | Preço: %.2f | Quantidade: %d", nome, preco, quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
