package classes;

// Classe abstrata que representa um produto genérico
public abstract class Produto {
    // Atributos privados do produto
    private String nome;
    private double codigo;
    private double preco;
    private int quantidade;

    // Construtor da classe Produto
    public Produto(String nome, double codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        // Só altera o preço se for maior ou igual a zero
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        // Só altera a quantidade se for positiva
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    // Método abstrato: deve ser implementado pelas subclasses
    public abstract double calcularValorTotal();

    // Método concreto para exibir informações básicas do produto
    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
