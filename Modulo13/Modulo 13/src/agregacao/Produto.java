public class Produto {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Double preco;

    public Double getPreco (){
        return preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void vendido(){
        System.out.println("Vendido");
    }
}
