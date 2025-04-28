package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import classes.Celular;
import classes.Computador;
import classes.Produto;

// Classe principal do sistema
public class SistemaEstoque {

    // Lista que armazena todos os produtos
    private static List<Produto> produtos = new ArrayList<>();

    // Scanner para entrada de dados
    private static Scanner scanner = new Scanner(System.in);

    // Método principal
    public static void main(String[] args) {
        
        int opcao;

        // Loop principal do menu
        do {
            System.out.println("\n----- Sistema de Estoque -----");
            System.out.println("1. Cadastrar Computador");
            System.out.println("2. Cadastrar Celular");
            System.out.println("3. Listar Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt(); // Lê a opção do usuário
            scanner.nextLine(); // Limpa o buffer do teclado

            // Executa uma ação de acordo com a opção escolhida
            switch(opcao) {
                case 1:
                    cadastrarComputador();
                    break;
                case 2:
                    cadastrarCelular();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while(opcao != 0); // Continua enquanto o usuário não escolher sair
    }

    // Método para cadastrar um Computador
    private static void cadastrarComputador() {
        System.out.println("\n--- Cadastro de Computador ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Código: ");
        double codigo = scanner.nextDouble();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        System.out.print("Processador: ");
        String processador = scanner.nextLine();

        System.out.print("Memória RAM: ");
        String memoriaRam = scanner.nextLine();

        // Cria um novo Computador e adiciona à lista
        Computador computador = new Computador(nome, codigo, preco, quantidade, processador, memoriaRam);
        produtos.add(computador);

        System.out.println("Computador cadastrado com sucesso!");
    }

    // Método para cadastrar um Celular
    private static void cadastrarCelular() {
        System.out.println("\n--- Cadastro de Celular ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Código: ");
        double codigo = scanner.nextDouble();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        // Cria um novo Celular e adiciona à lista
        Celular celular = new Celular(nome, codigo, preco, quantidade, marca, modelo);
        produtos.add(celular);

        System.out.println("Celular cadastrado com sucesso!");
    }

    // Método para listar todos os produtos cadastrados
    private static void listarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");

        // Se a lista estiver vazia
        if(produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            // Para cada produto na lista
            for (Produto produto : produtos) {
                produto.exibirInformacoes();
                System.out.println("Valor total em estoque: R$" + produto.calcularValorTotal());
                System.out.println("-------------------------------");
            }
        }
    }
}
