// Define que esta classe também pertence ao pacote 'inventario'.
package inventario;
// Importa a classe 'Scanner' do pacote 'java.util', que é usada para ler a entrada do usuário.
import java.util.Scanner;

// Declaração da classe pública chamada 'ProductTester'.
public class ProductTester {
    // O método 'main', ponto de entrada para a execução do programa.
    public static void main(String[] args) {

        // Cria uma nova instância da classe Scanner, associando-a à entrada padrão do sistema (o teclado).
        Scanner sc = new Scanner(System.in);

        // Declara e inicializa uma variável inteira 'maxSize' como -1. Ela armazenará o número de produtos a serem criados.
        int maxSize = -1;

        // Inicia um loop 'do-while'. O código dentro do 'do' será executado pelo menos uma vez.
        do {
            // Imprime uma instrução para o usuário no console.
            System.out.println("Insira o número de produtos que gostaria de adicionar:");
            // Imprime outra instrução.
            System.out.println("Insira '0' (zero) se não quiser adicionar produtos.");
            // Imprime uma solicitação para o usuário digitar sua opção, sem pular linha.
            System.out.print("Sua opção: ");
            // Lê o próximo número inteiro digitado pelo usuário e o armazena em 'maxSize'.
            maxSize = sc.nextInt();
            // Verifica se o valor inserido é negativo.
            if (maxSize < 0) {
                // Se for negativo, informa ao usuário que o valor está incorreto.
                System.out.println("\nValor incorreto inserido. Por favor, tente novamente.\n");
            }
            // O loop continua enquanto o valor de 'maxSize' for menor que 0.
        } while (maxSize < 0);

        // Verifica se o usuário escolheu não adicionar produtos (digitou 0).
        if (maxSize == 0) {
            // Se sim, exibe uma mensagem informando que nenhum produto será adicionado.
            System.out.println("Não há produtos para adicionar!");
            // Se 'maxSize' for maior que 0...
        } else {
            // Informa ao usuário quantos produtos serão adicionados.
            System.out.println(maxSize + " produto(s) serão adicionados.");

            // Cria um array (vetor) de objetos 'Produto' com o tamanho definido pelo usuário em 'maxSize'.
            Produto[] produtos = new Produto[maxSize];

            // Declara variáveis temporárias para armazenar os dados de cada produto antes de criar o objeto.
            int tempNumber, tempQty;
            String tempName;
            double tempPrice;

            // Inicia um loop 'for' que executará 'maxSize' vezes (de 0 até o tamanho do array - 1).
            for (int i = 0; i < produtos.length; i++) {
                // Consome a quebra de linha pendente do 'nextInt()' ou 'nextDouble()' anterior. Essencial para ler a próxima linha corretamente.
                sc.nextLine();

                // Exibe um cabeçalho para indicar qual produto está sendo inserido.
                System.out.println("\n=== Inserindo os dados do Produto " + (i + 1) + " ===");

                // Solicita o nome do produto.
                System.out.println(">>> Digite o nome do produto: ");
                // Lê a linha inteira digitada pelo usuário e armazena em 'tempName'.
                tempName = sc.nextLine();

                // Solicita o número do item.
                System.out.print(">>> Digite o número do item: ");
                // Lê o próximo inteiro digitado e armazena em 'tempNumber'.
                tempNumber = sc.nextInt();

                // Solicita a quantidade.
                System.out.print(">>> Digite a quantidade: ");
                // Lê o próximo inteiro digitado e armazena em 'tempQty'.
                tempQty = sc.nextInt();

                // Solicita o preço.
                System.out.print(">>> Digite o preço: ");
                // Lê o próximo número de ponto flutuante (double) e armazena em 'tempPrice'.
                tempPrice = sc.nextDouble();

                // Cria uma nova instância (objeto) da classe 'Produto' usando o construtor com parâmetros e a armazena na posição 'i' do array.
                produtos[i] = new Produto(tempNumber, tempName, tempQty, tempPrice);
            }

            // Exibe um cabeçalho para a listagem dos produtos.
            System.out.println("\n====================================================");
            System.out.println("=== EXIBINDO TODOS OS NOVOS PRODUTOS CADASTRADOS ===");
            System.out.println("====================================================");

            // Inicia um 'for-each' loop para percorrer cada objeto 'Produto' dentro do array 'produtos'.
            for (Produto produtoAtual : produtos) {
                // Para cada produto no array, invoca implicitamente seu método 'toString()' e imprime o resultado no console.
                System.out.println(produtoAtual);
            }
        }
        System.out.println("\n====================================================");
        System.out.println("======= EXIBINDO OS PRODUTOS PRÉ-CADASTRADOS =======");
        System.out.println("====================================================");

        // --- Demonstração de criação de objetos 'Produto' de forma direta ---
        // Cria um novo objeto 'Produto' e o armazena na variável 'p3'.
        Produto p3 = new Produto(7652, "CD Greatest Hits", 25, 29.99);
        // Cria um novo objeto 'Produto' e o armazena na variável 'p4'.
        Produto p4 = new Produto(9865, "DVD Filme X", 10, 39.90);
        // Cria um novo objeto 'Produto' e o armazena na variável 'p5'.
        Produto p5 = new Produto(2168, "Software Antivirus", 50, 99.90);
        // Cria um novo objeto 'Produto' e o armazena na variável 'p6'.
        Produto p6 = new Produto(1987, "Mouse Gamer", 15, 149.90);

        // Imprime os detalhes do objeto 'p3' usando seu método 'toString()'.
        System.out.println("\n" + p3);
        // Imprime os detalhes do objeto 'p4'.
        System.out.println(p4);
        // Imprime os detalhes do objeto 'p5'.
        System.out.println(p5);
        // Imprime os detalhes do objeto 'p6'.
        System.out.println(p6);

        // Fecha o objeto Scanner para liberar os recursos do sistema. É uma boa prática fazer isso ao final.
        sc.close();
    }
}