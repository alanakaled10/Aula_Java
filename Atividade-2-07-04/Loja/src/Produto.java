/*Crie uma hierarquia de classes de domínio para uma loja que venda livros,
CDs e DVDs. Sobrescreva o método toString() para que imprima:
• Para livros: nome, preço e autor;
• Para CDs: nome, preço e número de faixas;
• Para DVDs: nome, preço e duração.
Evite ao máximo repetição de código utilizando a palavra super no
construtor e no método sobrescrito. Em seguida, crie uma classe Loja com o
método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor
e, por fim, imprima o conteúdo do vetor. */

public class Produto {
    private String nome;
    private double preco;

    public Produto(){};

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {return nome;} 
    public void setNome(String nome){
        this.nome = nome;   
    }

    public double getPreco() {return preco;}
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco + '}';
    }

}
