import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class P022MetodeExercitii2 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        /*

        calculeazaMedia(2.0, 4.5, 66, 50.0, 100.5);
        calculeazaMedia(12.0, 4.5, 66, 520.03, 1040.5);
        calculeazaMedia(2.0, 43.5, 646, 550.0, 1300.5);

        */

        System.out.println("---------------------------------------");
        /*

        int rezultat = aduna(10, 30, 50);
        System.out.println("Rezultatul metodei a fost " + rezultat);
        System.out.println("Rezultatul metodei a fost " + aduna(1, 2, 3));
        System.out.println("Rezultatul metodei a fost " + aduna(1000, 2000, 5000));

         */

        System.out.println("---------------------------------------");

        /*

        ArrayList<Double> lista = new ArrayList<>(Arrays.asList(1000.0,2000.0,500.0,700.0));
        double cmm = returneazaCelMaiMicNumar(lista);
        System.out.println("Cel mai mic numar din lista a fost " + cmm);

         */

        System.out.println("---------------------------------------");
        /*

        ArrayList<String> rezultat = returneazaLista("texte", "pasate", "random", "ca", "parametrii");
        Collections.sort(rezultat);
        for (String element : rezultat) {
            System.out.print(element + " ");
        }

         */

        System.out.println("\n---------------------------------------");

        convertToCelsius(100);
        convertToCelsius(50);
        convertToCelsius(500);

        System.out.println("\n---------------------------------------");


    }

    // 1. Scrie o metoda calculeazaMedia() care primeste 5 parametri de tip double si afiseaza "Media
    //    numerelor este ... media". Apeleaza metoda de 3 ori cu valori diferite.

    public static void calculeazaMedia(double n1, double n2, double n3, double n4, double n5) {
        double suma = n1 + n2 + n3 + n4 + n5;
        System.out.println("Media numerelor este " + (suma / 5));
    }

    // 2. Scrie o metoda aduna() care primeste 3 parametri de tip int si returneaza suma numerelor. Apeleaza metoda de 3 ori cu valori diferite.

    public static int aduna(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // 3. Scrieți o metodă care returnează cel mai mic număr dintre o listă de tip double pasată ca parametru.

    public static double returneazaCelMaiMicNumar(ArrayList<Double> listaPasata) {
        double celMaiMicNumar = Double.MAX_VALUE;
        for (Double numar : listaPasata) {
            if (numar < celMaiMicNumar) {
                celMaiMicNumar = numar;
            }
        }
        return celMaiMicNumar;
    }

    // 4. Să se declare o metodă addStrings(), care primește 5 parametri de tip String și returnează o listă care conține acești
    //    parametri. Să se apeleze metoda și să se afișeze lista returnată, sortată alfabetic.

    public static ArrayList<String> returneazaLista(String t1, String t2, String t3, String t4, String t5) {
        ArrayList<String> listaReturnata = new ArrayList<>();
        listaReturnata.add(t1);
        listaReturnata.add(t2);
        listaReturnata.add(t3);
        listaReturnata.add(t4);
        listaReturnata.add(t5);
        return listaReturnata;
    }

    // 5. Scrie o metodă convertToCelsius() care primește un parametru int Fahrenheit și afișează
    //    “Temperatura în grade Celsius este …”. Apelează metoda de 3 ori cu valori diferite.

    public static void convertToCelsius(int gradeFahrenheit) {
        double gradeCelsius = (gradeFahrenheit - 32) * (5.0 / 9.0);
        System.out.printf("Temperatura in grade Celsius este %.2f\n", gradeCelsius);
    }

}
