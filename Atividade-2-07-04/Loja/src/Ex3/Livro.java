package Ex3;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String codigoDeBarras, String autor) {
        super(nome, preco, codigoDeBarras);
        this.autor = autor;
    }

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    @Override
    public String toString() {
        return '{' + super.toString() + "autor='" + autor + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Livro livro = (Livro) obj;
        return autor.equals(livro.autor);
    }
}
