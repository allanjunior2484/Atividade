import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando Fornecedores
        Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", 1);
        Fornecedor fornecedor2 = new Fornecedor("Fornecedor B", 2);

        // Criando Categorias
        Categoria categoriaEletronicos = new Categoria("Eletrônicos");

        // Criando Produtos
        Produto produto1 = new Produto(
                categoriaEletronicos.getNomeCategoria(),
                "Produto 1",
                50.0f,
                75.0f,
                101,
                501,
                fornecedor1,  // Fornecedor passado corretamente
                LocalDate.of(2025, 12, 31),
                LocalDate.now()
        );

        Produto produto2 = new Produto(
                categoriaEletronicos.getNomeCategoria(),
                "Produto 2",
                30.0f,
                45.0f,
                102,
                502,
                fornecedor2,  // Fornecedor passado corretamente
                LocalDate.of(2025, 6, 30),
                LocalDate.now()
        );

        // Criando Repositórios
        RepositorioProduto repositorioProduto = new RepositorioProduto();

        // Adicionando produtos ao repositório
        repositorioProduto.adicionarProduto(produto1);
        repositorioProduto.adicionarProduto(produto2);

        // Criando Serviço de Relatório
        ServicoRelatorio servicoRelatorio = new ServicoRelatorio(repositorioProduto);

        // Gerando relatórios
        servicoRelatorio.gerarRelatorio(); // Relatório de produtos
        servicoRelatorio.gerarRelatorioEstoque(); // Relatório de estoque
    }
}
