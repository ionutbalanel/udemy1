import java.util.Scanner;

public class P018WhileLoopExercitii1 {
    public static void main(String[] args) {
        // 1. Scrie un program care sa afiseze textul "Voi deveni programator" de 10 ori folosind while.
        System.out.println("--------------------------------------");

        int counter = 0;

        while (counter < 10) {
            System.out.println("Voi deveni programator");
            counter++;
        }

        System.out.println("---------------------------------------");
        // 2. Scrie un program care sa afiseze suma primelor 10 numere naturale folosind while.

        int counter1 = 1;
        int suma = 0;

        while (counter1 <= 10) {
            suma += counter1;
            counter1++;
        }
        System.out.println("Suma primelor 10 numere naturale este egala cu: " + suma);

        System.out.println("--------------------------------------");
        // 3. Scrie un program care citeste 4 numere de la user, apoi le inmulteste folosind while.

        Scanner cititor = new Scanner(System.in);
        int counter2 = 1;
        int produs = 1;

        while (counter2 <= 4) {
            System.out.print("Introduceti un numar: ");
            int numarCitit = cititor.nextInt();
            produs *= numarCitit;
            counter2++;
        }
        System.out.println("Produsul numerelor citite este egal cu " + produs);
        System.out.println("---------------------------------------");
        // 4. Scrie un program care citeste un numar int n de la user si afiseaza textul "stiu sa folosesc ciclul while"
        //    de n ori pe randuri diferite

        System.out.print("Introduceti numarul de repetitii: ");
        int numarRepetitii = cititor.nextInt();

        while (numarRepetitii > 0) {
            System.out.println("Stiu sa folosesc ciclul while");
            numarRepetitii--;
        }

        System.out.println("----------------------------------------");
        // 5. Scrieti un program care cere userului in mod repetat un numar int n.
        //    Cand userul introduce un numar divizibil cu 15, se va printa suma tuturor numerelor introduse si programul se va termina.

        int suma2 = 0;

        while (true) {
            System.out.print("Introduceti un numar: ");
            int numar = cititor.nextInt();

            suma2 += numar;

            if (numar % 15 == 0) {
                break;
            }
        }
        System.out.println("Suma numerelor introduse este egala cu: " + suma2);

        System.out.println("--------------------------------------");
    }
}
