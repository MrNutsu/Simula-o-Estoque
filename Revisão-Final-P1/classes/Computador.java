package classes;

// Classe Computador que herda de Produto
public class Computador extends Produto {
    // Atributos específicos do Computador
    private String processador;
    private String memoriaRam;

    // Construtor
    public Computador(String nome, double codigo, double preco, int quantidade, String processador, String memoriaRam) {
        super(nome, codigo, preco, quantidade); // Chama o construtor da superclasse Produto
        this.processador = processador;
        this.memoriaRam = memoriaRam;
    }

    // Métodos getters e setters

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    // Implementação do método abstrato calcularValorTotal
    @Override
    public double calcularValorTotal() {
        return getPreco() * getQuantidade();
    }

    // Exibe informações do Computador (complementando o Produto)
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da superclasse
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRam);
    }
}
