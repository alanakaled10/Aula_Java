import java.util.ArrayList;
import java.util.Collections;

public class ArrayTexto {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Mariana");
        nomes.add("André");
        nomes.add("Paulo");
        nomes.add("Carla");
        nomes.add("Matheus");

        System.out.println("Nomes antes de ordenar: ");
        for (String nome : nomes) {
            System.out.print(nome + ", ");
        }

        Collections.sort(nomes);
        System.out.println("\n\nNomes Depois de ordenar: ");
        for (String nome : nomes) {
            System.out.print(nome + ", ");
        }



        System.out.println("\nCollections.binarySearch() Alana: " + Collections.binarySearch(nomes, "Alana"));
        System.out.println("\nCollections.binarySearch() André: " + Collections.binarySearch(nomes, "André"));


        ArrayList<String> nomes2 = new ArrayList<>();
        nomes2.add("Mariana");
        nomes2.add("Andreia");
        nomes2.add("Carlos");
        nomes2.add("Miguel");
        nomes2.add("Paulo");

        System.out.println("Nomes2 antes de ordenar: ");
        for (String nome : nomes2) {
            System.out.print(nome + ", ");
        }

        Collections.sort(nomes2);
        System.out.println("\n\nNomes2 Depois de ordenar: ");
        for (String nome : nomes2) {
            System.out.print(nome + ", ");
        }

      
        System.out.println("\n\nOs conjuntos não possuem valores em comum? " + (Collections.disjoint(nomes, nomes2) ? "sim" : "não"));

        nomes2.add("Paulo");
        System.out.println("\nExibindo a Frequência do valor 'Paulo' na lista: " + Collections.frequency(nomes2, "Paulo"));

        System.out.println("\nO maior valor encontrado em nomes 2 é: " + Collections.max(nomes2) + "\nO menor valor encontrado em nome 2 é: " + Collections.min(nomes2));

        System.out.println("\nO maior valor encontrado em nomes  é: " + Collections.max(nomes) + "\nO menor valor encontrado em nome é: " + Collections.min(nomes));

        Collections.reverse(nomes2);
        System.out.println("\n\n nome 2 invertido: " + nomes);

    }

}
