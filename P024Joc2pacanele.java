import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P024Joc2pacanele {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.print("Doriti sa incepem jocul? (introduceti 'da' sau 'nu'): ");
        String raspuns = cititor.nextLine();

        if (raspuns.equalsIgnoreCase("da")) {
            startGame();
        } else if (raspuns.equalsIgnoreCase("nu")) {
            System.out.println("Va asteptam pe la noi!");
        } else {
            System.out.println("Nu ai introdus un raspuns valabil");
        }
    }

    private static void startGame() {
        double buget = 100;
        ArrayList<String> posibilitati = new ArrayList<>(Arrays.asList("DIAMANT", "CIREASA", "BAR"));
        Scanner cititor = new Scanner(System.in);
        Random generator = new Random();

        while (true) {
            System.out.printf("Bugetul vostru este de %.2f $\n", buget);
            System.out.print("Introduceti miza: ");
            double miza = cititor.nextDouble();
            if (miza > buget) {
                System.out.println("Nu ai atitea bani!");
            } else {
                // scad miza din buget
                buget -= miza;
                // tragem de maneta
                System.out.println("Am tras de maneta!");
                String rezultat1 = posibilitati.get(generator.nextInt(posibilitati.size()));
                String rezultat2 = posibilitati.get(generator.nextInt(posibilitati.size()));
                String rezultat3 = posibilitati.get(generator.nextInt(posibilitati.size()));

                printeazaRezultatele(rezultat1, rezultat2, rezultat3);

                if (rezultat1.equals(rezultat2) && rezultat2.equals(rezultat3)) {
                    System.out.println("JACKPOT!");
                    double deAdaugat = (30.0 / 100) * miza;
                    buget += miza + deAdaugat;
                } else if (rezultat1.equals(rezultat2) || rezultat1.equals(rezultat3) || rezultat2.equals(rezultat3)) {
                    System.out.println("SEMI-JACKPOT!");
                    double deAdaugat = (90.0 / 100) * miza;
                    buget += deAdaugat;
                } else {
                    System.out.println("AI PIERDUT!");
                }

                if (buget == 0) {
                    System.out.println("Ai pierdut jocul!");
                    break;
                } else if (buget >= 1000) {
                    System.out.println("Ai castigat jocul!");
                    break;
                }
            }
        }
    }

    private static void printeazaRezultatele(String rezultat1, String rezultat2, String rezultat3) {
        System.out.println("[ " + rezultat1 + " ] [ " + rezultat2 + " ] [ " + rezultat3 + " ]");
    }

}
