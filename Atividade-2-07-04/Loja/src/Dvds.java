public class Dvds extends Produto {
    private int duracao;

    public Dvds(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {return duracao;}
    public void setDuracao(int duracao) {this.duracao = duracao;}

    @Override
    public String toString() {
        return '{' + super.toString() + "duracao='" + duracao + '\'' + '}';
    }

}
