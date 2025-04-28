package classes;

// Classe Celular que herda de Produto
public class Celular extends Produto {
    // Atributos específicos do Celular
    private String marca;
    private String modelo;

    // Construtor
    public Celular(String nome, double codigo, double preco, int quantidade, String marca, String modelo) {
        super(nome, codigo, preco, quantidade); // Chama o construtor da superclasse Produto
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos getters e setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Implementação do método abstrato calcularValorTotal
    @Override
    public double calcularValorTotal() {
        return getPreco() * getQuantidade();
    }

    // Exibe informações do Celular (complementando o Produto)
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da superclasse
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
