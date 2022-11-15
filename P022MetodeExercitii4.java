import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P022MetodeExercitii4 {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        /*

        String caz1=fizzBuzz(30);
        String caz2=fizzBuzz(10);
        String caz3=fizzBuzz(9);
        String caz4=fizzBuzz(2);
        System.out.println(caz1);
        System.out.println(caz2);
        System.out.println(caz3);
        System.out.println(caz4);

         */

        System.out.println("---------------------------------------");

        /*

        inverseaza("abcdef");
        System.out.println();
        inverseaza("12345");
        System.out.println();

         */

        System.out.println("---------------------------------------");

        /*

        System.out.println(estePalindrom("ana"));
        System.out.println(estePalindrom("abcd"));
        System.out.println(estePalindrom("rotitor"));

         */

        System.out.println("---------------------------------------");

        /*

        ArrayList<Integer> numere = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 1, 2));
        deCateOriContine(numere,2);

         */

        System.out.println("---------------------------------------");
    }
    // 1. Scrie o metodă care returnează Fizz dacă un număr pasat ca parametru este divizibil cu 3,
    //    Buzz dacă este divizibil cu 5 și FizzBuzz dacă este divizibil și cu 3 și cu 5

    public static String fizzBuzz(int numar) {
        if (numar % 15 == 0) {
            return "FizzBuzz";
        } else if (numar % 5 == 0) {
            return "Buzz";
        } else if (numar % 3 == 0) {
            return "Fizz";
        } else {
            return numar + " ";
        }
    }

    // 2. Scrie o metodă care printează un String passat ca parametru în oglindă: exemplu abcdef => fedcba

    public static void inverseaza(String text) {
        char[] litere = text.toCharArray();
        for (int i = litere.length - 1; i >= 0; i--) {
            System.out.print(litere[i]);
        }
    }

    // 3. Scrie un metodă care determină dacă un String passat ca parametru este palindrom.
    //    Un cuvânt este palindrom atunci când el este scris în oglindă (exemple: unu, cojoc, reper, rotitor, atacată).
    //    Metoda va returna un boolean.

    public static boolean estePalindrom(String cuvant) {
        char[] litere = cuvant.toCharArray();
        for (int i = 0; i < litere.length / 2; i++) {
            if (litere[i] != litere[litere.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // 4. Scrieți o metodă care primește ca parametru o listă de tip integer și un număr int.
    //    Metoda va printa la consolă de câte ori este întâlnit numărul int în listă

    public static void deCateOriContine(ArrayList<Integer> lista, int numar) {
        int count = 0;
        for (Integer nr : lista) {
            if (nr == numar) {
                count++;
            }
        }
        System.out.println("In lista pasata, numarul " + numar + " a fost prezent de " + count + " ori");
    }
}
