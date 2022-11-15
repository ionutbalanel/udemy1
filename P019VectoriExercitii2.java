import java.util.Arrays;
import java.util.Scanner;

public class P019VectoriExercitii2 {
    public static void main(String[] args) {
        // 1. Sa se declare un array de int care sa contina 10 numere. Sa se afiseze la consola:
        //    A- suma tuturor numerelor pare
        //    B- media aritmetica a numerelor pozitive
        System.out.println("--------------------------------------------------");

        int[] numere = {12, -32, 45, 56, 7, -43, 23, 34, -22, 22};

        int sumaNumerePare = 0;
        int sumaNumerelorPozitive = 0;
        int numerePozitiveCount = 0;

        for (int numar :
                numere) {
            if (numar % 2 == 0) {
                sumaNumerePare += numar;
            }
            if (numar >= 0) {
                sumaNumerelorPozitive += numar;
                numerePozitiveCount++;
            }
        }

        System.out.println("Suma tuturor numerelor pare este egala cu: " + sumaNumerePare);
        System.out.println("Media aritmetica a numerelor pozitive este egala cu: " + (sumaNumerelorPozitive / numerePozitiveCount));

        System.out.println("--------------------------------------------------");
        // 2. Sa se declare un array numit masini cu dimensiunea 6. Sa se adauge masinile in array folosind indexul.
        //    Sortati array-ul, dupa care printati ultimele 2 elemente

        String[] masini = new String[6];

        masini[0] = "Audi";
        masini[1] = "Bmw";
        masini[2] = "Honda";
        masini[3] = "Renault";
        masini[4] = "Dacia";
        masini[5] = "Golf6";

        Arrays.sort(masini);

        //Varianta I
        for (String car : masini) {
            System.out.println(car);
        }

        System.out.println("++++++++++");

        // Varianta II
        System.out.println(Arrays.toString(masini));

        System.out.println("++++++++++");

        System.out.println(masini[masini.length - 2]);
        System.out.println(masini[masini.length - 1]);

        System.out.println("--------------------------------------------------");
        // 3. Sa se citeasca de la user un numar int n. Sa se declare un array de tip double cu dimensiunea n si sa se initializeze cu n valori.
        //    Sa se sorteze array-ul folosind una dintre metodele clasei Array. Sa se declare un al doilea array cu dimensiunea n.
        //    Sa se copieze toate elementele deja sortate din primul array, in al doilea. Sa se afiseze elementele din al doilea array la consola,
        //    folosind ciclul foreach.

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti dimensiunea array-ului: ");
        int dimensiune = sc.nextInt();

        double[] numereDouble = new double[dimensiune];
        double numar = 20.4;

        for (int i = 0; i < dimensiune; i++) {
            numereDouble[i]=numar;
            numar+=20;
        }

        Arrays.sort(numereDouble);

        double[] vectorNou = new double[dimensiune];

        for (int i = 0; i < dimensiune; i++) {
            vectorNou[i]=numereDouble[i];
        }

        for (double numarDouble:
             vectorNou) {
            System.out.println(numarDouble);
        }

        System.out.println("--------------------------------------------------");
        // 4. Sa se copieze toate masinile din array-ul de la ex. 2 in alt array nou (masiniCopy), folosind numai un ciclu for.
        //    Printati vectorul la consola

        String[] masiniCopy = new String[masini.length];

        for (int i = 0; i < masini.length; i++) {
            masiniCopy[i]=masini[i];
        }

        System.out.println(Arrays.toString(masiniCopy));

        System.out.println("--------------------------------------------------");
        // 5. Sa se copieze toate masinile din array-ul de la ex. 2 in alt array nou (masiniCopy), folosind numai un ciclu while.
        //    Printati vectorul la consola

        String[] masiniCopy2 = new String[masini.length];

        int index = 0;

        while (index<masini.length){
            masiniCopy2[index]=masini[index];
            index++;
        }

        System.out.println(Arrays.toString(masiniCopy2));

        System.out.println("--------------------------------------------------");
        // 6. Sa se calculeze media aritmetica a tuturor elementelor impare ale unui array cu 12 valori de tip double.

        double[] numereDouble2 = {34.5,23.6,76.5,34.5,56.7,2.5,9.88,44.5,100.5,10.0,12.3,24.0};

        double suma=0.0;
        int numereImpare = 0;

        for (double numar1:
             numereDouble2) {
            if (numar1%2!=0){
                suma+=numar1;
                numereImpare++;
            }
        }
        System.out.println("Media aritmetica a numerelor impare este egala cu "+(suma/numereImpare));

        System.out.println("--------------------------------------------------");
    }
}
