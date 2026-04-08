public class App {
    public static void main(String[] args)  {
        Ex3.Produto produto1 = new Ex3.Produto("123456789");
        Ex3.Produto produto2 = new Ex3.Produto("123456789");
        Ex3.Produto produto3 = new Ex3.Produto("987654321");

        System.out.println(produto1.equals(produto2)); // true
        System.out.println(produto1.equals(produto3)); // false

        Ex3.Livro livro1 = new Ex3.Livro("O Senhor dos Anéis", 39.90, "111111111", "J.R.R. Tolkien");
        Ex3.Livro livro2 = new Ex3.Livro("O Senhor dos Anéis", 39.90, "111111111", "J.R.R. Tolkien");
        Ex3.Livro livro3 = new Ex3.Livro("O Hobbit", 29.90, "222222222", "J.R.R. Tolkien");

        System.out.println(livro1.equals(livro2)); // true
        System.out.println(livro1.equals(livro3)); // false

        Ex3.Dvds dvd1 = new Ex3.Dvds("Matrix", 19.90, 136, "333333333");
        Ex3.Dvds dvd2 = new Ex3.Dvds("Matrix", 19.90, 136, "333333333");
        Ex3.Dvds dvd3 = new Ex3.Dvds("Inception", 24.90, 148, "444444444");

        System.out.println(dvd1.equals(dvd2)); // true
        System.out.println(dvd1.equals(dvd3)); // false
    }
}
