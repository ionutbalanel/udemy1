import java.util.Arrays;

public class P019VectoriExercitii1 {
    public static void main(String[] args) {
        // 1. Sa se declare un array de strings care sa contina numele a 10 persoane. Sa se afiseze la
        //    consola elementul 3 si 7 pe acelasi rand despartite de spatiu, de trei ori.
        System.out.println("--------------------------------------------");

        String[] nume = new String[10];
        nume[0] = "Andrei";
        nume[1] = "Gabi";
        nume[2] = "Daniela";
        nume[3] = "Danut";
        nume[4] = "Mihai";
        nume[5] = "Carmen";
        nume[6] = "Mihnea";
        nume[7] = "Stefan";
        nume[8] = "Dorel";
        nume[9] = "Sandu";

        for (int i = 0; i < 3; i++) {
            System.out.print(nume[2] + " " + nume[6] + " ");
        }


        System.out.println("\n--------------------------------------------");
        // 2. Sa se declare un array numit fruits cu dimensiunea 6. Sa se adauge fructele in array
        //    folosind indexul.

        String[] fruits = new String[6];
        fruits[0] = "mere";
        fruits[1] = "pere";
        fruits[2] = "gutui";
        fruits[3] = "capsuni";
        fruits[4] = "visine";
        fruits[5] = "prune";

        for (String fruct : fruits) {
            System.out.print(fruct + " ");
        }

        System.out.println("\n--------------------------------------------");
        // 3. Sa se declare un array cu 12 numere. Afisati array-ul la consola si pe acelasi rand, si pe
        //    randuri diferite.

        int[] numere = {1, 5, 76, 45, 76, 87, 34, 66, 7, 2, 3, 1000};

        for (int i = 0; i < numere.length; i++) {
            System.out.print(numere[i] + " ");
        }

        System.out.println("");

        for (int numar : numere) {
            System.out.println(numar);
        }

        System.out.println("--------------------------------------------");
        // 4. Sa se declare un array de string cu 8 spatii libere. Umpleti array-ul cu 8 valori. Sortati
        //    array-ul. Afisati valorile la consola.

        String[] vector = new String[8];
        vector[0] = "text1";
        vector[1] = "ana are mere";
        vector[2] = "macbook";
        vector[3] = "nastea";
        vector[4] = "calculator";
        vector[5] = "andreea";
        vector[6] = "monitor";
        vector[7] = "cladire";

        Arrays.sort(vector);

        for (String text : vector) {
            System.out.println(text);
        }

        System.out.println("--------------------------------------------");
        // 5. Sa se declare un array de float cu 6 spatii libere. Umpleti array-ul cu valori. Afisati suma
        //    elementelor din acesta.

        float[] numereFloat = new float[6];
        Arrays.fill(numereFloat, 5f);

        int suma = 0;
        for (float numar :
                numereFloat) {
            System.out.println(numar);
            suma += numar;
        }
        System.out.println("Suma tuturor numerelor din vector este egala cu " + suma);

        System.out.println("--------------------------------------------");
    }
}
