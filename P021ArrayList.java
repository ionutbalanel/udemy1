import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P021ArrayList {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");

        // declarare
        ArrayList<String> cuvinte = new ArrayList<>();

        // initializare
        cuvinte.add("curs1");
        cuvinte.add("curs2");
        cuvinte.add("curs3");

        // citire
        for (String cuvant :
                cuvinte) {
            System.out.print(cuvant + " ");
        }

        // stergere
        cuvinte.remove(2);

        System.out.println("");

        // citire
        for (String cuvant :
                cuvinte) {
            System.out.print(cuvant + " ");
        }

        //adaugare element
        cuvinte.add(1, "in_plus");

        System.out.println("");

        // citire
        for (String cuvant :
                cuvinte) {
            System.out.print(cuvant + " ");
        }

        System.out.println("");

        System.out.println("---------------------------------------------------");

        // declarare
        ArrayList<Integer> listaNumere = new ArrayList<>();
        listaNumere.add(4);
        listaNumere.add(76);
        listaNumere.add(98);
        listaNumere.add(34);
        listaNumere.add(1);
        listaNumere.add(5);

        // citire
        for (int numar :
                listaNumere) {
            System.out.println(numar + " ");
        }

        System.out.println("+++++++++++++++++++++++++");
        Collections.sort(listaNumere);

        // citire
        for (int numar :
                listaNumere) {
            System.out.println(numar + " ");
        }

        System.out.println("+++++++++++++++++++++++++");

        for (int i = listaNumere.size() - 1; i >= 0; i--) {
            System.out.println(listaNumere.get(i) + " ");
        }

        System.out.println("+++++++++++++++++++++++++");

        // declarare
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("test1", "test2", "test3"));

        lista.add("test4");

        // citire
        for (String s :
                lista) {
            System.out.print(s + " ");
        }
        System.out.println("");

        // declarare
        ArrayList<Double> numereDouble = new ArrayList<>();
        ArrayList<Character> caractere = new ArrayList<>();

        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i) + " ");
        }

        System.out.println("\n---------------------------------------------------");
    }
}
