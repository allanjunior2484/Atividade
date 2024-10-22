import java.util.ArrayList;
import java.util.List;

public class RepositorioProduto {
    private List<Produto> produtos; // Lista para armazenar produtos
    private float estoque; // Quantidade total em estoque

    //construtor estoque manual

    public RepositorioProduto(List<Produto> produtosIniciais, float estoqueInicial) {
        this.produtos = new ArrayList<>(produtosIniciais); // Inicializa com a lista de produtos fornecida
        this.estoque = estoqueInicial; // Define o estoque com o valor fornecido
    }



    // Construtor
    public RepositorioProduto() {
        this.produtos = new ArrayList<>(); // Inicializa a lista de produtos
        this.estoque = 0; // Inicializa o estoque
    }

    // Metodo para adicionar um produto ao repositório
    public void adicionarProduto(Produto produto) {
        produtos.add(produto); // Adiciona o produto à lista
        estoque += 1; // Aumenta o estoque
    }

    // Metodo para remover um produto do repositório
    public void removerProduto(Produto produto) {
        if (produtos.remove(produto)) { // Remove o produto da lista
            estoque -= 1; // Diminui o estoque se o produto foi encontrado e removido
        }
    }

    // Metodo para obter a lista de produtos
    public List<Produto> getProdutos() {
        return produtos; // Retorna a lista de produtos
    }

    // Metodo para obter a quantidade total de estoque
    public float getEstoque() {
        return estoque; // Retorna a quantidade de estoque
    }
}
