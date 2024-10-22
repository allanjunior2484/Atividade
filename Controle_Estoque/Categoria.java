public class Categoria {
   private String nomeCategoria;
   // construtores

    // Construtor  define um nome (Categoria não defiida)
    public Categoria() {
        this.nomeCategoria = "Categoria Não definida"; // Define um nome padrão
    }
    // define que nomeCategoria ira receber String
    public Categoria (String nomeCategoria){
        this.nomeCategoria = nomeCategoria; // Inicializa o atributo
    }
    //  metodo get para obter nome categoria
    public String getNomeCategoria(){
        return nomeCategoria; // Retorna o valor do atributo
    }
    //Metodo set para modificar o nome da categoria

     public void setNomeCategoria(String nomeCategoria){

        this.nomeCategoria = nomeCategoria; // Define um novo valor para o atributo
    }

}
