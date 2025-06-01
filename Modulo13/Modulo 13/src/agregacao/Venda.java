
import java.util.List;

public class Venda {

    private Comprador comprador;

    private Object produto;

    public Venda(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @SuppressWarnings("unchecked")
    public void add(Produto produto) {
        ((List<Produto>) this.produto).add(produto)
    }

    private Vendedor vendedor;

    private List<Produto> produtos;

    private class produto {

        public produto() {
        }
    }

}
