import java.util.ArrayList;
import java.util.Arrays;

public class P022MetodeExercitii5 {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        /*

        int[] numere = {2, 6, 5, 4, 7, 6, 8, 7, 9, 8};
        printeazaCrescator(numere);
        System.out.println();
        printeazaDescrescator(numere);
        System.out.println();

         */

        System.out.println("---------------------------------------");

        /*

        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(5,7,6,8,7,9,8,3));
        printeazaArrayListulCrescator(lista);
        System.out.println();
        printeazaArrayListulDescrescator(lista);
        System.out.println();

         */

        System.out.println("---------------------------------------");

        /*

        printFibbonacci(5);
        printFibbonacci(6);
        printFibbonacci(7);
        printFibbonacci(8);

         */

        System.out.println("---------------------------------------");

    }
    // 1. Scrie 2 metode care printează un vector de numere passat ca parametru, ordonat crescator si descrescător.

    public static void printeazaCrescator(int[] numere) {
        for (int i = 0; i < numere.length; i++) {
            for (int j = i + 1; j < numere.length; j++) {
                if (numere[i] > numere[j]) {
                    int temp = numere[i];
                    numere[i] = numere[j];
                    numere[j] = temp;
                }
            }
        }
        for (int numar : numere) {
            System.out.print(numar + " ");
        }
    }

    public static void printeazaDescrescator(int[] numere) {
        for (int i = 0; i < numere.length; i++) {
            for (int j = i + 1; j < numere.length; j++) {
                if (numere[i] < numere[j]) {
                    int temp = numere[i];
                    numere[i] = numere[j];
                    numere[j] = temp;
                }
            }
        }
        for (int numar : numere) {
            System.out.print(numar + " ");
        }
    }

    // 2. Scrie 2 metode care printează o listă de numere pasată ca parametru ordonată crescator si descrescător.

    public static void printeazaArrayListulCrescator(ArrayList<Integer> numere) {
        for (int i = 0; i < numere.size(); i++) {
            for (int j = i + 1; j > numere.size(); j++) {
                if (numere.get(i) < numere.get(j)) {
                    int temp = numere.get(i);
                    numere.set(i,numere.get(j));
                    numere.set(j,temp);
                }
            }
        }
        for (int numar : numere) {
            System.out.print(numar + " ");
        }
    }
    public static void printeazaArrayListulDescrescator(ArrayList<Integer> numere) {
        for (int i = 0; i < numere.size(); i++) {
            for (int j = i + 1; j < numere.size(); j++) {
                if (numere.get(i) < numere.get(j)) {
                    int temp = numere.get(i);
                    numere.set(i,numere.get(j));
                    numere.set(j,temp);
                }
            }
        }
        for (int numar : numere) {
            System.out.print(numar + " ");
        }
    }

    // 3. Se da secvența Fibonacci 0 1 1 2 3 5 8 13 … .
    //    Scrieți o metodă care primește un parametru de tip int x și printează al x-lea element din șirul Fibonacci.

    public static void printFibbonacci(int x){
        if (x == 0) {
            System.out.println(0);
        }else if (x == 1) {
            System.out.println(1);
        }else {
            ArrayList<Integer> numereFibbonacci = new ArrayList<>();
            numereFibbonacci.add(0);
            numereFibbonacci.add(1);
            for (int i = 2; i <= x; i++) {
                numereFibbonacci.add(numereFibbonacci.get(i-1)+numereFibbonacci.get((i-2)));
            }
            System.out.println(numereFibbonacci.get(x));
        }
    }
}
