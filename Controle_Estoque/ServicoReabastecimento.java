public class ServicoReabastecimento {
    private Produto produto; // Produto a ser reabastecido
    private float quantidadeProduto; // Quantidade a ser reabastecida


    // Construtor que inicializa apenas o produto, com quantidade padrão de 0
    public ServicoReabastecimento(Produto produto) {
        this.produto = produto; // Inicializa o produto
        this.quantidadeProduto = 0; // Inicializa a quantidade como 0
    }
    // Construtor
    public ServicoReabastecimento(Produto produto, float quantidade) {
        this.produto = produto; // Inicializa o produto
        this.quantidadeProduto = quantidade; // Inicializa a quantidade
    }

    // Metodo para reabastecer o produto
    public void reabastecer(float quantidade) {
        quantidadeProduto += quantidade; // Aumenta a quantidade no estoque
    }

    // Metodo para obter a quantidade atual do produto
    public float getQuantidadeProduto() {
        return quantidadeProduto; // Retorna a quantidade atual
    }

    // Metodo para obter o produto
    public Produto getProduto() {
        return produto; // Retorna o produto
    }

    // Metodo para definir um novo produto
    public void setProduto(Produto produto) {
        this.produto = produto; // Atualiza o produto
    }

    // Metodo para definir uma nova quantidade de produto
    public void setQuantidadeProduto(float quantidade) {
        this.quantidadeProduto = quantidade; // Atualiza a quantidade do produto
    }
}
