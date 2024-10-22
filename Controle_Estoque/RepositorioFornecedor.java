import java.util.ArrayList;
import java.util.List;

public class RepositorioFornecedor {
    private List<Fornecedor> fornecedores; // Lista para armazenar fornecedores



    // Construtor
    public RepositorioFornecedor() {
        this.fornecedores = new ArrayList<>(); // Inicializa a lista de fornecedores
    }

    // Metodo para adicionar um fornecedor ao repositório
    public void adicionarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor); // Adiciona o fornecedor à lista
    }

    // Metodo para remover um fornecedor do repositório
    public void removerFornecedor(Fornecedor fornecedor) {
        fornecedores.remove(fornecedor); // Remove o fornecedor da lista
    }

    // Metodo para obter a lista de fornecedores
    public List<Fornecedor> getFornecedores() {
        return fornecedores; // Retorna a lista de fornecedores
    }
}
