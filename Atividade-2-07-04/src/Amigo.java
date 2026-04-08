/*Escreva uma classe chamada Pessoa com os atributos: nome (tipo String),
sexo (tipo char), idade (tipo int). Escreva agora outra classe chamada Amigo,
que é uma pessoa (estende da classe Pessoa) de quem sabemos o dia de
seu aniversário, atributo diaDoAniversario (tipo String). Use
encapsulamento e forneça construtor padrão e construtor usando todos os
atributos para as duas classes*/

public class Amigo extends Pessoa {
    private String diaDoAniversario;

    public Amigo(String nome, String genero, int idade, String Aniversario) {
        super(nome, genero, idade);
        this.diaDoAniversario = Aniversario;
    }

    public String getAniversario() {
        return diaDoAniversario;
    }
    public void setAniversario(String Aniversario) {
        this.diaDoAniversario = Aniversario;
    }


}
