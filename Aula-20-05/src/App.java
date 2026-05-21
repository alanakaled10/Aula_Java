import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(50);
        inteiros.add(41);
        inteiros.add(0);
        inteiros.add(-1);

        System.out.println("Inteiros antes de ordenar: ");
        for (Integer integer : inteiros) {
            System.out.print(integer + ", ");
        }

        Collections.sort(inteiros);
        System.out.println("\n\nInteiros Depois de ordenar: ");
        for (Integer integer : inteiros) {
            System.out.print(integer + ", ");
        }

        System.out.println("\nCollections.binarySearch() 10: " + Collections.binarySearch(inteiros, 10));
        System.out.println("\nCollections.binarySearch() 20: " + Collections.binarySearch(inteiros, 20));

        ArrayList<Integer> inteiros2 = new ArrayList<>();
        inteiros2.add(30);
        inteiros2.add(52);
        inteiros2.add(20);
        inteiros2.add(-10);
        inteiros.add(100);

        System.out.println("\nOs conjuntos não possuem valores em comum? " + (Collections.disjoint(inteiros, inteiros2) ? "sim" : "não"));

        inteiros2.add(100);
        System.out.println("Exibindo a Frequência do vaor 100 na lista: " + Collections.frequency(inteiros2, 100));

        System.out.println("O maior valor encontrado em inteiros 2 é: " + Collections.max(inteiros2) + "\nO menor valor encontrado em inteiros 2 é: " + Collections.min(inteiros2));

        System.out.println("\nO maior valor encontrado em inteiros  é: " + Collections.max(inteiros) + "\nO menor valor encontrado em inteiros é: " + Collections.min(inteiros));

        Collections.reverse(inteiros2);
        System.out.println("\n\n Inteiros 2 invertido: " + inteiros2);

    }
}
