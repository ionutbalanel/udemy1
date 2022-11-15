import java.util.Random;
import java.util.Scanner;

public class P024Joc1zaruri {
    public static void main(String[] args) {
        int zar1;
        int zar2;
        int zar1Adversar;
        int zar2Adversar;

        int victoriileMele = 0;
        int victoriileAdversarului = 0;

        Scanner sc = new Scanner(System.in);
        Random generator = new Random();

        while (true) {
            System.out.print("Doriti sa jucati?: ");
            String raspuns = sc.nextLine();

            if (raspuns.equals("da")) {
                zar1 = generator.nextInt(6) + 1;
                zar2 = generator.nextInt(6) + 1;
                zar1Adversar = generator.nextInt(6) + 1;
                zar2Adversar = generator.nextInt(6) + 1;

                System.out.println("Ai dat: " + zar1 + " " + zar2);
                System.out.println("Oponentul a dat: " + zar1Adversar + " " + zar2Adversar);

                int scorulMeu = zar1 + zar2;
                int scorulAdversarului = zar1Adversar + zar2Adversar;

                if (scorulMeu > scorulAdversarului) {
                    victoriileMele++;
                    System.out.println("Ai castigat!");
                } else if (scorulAdversarului > scorulMeu) {
                    victoriileAdversarului++;
                    System.out.println("Ai pierdut!");
                } else {
                    System.out.println("Remiza!");
                }

                System.out.println("Scorul tau: " + victoriileMele + " " + "Scorul adversarului: " + victoriileAdversarului);

                if (victoriileMele == 6) {
                    System.out.println("Ai castigat jocul!");
                    break;
                } else if (victoriileAdversarului == 6) {
                    System.out.println("Ai pierdut!");
                    break;
                }

            } else if (raspuns.equals("nu")) {
                System.out.println("Va mai asteptam pe la noi");
                break;
            } else {
                System.out.println("Nu ai introdus un raspuns valabil. Introdu da sau nu");
            }
        }
    }

}
