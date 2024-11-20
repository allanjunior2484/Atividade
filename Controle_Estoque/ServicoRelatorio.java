public class ServicoRelatorio{
	Date dataRelatorio;
	Date dataPassado;
	Fornecedor fornecedor;
	Produto produto;
	Categoria categoria;
	float estoquePresente;
	float vendido;


}
// Método para calcular o saldo de estoque
    public float calcularSaldoEstoque() {
        return estoquePresente - vendido;
    }

    // Método para exibir um resumo do relatório
    public void exibirRelatorio() {
        System.out.println("Data do Relatório: " + dataRelatorio);
        System.out.println("Fornecedor: " + fornecedor.nomeFornecedor);
        System.out.println("Produto: " + produto.nome);
        System.out.println("Categoria: " + categoria.nome);
        System.out.println("Estoque Presente: " + estoquePresente);
        System.out.println("Vendidos: " + vendido);
        System.out.println("Saldo de Estoque: " + calcularSaldoEstoque());
    }

    // Método para definir a data do relatório
    public void definirDataRelatorio(Date data) {
        this.dataRelatorio = data;
    }

    // Método para definir a data passada
    public void definirDataPassada(Date data) {
        this.dataPassado = data;
    }

    // Método para adicionar vendido
    public void adicionarVendido(float quantidade) {
        this.vendido += quantidade; // Atualiza a quantidade vendida
    }

    // Método para atualizar estoque presente
    public void atualizarEstoquePresente(float quantidade) {
        this.estoquePresente = quantidade; // Atualiza o estoque presente
    }
