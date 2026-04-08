package Ex3;

public class Dvds extends Produto {
    private int duracao;

    public Dvds(String nome, double preco, int duracao, String codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    public int getDuracao() {return duracao;}
    public void setDuracao(int duracao) {this.duracao = duracao;}

    @Override
    public String toString() {
        return '{' + super.toString() + "duracao='" + duracao + '\'' + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Dvds dvds = (Dvds) obj;
        return duracao == dvds.duracao;
    }

}
