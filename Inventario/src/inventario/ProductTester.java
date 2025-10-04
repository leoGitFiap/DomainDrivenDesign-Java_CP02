// Tarefa 3: Define que esta classe também pertence ao pacote 'inventario'.
package inventario;
// Tarefa 12a: Importa a classe 'Scanner' para ler a entrada do usuário.
import java.util.Scanner;

// Tarefa 9: Cria a classe driver chamada 'ProductTester'.
public class ProductTester {
    // O método 'main', ponto de entrada para a execução do programa.
    public static void main(String[] args) {

        // Tarefa 12a: Adiciona um Scanner no início do método main.
        Scanner sc = new Scanner(System.in);

        // Tarefa 19a: Cria uma variável 'maxSize' para armazenar o número de produtos.
        int maxSize = -1;

        // Tarefa 19c: Utiliza um loop 'do-while' para garantir que um valor positivo ou zero seja inserido.
        do {
            // Tarefa 19b: Solicita ao usuário para inserir o número de produtos.
            System.out.println("Insira o número de produtos que gostaria de adicionar:");
            System.out.println("Insira '0' (zero) se não quiser adicionar produtos.");
            System.out.print("Sua opção: ");
            maxSize = sc.nextInt();

            // Tarefa 19c: Exibe uma mensagem de erro se o valor for inválido.
            if (maxSize < 0) {
                System.out.println("\nValor incorreto inserido. Por favor, tente novamente.\n");
            }
        } while (maxSize < 0);

        // Tarefa 20a: Cria uma instrução 'if' que exibe uma mensagem se maxSize for zero.
        if (maxSize == 0) {
            System.out.println("Não há produtos para adicionar!");
            // Tarefa 20b: Adiciona uma instrução 'else' para lidar com valores maiores que zero.
        } else {
            System.out.println(maxSize + " produto(s) serão adicionados.");

            // Tarefa 20b: Cria um array unidimensional de Produtos com o tamanho especificado.
            Produto[] produtos = new Produto[maxSize];

            // Tarefa 12b: Cria variáveis locais temporárias para armazenar os valores do usuário.
            int tempNumber, tempQty;
            String tempName;
            double tempPrice;

            // Tarefa 21: Preenche o array com dados do usuário.
            // Tarefa 21a: Escreve um loop 'for' para iterar pelo array.
            for (int i = 0; i < produtos.length; i++) {
                // Tarefa 21b: Esvazia o buffer de entrada antes de ler a próxima linha de texto.
                sc.nextLine();

                System.out.println("\n=== Inserindo os dados do Produto " + (i + 1) + " ===");

                // Tarefa 21c: Reutiliza o código para obter a entrada do usuário para cada campo.
                System.out.println(">>> Digite o nome do produto: ");
                tempName = sc.nextLine();

                System.out.print(">>> Digite o número do item: ");
                tempNumber = sc.nextInt();

                System.out.print(">>> Digite a quantidade: ");
                tempQty = sc.nextInt();

                System.out.print(">>> Digite o preço: ");
                tempPrice = sc.nextDouble();

                // Tarefa 21d: Adiciona um novo objeto Produto ao array usando o construtor com 4 parâmetros.
                produtos[i] = new Produto(tempNumber, tempName, tempQty, tempPrice);

                // Exemplo de como a Tarefa 16 seria aplicada a um item do array
                // if(i == 0){ // Se for o primeiro produto (índice 0)
                //     produtos[i].setAtivo(false); // Define o status como 'false' (Descontinuado)
                // }
            }

            System.out.println("\n====================================================");
            System.out.println("=== EXIBINDO TODOS OS NOVOS PRODUTOS CADASTRADOS ===");
            System.out.println("====================================================");

            // Tarefa 22: Usa um loop 'for-each' para exibir as informações de cada produto no array.
            for (Produto produtoAtual : produtos) {
                System.out.println(produtoAtual);
            }
        }

        // As tarefas 12 e 13 foram incorporadas na lógica do loop acima.
        // A demonstração abaixo cumpre as tarefas 10 e 11.
        System.out.println("\n====================================================");
        System.out.println("======= EXIBINDO OS PRODUTOS PRÉ-CADASTRADOS =======");
        System.out.println("====================================================");

        // Tarefa 10b: Cria quatro objetos Produto fornecendo valores diretamente ao construtor.
        Produto p3 = new Produto(7652, "CD Greatest Hits", 25, 29.99);
        Produto p4 = new Produto(9865, "DVD Filme X", 10, 39.90);
        Produto p5 = new Produto(2168, "Software Antivirus", 50, 99.90);
        Produto p6 = new Produto(1987, "Mouse Gamer", 15, 149.90);

        // Tarefa 16: Demonstração de como chamar o setter para definir 'ativo' como falso.
        p3.setAtivo(false);

        // Tarefa 11: Exibe os detalhes de cada produto no console.
        System.out.println("\n" + p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        // Tarefa 13e: Fecha o objeto Scanner para liberar os recursos.
        sc.close();
    }
}