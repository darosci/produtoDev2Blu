import strategy.DescontoSazonal;
import strategy.IDesconto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();
        IDesconto desconto = new DescontoSazonal();
        Scanner sc = new Scanner(System.in);
        int controle = 0;
        while (controle < 4) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Sistema de Gerenciamento de Produtos!");
            System.out.println("----------------------------------------------------------");
            System.out.println("[1] Cadastrar Produto");
            System.out.println("[2] Listar Produtos");
            System.out.println("[3] Calcular Valor em Estoque");
            System.out.println("[4] Sair");
            System.out.print("::");
            controle = sc.nextInt();

            switch (controle) {
                case 1:
                    System.out.println("Cadastrar Produto");
                    String categoria = "";
                    while (categoria.equals("")) {
                        System.out.print("Digite a categoria do produto(E ou M): ");
                        categoria = sc.next();
                        sc.nextLine(); //Limpar Scanner
                        categoria = categoria.equalsIgnoreCase("E") ? "eletronicos" :
                                categoria.equalsIgnoreCase("M") ? "mantimentos" : "";
                        if (categoria.equalsIgnoreCase("")) {
                            System.out.println("Categoria inválida!");
                        }
                    }
                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o valor do produto: ");
                    double valor = sc.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    System.out.println("Produto cadastrado com sucesso!");
                    gerenciador.cadastrarProduto(categoria, nome, valor, quantidade);
                    break;
                case 2:
                    System.out.println("----------------------------------------------------------");
                    gerenciador.listarProdutos();
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Aperte enter para continuar.");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("----------------------------------------------------------");
                    gerenciador.calcularValorEmEstoque();
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Aperte enter para continuar.");
                    sc.nextLine();
                    sc.nextLine();
                    break;
            }
        }
        System.out.println("Programa finalizado com sucesso!");
    }
}