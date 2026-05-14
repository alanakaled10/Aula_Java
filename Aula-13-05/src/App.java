import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(new Carro("Fusca", "485-aaa-98"));
        listaVeiculos.add(new Bicicleta("Montanha"));
        listaVeiculos.add(new Caminhao(1000, "589-ggg-58"));

        for(Veiculo veiculo : listaVeiculos){
            System.out.println(veiculo.obterTipo());
            veiculo.acelerar();
            veiculo.frear();
            
        }
        sc.close();
    }
}
