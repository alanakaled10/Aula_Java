package Ex3;


public class Produto {

    private String nome;
    private double preco;
    private String codigoDeBarras;

    public Produto(String codigoDeBarras){ 
        this.codigoDeBarras = codigoDeBarras;
    }

    public Produto(String nome, double preco, String codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }
    public String getNome() {return nome;} 
    public void setNome(String nome){
        this.nome = nome;   
    }

    public double getPreco() {return preco;}
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigoDeBarras(){
        return this.codigoDeBarras;
    }

    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto produto = (Produto) obj;
        return codigoDeBarras.equals(produto.codigoDeBarras);
    }

}
