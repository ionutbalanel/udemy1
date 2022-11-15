import java.util.Scanner;

public class P011InstructiuneaIFExercitii3 {
    public static void main(String[] args) {
        // 1. Scrieti un program care declara o variabila numarAscuns = 999, apoi cere de la consola un numar,
        //    Daca numarul introdus la consola este acelasi cu numarul ascuns, afiseaza "Ai ghicit!".
        //    Daca e mai mic afiseaza "mai mult!", daca e mai mare afiseaza "mai putin!".

        int numarAscuns = 999;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti numarul dvs: ");
        int guess = sc.nextInt();

        if (numarAscuns == guess) {
            System.out.println("Ai ghicit!");
        } else if (guess < numarAscuns) {
            System.out.println("Mai mult!");
        } else {
            System.out.println("Mai putin!");
        }

        System.out.println("----------------------------------------------------------");
        // 2. Scrieti un program care cere un an de la consola (ex: 1845), si calculeaza daca anul respectiv este bisect sau nu.
        //    (gasiti formula pe net)

        System.out.print("Introduceti anul: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Anul este bisesct!");
        } else {
            System.out.println("Anul nu este bisesct!");
        }

        System.out.println("----------------------------------------------------------");
        // 3. Scrieti un program care va cere varsta si apoi o calculeaza in ani cainesti (x7).
        //    Daca depasesti 100 de ani, afisati "Este pe aici de un secol". Daca nu, "You are a baby!"
        //    Daca introduci o varsta negativa, se va afisa un text de forma "Ooooh, deci o sa te nasti peste x ani"

        System.out.print("Introduceti varsta: ");
        int varsta = sc.nextInt();

        if (varsta < 0) {
            System.out.println("Ooooh, deci o sa te nasti peste " + (-varsta) + " ani");
        } else {
            int aniCainesti = varsta * 7;
            if (aniCainesti >= 100) {
                System.out.println("Este pe aici de un secol");
            } else {
                System.out.println("You are a baby!");
            }
        }

        System.out.println("----------------------------------------------------------");
        // 4. Scrie un program care te intreaba cate beri ai baut, iar apoi calculatorul iti da sfaturi:
        //    Daca ai baut mai putin de 4, mai bea. Daca ai baut mai mult de 4, du-te la culcare.
        //    Daca nu ai baut niciuna, inseamna ca esti cu masina.

        System.out.print("Cate beri ai baut: ");
        int numarBeri = sc.nextInt();

        if (numarBeri < 0) {
            System.out.println("Nu poti introduce un numar negativ!");
        } else {
            if (numarBeri==0){
                System.out.println("Suntem cu masina!");
            }else if (numarBeri <= 4) {
                System.out.println("Mai bea!");
            } else {
                System.out.println("Dute la culcare!");
            }
        }

        System.out.println("----------------------------------------------------------");
        // 5. Scrieti un program care determina gradul studentului in varianta Americana.
        //    Programul va trebui sa citeasca de la consola 3 note, va calcula media acestora si apoi va determina si printa
        //    gradul in conformitate cu urmatoarele regului:
        //          -daca media scorurilor e mai mare sau egala cu 90 studentul are gradul A
        //          -daca media scorurilor e intre 70 si 90 studentul are gradul B
        //          -daca media scorurilor e intre 50 si 90 studentul are gradul C
        //          -daca media scorurilor e sub 50% studentul are gradul F
        //   Nota: Scorurile pot avea valori intre 0 si 100. Daca se introduce altceva, sa se afiseze un mesaj de eroare.

        System.out.print("Introduceti prima nota: ");
        int nota1 = sc.nextInt();
        System.out.print("Introduceti a doua nota: ");
        int nota2 = sc.nextInt();
        System.out.print("Introduceti a treia nota: ");
        int nota3 = sc.nextInt();

        if (nota1 < 0 || nota2 < 0 || nota3 < 0) {
            System.out.println("Nu poti introduce o nota negativa!");
        } else if (nota1 > 100 || nota2 > 100 || nota3 > 100) {
            System.out.println("Nu poti introduce o nota mai mare decat!");
        }else {
            int medie = (nota1+nota2+nota3)/3;
            if (medie>90){
                System.out.println("Studentul are gradul A");
            } else if (medie>70) {
                System.out.println("Studentul are gradul B");
            } else if (medie>50) {
                System.out.println("Studentul are gradul C");
            }else {
                System.out.println("Studentul are gradul F");
            }
        }


        System.out.println("----------------------------------------------------------");
    }
}
