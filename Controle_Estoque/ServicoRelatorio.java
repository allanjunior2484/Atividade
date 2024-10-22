import java.util.List;

public class ServicoRelatorio {
    private RepositorioProduto repositorioProduto; // Referência ao repositório de produtos

    // Construtor que inicializa um repositório vazio
    public ServicoRelatorio() {
        this.repositorioProduto = new RepositorioProduto(); // Inicializa com um repositório vazio
    }

    // Construtor padrão
    public ServicoRelatorio(RepositorioProduto repositorioProduto) {
        this.repositorioProduto = repositorioProduto; // Inicializa o repositório
    }


    // Metodo para gerar um relatório de produtos
    public void gerarRelatorio() {
        List<Produto> produtos = repositorioProduto.getProdutos(); // Obtém a lista de produtos

        System.out.println("Relatório de Produtos:");


        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNomeProduto()); // Corrigido para getNomeProduto()
            System.out.println("Preço de Custo: " + produto.getPrecoCusto());
            System.out.println("Preço de Venda: " + produto.getPrecoVenda());
            System.out.println("Código do Produto: " + produto.getCodigoProduto());
            System.out.println("Código Interno: " + produto.getCodigoInterno());
            System.out.println("Validade: " + produto.getValidade());
            System.out.println("Chegada: " + produto.getChegada());

        }
    }

    // Metodo para gerar um relatório de estoque
    public void gerarRelatorioEstoque() {
        float totalEstoque = repositorioProduto.getEstoque(); // Obtém o total de estoque
        System.out.println("Total de Estoque: " + totalEstoque);
    }
}


