package Ex3;

public class Cds extends Produto {
    private int numeroFaixas;

    public Cds(String nome, double preco, String codigoDeBarras, int numeroFaixas) {
        super(nome, preco, codigoDeBarras);
        this.numeroFaixas = numeroFaixas;
    }

    public int getArtista() {return numeroFaixas;}
    public void setArtista(int numeroFaixas) {this.numeroFaixas = numeroFaixas;}

    @Override
    public String toString() {
        return '{' + super.toString() + "Número de Faixa ='" + numeroFaixas + '\'' + '}';
    }
    @Override
    public boolean equals(Object obj) { 
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Cds cds = (Cds) obj;
        return numeroFaixas == cds.numeroFaixas;
    }

    
}
