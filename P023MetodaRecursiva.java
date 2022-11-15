import java.util.ArrayList;

public class P023MetodaRecursiva {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        System.out.println(factorial(5));
        System.out.println(factorialRecursiv(5));
        System.out.println(factorialRecursivTernar(5));

        System.out.println("---------------------------------------");
    }

    public static int factorial(int numar) {
        // Scrie o metodă care primește un parametru de tip int x și returnează numărul respectiv factorial. (1*2*3*4*....*x)
        int rezultat = 1;

        if (numar >= 1) {
            for (int i = 1; i <= numar; i++) {
                rezultat *= i;
            }
            return rezultat;
        }
        return 0;
    }

    public static int factorialRecursiv(int numar) {
        if (numar == 1) {
            return 1;
        } else {
            return numar * factorialRecursiv(numar - 1);
        }
    }

    public static int factorialRecursivTernar(int numar) {
        return numar == 1 ? 1 : numar * factorialRecursivTernar(numar - 1);
    }
}
