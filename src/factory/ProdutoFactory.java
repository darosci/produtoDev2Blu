package factory;

import model.*;

public class ProdutoFactory implements IProdutoFactory {
	//  Produto Concreto 
	
    @Override
    public Produto criarProduto(String tipo, String nome, double preco, int quantidade) {
        switch (tipo.toLowerCase()) {
            case "eletronicos":
                return new Eletronicos(nome,preco, quantidade);
            case "mantimentos":
                return new Mantimentos(nome, preco, quantidade);
            default:
                throw new IllegalArgumentException("Tipo de produto desconhecido: " + tipo);
        }
    }
}
