package strategy;

public class DescontoSazonal implements IDesconto {
		// Estratégia Concreta
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.9; // 10% de desconto
    }
}
