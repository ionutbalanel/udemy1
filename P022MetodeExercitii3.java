import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P022MetodeExercitii3 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        /*

        ghiceste(88);
        System.out.println("NEXT");
        ghiceste(50);

         */

        System.out.println("---------------------------------------");

        /*

        boolean caz1 = isBisect(2016);
        System.out.println(caz1);
        boolean caz2 = isBisect(2000);
        System.out.println(caz2);
        boolean caz3 = isBisect(2001);
        System.out.println(caz3);

         */

        System.out.println("---------------------------------------");

        /*

        Scanner scInt = new Scanner(System.in);
        Scanner scChar = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int nr1 = scInt.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int nr2 = scInt.nextInt();
        System.out.print("Introduceti operatia: ");
        char operatia = scChar.next().charAt(0);

        switch (operatia) {
            case '+':
                System.out.println("Suma este " + sum(nr1, nr2));
                break;
            case '-':
                System.out.println("Diferenta este " + difference(nr1, nr2));
                break;
            case '*':
                System.out.println("Produsul este " + multiply(nr1, nr2));
                break;
            case '/':
                System.out.println("Catul este " + divide(nr1, nr2));
                break;
            case '%':
                System.out.println("Restul impartirii este " + modulo(nr1, nr2));
                break;
            case '^':
                System.out.println(nr1 + " la puterea a " + nr2 + " este egal cu " + power(nr1, nr2));
                break;
            default:
                System.out.println("Nu ai introdus o operatie valabila!");
        }

         */

        System.out.println("---------------------------------------");

        /*

        System.out.println(factorial(5));
        System.out.println(factorial(3));
        System.out.println(factorial(-100));

         */

        System.out.println("---------------------------------------");

        /*

        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(1, 6, 3, 4));
        boolean primaMaiMare = suntMaiMari(lista1,lista2);
        System.out.println("Toate elementele primei liste sunt mai mari decat celei de-a doua? "+primaMaiMare);

         */

        System.out.println("---------------------------------------");

    }
    // 1. S?? se declare o metod?? static?? ghiceste(), care s?? primeasc?? un parametru int num??r ??i se afi??eze: ,,Ai ghicit!???,
    //    dac?? un num??r cerut de la consol?? este acela??i cu parametrul, ,,Mai mult??? dac?? este mai mic ??i ,,Mai pu??in??? dac?? este mai mare.
    //    Dac?? nu, s?? se cear?? din nou num??rul p??n?? se ghice??te. Apela??i metoda.

    public static void ghiceste(int numar) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Introduceti un numar: ");
            int numarIntrodus = sc.nextInt();
            if (numarIntrodus < numar) {
                System.out.println("Mai mult");
            } else if (numarIntrodus > numar) {
                System.out.println("Mai pu??in");
            } else {
                System.out.println("Ai ghicit!");
                break;
            }
        }
    }

    // 2. S?? se declare o metod?? care prime??te ca parametru un int ??i returneaz?? un boolean. Aceast?? metod?? calculeaz??
    //    dac?? un an primit ca parametru este sau nu bisect. S?? se afi??eze true, dac?? parametrul introdus este un an bisect,
    //    sau false dac?? nu este bisect. Metoda isBisect(), clasa Years. Apela??i metoda.

    public static boolean isBisect(int an) {
        if (an % 400 == 0 || an % 4 == 0 && an % 100 != 0) {
            return true;
        }
        return false;
    }

    // 3. S?? se declare 6 metode (sum, difference, multiply, divide, modulo, power). ??n main() s?? se cear?? de la user un num??r, un
    //    semn (operator), apoi un alt num??r, ??i returneaz?? calculul (apeleaz?? metoda) f??cut?? cu acele numere ??n func??ie de operatorul
    //    introdus. Folosi??i if() sau switch() pentru operatori. Tip: semnele sunt: + - * / % ^

    public static int sum(int x1, int x2) {
        return x1 + x2;
    }

    public static int difference(int x1, int x2) {
        return x1 - x2;
    }

    public static int multiply(int x1, int x2) {
        return x1 * x2;
    }

    public static int divide(int x1, int x2) {
        return x1 / x2;
    }

    public static int modulo(int x1, int x2) {
        return x1 % x2;
    }

    public static int power(int x1, int x2) {
        int rezultatFinal = x1;
        for (int i = 2; i <= x2; i++) {
            rezultatFinal *= x1;
        }
        return rezultatFinal;
    }

    // 4. Scrie o metod?? care prime??te un parametru de tip int x ??i returneaz?? num??rul respectiv factorial. (1*2*3*4*....*x)

    public static int factorial(int numar) {
        int rezultat = 1;

        if (numar >= 1) {
            for (int i = 1; i <= numar; i++) {
                rezultat *= i;
            }
            return rezultat;
        }
        return 0;
    }

    // 5. Scrie??i o metod?? care prime??te ca parametri 2 liste de tip int ??i returneaz?? true dac?? toate elementele primei liste
    //    sunt mai mari dec??t toate celei de-a doua

    public static boolean suntMaiMari(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        boolean toateSuntMaiMari = true;

        for (Integer numar1 : lista1) {
            for (Integer numar2 : lista2) {
                if (numar2 > numar1) {
                    toateSuntMaiMari = false;
                }
            }
        }

        return toateSuntMaiMari;
    }
}
