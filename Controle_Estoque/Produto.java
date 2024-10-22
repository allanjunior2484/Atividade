import java.time.LocalDate;

public class Produto extends Categoria {
    private String nomeProduto;
    private float precoCusto;
    private float precoVenda;
    private int codigoProduto;
    private int codigoInterno;
    private LocalDate validade;
    private LocalDate chegada;

    // Construtor
    public Produto(String nomeCategoria, String nomeProduto, float precoCusto, float precoVenda,
                   int codigoProduto, int codigoInterno, Fornecedor fornecedor,
                   LocalDate validade, LocalDate chegada) {
        super(nomeCategoria);
        this.nomeProduto = nomeProduto;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.codigoProduto = codigoProduto;
        this.codigoInterno = codigoInterno;
        this.validade = validade;
        this.chegada = chegada;
    }

    // Getters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public LocalDate getChegada() {
        return chegada;
    }

    // Setters
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public void setChegada(LocalDate chegada) {
        this.chegada = chegada;
    }
}
