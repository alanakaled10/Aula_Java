import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;

        

        ArrayList<Forma2D> formasGeometricas = new ArrayList<>();

        do {
            System.out.println(  "1 - Criar um retângulo \n"
                               + "2 - Criar um triângulo \n"
                               + "3 - Criar um círculo \n"
                               + "4 - Listar formas geométricas \n"
                               + "0 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a base do retângulo:");
                    double base = sc.nextDouble();
                    System.out.println("Digite a altura do retângulo:");
                    double altura = sc.nextDouble();
                    System.out.println("Digite o nome do retângulo:");
                    String nomeRetangulo = sc.next(); 
                    Retangulo retangulo = new Retangulo(base, altura, nomeRetangulo);
                    formasGeometricas.add(retangulo);
                    break;

                case 2:
                    System.out.println("Digite a base do triângulo:");
                    double baseTriangulo = sc.nextDouble();
                    System.out.println("Digite a altura do triângulo:");
                    double alturaTriangulo = sc.nextDouble();
                    System.out.println("Digite o nome do triângulo:");
                    String nomeTriangulo = sc.next(); 
                    System.out.println("Digite o estilo do triângulo:");
                    String estiloTriangulo = sc.next(); 
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo, nomeTriangulo, estiloTriangulo);
                    formasGeometricas.add(triangulo);
                    break;

                case 3:
                    System.out.println("Digite o raio do círculo:");
                    double raioCirculo = sc.nextDouble();
                    System.out.println("Digite o nome do círculo:");
                    String nomeCirculo = sc.next(); 
                    Circulo circulo = new Circulo(raioCirculo, nomeCirculo);
                    formasGeometricas.add(circulo);
                    break;

                case 4:
                    for (Forma2D forma : formasGeometricas){
                        System.out.println(forma);
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }

        } while (opcao != 0);

        for (Forma2D forma : formasGeometricas){
            System.out.println("Forma Geométrica: " + forma.getNome() + " - Área: " + forma.area());
        }


        sc.close();
        
    }
}
