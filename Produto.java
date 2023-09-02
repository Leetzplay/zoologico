public class Produto{
    private String id;
    private int preco;
    private String tipoVenda;
    private String brinquedo;
    private String lanche;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getTipoVenda() {
        return tipoVenda;
    }
    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

    public String getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }
    public Produto() {
    }

    public Produto(String id, int preco, String tipoVenda, String brinquedo, String lanche){
    this.id = id;
    this.preco = preco;
    this.tipoVenda = tipoVenda;
    this.Brinquedo = brinquedo;
    this.lanche = lanche;
}
