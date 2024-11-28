package produtoDev2Blu.factory;

import model.Produto;

public interface IProdutoFactory {
	// Interface de produto (Factory Method) 
    Produto criarProduto(String tipo, String nome, double preco, int quantidade);
}
