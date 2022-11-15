import java.util.ArrayList;

public class P023MetodaRecursivaExercitii3 {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        printFibbonacci(5);
        printFibbonacci(6);
        printFibbonacci(7);
        printFibbonacci(8);

        System.out.println();


        System.out.println(printFibbonacciRecursiv(5));
        System.out.println(printFibbonacciRecursiv(6));
        System.out.println(printFibbonacciRecursiv(7));
        System.out.println(printFibbonacciRecursiv(8));


        System.out.println("---------------------------------------");
    }
    // Scrieti o metoda care primeste un parametru de tip int si returneaza numarul respectiv din sirul Fibbonacci
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

    public static int printFibbonacciRecursiv(int x) {
        if (x == 0) {
            return 0;
        } else if (x==1) {
            return 1;
        }else {
            return printFibbonacciRecursiv(x-1)+printFibbonacciRecursiv(x-2);
        }
    }

}
