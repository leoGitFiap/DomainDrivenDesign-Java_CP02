// 3: Define que esta classe pertence ao pacote 'inventario', organizando o projeto.
package inventario;

// 4: Criação da classe de objeto chamada 'Produto'.
public class Produto {
    // 5: Adiciona os campos (variáveis) de instância privada.
    // 5a: Campo para o número do item.
    private int numeroItem;
    // 5b: Campo para o nome do produto.
    private String nomeProduto;
    // 5c: Campo para o número de unidades em estoque.
    private int quantidade;
    // 5d: Campo para o preço de cada unidade.
    private double preco;
    // 14a: Adiciona um campo de instância booleano chamado 'ativo' com um valor padrão 'true'.
    private boolean ativo;

    // 6: Criação dos construtores.
    // 6a: Construtor padrão (sem parâmetros) que inicializa os campos com valores padrão.
    public Produto() {
        this.numeroItem = 0;
        this.nomeProduto = "";
        this.quantidade = 0;
        this.preco = 0.0;
        // 14a: Garante que o valor padrão seja 'true' quando o construtor padrão é usado.
        this.ativo = true;
    }

    // 6b: Construtor sobrecarregado com parâmetros para inicializar todos os campos.
    public Produto(int numeroItem, String nomeProduto, int quantidade, double preco) {
        this.numeroItem = numeroItem;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
        // 14a: Garante que o valor padrão seja 'true' mesmo quando este construtor é usado.
        this.ativo = true;
    }

    // 7: Criação dos métodos getter/accessor e setter/mutator para cada variável.
    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // 14b: Criação dos métodos getter e setter para o novo campo 'ativo'.
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    // 17: Cria um método para retornar o valor do inventário (preço * quantidade).
    public double getValorEstoque() {
        // Retorna o valor calculado em uma única linha de código, sem variáveis locais.
        // O Math.ceil arredonda o valor para o próximo inteiro, uma prática comum para valores monetários.
        return Math.ceil(quantidade * preco);
    }

    // 8: Substitui (sobrescreve) o método toString() da classe Object.
    @Override
    public String toString() {
        // 15: Adiciona uma lógica para exibir "Ativo" ou "Descontinuado" em vez de "true" ou "false".
        String status = ativo ? "Ativo" : "Descontinuado";

        // 8, 14c e 18: Retorna a String formatada contendo todos os valores,
        // incluindo o status (14c) e o valor do estoque (18).
        return "Número do Item\t\t  : " + numeroItem +
                "\nNome\t\t\t\t  : " + nomeProduto +
                "\nQuantidade em Estoque : " + quantidade +
                "\nPreço\t\t\t\t  : R$ " + String.format("%.2f", preco) +
                // 18: Inclui a chamada ao método getValorEstoque() na saída.
                "\nValor do Estoque\t  : R$ " + String.format("%.2f", getValorEstoque()) +
                // 14c e 15: Inclui o novo campo de status na saída.
                "\nStatus do Produto\t  : " + status + "\n";
    }
}