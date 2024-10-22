public class Fornecedor {
    private String nomeFornecedor;
    private int idFornecedor;

    private static int contadorId = 0;

    //construtor para gerar idFornecedor
    public Fornecedor(String nomeFornecedor){
        this.nomeFornecedor = nomeFornecedor;
       this.idFornecedor = contadorId++;
    }


    // Construtor
    public Fornecedor(String nomeFornecedor, int idFornecedor) {
        this.nomeFornecedor = nomeFornecedor; // Inicializa o atributo nomeFornecedor
        this.idFornecedor = idFornecedor; // Inicializa o atributo idFornecedor
    }

    // Metodo get para obter o nome do fornecedor
    public String getNomeFornecedor() {
        return nomeFornecedor; // Retorna o valor do atributo nome
    }

    // Metodo set para modificar o nome do fornecedor
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor; // Define um novo valor para o atributo nomeFornecedor
    }
}
