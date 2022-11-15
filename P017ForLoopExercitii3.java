import java.util.Scanner;

public class P017ForLoopExercitii3 {
    public static void main(String[] args) {
        // 1. Scrie un program care calculeaza si printeaza suma tuturor numerelor de la 1 la 50.
        System.out.println("-------------------------------------------------------------------");

        int suma1 = 0;

        for (int i = 1; i <= 50; i++) {
            suma1 += i;
        }

        System.out.println("Suma numerelor de la 1 la 50 este egala cu: " + suma1);

        System.out.println("-------------------------------------------------------------------");
        // 2. Scrie un program care calculeaza suma numerelor impare cuprinse intre 0 si 100.

        int suma2 = 0;

        // varianta I
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0)
//                suma2 += i;
//        }

        // varianta II
        for (int i = 1; i <= 100; i += 2) {
            suma2 += i;
        }

        System.out.println("Suma numerelor impare cuprinse intre 0 si 100 este egala cu: " + suma2);

        System.out.println("-------------------------------------------------------------------");
        // 3. Scrie un program care calculeaza media aritmetica a tuturor numerelor de la 10 la 100.

        int suma3 = 0;
        int numere = 0;

        for (int i = 10; i <= 100; i++) {
            suma3 += i;
            numere++;
        }

        int medie = suma3 / numere;

        System.out.println("Media aritmetica a tuturor numerelor de la 10 la 100 este: " + medie);

        System.out.println("-------------------------------------------------------------------");
        // 4. Scrie un program care calculeaza si printeaza suma si produsul numerelor cuprinse intre -5 si 5.

        int suma4 = 0;
        int produs = 1;

        for (int i = -5; i <= 5; i++) {
            suma4 += i;
            produs *= i;
        }

        System.out.println("Suma numerelor cuprinse intre -5 si 5 este egala cu: " + suma4);
        System.out.println("Produsul numerelor cuprinse intre -5 si 5 este egala cu: " + produs);

        System.out.println("-------------------------------------------------------------------");
        // 5. Programul va cere userului sa introduca un numar de la tastatura.
        //    Daca numarul este pozitiv, sa se calculeze produsul numerelor pare de la 0 la acel numar.
        //    Daca numarul este negativ, sa se calculeze suma numerelor impare de la 0 la acel numar.

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = sc.nextInt();

        if (numar >= 0) {
            int produs1 = 1;
            for (int i = 1; i <= numar; i++) {
                if (i % 2 == 0) {
                    produs1 *= i;
                }
            }
            System.out.println("Podusul numerelor pare cuprinse intre 1 si " + numar + " este egal cu " + produs1);
        } else {
            int suma5 = 0;
            for (int i = 0; i >= numar; i--) {
                if (i % 2 != 0) {
                    suma5 += i;
                }
            }
            System.out.println("Suma numerelor impare cuprinse intre 0 si " + numar + " este egal cu " + suma5);
        }

        System.out.println("-------------------------------------------------------------------");
    }
}
