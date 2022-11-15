public class P022MetodeExercitii1 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");

        salut("Raluca");
        salut("Gabi");
        salut("Andrei");

        System.out.println("---------------------------------------");

        compara(100, 8);
        compara(66, 4);
        compara(10, 10);
        compara(9, 90);

        System.out.println("---------------------------------------");

        estePozitiv(100);
        estePozitiv(-7);

        System.out.println("---------------------------------------");

        printeaza("Academia");
        printeaza("Programatorilor");

        System.out.println("---------------------------------------");

        printeaza("Programare",30);

        System.out.println("---------------------------------------");
    }
    // 1. Scrie o metoda salut() care primeste un parametru nume si afiseaza "Salut, ma numesc ... nume",
    //    apeleaza metoda de 3 ori cu Raluca, Gabi si Andrei.

    public static void salut(String nume) {
        System.out.println("Salut, ma numesc " + nume);
    }

    // 2. Scrie o metoda compara() care primeste 2 parametri de tip int si afiseaza "Numarul ... este
    //    mai mare. Apeleaza metoda de 3 ori, cu valori diferite."

    public static void compara(int n1, int n2) {
        if (n1 > n2) {
            System.out.println("Primul numar, " + n1 + ", este mai mare");
        } else if (n1 < n2) {
            System.out.println("Al doilea numar, " + n2 + ", este mai mare");
        } else {
            System.out.println("Numerele sunt egale");
        }
    }

    // 3. Scrieti o metoda care primeste ca parametru un numsar si printeaza "Numarul pasat este pozitiv" sau "Numarul pasat este negativ"

    public static void estePozitiv(int numar) {
        System.out.println(numar >= 0 ? "Numarul este pozitiv" : "Numarul este negativ");
    }

    // 4. Scrie o metoda care printeaza un text primit ca parametru de 10 ori.
    public static void printeaza(String text) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(text + " x" + i);
        }
    }

    // 5. Scrie o metoda care printeaza un text primit ca parametru de x ori, x fiind de asemenea un parametru al metodei.

    public static void printeaza(String text2, int numarIteratie){
        for (int i = 0; i <= numarIteratie; i++) {
            System.out.println(text2 + " x" + i);
        }
    }

}
