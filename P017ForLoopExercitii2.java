import java.util.Scanner;

public class P017ForLoopExercitii2 {
    public static void main(String[] args) {
        /*
        // 1. Scrieti un program care cere utilizatorului sa introduca un numar de la consola.
        //    Daca numarul este par, acesta va fi printat de 10 ori. Daca nu, de 20.
        System.out.println("------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = sc.nextInt();

        if (numar % 2 == 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numar + "x" + i);
            }
        } else {
            for (int i = 1; i <= 20; i++) {
                System.out.println(numar + "x" + i);
            }
        }

        System.out.println("------------------------------------------------------------------");



        // 2. Programul cere utilizatorului sa introduca un String text, apoi sa introduca un int x.
        //    Textul va printat la consola de x ori.

        Scanner scText = new Scanner(System.in);

        System.out.print("Introduceti textul dorit: ");
        String text = scText.nextLine();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numarul de iteratiit: ");
        int numarIteratii = sc.nextInt();

        for (int i = 0; i < numarIteratii; i++) {
            System.out.println(text + " x " + i);
        }

        System.out.println("------------------------------------------------------------------");


        // 3. Programul cere utilizatorului sa introduca un String text, apoi sa introduca un numar.
        //    Daca numarul este mai mic decat 5, textul se va printa de 10 ori pe linii diferite.
        //    Daca nu, de 10 ori pe acelasi rand, cu spatiu intre.

        Scanner scanerText = new Scanner(System.in);
        Scanner scanerInt = new Scanner(System.in);

        System.out.print("Introduceti textul dorit: ");
        String txt = scanerText.nextLine();
        System.out.print("Introduceti numarul dorit: ");
        int nr = scanerInt.nextInt();

        if (nr<5) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(txt);
            }
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.print(txt + " ");
            }
        }

        System.out.println("\n------------------------------------------------------------------");


        // 4. Scrieti un program care sa ceara utilizatorului ora curenta.
        //    Sa se printeze la consola timpul din 15 in 15 minute de la ora 0 pana la ora introdusa
        //    Model: 00:00  00:15   00:30   00:45   01:00   01:15 ... n:00
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti ora dorita: ");
        int ora = sc.nextInt();

        if (ora <= 24 && ora >= 0) {
            for (int i = 0; i < ora; i++) {
                if (i < 10) {
                    System.out.println("0" + i + ":00");
                    System.out.println("0" + i + ":15");
                    System.out.println("0" + i + ":30");
                    System.out.println("0" + i + ":45");
                } else {
                    System.out.println(i + ":00");
                    System.out.println(i + ":15");
                    System.out.println(i + ":30");
                    System.out.println(i + ":45");
                }
            }
        } else {
            System.out.println("Nu ai introdus o ora valabila!");
        }

        System.out.println("------------------------------------------------------------------");
        */

        // 5. Scrie un program care citeste un numar int n de la user, apoi citeste n numere de la user si la sfarsit
        //    afiseaza numarul cel mai mic

        int minim = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu numarul de citiri: ");
        int numarCitiri = sc.nextInt();

        for (int i = 1; i <= numarCitiri; i++) {
            System.out.println("Introduceti numarul citit: "+i);
            int numarCitit = sc.nextInt();
            if (numarCitit<minim){
                minim=numarCitit;
            }
        }
        System.out.println("Cel mai mic numar este: " + minim);
        
        System.out.println("------------------------------------------------------------------");

    }
}
