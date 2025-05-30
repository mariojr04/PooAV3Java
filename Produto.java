public class Produto{

    private int idProduto;
    private String descProduto;
    private Double valor;

    public Produto(int idProduto, String descProduto, Double valor){
        this.idProduto = idProduto;
        this.descProduto = descProduto;
        this.valor = valor;
    }

    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }

    public int getIdProduto(){
        return idProduto;
    }

    public void setDescProduto(String descProduto){
        this.descProduto = descProduto;
    }

    public String getDescProduto(){
        return descProduto;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }
    public Double getValor(){
        return valor;
    }

    public void ToString(){
        System.out.println("Id do produto: " + getIdProduto());
        System.out.println("Desc do produto: " + getDescProduto());
        System.out.println("Valor do produto: " + getValor());
    }
}