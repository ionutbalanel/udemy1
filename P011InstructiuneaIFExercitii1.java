import java.util.Scanner;

public class P011InstructiuneaIFExercitii1 {
    public static void main(String[] args) {
        // 1. Scrie un program care sa citeasca 2 numere din consola si sa afiseze daca sunt egale sau nu.
        System.out.println("----------------------------------------------------------");

        Scanner cititor = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int numar1 = cititor.nextInt();
        System.out.print("Introduceti al doilea numar: ");

        int numar2 = cititor.nextInt();

        if (numar1 == numar2) {
            System.out.println("Numerele introduse sunt egale!");
        } else {
            System.out.println("Numerele introduse NU sunt egale!");
        }

        System.out.println("----------------------------------------------------------");
        // 2. Scrie un program care sa citeasca un numar din consola si sa afiseze daca este par sau impar.

        System.out.print("Introduceti un numar: ");
        int numarIntrodus = cititor.nextInt();

        if (numarIntrodus % 2 == 0) {
            System.out.println(numarIntrodus + " % " + 2 + " --> " + numarIntrodus % 2 + " == " + 0);
            System.out.println("Numarul introdus este PAR!");
        } else {
            System.out.println(numarIntrodus + " % " + 2 + " --> " + numarIntrodus % 2 + " == " + 0);
            System.out.println("Numarul introdus este IMPAR!");
        }

        System.out.println("----------------------------------------------------------");
        // 3. Scrie un program care sa citeasca un numar din consola si sa afiseze daca este pozitiv sau negativ

        System.out.print("Introduceti un numar: ");
        int nrIntrodus = cititor.nextInt();

        if (nrIntrodus < 0) {
            System.out.println("Numarul este negativ!");
        } else {
            System.out.println("Numarul este pozitiv!");
        }

        System.out.println("----------------------------------------------------------");
        // 4. Creati o aplicatie care cere trei numere de la utilizator si il gaseste si afiseaza pe cel mai mic dintre ele.

        System.out.print("Introduceti primul numar: ");
        int n1 = cititor.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int n2 = cititor.nextInt();
        System.out.print("Introduceti al treilea numar: ");
        int n3 = cititor.nextInt();

        int minim = n1;

        if (n2 < minim) {
            minim = n2;
        } else if (n3 < minim) {
            minim = n3;
        } else {
            System.out.println("Ati introdus gresit!");
        }
        System.out.println("Cel mai mic numar este " + minim);

        System.out.println("----------------------------------------------------------");
        // 5. Scrieti un program care va cere sa introduceti varsta voastra si varsta voastra ideala de pensionare.
        //    Sa se printeze unul din mesajele corespunzatoare: "Mai aveti de lucrat inca X ani" / "Ati iesit deja la pensie"
        //    De asemenea, varstele introduse trebuie sa fie valide.

        System.out.print("Introduceti varsta la care doriti sa va pensionati: ");
        int varstaIdeala = cititor.nextInt();
        System.out.print("Introduceti varsta dvs: ");
        int varstaMea = cititor.nextInt();

        if (varstaMea <= 0 || varstaIdeala < 0) {
            System.out.println("Ai introdus o varsta negativa!");
        } else if (varstaMea > 130 || varstaIdeala > 130) {
            System.out.println("Ai introdus o varsta absurda!");
        } else if (varstaMea < varstaIdeala) {
            System.out.println("Mai ai de lucrat inca " + (varstaIdeala - varstaMea) + " ani");
        } else {
            System.out.println("Ai iesit deja la pensie!");
        }

        System.out.println("----------------------------------------------------------");
    }
}
