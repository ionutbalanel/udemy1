import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P024Joc3spanzuratoarea {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        Random generator = new Random();
        ArrayList<String> cuvinte = new ArrayList<>(Arrays.asList("academia", "programator","java","curs","bicicleta","mouse","masina","dormitor"));
        String cuvant = cuvinte.get(generator.nextInt(cuvinte.size()));
        int vietiRamase = 6;

        char[] litere = cuvant.toCharArray();
        char[] cuvantAfisat = new char[litere.length];
        Arrays.fill(cuvantAfisat, '_');

        afiseazaCuvantul(cuvantAfisat);

        while (true) {
            System.out.print("Introduceti o litera (vieti ramase = " + vietiRamase+"): ");
            char literaIntrodusa = cititor.next().charAt(0);
            boolean cuvantulContineLitera = false;
            for (int i = 0; i < litere.length; i++) {
                if (literaIntrodusa == litere[i]) {
                    cuvantAfisat[i] = literaIntrodusa;
                    cuvantulContineLitera=true;
                }
            }
            if (!cuvantulContineLitera) {
                vietiRamase--;
            }
            if (vietiRamase <= 0) {
                System.out.println("Ai pierdut jocul!");
                break;
            }
            afiseazaCuvantul(cuvantAfisat);

            if (Arrays.equals(litere,cuvantAfisat)) {
                System.out.println("Ai castigat!");
                break;
            }

        }
    }

    private static void afiseazaCuvantul(char[] cuvantAfisat) {
        for (char c : cuvantAfisat) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
