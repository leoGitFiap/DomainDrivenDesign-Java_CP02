// Define que a classe pertence ao pacote 'inventario'. Pacotes são usados para organizar as classes.
package inventario;

// Declaração da classe pública chamada 'Produto'.
public class Produto {
    // Declara um atributo privado do tipo inteiro para armazenar o número de identificação do item.
    private int numeroItem;
    // Declara um atributo privado do tipo String para armazenar o nome do produto.
    private String nomeProduto;
    // Declara um atributo privado do tipo inteiro para armazenar a quantidade do produto em estoque.
    private int quantidade;
    // Declara um atributo privado do tipo double para armazenar o preço unitário do produto.
    private double preco;
    // Declara um atributo privado do tipo booleano para indicar se o produto está ativo (true) ou descontinuado (false).
    private boolean ativo;

    // Declaração do construtor padrão (sem argumentos).
    public Produto() {
        // Inicializa o atributo 'numeroItem' com o valor 0.
        this.numeroItem = 0;
        // Inicializa o atributo 'nomeProduto' com uma string vazia.
        this.nomeProduto = "";
        // Inicializa o atributo 'quantidade' com o valor 0.
        this.quantidade = 0;
        // Inicializa o atributo 'preco' com o valor 0.0.
        this.preco = 0.0;
        // Inicializa o atributo 'ativo' com o valor true (produto ativo por padrão).
        this.ativo = true;
    }

    // Declaração do construtor com parâmetros para inicializar os atributos do objeto.
    public Produto(int numeroItem, String nomeProduto, int quantidade, double preco) {
        // Atribui o valor do parâmetro 'numeroItem' ao atributo 'numeroItem' da classe.
        this.numeroItem = numeroItem;
        // Atribui o valor do parâmetro 'nomeProduto' ao atributo 'nomeProduto' da classe.
        this.nomeProduto = nomeProduto;
        // Atribui o valor do parâmetro 'quantidade' ao atributo 'quantidade' da classe.
        this.quantidade = quantidade;
        // Atribui o valor do parâmetro 'preco' ao atributo 'preco' da classe.
        this.preco = preco;
        // Inicializa o atributo 'ativo' com o valor true para todo novo produto criado com este construtor.
        this.ativo = true;
    }

    // --- Início dos Métodos Getters e Setters ---
    // Getter: Método público que retorna o valor do atributo 'numeroItem'.
    public int getNumeroItem() {
        return numeroItem;
    }

    // Setter: Método público que define um novo valor para o atributo 'numeroItem'.
    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    // Getter: Método público que retorna o valor do atributo 'nomeProduto'.
    public String getNomeProduto() {
        return nomeProduto;
    }

    // Setter: Método público que define um novo valor para o atributo 'nomeProduto'.
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    // Getter: Método público que retorna o valor do atributo 'quantidade'.
    public int getQuantidade() {
        return quantidade;
    }

    // Setter: Método público que define um novo valor para o atributo 'quantidade'.
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Getter: Método público que retorna o valor do atributo 'preco'.
    public double getPreco() {
        return preco;
    }

    // Setter: Método público que define um novo valor para o atributo 'preco'.
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter para um atributo booleano. Por convenção, inicia-se com "is" em vez de "get".
    public boolean isAtivo() {
        return ativo;
    }

    // Setter: Método público que define um novo valor para o atributo 'ativo'.
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    // --- Fim dos Métodos Getters e Setters ---

    // Método público que calcula e retorna o valor total do estoque para este produto.
    public double getValorEstoque() {
        // Multiplica a quantidade pelo preço e usa Math.ceil para arredondar o resultado para o próximo inteiro maior.
        return Math.ceil(quantidade * preco);
    }

    // Sobrescreve (substitui) o método 'toString' da classe Object.
    @Override
    public String toString() {
        // Usa um operador ternário para definir a string 'status' como "Ativo" se 'ativo' for true, e "Descontinuado" caso contrário.
        String status = ativo ? "Ativo" : "Descontinuado";
        // Retorna uma String formatada com todas as informações do produto.
        return "Número do Item\t\t  : " + numeroItem +
                "\nNome\t\t\t\t  : " + nomeProduto +
                "\nQuantidade em Estoque : " + quantidade +
                "\nPreço\t\t\t\t  : R$ " + preco +
                "\nValor do Estoque\t  : R$ " + getValorEstoque() +
                "\nStatus do Produto\t  : " + status + "\n";
    }
}