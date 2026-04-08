public class Cds extends Produto {
    private int numeroFaixas;

    public Cds(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }

    public int getArtista() {return numeroFaixas;}
    public void setArtista(int numeroFaixas) {this.numeroFaixas = numeroFaixas;}

    @Override
    public String toString() {
        return '{' + super.toString() + "Número de Faixa ='" + numeroFaixas + '\'' + '}';
    }

    
}