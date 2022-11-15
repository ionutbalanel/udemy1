import java.util.Random;
import java.util.Scanner;

public class P018WhileLoopExercitii2 {
    public static void main(String[] args) {
        // 1. Scrieti un program care cere userului in mod repetat sa introduca numere de la tastatura.
        //    Cand userul introduce 0, programul va printa media aritmetica a tuturor numerelor introduse si programul se va termina.
        System.out.println("----------------------------------------");

        Scanner sc = new Scanner(System.in);

        float suma = 0;
        int count = 0;

        while (true) {
            System.out.print("Introduceti un numar: ");
            float numar = sc.nextFloat();

            if (numar == 0) {
                break;
            } else {
                suma += numar;
                count++;
            }
        }
        System.out.printf("Media aritmetica a numerelor introduse este egala cu: %.2f\n", (suma / count));

        System.out.println("----------------------------------------");
        // 2. Declarati o variabila de tip int si initializa-ti-o. Programul va cere in mod repetat userului sa ghiceasca numarul.
        //    Daca utilizatorul introduce un numar mai mic, se va printa "Mai adauga"
        //    Daca utilizatorul introduce un numar mai mare, se va printa "Mai scade"
        //    Daca utilizatorul ghiceste numarul, se va printa "Felicitari. Ai ghicit numarul din ... x ... incercari"

        Random generator = new Random();
        int numarAscuns = generator.nextInt(100);
        int incercari = 0;

        while (true) {
            System.out.print("Introduceti un numar: ");
            int numar1 = sc.nextInt();

            incercari++;

            if (numar1 < numarAscuns) {
                System.out.println("Mai mult!");
            } else if (numar1 > numarAscuns) {
                System.out.println("Mai putin!");
            } else {
                System.out.println("Felicitari, ai ghicit numarul din " + incercari + " incercari.");
                break;
            }
        }
        System.out.println("----------------------------------------");
        // 3. Urmatorul program va calcula spatiul total pe care il ocupa fisierele de pe un hard disk.
        //    Prima data, sa se citeasca de la user un numar int numarulFisierelor care va reprezenta numarul de fisiere de pe disk.
        //    Apoi se va citi o serie de numere care sa reprezinte marimea fiecarui fisier (MB). Scrieti un program care sa ceara user-ului marimea
        //    fiecarui fisier cu fraza "Introduceti marimea fisierului {i}: ", unde i reprezinta indexul fiecarui fisier,
        //    care incepe de la 1, si se incrementeaza cu 1 la fiecsare fisier.
        //    In final, calculeaza suma tuturor fisierelor si afiseaz-o cu fraza: "Spatiul total ocupat pe hard disk este {suma} MB. bytes."
        //    Exemplu:
        //    Introduceti numarul de fisiere:
        //    >3
        //    Introduceti marimea fisierului 1:
        //    >2
        //    Introduceti marimea fisierului 2:
        //    >7
        //    Introduceti marimea fisierului 3:
        //    >12
        //    Spatiul total ocupat pe hard disk este 21 MB

        int counter = 1;
        int sum = 0;

        System.out.print("Introduceti numarul de fisiere: ");
        int numarulFisierelor = sc.nextInt();

        while (numarulFisierelor > 0) {
            System.out.print("Introduceti marimea fisierului " + counter + " = ");
            int marimeaFisierului = sc.nextInt();
            sum += marimeaFisierului;
            counter++;
            numarulFisierelor--;
        }
        System.out.println("Spatiul total ocupat pe hard disk este de " + sum + " MB");

        System.out.println("-----------------------------");
    }
}
