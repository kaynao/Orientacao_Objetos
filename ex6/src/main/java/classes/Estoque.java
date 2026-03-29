package classes;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    
    public Estoque() {
        this.produtos = new ArrayList<>();
    }
    
    public boolean adicionarProduto(Produto produto) {
        if (buscarProdutoPorCodigo(produto.getCodigo()) != null) {
            return false; // Produto já existe
        }
        produtos.add(produto);
        return true;
    }
    
    public boolean removerProduto(int codigo) {
        Produto produto = buscarProdutoPorCodigo(codigo);
        if (produto != null) {
            produtos.remove(produto);
            return true;
        }
        return false;
    }
    
    public boolean atualizarQuantidade(int codigo, int novaQuantidade) {
        Produto produto = buscarProdutoPorCodigo(codigo);
        if (produto != null) {
            produto.setQuantidade(novaQuantidade);
            return true;
        }
        return false;
    }
    
    public Produto buscarProdutoPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }
    
    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }
}